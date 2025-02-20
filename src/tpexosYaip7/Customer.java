package tpexosYaip7;

public class Customer {
	private String name;
	private boolean member = false;
	private String memberType;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
	
	public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        System.out.println(c1);
        System.out.println(c2);

        c1.setMember(true);
        c1.setMemberType("Or");

        c2.setMember(true);
        c2.setMemberType("Argent");

        System.out.println(c1);
        System.out.println(c2);

        c2.setMember(false);
        c2.setMemberType(null);

        System.out.println(c2);
    }
}
