package question1;
import java.text.DecimalFormat;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] fahrenheit) {
		// pour tous les param�tres de la ligne de commande
		int fahrenheitEntier ;
		float celsius ;
		for (String fahren : fahrenheit){
		    fahrenheitEntier = Integer.parseInt(fahren);
		    celsius = fahrenheitEnCelsius(fahrenheitEntier);
		   System.out.println(fahrenheitEntier + "\u00B0F -> " + String.format("%.1f", celsius) + "\u00B0C");
		}
		 // ligne,
																				// format
																				// impos�s
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
		float celsius = ((float)5/(float)9)*(f - 32);
                celsius = ((int)(celsius * 10))/10.0f;
                return (celsius);
	}

}
