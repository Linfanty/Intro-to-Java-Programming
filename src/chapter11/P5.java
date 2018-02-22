package chapter11;
import java.util.*;

@SuppressWarnings("unused")
public class P5 {

		  public static void main(String[] args) {
		    Course course1 = new Course("Data Structures");
		    Course course2 = new Course("Database Systems");

		    course1.addStudent("Peter Jones"); //1
		    course1.addStudent("Brian Smith"); //2
		    course1.addStudent("Anne Kennedy");//3

		    course2.addStudent("Peter Jones");//1
		    course2.addStudent("Steve Smith");//2

		    System.out.println("Number of students in course1: "
		        + course1.getNumberOfStudents());
		    
		    String[] students = course1.getStudents();
	
		    
		    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");

		    System.out.println();
		    System.out.print("Number of students in course2: "
		        + course2.getNumberOfStudents());
		  }
		}

		class Course {
		  private String name;

		  private ArrayList<String> students = new ArrayList<>();

		  public Course(String name) {
		    this.name = name;
		  }

		  public void addStudent(String student) {
		    students.add(student);
		  }

		  public String[] getStudents() {
		    String[] result = new String[students.size()];
		    students.toArray(result); 
		    //将students Arraylist 类型 转换 成 String 类型
		    return result;
		  }

		  public int getNumberOfStudents() {
		    return students.size();
		  }
		}
