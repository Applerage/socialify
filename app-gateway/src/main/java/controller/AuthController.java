package controller;

import org.springframework.web.bind.annotation.*;
import reactor.netty.http.server.HttpServerResponse;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.SpotifyHttpManager;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;
import se.michaelthelin.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import se.michaelthelin.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest;
import se.michaelthelin.spotify.requests.authorization.authorization_code.AuthorizationCodeUriRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;


@RestController
@RequestMapping("/api")
public class AuthController {
    private static final URI redirectUri = SpotifyHttpManager.makeUri("http://localhost:8080/api/get-user-code/");
    private String code = "";

    //will be changed to a secret enumeration
    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId("e7283619bf944a9581d44a2650adeed0")
            .setClientSecret("7f6e5f8f5d3d47c6a16352b9a85b57c6")
            .setRedirectUri(redirectUri)
            .build();

    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
    @GetMapping("login")
    @ResponseBody
    public String spotifyLogin(){
        AuthorizationCodeUriRequest authorizationCodeUriRequest = spotifyApi.authorizationCodeUri()
                .scope("user-read-private, user-read-email, user-top-read")
                .show_dialog(true)
                .build();
        final URI uri = authorizationCodeUriRequest.execute();
        return uri.toString();
    }

    @GetMapping(value = "get-user-code")
    public String getSpotifyUserCode(@RequestParam("code") String userCode, HttpServletResponse response) throws IOException{
        code = userCode;
        AuthorizationCodeRequest authorizationCodeRequest = spotifyApi.authorizationCode(code)
            .build();
        try{
            final AuthorizationCodeCredentials authorizationCodeCredentials = authorizationCodeRequest.execute();

            spotifyApi.setAccessToken(authorizationCodeCredentials.getAccessToken());
            spotifyApi.setRefreshToken(authorizationCodeCredentials.getRefreshToken());

            System.out.println("Expires in:" + authorizationCodeCredentials.getExpiresIn());
        }catch (IOException | SpotifyWebApiException | org.apache.hc.core5.http.ParseException e) {
            System.out.println("Error:" + e.getMessage());
        }

        response.sendRedirect("http://localhost:3000/home");
        return spotifyApi.getAccessToken();
    }
}

