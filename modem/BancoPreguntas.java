package modem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoPreguntas {

    private List<Pregunta> preguntas;

    public BancoPreguntas() {
        preguntas = new ArrayList<>();
        cargarPreguntas();
    }

    private void cargarPreguntas() {
        preguntas.add(new Pregunta(
            "¿Cuál es el océano más grande del mundo?",
            List.of("Atlántico", "Índico", "Ártico", "Pacífico"),
            3
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));
        preguntas.add(new Pregunta(
            "¿Quién pinto la Gioconda?",
            List.of("Miguel Ángel", "Leonardo da Vinci", "Rafael", "Boticelli"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuál es el país más poblado del mundo actualmente?",
            List.of("Estados Unidos", "China", "India", "Indonesia"),
            2
        ));

        preguntas.add(new Pregunta(
            "¿Qué serie popular incluye dragones y la familia Targaryen?",
            List.of("Juego de Tronos", "The Witcher", "Vikings", "The Last Kingdom"),
            0
        ));

        preguntas.add(new Pregunta(
            "¿Cuál es la capital de Australia?",
            List.of("Sydney", "Melbourne", "Brisbane", "Canberra"),
            3
        ));

        preguntas.add(new Pregunta(
            "¿Cuál es el material más ligero de la tabla periódica?",
            List.of("Litio", "Hidrógeno", "Helio", "Berilio"),
            0
        ));

        preguntas.add(new Pregunta(
            "¿Qué cantante lanzó la canción Shape of You??",
            List.of("Ed Sheeran", "Justin Bieber", "Bruno Mars", "Dua Lipa"),
            0
        ));

        preguntas.add(new Pregunta(
            "¿Qué película ganó el Óscar a Mejor Película en 2020?",
            List.of("Joker", "1917", "Green Book", "Parásitos"),
            3
        ));

        preguntas.add(new Pregunta(
            "¿Qué red social fue originalmente solo para estudiantes universitarios?",
            List.of("Instagram", "Facebook", "Snapchat", "Twitter"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Qué país tiene forma alargada y estrecha en Sudamérica?",
            List.of("Ecuador", "Perú", "Chile", "Uruguay"),
            2
        ));

        preguntas.add(new Pregunta(
            "¿Qué artista pintó El Grito?",
            List.of("Munch", "Van Gogh", "Monet", "Klimt"),
            0
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

     
        preguntas.add(new Pregunta(
            "¿Cuántos planetas hay en el sistema solar?",
            List.of("7", "8", "9", "10"),
            1
        ));

        // Añade más preguntas aquí
    }

    public Pregunta obtenerPreguntaAleatoria() {
        Random r = new Random();
        return preguntas.get(r.nextInt(preguntas.size()));
    }
}




