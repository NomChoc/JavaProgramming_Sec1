
public class PersonlInfo {
	private Person name;
	private Date dDay;
	private int personID;
	
	PersonlInfo(){
		name=new Person(); //	firstName="";lastName="";
		dDay= new Date(); //  dMonth=1;dDay=1;dYear=1900;
		personID=0;
	}
	PersonlInfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last);
		dDay= new Date(month,day,year);
		personID=ID;
	}
	public void setPersonlInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		dDay.setDate(month, day, year);
		personID=ID;
	}
	public String toString() {
		return "Name: "+name.toString()	+"\n"+"Date of birth: "+dDay.toString()+"\n"+"PersonID: "+personID;
	
	}
}
