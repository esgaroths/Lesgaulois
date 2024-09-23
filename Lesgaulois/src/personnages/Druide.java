package personnages;
import java.util.Random;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom
				+ " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		parler("Je vais aller préparer une petite potion");
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax + 1 - effetPotionMin);
		forcePotion += effetPotionMin;
		if (forcePotion > 7) {
			parler("j'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+ forcePotion);

		}
	}
	
	public void booster(Gaulois gaulois) {
		
		if (gaulois.getNom() == "Obélix") {
			parler("Non Obélix, tu n'auras pas de potion magique");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
			} else {
				gaulois.boirePotion(forcePotion);
			}
		
	}
			
		
	
	public static void main(String[] args) {
		
	}
}

