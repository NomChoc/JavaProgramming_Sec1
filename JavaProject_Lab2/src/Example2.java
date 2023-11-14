import java.text.*;// import format num
public class Example2 {

	public static void main(String[] args) {
		// call class decimelformat
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BuffET = 299;
		int numberofCustomer = 5;
		double netprice =BuffET*numberofCustomer;
		// apply format method to variable
		System.out.println("Buffet of "+numberofCustomer
				+"customers is "+ frm.format(netprice));
		double serviceCharge = netprice +(netprice*3/100);
		System.out.println("Add Service Charge 3% is "+frm.format(serviceCharge));
		
	}

}
