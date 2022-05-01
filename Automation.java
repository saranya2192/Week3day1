package Week3.day1;

public class Automation implements Language, Testtool {
	private int num;
	private String name;
	public void java()
	{
		System.out.println("Java is easy to learn");
	}
	public void selenium()
	{
		System.out.println("slenium is laso easy to learn");
	}
public String getName(String name) {
	return name;
}
public Automation(String name, int num)
{
	this.name=name;
	this.num=num;
	System.out.println("Name is " + "and the num "+num);
}
public static void main(String[] args) {
	
	Automation an= new Automation("Testing", 567);
	an.java();
	an.selenium();
	System.out.println("Id is "+id);
}
}
