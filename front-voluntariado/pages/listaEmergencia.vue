<template>
  <body>

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
  <div class="container">
    <title> VoluntaRed - Emergencias</title>
    <h1 class="text-center">Emergencias</h1>

    <div class="content-table">
      <form>
        <table class="table table-bordered table-hover" style="center">
          <thead class="thead-dark">
          <tr>
            <th>Id</th>
            <th>Asunto</th>
            <th>Fecha</th>
            <th>Estado</th>
            <th colspan="3">Acciones</th>
          </tr>
          </thead>
          <tbody>
          <tr
              v-for="emergency in emergencies"
              v-bind:key="emergency.id_emergencia"
          >
            <th>{{ emergency.id_emergencia }}</th>
            <th>{{ emergency.asunto }}</th>
            <th>{{ emergency.fecha }}</th>
            <th v-if="emergency.activa"> Activa </th>
            <th v-else> No activa </th>
            <td>
              <router-link
                  v-on:click="guardarId"
                  :to="'/getById-id/' + emergency.id_emergencia"
              ><button>Ver</button></router-link
              >
            </td>
            <td>
              <router-link
                  v-on:click="guardarId"
                  :to="'/updateById-id/' + emergency.id_emergencia"
              ><button>Modificar</button></router-link
              >
            </td>
            <td v-if="emergency.activa" >
              <button v-bind:id="emergency.id_emergencia" v-on:click="cambiarEstado(emergency.id_emergencia)">Desactivar</button>

            </td>
            <td v-else>
              <button v-bind:id="emergency.id_emergencia" v-on:click="cambiarEstado(emergency.id_emergencia)">Activar</button>

            </td>
          </tr>
          </tbody>
        </table>
      </form>
    </div>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
        crossorigin="anonymous"
    />
  </div>
  <footer class="container mx-auto p-4 flex justify-between border-t-2">
    <ul class="flex gap-4">
      <NuxtLink to="/" class="cta-button">Home</NuxtLink>
    </ul>
  </footer>
  </body>
</template>

<script>
export default {
  data() {
    return {
      emergencies: [], //Todas las emergencias
      tasks: [], //Tareas de la emergencia en especifico
    };
  },

  methods: {
    getData: async function () {
      try {
        let response = await this.$axios.get("/emergencia");
        this.emergencies = response.data;
      } catch (error) {
        console.log("Error", error);
      }
    },

    guardarId: async function () {
      try {
        localStorage.setItem("id_emergencia", id_emergencia);
      } catch (error) {
        console.log("Error ", error);
      }
    },

    cambiarEstado: async function(id_emergencia)
    {
      try
      {
        console.log("id: "+id_emergencia);
        let response = await this.$axios.put(
            '/cambiarEstado/' + id_emergencia, null,
            {
              params:
                  {
                    id_emergencia: id_emergencia
                  }
            });
      }
      catch(error)
      {
        console.log('Error ', error.response.data);

      }
    }
  },

  created: function () {
    this.getData();
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
  font-size: 15px;
  text-decoration: none;
  border-radius: 4px;
}
.buttons-container {
  text-align: center;
}
</style>
