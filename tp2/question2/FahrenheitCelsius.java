package question2;

/**
 * Classe pour convertir des degrés Fahrenheit en degrés Celsius.
 * Gère les exceptions NumberFormatException pour les entrées non numériques.
 *
 * @author Maroun Melhem
 * @version 10504F
 */
public class FahrenheitCelsius {

    /**
     * Le point d'entrée de cette application. Convertit des degrés Fahrenheit
     * donnés en argument de la ligne de commande en degrés Celsius.
     * Gère les NumberFormatExceptions pour les entrées non valides.
     *
     * @param args les arguments de la ligne de commande représentant des degrés Fahrenheit.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir au moins une valeur Fahrenheit en argument.");
            return; // Exit the method if no arguments are provided
        }

        for (String arg : args) {
            try {
                int fahrenheit = Integer.parseInt(arg);
                float celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + " deg F -> " + String.format("%.1f", celsius) + " deg C");
            } catch (NumberFormatException nfe) {
                System.out.println("error : " + nfe.getMessage());
            }
        }
    }

    /**
     * Convertit les degrés Fahrenheit en degrés Celsius.
     *
     * @param f la valeur en degrés Fahrenheit à convertir
     * @return la conversion en degrés Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        return ((float) 5 / 9) * (f - 32);
    }

}
