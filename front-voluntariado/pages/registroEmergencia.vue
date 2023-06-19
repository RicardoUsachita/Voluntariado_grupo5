<template>
  <div>
    <h1 class="text-center">Ingreso de Emergencia</h1>
    <form @submit.prevent="submitForm">
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
      <button type="submit" class="submit-button">Enviar</button>
    </form>
    <h1>Lista de Tareas</h1>
  
      <form @submit.prevent="addTask">
        <div class="form-group">
          <label for="task">Tarea:</label>
          <input type="text" id="task" v-model="newTask" class="input-field">
        </div>
        <button type="submit" class="submit-button">Agregar Requisitos de Habilidades</button>
      </form>
  
      <div>
        <h2>Habilidades:</h2>
        <ul>
          <li v-for="(task, index) in tasks" :key="index">{{ task }}</li>
        </ul>
      </div>
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
