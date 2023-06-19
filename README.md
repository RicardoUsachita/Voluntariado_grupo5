<div align="center">
      <h1> <img src="https://th.bing.com/th/id/R.70c11b59c144e8d8af1a292274043105?rik=qsIhI%2f3hvZdFJQ&pid=ImgRaw&r=0" width="80px"><br/>Laboratorio TDB </h1>
     </div>

# Voluntariado_grupo5

## Integrantes
- Ricardo Arancibia(Backend)
- Hernán Aravena (Backend)
- Bryan Salgado (Fronted)
- Constanza Palomo (Frontend)
- Semestre: 1-2023
- Fecha de entrega: 19/06/2023




# Tecnologías utilizadas🛠:
 ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Vue.js](https://img.shields.io/badge/vuejs-%2335495e.svg?style=for-the-badge&logo=vuedotjs&logoColor=%234FC08D) 
   

### Instrucciones de Instalación 💻:
Para poder ejecutar el proyecto se deben tener instaladas las siguientes herramientas:

    - Nodejs
    - Vue 2x
    - Nuxt 3
    - Postgres 12 o superior
    - Java 17
    - PgAdmin 4
    
Primeramente se debe clonar el repositorio proporcionado, dentro del cual se encontrarán las carpeta "voluntariado"(back-end), "front-voluntariado"(front-end) y "db" donde se podrán encontrar los scripts para crear y poblar la base de datos del programa.
### Montar la base de datos 🚀:

Para montar la DB debe seguir los siguientes pasos:
1. Abrir pgAdmin 4
2. Autenticarse con el usuario y contraseña correspondiente a su instalación de postgres, esta debe ser la misma que se encuentra en el archivo "application.properties" de la carpeta "voluntariado", en caso de ser distinta se debe cambiar en el archivo.
3. Crear una nueva base de datos con el nombre "bd_vol"
4. Seleccionar la base de datos creada y en la pestaña "Tools" seleccionar la opción "Query Tool"
5. En la ventana que se abrirá, ejecutar el script del archivo "create_table.sql" que se encuentra en la carpeta "db" del proyecto.
6. Luego ejecutar el scrip del archivo "import.sql" que se encuentra en la carpeta "db" del proyecto.
7. Con esto la base de datos ya se encontrará creada y poblada con los datos necesarios para el funcionamiento base del programa.

### Montar el back-end 🚀:

Para montar el back-end se debe abrir la carpeta "voluntariado" del proyecto con alguna IDE que soporte Java 17, se recomienda utilizar IntelliJ IDEA. Una vez abierta la carpeta, se debe ejecutar el archivo "VoluntariadoApplication.java" de la carpeta "voluntariado". Con esto el back-end ya se encontrará en funcionamiento.

### Montar el front-end 🚀:

Para iniciar el front se debe abrir la carpeta "front-voluntariado" del proyecto clonado, luego se debe abrir una terminal en la carpeta y ejecutar el siguiente comando para instalar las dependencias:
```
npm install
```
En caso de que falte instalar alguna dependencia(como axios), se debe ejecutar el siguiente comando:
```
npm install <nombre_modulo> -> En este caso sería: npm install axios
```
Luego para poner en marcha el fronted se ejecuta el comando:
```
npm run dev
```
Finalmente, para acceder a la vista esta se encontrará en el puerto:
```
http://localhost:8080/
```

### Extra📌📌:
En caso de que la biblioteca leaflet genere algun problema ejecutar:
```
npm install leaflet-defaulticon-compatibility --save
```
Luego volver a ejecutar el comando para poner en marcha.
