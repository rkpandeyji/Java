package Student;

public class Student {
	private String name;
	private int roll_no;
	private long phone_number;
	private String address;
	
	public void setName(String name) {this.name=name;}
	public void setRollNo(int roll_no) {this.roll_no=roll_no;}
	public void setPhonNumber(int phone_number) {this.phone_number=phone_number;}
	public void setAddress(String address) {this.address=address;}
	
	public String getName() {return name;}
	public int getRollNo() {return roll_no;}
	public long getPhoneNumber() {return phone_number;}
	public String getAddress() {return address;}

	//constructor
	Student(){}
	Student(String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	Student(String name, int roll_no, long phone_number,String address)
	{
		this.name= name;
		this.roll_no= roll_no;
		this.phone_number = phone_number;
		this.address = address;
	}
	
	public static void main (String[] args) {
		Student s = new Student("John", 2);
		System.out.println("Name : " + s.getName() + "\nRoll No : " + s.getRollNo() + "\n\n");
		     Student s2 = new Student("Daniel",3,883392766,"Delhi, India");
		     Student s3 = new Student("Sam",4,998765670, "Mumbai, India");
		     System.out.println("Name : " + s2.getName() + "\nRoll No : " + s2.getRollNo() + "\nMobile No : " + s2.getPhoneNumber());
		     System.out.println("Address : " + s2.getAddress() + "\n\n\n");
		     
		     System.out.println("Nmae : " + s3.getName() + "\nRoll No : " + s3.getRollNo() + "\nMobile No : " + s3.getPhoneNumber());
		     System.out.println("Address : " + s3.getAddress());
	}
}
