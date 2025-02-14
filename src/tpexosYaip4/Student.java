package tpexosYaip4;

public class Student extends Person{
	private String program;
	private int year;
	private int fee;
	
	public Student(String name, String address, String program, int year) {
		super(name, address);
		this.program = program;
		this.year = year;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee = " + fee + "]";
	}
	
	public static void main(String[] args) {
        Student s1 = new Student("Idris", "AIX", "Informatique", 2);
        Student s2 = new Student("Antoine", "AIX", "Mathématiques", 1);

        System.out.println(s1);
        System.out.println(s2);

        s1.setYear(3);
        s1.setFee(1500);
        s2.setProgram("Physique");
        s2.setFee(1200);

        System.out.println(s1);
        System.out.println(s2);
    }
}
