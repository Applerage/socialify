<template>
  <v-navigation-drawer v-model="drawer" app floating>
    <p>text</p>
  </v-navigation-drawer>

  <v-toolbar color="secondary">
    <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>
    <img
      :src="require('../assets/Socialify_Logo.png')"
      height="50"
      @click="this.$router.push('/home')"
    />
    <h1 @click="this.$router.push('/home')">Socialify</h1>
    <v-spacer></v-spacer>
    <v-btn icon="mdi-logout"></v-btn>
  </v-toolbar>
</template>

<script>
export default {
    data(){
        return{
            drawer: false
        }
    }
}
</script>

<style>

</style>