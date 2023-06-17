<template>
  <form @submit.prevent="submitForm">
    <div>
      <label for="nombre">Nombre:</label>
      <input type="text" id="nombre" v-model="formulario.nombre">
    </div>
    <div>
      <label for="descripcion">Descripción:</label>
      <textarea id="descripcion" v-model="formulario.descripcion"></textarea>
    </div>
    <div>
      <label for="fecha">Fecha:</label>
      <input type="date" id="fecha" v-model="formulario.fecha">
    </div>
    <div>
      <label for="reqs_grupales">Requisitos grupales:</label>
      <textarea id="reqs_grupales" v-model="formulario.reqs_grupales"></textarea>
    </div>
    <div>
      <label for="reqs_individuales">Requisitos individuales:</label>
      <textarea id="reqs_individuales" v-model="formulario.reqs_individuales"></textarea>
    </div>
    <div>
      <label for="longitude">Longitud:</label>
      <input type="number" id="longitude" v-model="formulario.longitude">
    </div>
    <div>
      <label for="latitude">Latitud:</label>
      <input type="number" id="latitude" v-model="formulario.latitude">
    </div>
    <button type="submit">Enviar</button>
  </form>
</template>

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