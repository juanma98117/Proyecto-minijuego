
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
```mermaid
   graph TD
    %% Definición del Actor
    Jugador((Jugador))

    subgraph "Sistema PreguntasDAW"
        UC1(Iniciar Partida)
        UC2(Visualizar Pregunta)
        UC3(Responder Pregunta)
        UC4(Ver Puntuación)
        UC5(Recibir Feedback)
        UC6(Finalizar Juego)
    end

    %% Relaciones de interacción
    Jugador --> UC1
    Jugador --> UC3
    
    %% Relaciones de dependencia
    UC1 -.->|include| UC2
    UC3 -.->|include| UC5
    UC3 -.->|include| UC4
    UC5 -.->|extend| UC6
    ```