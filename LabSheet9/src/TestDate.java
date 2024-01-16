
public class TestDate {

	public static void main(String[] args) {
		Date d1= new Date(2023,2,8);
		System.out.println(d1);
		System.out.println();
		d1.setYear(2012);
		d1.setmonth(12);
		d1.setday(23);
		System.out.println(d1);
		System.out.print("Year is : "+d1.getYear());
		System.out.print("Month is : "+d1.getmonth());
		System.out.print("Day is : "+d1.getday());
		System.out.println();
		d1.setDate(2024, 1, 16);
		System.out.println(d1);
	}

}
