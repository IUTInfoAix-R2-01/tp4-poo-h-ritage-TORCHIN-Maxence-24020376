package tpexosYaip7;

import java.sql.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpence;
	
	public Visit(Customer customer, Date date) {
		super();
		this.customer = customer;
		this.date = date;
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpence() {
		return productExpence;
	}

	public void setProductExpence(double productExpence) {
		this.productExpence = productExpence;
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpence=" + productExpence + "]";
	}
	
	public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        c1.setMember(true);
        c1.setMemberType("Gold");

        Visit v1 = new Visit(c1, Date.valueOf("2024-02-21"));
        v1.setServiceExpense(100.0);
        v1.setProductExpence(50.0);

        System.out.println(v1);

        Visit v2 = new Visit(c1, Date.valueOf("2024-02-22"));
        v2.setServiceExpense(200.0);
        v2.setProductExpence(80.0);

        System.out.println(v2);
    }
}
