
# Conversor de Monedas - Challenge ONE

Segundo proyecto del desafío **Oracle Next Education (ONE)**, Grupo 8 - 2025, Formación Java Backend.

## 📌 Descripción

Este proyecto es una aplicación de consola desarrollada en Java que permite convertir montos entre diferentes monedas. Fue creado como parte del programa de formación **Oracle Next Education** en colaboración con **Alura Latam**, con el objetivo de aplicar conceptos de programación orientada a objetos y manejo de APIs externas.

## 🛠️ Tecnologías Utilizadas

- **Lenguaje de programación:** Java
- **Paradigma:** Programación Orientada a Objetos (POO)
- **IDE recomendado:** IntelliJ IDEA 
- **Control de versiones:** Git y GitHub
- **Librerías usadas:** GSON, la cual sirve para el parseo de objetos java a JSON y viceversa. La puedes descargar de la web: https://mvnrepository.com/artifact/com.google.code.gson/gson


## 🚀 Funcionalidades

- Conversión de monedas utilizando tasas de cambio actualizadas.
- Interfaz de usuario en consola para una interacción sencilla.
- Manejo de errores y validación de entradas del usuario.

## 📂 Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

![Estructura-del-proyecto](images/estructura.png)


- `Main.java`: Clase principal que inicia la aplicación y gestiona la interacción con el usuario.
- `CurrencyConverter.java`: Contiene la lógica para realizar las conversiones de moneda.
- `ExchangeRateAPI.java`: Maneja las solicitudes a la API externa para obtener las tasas de cambio actuales.

## ⚙️ Requisitos

- **Java Development Kit (JDK) 17** o superior instalado en tu sistema.
- **Conexión a Internet** para obtener las tasas de cambio actualizadas desde la API.

## 🧪 Ejecución del Proyecto

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/Lunisa202/Conversor-de-Monedas-ChallengeONE.git
   ```

2. Abre el proyecto en tu IDE de Java preferido.

3. Ejecuta la clase `Main.java` para iniciar la aplicación.

4. Sigue las instrucciones en la consola para realizar conversiones de moneda.

## 📸 Capturas de Pantalla
### Ejecución de la clase main
![Programa en ejecución-1](images/main.png)

### Interfaz de linea de comandos
![Programa en ejecución-2](images/ejecucion.png)

### Validación de las opciones a elegir por el usuario (siempre ser{a un número double)
![Programa en ejecución-2](images/validacion-numeros.png)


### Validación del monto de dinero ingresado por el usuario (siempre será un número double)
![Programa en ejecución-2](images/validacion-numeros.png)

## 👩‍💻 Autor

- **Carolina Limay** - [GitHub](https://github.com/Lunisa202)

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
