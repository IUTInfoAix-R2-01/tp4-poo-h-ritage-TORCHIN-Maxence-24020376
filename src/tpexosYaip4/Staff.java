package tpexosYaip4;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}

	public static void main(String[] args) {
        Staff staff1 = new Staff("Torchin","Coudoux","Lycée Jean Moulin", 2500.0);
        Staff staff2 = new Staff("Ilann","AIX","Université Aix-Marseille", 3200.0);

        System.out.println(staff1);
        System.out.println(staff2);

        staff1.setSchool("Collège Victor Hugo");
        staff1.setPay(2600.0);
        staff2.setPay(3300.0);

        System.out.println(staff1);
        System.out.println(staff2);
    }
}
