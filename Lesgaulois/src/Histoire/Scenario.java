package Histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("panoramix", 5, 10);
		Gaulois obelix = new Gaulois("Obélix", 25);
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU ...");
		asterix.frapper(minus);
				
		
		
	}

}
