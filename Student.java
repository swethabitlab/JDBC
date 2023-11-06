package com.swetha;

import java.util.TreeSet;

public class Student implements Comparable<Student> {
	private int roll_no;
	private String name;
	private int age;
	public Student(int roll_no, String name, int age) {
	this.roll_no = roll_no;
	this.name = name;
	this.age = age;
	}
	@Override
	public int compareTo(Student o) {
	if (this.roll_no > o.roll_no) {
	return 1;
	} else if (this.roll_no == o.roll_no) {
	return 0;
	} else {
	return -1;
	}
	}
	@Override
	public String toString() {
	return "RollNo-" + this.roll_no + ", Name-" + this.name + ", Age-" + this.age;
	}
	public static void main(String[] args) {
	TreeSet<Student> s = new TreeSet<>();
	Student student1 = new Student(3, "Sriteja", 22);
	Student student2 = new Student(5, "Anjali", 21);
	Student student3 = new Student(1, "Swamy", 23);
	Student student4 = new Student(4, "Amit", 25);
	Student student5 = new Student(2, "Swetha", 20);
	s.add(student1);
	s.add(student2);
    s.add(student3);
	s.add(student4);
	s.add(student5);
	for (Student st : s) {
	System.out.println(st);
	}
	}
	}

