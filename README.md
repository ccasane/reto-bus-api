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
