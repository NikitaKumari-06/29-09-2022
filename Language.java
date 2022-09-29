/*
 * Question  1.	Create a list of elements as shown below into the LinkedList and name it as languages.

C
C++
Java
Kotlin
Python
Perl
Ruby

Display the created list.

Remove an element at index 5 and display the list

Remove ‘Kotlin’ and display the list

Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

Remove all the elements from the list and display the list.

 */
package com.test.bll;

import java.util.LinkedList;

public class Language {

	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();
		
		//add elements into a list
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		// Display the LinkedList
		System.out.println("Created list : " +languages);
		System.out.println();
		
		//Remove element at index 5
		String str = languages.remove(5);
		System.out.println("Removed element : " + str);
		System.out.println("Updated list : " + languages);
		System.out.println();
		
		//Remove all Scripting language
		LinkedList<String> scriptingLanguage = new LinkedList<>();
		scriptingLanguage.add("Python");
		scriptingLanguage.add("Ruby");
		scriptingLanguage.add("Perl");
		
		System.out.println("Scripting Languages : " +scriptingLanguage);
		languages.removeAll(scriptingLanguage);
		System.out.println("List after removing scripting languages : " + languages);
		System.out.println();
		
		//remove all the elements from the list
		languages.clear();
		System.out.println("List after removing all the list :  " + languages);

	}

}
