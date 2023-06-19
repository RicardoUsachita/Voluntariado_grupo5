<template>
    <div>
      <h1>Formulario de Registro</h1>
  
      <form @submit.prevent="submitForm">
        <div class="form-group">
          <label for="nombre">Nombre:</label>
          <input type="text" id="nombre" v-model="formData.nombre" class="input-field">
        </div>
        <div class="form-group">
          <label for="correo">Correo:</label>
          <input type="email" id="correo" v-model="formData.correo" class="input-field">
        </div>
        <div class="form-group">
          <label for="usuario">Usuario:</label>
          <input type="text" id="usuario" v-model="formData.usuario" class="input-field">
        </div>
        <div class="form-group">
          <label for="password">Contraseña:</label>
          <input type="password" id="password" v-model="formData.password" class="input-field">
        </div>
        <div class="form-group">
          <label for="atributos">Descripción:</label>
          <textarea id="atributos" v-model="formData.atributos" class="input-field"></textarea>
        </div>
        <button type="submit" class="submit-button">Registrarse</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        formData: {
          nombre: '',
          correo: '',
          usuario: '',
          password: '',
          atributos: ''
        }
      }
    },
    methods: {
      submitForm() {
        // Aquí puedes implementar la lógica para enviar los datos del formulario al servidor
        console.log(this.formData);
      }
    }
  }
  </script>
  