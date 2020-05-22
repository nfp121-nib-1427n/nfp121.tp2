package question1;
import java.text.DecimalFormat;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] fahrenheit) {
		// pour tous les paramètres de la ligne de commande
		int fahrenheitEntier ;
		float celsius ;
		for (String fahren : fahrenheit){
		    fahrenheitEntier = Integer.parseInt(fahren);
		    celsius = fahrenheitEnCelsius(fahrenheitEntier);
		   System.out.println(fahrenheitEntier + "\u00B0F -> " + String.format("%.1f", celsius) + "\u00B0C");
		}
		 // ligne,
																				// format
																				// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
		float celsius = ((float)5/(float)9)*(f - 32);
                celsius = ((int)(celsius * 10))/10.0f;
                return (celsius);
	}

}
