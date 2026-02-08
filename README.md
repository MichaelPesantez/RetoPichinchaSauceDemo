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







# CONCLUSIONES

## EVALUACION DE LAS PRUEBAS REALIZADAS

### 1. Resumen Ejecutivo
   Se llevó a cabo un ciclo de pruebas automatizadas bajo el enfoque **E2E** sobre la plataforma de comercio electrónico **SauceDemo**. El objetivo principal fue validar la integridad del flujo crítico de negocio, desde el acceso del usuario hasta la confirmación de la transacción, garantizando que los componentes del sistema interactúen correctamente.

### 2. Alcance de la Validación
   El proceso de automatización cubrió satisfactoriamente las siguientes funcionalidades clave:

- **Gestión de Accesos:** Validación del proceso de autenticación con credenciales autorizadas.

- **Gestión de Inventario:** Selección y adición efectiva de múltiples artículos al carrito de compras.

- **Flujo de Transacción:** Revisión del carrito, ingreso de datos de facturación/envío y procesamiento de la orden.

- **Confirmación de Operación:** Verificación del estado final de éxito mediante el mensaje: “Thank you for your order”.

### 3. Resultados y Hallazgos Detallados
   Tras la ejecución de los scripts de prueba, se exponen las siguientes conclusiones técnicas:

- **Efectividad del Software:** El 100% de los casos de prueba se ejecutaron con éxito, sin registrar excepciones, fallos de carga o errores de respuesta por parte del servidor.

- **Observación de Seguridad/Validación:** Se identificó que los campos de entrada de texto carecen de validaciones estrictas (máscaras de entrada o restricciones de tipo de carácter). Si bien esto no impidió la compra, representa una oportunidad de mejora en la integridad de los datos.

- **Disponibilidad y Rendimiento:** No se detectaron intermitencias, latencias inusuales ni denegaciones de servicio, confirmando la estabilidad del entorno bajo las condiciones de prueba actuales.

### 4. Recomendaciones Estratégicas
   Dada la naturaleza crítica y repetitiva de este flujo, se recomienda firmemente la adopción permanente de estas pruebas automatizadas. La implementación de este marco de trabajo permite:

- **Optimización de Recursos:** Liberar al equipo de control de calidad de tareas manuales monótonas, permitiéndoles enfocarse en pruebas de exploración y usabilidad.

- **Escalabilidad:** Ejecutar ciclos de pruebas masivos y recurrentes con un costo marginal mínimo.

- **Reducción del Time-to-Market:** Detectar regresiones de manera inmediata ante cualquier cambio en el código fuente, asegurando una entrega continua de alta confiabilidad.