package view;

import java.awt.*;
import javax.swing.*;

public class JPanel1 extends JPanel {
    
    //Declaración de los componentes de la interfaz gráfica
    private JLabel labelCategoria;
    private JTextArea txtPregunta;
    private JButton btnOpcion1;
    private JButton btnOpcion2;
    private JButton btnOpcion3;
    private JButton btnOpcion4;

    public JPanel1() {
        // Al crear el panel, inicializamos la interfaz
        inicializarComponentes();
    }

// Método para inicializar los componentes de la interfaz gráfica
    private void inicializarComponentes() {
        //Configuración del panel principal layout y márgenes
        this.setLayout(new BorderLayout(20, 20));
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.setBackground(new Color(245, 245, 245)); // Un gris muy claro de fondo
    }

}
