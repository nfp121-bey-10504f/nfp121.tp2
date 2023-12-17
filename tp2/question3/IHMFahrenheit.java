package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener {
    private JTextField entree = new JTextField(6);
    /** Le bouton de conversion. */
    private JButton boutonDeConversion = new JButton("convertir");
    /** La sortie en degrés Celsius. */
    private JTextField sortie = new JTextField(6);

    public IHMFahrenheit() {
        super("IHM Fahrenheit");

        setLayout(new FlowLayout());
        add(entree); add(boutonDeConversion); add(sortie);
        sortie.setEditable(false);
        getContentPane().setBackground(Color.pink);
        setLocation(100,100);
        pack(); setVisible(true);

        boutonDeConversion.addActionListener(this);
    }

    /**
     * Méthode déclenchée lorsque le bouton de conversion est appuyé.
     * Le champ de droite (les degrés Celsius) n'est pas éditable.
     * @param ae l'événement transmis
     */
    public void actionPerformed(ActionEvent ae) {
        try {
            int fahrenheit = Integer.parseInt(entree.getText()); // Conversion de la chaîne en entier
            float celsius = question1.FahrenheitCelsius.convertirFahrenheitEnCelsius(fahrenheit); // Appel de la méthode de conversion

            // Test pour le zéro absolu (-273.1°C)
            if (celsius < -273.1F) {
                celsius = -273.1F;
            }

            sortie.setText(Float.toString(celsius));
        } catch (NumberFormatException nfe) {
            sortie.setText("error !");
        }
    }

    public static void main(String[] args) {
        new IHMFahrenheit();
    }
}
