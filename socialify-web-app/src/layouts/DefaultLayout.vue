<template>
  <nav-bar-component></nav-bar-component>
  <router-view></router-view>
</template>

<script>
import NavBarComponent from "../components/NavBarComponent.vue";
export default {
  components: { 
      NavBarComponent 
  },
};
</script>

<style>
</style>