/*
 * question 1 . Students class
 */
package com.test.bll;

public class Student implements Comparable<Student>  {
	private String studentcode;
	 private String studentname;
	 private int age;
	 private String state;
	 
	 //constructor
	 public Student() {
		 
	 	}
	 
	 public Student(String studentcode, String studentname,int age, String state) {
		 this.studentcode= studentcode;
		 this.studentname=studentname;
		 this.age=age;
		 this.state=state;
	 	}
	 
	 //get method for studentcode
	 public String getStudentCode() {
		 return studentcode;
	 	}
	 
	 //set method for studentcode
	 public void setStudentCode(String studentcode) {
		 this.studentcode=studentcode;
	 	}
	 
	 //get method for studentname
	 public String getStudentName() {
		 return studentname;
	 	}
	 
	 //set method for studentname
	 public void setStudentName(String studentname) {
		 this.studentname=studentname;
	 	}
	 
	 //get method for state
	 public  String getState() {
		 return state;
	 	}
	 
	 //set method for sate
	 public void setState(String state) {
		 this.state=state;
	 	}
	 
	 public int getAge() {
		 return age;
	 	}
	 
	 public void setAge(int age) {
		 this.age=age;
	 	} 
	 
	 public int compareTo(Student student) 
		{
			if(age==student.age) {
				return 0;
			}
			else if (age>student.age) {
				return 1;
			}
			else {
				return -1;
			}
		}
	 @Override
	 public String toString() {
		 return "Student[studentcode=" + studentcode + ", studentname=" +
	              studentname + ", age=" + age + ", state="+ state + "]";
	 	}
}
