package question2;

import junit.framework.TestCase;

/**
 * Classe-test FahrenheitCelsiusTest. Les tests unitaires de FahrenheitCelsius.
 *
 * @author Maroun Melhem
 * @version 1.0
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document © 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le même paquetage.
 * Les "fixtures" forment un ensemble de conditions qui sont vraies pour chaque
 * méthode Test à exécuter. Il peut y avoir plus d'une méthode Test dans une classe
 * Test; leur ensemble forme un objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les fixtures, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class FahrenheitCelsiusTest extends TestCase {

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest() {
    }

    /**
     * Met en place les fixtures.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() {
        // Initialisez ici vos fixtures
    }

    /**
     * Supprime les fixtures
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() {
        // Libérez ici les ressources engagées par setUp()
    }

    /**
     * Teste le cas où une NumberFormatException doit être levée.
     */
    public void testNumberFormatException() {
        try {
            FahrenheitCelsius.fahrenheitEnCelsius(Integer.parseInt("NotANumber"));
            fail("Une NumberFormatException était attendue");
        } catch (NumberFormatException e) {
            // L'exception attendue a été levée.
        }
    }

    /**
     * Teste la méthode fahrenheitEnCelsius pour s'assurer que la conversion
     * est correctement effectuée avec des entrées valides.
     */
    public void testFahrenheitEnCelsius() {
        assertEquals("0 degrés F devrait être converti en -17.8 degrés C",
                     -17.8,
                     FahrenheitCelsius.fahrenheitEnCelsius(0),
                     0.1);
        assertEquals("100 degrés F devrait être converti en 37.8 degrés C",
                     37.8,
                     FahrenheitCelsius.fahrenheitEnCelsius(100),
                     0.1);
    }
}
