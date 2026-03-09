# challenge-conversor-de-monedas-one-g9
Conversor de Monedas - Challenge Alura Latam (G9-ONE)
¡Bienvenido al proyecto Conversor de Monedas! Esta aplicación te permite convertir entre diferentes monedas de manera sencilla y rápida. Utiliza tasas de cambio actualizadas para proporcionar resultados precisos.

Tabla de Contenidos
Descripción
Funcionalidades
Tecnologías Utilizadas
Instalación
Uso
Requisitos
Capturas de Pantalla
Mejoras Futuras
Contribución
Créditos
Descripción
Esta aplicación fue desarrollada como parte del curso Practicando con Java: Challenge Conversor de Monedas en Alura Latam. Permite a los usuarios seleccionar dos monedas e ingresar un monto, con estas acciones el programa realiza la conversión consultando la tasa de cambio actualizada mediante una llamada HTTP.

Funcionalidades
Conversión entre múltiples monedas (USD, MXN, BRL, GBP, KRW, CLP)
Menú interactivo por consola.
Consulta en tiempo real de la tasa de cambio usando la API pública de ExchangeRate-API. https://v6.exchangerate-api.com/
Procesamiento de JSON con Gson.
Arquitectura organizada en clases independientes:
ConsultaMoneda → Maneja la petición HTTP y el JSON.
ConversorMoneda → Realiza la operación matemática.
GenerarApi → Construye la URL dinámica.
Moneda → Record con los datos obtenidos de la API.
Principal → Contiene el menú y la lógica de interacción.
Tecnologías Utilizadas
Java 17+
Gson para convertir JSON a objetos Java
HttpClient, HttpRequest, HttpResponse (Java estándar)
ExchangeRate-API para obtener tasas de cambio
Instalación
Para ejecutar este proyecto, sigue estos pasos:

Clona el repositorio:
git clone [URL del repositorio]```(agregar url correcta)```
Navega al directorio del proyecto:
cd challenge-ConversorDeMonedas
Compila y ejecuta el proyecto.
Uso
El programa muestra un menú de opciones con diferentes conversiones de monedas.
El usuario elige qué conversión realizar.
El usuario ingresa un monto.
El resultado se muestra en pantalla.
Requisitos
Tener Java 17 o superior instalado.
Contar con una clave válida de ExchangeRate-API (gratuita).
Conexión a internet para consultar las tasas.
Capturas de Pantalla
Pantalla-inicial Utilice System.out.printlndentro de la clase ConsultaMoneda para comprobar que estemos realmente utilizando la API.

Pantalla-inicial Con la opción 11 el programa termina de ejecutarse.

Asegúrate de contar con tu propia clave de ExchangeRate-API.
Mi clave, la utilizada en este proyecto en la clase GenerarApi, se desactivara después de entregar el challenge.
Revisa la documentación de ExchangeRate-API para mayor información.
Mejoras Futuras
Crear una versión con interfaz gráfica.
Historial de conversiones
Soporte para más Monedas
Registros con marca de tiempo
Conclusión
Este proyecto me permitió aplicar los conceptos impartidos en clases. Espero en el futuro poder modificar un poco el diseño para permitir un mantenedor de temperaturas y divisas para que el usuario pueda eliminar e incorporar sus propios elementos. En este minuto, gracias al diseño actual de la aplicación, ésto es posible solo a través de un requerimiento que, tras evaluado, puede constituir una mejora y posterior planificación de desarrollo.


