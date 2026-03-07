## En este apartado vamos a definir la arquitectura técnica del juego que tenemos en desarrallo.

## === MODELO (LÓGICA DE DATOS) ===
## El modelo, solo gestionará la información.

## Clase Pregunta: 
## Es un objeto simple que representa una pregunta individual.
## Atributos: 
## String enunciado: El texto de la pregunta.
## String[] opciones: Un array de 4 textos para las respuestas.
## int respuestaCorrecta: El índice (0 a 3) de la opción válida.
## String categoria: El nombre de la categoría (El más listo, DAW , etc.).

## Métodos: Getters para todos los atributos.

## Clase BancoPreguntas:
## Es el almacén que gestiona el listado de preguntas.

## Atributos:
## List<Pregunta> listaPreguntas: Una colección con todas las preguntas disponibles.

## Métodos: 
## cargarPreguntas() -> Método privado para inicializar el juego con datos.
## obtenerPreguntaAleatoria() -> Retorna una pregunta al azar y, opcionalmente, la marca como usada para no repetirla.

## === VISTA (LA INTERFAZ GRÁFICA) ===

## Clase JPanel1:
## Atributos: Los componentes Swing (JButton, JLabel, JTextArea).
## Métodos: 
## actualizarInterfaz(Pregunta p): Recibe un objeto Pregunta y setea el texto en el área de la pregunta y en los botones.
## limpiarColores(): Restablece los botones al color original tras un acierto/error. 
## Getters: Necesarios para que el controlador pueda añadir los ActionListener a los botones.

## === CONTROLADOR ===
## El controlador es la clase que une todo y decide lo que pasa en el modelo.

## ClaseJuegoController

## Atributos:
## JPanel1/vista
## BancoPreguntas/modelo
## Pregunta preguntaActual
## int puntuacion

## Métodos: 
## inicializarEventos(): Añade los escuchadores de clic a los botones de la vista.
## validarRespuesta(int indiceSeleccionado): Copara el índice del botón pulsado con el respuestaCorrecta del modelo.
## gestionarAcierto(): Suma puntos, cambia el botón a verde y pide una nueva pregunta.
## gestionarError(): Cambia rl botón a rojo y termina el juego o resta vidas.




