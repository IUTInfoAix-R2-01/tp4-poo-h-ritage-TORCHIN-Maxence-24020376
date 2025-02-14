package cycles;

import java.util.Random;

public class Velo {
	private double braquet;
	private double diamRoue;
	private Random genAlea;

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
		return "velo[braquet=" + braquet + ", diamRoue" + diamRoue();
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
		return frequenceCoupsDePedale * braquet * diamRoue *genAlea.nextDouble();	}

}
