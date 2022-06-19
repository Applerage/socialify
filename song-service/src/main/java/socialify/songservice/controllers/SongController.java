package socialify.songservice.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialify.songservice.models.Song;
import socialify.songservice.rabbitmq.CustomMessage;
import socialify.songservice.rabbitmq.MQConfig;
import socialify.songservice.services.SongService;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping("/save")
    public Song saveSong(@RequestBody Song song){
        return songService.saveSong(song);
    }

    @GetMapping("/{id}")
    public Song findSongById(@PathVariable("id") String id){
        return songService.findSongById(id);
    }

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage message) {
        message.setMessageId(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        template.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY, message);
        return "Message published.";
    }
}
