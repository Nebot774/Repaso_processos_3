# Repaso Processos 3

## Descripción
Este proyecto es una aplicación Spring Boot desarrollada para el repaso de procesos. La aplicación proporciona una API REST para obtener información sobre fechas.

## Funcionalidades
- Obtener la fecha actual.
- Añadir un número específico de días a la fecha actual.

## Tecnologías Utilizadas
- Java
- Spring Boot
- Docker (opcional)

## Cómo Ejecutar

### Requisitos Previos
- JDK 11 o superior
- Maven
- Docker (si se desea utilizar para el despliegue)

### Pasos para la Ejecución
1. Clonar el repositorio:

2. Navegar al directorio del proyecto:

3. Compilar y ejecutar la aplicación:


## Acceso a la API

Los siguientes endpoints están disponibles:

- `GET /api/date/current`: Devuelve la fecha actual.
- `GET /api/date/add/{n}`: Añade `n` días a la fecha actual y devuelve el resultado.

Ejemplo de uso:

get http://localhost:8080/api/date/current
get http://localhost:8080/api/date/add/5

