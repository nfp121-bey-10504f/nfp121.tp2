package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 *
 * @author Maroun Melhem
 * @version 10504F
 */
public class FahrenheitCelsius {

	/**
	 * Point d'entrée de "TempConverter" pour convertir de Fahrenheit à Celsius.
	 * Accepte plusieurs valeurs Fahrenheit en arguments et affiche le résultat en Celsius.
	 *
	 * @param args un tableau de chaînes de caractères avec les valeurs Fahrenheit.
	 *            Convertit chaque valeur en Celsius.
	 */
	public static void main(String[] args) {
        // Contrôle de la présence d'arguments de température Fahrenheit
        if (args.length > 0) {
            for (String valeurFahrenheit : args) {
                int tempFahrenheit = Integer.parseInt(valeurFahrenheit); // Conversion de la chaîne en entier
                float tempCelsius = convertirFahrenheitEnCelsius(tempFahrenheit); // Conversion en Celsius
                // Affichage du résultat formaté
                System.out.println(tempFahrenheit + " deg F -> " + String.format("%.1f", tempCelsius) + " deg C");
            }
        } else {
            System.out.println("Veuillez fournir au moins une valeur Fahrenheit en argument.");
        }
    }

	/**
	 * Convertit les degrés Fahrenheit en degrés Celsius.
	 *
	 * @param f la valeur en degrés Fahrenheit à convertir
	 * @return le résultat en degrés Celsius
	 */
	public static float convertirFahrenheitEnCelsius(int tempF) {
        float celsiusBrut = ((float) 5 / 9) * (tempF - 32);
        // Arrondissement à un chiffre après la virgule en utilisant des calculs mathématiques
        return Math.round(celsiusBrut * 10) / 10.0f;
    }

}
