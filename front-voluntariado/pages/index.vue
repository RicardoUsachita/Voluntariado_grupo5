<template>

  <div class="container">
    <title> VoluntaRed </title>
    <v-row justify="center" alling="center">
      <h1 class="text-center">Sistema de Gestión de Voluntariado Espontáneo</h1>
      <hr />
      <!--
      <form action="/emergencies">
        <button type="submit" value="Emergencias">
          Ir a emergencias
        </button>
      </form>
      -->
      <form action="/mapview">
        <button type="submit" value="Mapa">
          Ver mapa
        </button>
      </form>
    </v-row>


  </div>
</template>

<script>
definePageMeta({
  layout: 'default',
})
export default {
  name: 'IndexPage',
}
</script>

<style>
* {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 40px;
}
</style>