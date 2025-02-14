package cycles;

public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

     
    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet,diamRoue);
        this.setFacteurPuissanceMoteur(coupleMoteur);
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(diamRoue);
        this.setFacteurPuissanceMoteur(coupleMoteur);
    }

	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
		return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public static void main(String[] args) {
		VeloElec veloElec1 = new VeloElec(14.5, 27.5, 20.0);
		VeloElec veloElec2 = new VeloElec(29.0, 18.0);
		
		System.out.println("Test du VeloElec 1 : " + veloElec1);
		System.out.println("Test du VeloElec 2 : " + veloElec2);
	    
		double puissance1 = veloElec1.getPuissance(90);
		double puissance2 = veloElec2.getPuissance(80);

		System.out.println("Puissance du VeloElec 1 (90 coups de pédale) : " + puissance1);
		System.out.println("Puissance du VeloElec 2 (80 coups de pédale) : " + puissance2);

		veloElec1.setFacteurPuissanceMoteur(25.0);
		System.out.println("Nouvelle puissance du VeloElec 1 (90 coups de pédale) après modification du moteur : " + veloElec1.getPuissance(90));

		System.out.println("Facteur de puissance moteur par défaut : " + VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());

	    VeloElec.setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(17.5);
	    System.out.println("Nouveau facteur de puissance moteur par défaut : " + VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
	}
}
