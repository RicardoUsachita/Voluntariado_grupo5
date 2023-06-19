<template>
  <div>
    <header class="shadow-sm bg-#CA8F28">
      <nav class="container mx-auto p-4 flex justify-between items-center">
        <div>
          <a>
            <img
                src="https://i.ibb.co/yRyDcBf/Voluntared-fotor-20230618213813.png"
                alt="Voluntared-fotor-20230618213813"
                border="0"
            />
          </a>
        </div>
        <div class="flex items-center gap-4">
          <NuxtLink to="/" class="cta-button">VoluntaRed</NuxtLink>
          <NuxtLink to="/RegistroEmergencia" class="cta-button">Registro Emergencia</NuxtLink>
          <NuxtLink to="/contact" class="cta-button">Módulo Coordinadores</NuxtLink>
        </div>
      </nav>
    </header>

    <div class="container">
      <title>VoluntaRed</title>
      <v-row justify="center" alling="center">
        <h1 class="text-center">Sistema de Gestión de Voluntariado Espontáneo</h1>
        <hr />
        <!-- Your form elements and buttons go here -->
      </v-row>
    </div>

    <footer class="container mx-auto p-4 flex justify-between border-t-2">
      <ul class="flex gap-4">
        <li>
          <NuxtLink to="/" class="cta-button">Home</NuxtLink>
        </li>
        <li>
          <NuxtLink to="/about" class="cta-button">About</NuxtLink>
        </li>
        <li>
          <NuxtLink to="/contact" class="cta-button">Contact</NuxtLink>
        </li>
      </ul>
    </footer>
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
