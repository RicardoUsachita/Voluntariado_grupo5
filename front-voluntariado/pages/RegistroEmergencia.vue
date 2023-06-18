<template>
  <h1 class="text-center">Ingreso de Emergencia</h1>
  <body>
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
  </body>
</template>

<style>
.form-group {
  margin-bottom: 20px;
}

.label {
  display: block;
  font-weight: bold;
}

.input-field {
  width: 100%;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.submit-button {
  background-color: #0C1446;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.submit-button:hover {
  background-color: #7A95E5;
}
</style>

<script>
definePageMeta(
    {
      layout: 'detalles'
    }
)
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
    };
  },

  methods: {
    submitForm() {
      // Aquí puedes agregar la lógica para enviar los datos del formulario
      // a través de una API o realizar cualquier otra acción necesaria.
      console.log(this.formulario);
    },
  },
};
</script>