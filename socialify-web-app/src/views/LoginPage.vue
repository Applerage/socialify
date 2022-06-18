<template>
  <v-container fluid>
    <v-row class="mb-2" justify="center" no-gutters>
      <v-col lg="2">
        <v-card class="pa-2 my-13" color="secondary" outlined tile>
            <v-card-title class="justify-center text-h3 ma-10">Login</v-card-title>
          <v-card-actions class="justify-center ma-10">
            <v-btn variant="contained-text" size="x-large" color="primary" class="pa-3" @click="login">Login</v-btn>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import axios from "axios";
export default {
  methods: {
    login: async function () {
      await axios
        .get("http://localhost:8080/api/login")
        .then((response) => response.data)
        .then((response) => {
          window.location.replace(response);
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style>
</style>
