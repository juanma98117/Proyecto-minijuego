```mermaid
classDiagram
    direction TB

    %% --- MODELO ---
    class Pregunta {
        -String enunciado
        -String[] opciones
        -int respuestaCorrecta
        -String categoria
        +getEnunciado() String
        +getOpciones() String[]
        +getRespuestaCorrecta() int
        +getCategoria() String
    }

    class BancoPreguntas {
        -List~Pregunta~ listaPreguntas
        -cargarPreguntas() void
        +obtenerPreguntaAleatoria() Pregunta
    }

    %% --- VISTA ---
    class JPanel1 {
        -JLabel labelCategoria
        -JTextArea txtPregunta
        -JButton btnOpcion1
        -JButton btnOpcion2
        -JButton btnOpcion3
        -JButton btnOpcion4
        +actualizarInterfaz(Pregunta p) void
        +limpiarColores() void
        +getBtnOpcion1() JButton
        +getBtnOpcion2() JButton
        +getBtnOpcion3() JButton
        +getBtnOpcion4() JButton
    }

    %% --- CONTROLADOR ---
    class JuegoController {
        -JPanel1 vista
        -BancoPreguntas modelo
        -Pregunta preguntaActual
        -int puntuacion
        +inicializarEventos() void
        +validarRespuesta(int indiceSeleccionado) void
        +gestionarAcierto() void
        +gestionarError() void
    }

    %% --- RELACIONES ---
    JuegoController --> JPanel1 : Actualiza y escucha
    JuegoController --> BancoPreguntas : Solicita datos
    JuegoController ..> Pregunta : Manipula datos de
    BancoPreguntas "1" o-- "*" Pregunta : Agregación (Contiene)
    ```
