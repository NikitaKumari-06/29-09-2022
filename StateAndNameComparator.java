package com.test.bll;

import java.util.Comparator;

public class StateAndNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
	
		if(student1.getState().compareTo(student2.getState())==0) {
			if(student1.getStudentName().compareTo(student2.getStudentName())==0) {
				return 0;
			}
			else if(student1.getStudentName().compareTo(student2.getStudentName())>0) {
			return 1;
			}
			else {
				return -1;
			}
		}
		else if(student1.getState().compareTo(student2.getState())>0) {
			if(student1.getStudentName().compareTo(student2.getStudentName())==0) {
				return 0;
			}
			else if(student1.getStudentName().compareTo(student2.getStudentName())>0) {
			return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}

}

