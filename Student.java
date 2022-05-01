package Week3.day1;

public class Student {
	public void StudentName()
	{
		System.out.println("Saranya S");
			}
	public void Studentdept()
	{
		System.out.println("ECE");
	}
public void StudentId()
{
	System.out.println("ID is 3");
}
public static void main(String[] args) {
	College college=new College();
	Department Department=new Department();
	Student student=new Student();
	college.collegeName();
	college.collegeCode();
	college.collegeRank();
	Department.deptName();
	student.StudentName();
	student.Studentdept();
	student.StudentId();
}}

