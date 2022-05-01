package Week3.day1;

public class Students {
	public int getStudentInfo(int id) {
		return id;
	}
public void getStudentInfo(int id, String name)
{
	System.out.println("id is " +id);
	System.out.println("name is " +name);
}
public void getStudentInfo(String email, long phoneNo)
{
	System.out.println("email is "+email);
	System.out.println("Phone no is "+phoneNo);
}
public static void main(String[] args) {
	Students stu=new Students();
	int students= stu.getStudentInfo(1);
	stu.getStudentInfo(3, "Saranya");
	stu.getStudentInfo("123@6.com", 897654321);
}
}
