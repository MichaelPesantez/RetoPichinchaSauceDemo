# Automatizacion E2E

### Automatizacion de pruebas E2E usando Serenity BDD con Screenplay



#### Autor: Michael Pesantez


## Prerequisitos

- Maquina Local con sistema operativo Windows 11 64 bits

<img width="160" height="28" alt="Image" src="https://github.com/user-attachments/assets/ebc61342-7d30-496e-a321-897c635606f2" />



- IDE IntelliJ version 2025.3.2


<img width="80" height="80" alt="Image" src="https://github.com/user-attachments/assets/654db531-ce9e-4153-b9e5-998dd682abc4" />



- Gradle version 7.6.1 configurado en las variables de entorno de la maquina


<img width="100" height="100" alt="Image" src="https://github.com/user-attachments/assets/ad0524e0-abb2-450f-ba64-ef7d38431951" />


- Java 17 configurado en las variables de entorno de la maquina


<img width="100" height="100" alt="Image" src="https://github.com/user-attachments/assets/42803071-ff01-4126-be0a-5deeaf4dc73f" />



## Instalación

- Clonar repositorio desde el IDE IntelliJ
- Descargar todas las dependencias detalladas en el archivo buil.gradle

## Instrucciones

### El test se puede ejecutar de dos maneras:

- Correr el proyecto desde la clase MainRunner ubicada dentro de la ruta /src/test/java/com/pichincha/saucedemo/runners
- Ejecutar en la terminal el comando `gradle clean test`
> La automatizacion genera reportes automáticamente, los reportes generados por Serenity BDD se los puede visualizar ejecutando el index.html que se crea después de correr el programa dentro de la ruta: `/target/site/serenity/index.html`


# Nota
#### Todos los reportes generados en Cucumber se encuentran denrtro de la ruta `/target/reports/`