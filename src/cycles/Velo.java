package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();


    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
    }
    
    public Velo(double diamRoue) {
    	this.diamRoue = diamRoue;
    }
    
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString() {
		return "velo[braquet = " + braquet + ", diamRoue = " + diamRoue;
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
		return frequenceCoupsDePedale * braquet * diamRoue *genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
        Velo v1 = new Velo(14.5, 27.5);
        System.out.println(v1);
        System.out.println("Puissance : " + v1.getPuissance(10));
    }
}
