package chapter10;

public class P9 {
		  public static void main(String[] args) {
		    CourseNew course1 = new CourseNew("Data Structures");
		    CourseNew course2 = new CourseNew("Database Systems");

		    course1.addStudent("A");
		    course1.addStudent("B");
		    course1.addStudent("C");

		    course2.addStudent("X");
		    course2.addStudent("Y");

		    System.out.println("Number of students in course1: "
		      + course1.getNumberOfStudents());
		    String[] students = course1.getStudents();
		    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");
		    
		    System.out.println();
		    System.out.print("Number of students in course2: "
		      + course2.getNumberOfStudents());
		    
		    course1.dropStudent("S1");
		    System.out.println("Number of students in course1: "
		      + course1.getNumberOfStudents());
		    students = course1.getStudents();
		    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");
		    
		    course1.clear();
		    System.out.println("\nNumber of students in course1: "
		      + course1.getNumberOfStudents());
		  }
		}

		class CourseNew {
		  @SuppressWarnings("unused")
		private String name;
		  private String[] students = new String[2];
		  private int numberOfStudents;

		  public CourseNew(String name) {
		    this.name = name;
		  }

		  public void addStudent(String student) {
		    if (numberOfStudents == students.length) {
		      increaseSize();
		    }

		    students[numberOfStudents] = student;
		    numberOfStudents++;
		  }
		  
		  private void increaseSize() {
		    String[] temp = new String[students.length * 2];
		    System.arraycopy(students, 0, temp, 0, students.length);
		    students = temp;
		  }

		  public String[] getStudents() {
		    return students;
		  }

		  public int getNumberOfStudents() {
		    return numberOfStudents;
		  }
		  
		  /** Clear the course */
		  public void clear() {
		    for (int i = 0; i < numberOfStudents; i++) 
		      students[i] = null;
		    numberOfStudents = 0;
		  }
		  

		  public void dropStudent(String student) {
		    for (int i = 0; i < numberOfStudents; i++) {
		      if (students[i].equals(student)) {
		    
		        for (int k = i + 1; k < numberOfStudents; k++) {
		          students[k - 1] = students[k];
		        }
		        
		        numberOfStudents--;
		        break;
		      }
		    }
		  }
		}
