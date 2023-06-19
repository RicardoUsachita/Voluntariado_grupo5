<template>
  <div>
    <header class="shadow-sm bg-#CA8F28">
      <title>VoluntaRed</title>
      <div>
        <a>
          <img
            src="https://i.ibb.co/yRyDcBf/Voluntared-fotor-20230618213813.png"
            alt="Voluntared-fotor-20230618213813"
            border="0"
          />
        </a>
      </div>
    </header>

    <h1 class="text-center">Ingreso de Emergencia</h1>

    <form @submit.prevent="submitForm" class="form">
      <div class="form-group">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" v-model="formulario.nombre" class="input-field">
      </div>

      <div class="form-group">
        <label for="descripcion">Descripción:</label>
        <textarea id="descripcion" v-model="formulario.descripcion" class="input-field"></textarea>
      </div>

      <div class="form-group">
        <label for="fecha">Fecha:</label>
        <input type="date" id="fecha" v-model="formulario.fecha" class="input-field">
      </div>

      <div class="form-group">
        <label for="reqs_grupales">Requisitos grupales:</label>
        <textarea id="reqs_grupales" v-model="formulario.reqs_grupales" class="input-field"></textarea>
      </div>

      <div class="form-group">
        <label for="reqs_individuales">Requisitos individuales:</label>
        <textarea id="reqs_individuales" v-model="formulario.reqs_individuales" class="input-field"></textarea>
      </div>

      <div class="form-group">
        <label for="longitude">Longitud:</label>
        <input type="number" id="longitude" v-model="formulario.longitude" class="input-field">
      </div>

      <div class="form-group">
        <label for="latitude">Latitud:</label>
        <input type="number" id="latitude" v-model="formulario.latitude" class="input-field">
      </div>

      <button type="submit" class="cta-button2">Enviar</button>
    </form>

    <h1>Lista de Tareas</h1>

    <form @submit.prevent="addTask" class="form">
      <div class="form-group">
        <label for="task">Tarea:</label>
        <input type="text" id="task" v-model="newTask" class="input-field">
      </div>
      <button type="submit" class="cta-button2">Agregar Requisitos de Habilidades</button>
    </form>

    <div>
      <h2>Habilidades:</h2>
      <ul>
        <li v-for="(task, index) in tasks" :key="index">{{ task }}</li>
      </ul>
    </div>
    <footer class="container mx-auto p-4 flex justify-between border-t-2">
      <ul class="flex gap-4">
        <NuxtLink to="/" class="cta-button">Home</NuxtLink>
        <NuxtLink to="/loginUsuario" class="cta-button">Login</NuxtLink>
        <NuxtLink to="/registroEmergencia" class="cta-button">Registro Emergencia</NuxtLink>
        <NuxtLink to="/vistaMapa" class="cta-button">Ver Mapa</NuxtLink>
        <NuxtLink to="/listaEmergencia" class="cta-button">Emergencias</NuxtLink>
      </ul>
    </footer>
  </div>
</template>


<style>
/* Your existing styles here */
</style>

<script>
export default {
  data() {
    return {
      formulario: {
        nombre: '',
        descripcion: '',
        fecha: '',
        reqs_grupales: '',
        reqs_individuales: '',
        longitude: 0,
        latitude: 0,
      },
      newTask: '',
      tasks: []
    };
  },

  methods: {
    submitForm() {
      // Aquí puedes agregar la lógica para enviar los datos del formulario
      // a través de una API o realizar cualquier otra acción necesaria.
      console.log(this.formulario);
    },
    addTask() {
      if (this.newTask !== '') {
        this.tasks.push(this.newTask);
        this.newTask = '';
      }
    }
  },
};
</script>
<style>
body {
  background-color: #FEE9E4;
  color: #2E5077;
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
  color: #2E5077;
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
  background-color: #F47784;
  color: #2E5077;
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
  color: #2E5077;
}
h1 {
  background-color: #FEE9E4;
  color: #2E5077;
  font-size: 36px;
  margin-bottom: 20px;
}
.content-table {
  background-color: #FEE9E4;
  color: #2E5077;
  border-collapse: collapse;
  width: 100%;
  margin-top: 20px;
}
.content-table th {
  background-color: #FEE9E4;
  color: #2E5077;
  padding: 10px;
  text-align: left;
}
.content-table td {
  border: 1px solid #FEE9E4;
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
  color: #2E5077;
  margin-bottom: 20px;
}
.hero-text p {
  font-size: 24px;
  color: #2E5077;
  margin-bottom: 30px;
}
.cta-button {
  display: inline-block;
  padding: 12px 24px;
  background-color: #FDB35A;
  color: #fff;
  font-size: 20px;
  text-decoration: none;
  border-radius: 4px;
}
.cta-button2 {
  display: inline-block;
  padding: 10px 18px;
  background-color: #FDB35A;
  color: #fff;
  font-family: ui-rounded, sans-serif;
  font-size: 15px;
  text-decoration: none;
  border-radius: 4px;
}
.buttons-container {
  text-align: center;
}
.form-group {
  margin-bottom: 1em;
  font-family: ui-rounded, sans-serif;
  font-size: 1em;
  color: #2E5077;
}
.input-field {
  font-size: 1.1em; /* Aumenta el tamaño de la fuente */
  padding: 0.5em; /* Ajusta el relleno para hacer el campo de entrada ligeramente más grande */
}
</style>
