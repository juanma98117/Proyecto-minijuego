
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
    actor "Jugador" as J

    package "Sistema PreguntasDAW" {
        usecase "Iniciar Partida" as UC1
        usecase "Visualizar Pregunta" as UC2
        usecase "Responder Pregunta" as UC3
        usecase "Ver Puntuación" as UC4
        usecase "Recibir Feedback (Acierto/Error)" as UC5
        usecase "Finalizar Juego" as UC6
    }

    %% Relaciones de interacción
    J --> UC1
    J --> UC3
    
    %% Relaciones de dependencia del sistema
    UC1 ..> UC2 : <<include>>
    UC3 ..> UC5 : <<include>>
    UC3 ..> UC4 : <<include>>
    UC5 ..> UC6 : <<extend>> (Si falla o termina banco)
    ```