
public class Invoice {
	private int id ;
	private Customer customer;
	private double amounit;
	
	Invoice(int id,Customer customer,double amounit){
		this.id=id;
		this.customer=customer;
		this.amounit=amounit;
	}
	public int getID() {
		return id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public double getAmount() {
		return this.amounit;
	}
	public void setAmount(double amounit) {
		this.amounit=amounit;
	}
	public int getCustomerID() {
		return getCustomer().getID();
	}
	public String getCustomerName() {
		return getCustomer().getName();
	}
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	public double getAmountAfterDiscount() {
		return getAmount()-(getAmount()*getCustomerDiscount()/100);
	}public String toString() {
		return "Invoice [id= "+id+",customer= "+getCustomerName()+",amount= "+getAmountAfterDiscount()+"]";
	}
}
