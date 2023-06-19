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


export default {
  name: 'IndexPage',
}
</script>

<style>

body {
  background-color: #fffffe;
  color: #192D36;
  font-family: ui-rounded, sans-serif;
  margin: 0;
  padding: 0;
}

.container {

  max-width: 960px;
  margin: 0 auto;
  padding: 20px;
}

body2 {
  background-color: #CA8F28;
  color: #192D36;
  font-family: ui-rounded, sans-serif;
  margin: 0;
  padding: 0;
}

.header2 {
  background-color: #87ACA3;
  padding: 10px;
  text-align: center;
}

header {
  background-color: #175873;
  color: #192D36;
  padding: 0px;
  text-align: center;
}

header img {
  max-width: 250px;
  height: auto;
}
.logo {
  margin-bottom: 10px;
}

.logo h1 {
  font-family: ui-rounded, sans-serif;
  font-size: 36px;
  color: #192D36;
}

h1 {
  background-color: #fffffe;
  color: #192D36;
  font-size: 36px;
  margin-bottom: 20px;

}
.content-table {
  background-color: #fffffe;
  color: #192D36;
  border-collapse: collapse;
  width: 100%;
  margin-top: 20px;
}

.content-table th {
  background-color: #fffffe;
  color: #192D36;
  padding: 10px;
  text-align: left;
}

.content-table td {
  border: 1px solid #fffffe;
  padding: 10px;
}
.hero-image {

  background-size: cover;
  background-position: center;
  height: 400px;

}

.hero-text {
  padding-top: 150px;
  text-align: center;

}

.hero-text h2 {
  font-size: 24px;
  color: #192D36;
  margin-bottom: 20px;
}

.hero-text p {
  font-size: 24px;
  color: #192D36;
  margin-bottom: 30px;
}

.cta-button {
  display: inline-block;
  padding: 12px 24px;
  background-color: #0C1446;
  color: #fff;
  font-size: 20px;
  text-decoration: none;
  border-radius: 4px;
}
.buttons-container {
  text-align: center;
}

</style>
