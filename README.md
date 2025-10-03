# Reto Bus API - Backend

![Badge Java](https://img.shields.io/badge/Java-21-blue)
![Badge Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.11-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18.0-blue)

## ✨ Descripción

Este parte del reto corresponde al backend del reto Bus API, desarrollado con Spring Boot y PostgreSQL.
Su propósito es gestionar la información de buses y marcas, exponiendo endpoints REST para su consumo desde el frontend.

## 🚀 Contenido

La API está estructurada de la siguiente manera:

- **Model**: Contiene las entidades Bus, Marca que representan las tablas de la base de datos.
- **Repository**: Interfaces que gestionan la persistencia usando Spring Data JPA.
- **Service**: Lógica.
- **Controller**: Controladores REST que exponen los endpoints.
- **application.properties**: Configuración de la base de datos y parámetros del proyecto.

## 🛠️ Configuración 

Para ejecutar el proyecto correctamente, asegúrate de configurar las siguientes variables de entorno o bien modificar directamente el archivo application.properties:

- spring.datasource.username: Usuario de la base de datos.
- spring.datasource.password: Contraseña de la base de datos.
- spring.datasource.url: Nombre de la base de datos por defecto busesdb, pero puedes cambiarlo.
- server.port: Puerto de ejecución de la API.

<img width="542" height="100" alt="image" src="https://github.com/user-attachments/assets/e7c013ff-d260-41bc-96d2-b94b1e2ea1c7" />
<br>
<img width="179" height="48" alt="image" src="https://github.com/user-attachments/assets/bfe5f9c5-9240-436b-8ded-04945a1f7eba" />

También puedes configurar estas propiedades como variables de entorno del sistema para no exponer credenciales en el repositorio, aunque en este caso, al ser un proyecto con fines de demostración, no representa un problema.

La API cuenta con autenticación **Basic Auth**.
Por defecto, viene configurado un usuario y contraseña predeterminados, los cuales puedes modificar en el archivo application.properties o en variables de entorno:

<img width="371" height="56" alt="image" src="https://github.com/user-attachments/assets/2720dce5-5af2-4021-a083-b0794686857d" />

