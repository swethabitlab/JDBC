package com.swetha;
import java.util.*;
public class Employe implements Comparator<Employe> {
	private int eid;
	private String name;
	private double salary;
	public Employe(int eid, String name, double salary) {
	this.eid=eid;
	this.name = name;
	this.salary =salary;
	}
	@Override
	public int compare(Employe o1,Employe o2) {
	if (o1.eid > o2.eid) {
	return 1;
	} else if (o1.eid == o2.eid) {
	return 0;
	} else {
	return -1;
	}
	}
	@Override
	public String toString() {
	return "Employee id:" + this.eid + ", Name-" + this.name + ", Salary-" + this.salary;
	}
	public static void main(String[] args) {
	TreeSet<Employe> em = new TreeSet<>();
	Employe em1 = new Employe(3, "Raj", 20000);
	Employe em2 = new Employe(5, "Shyam", 18000);
	Employe em3 = new Employe(1, "Ram", 19000);
	Employe em4 = new Employe(4, "Sunil", 25000);
	Employe em5 = new Employe(2, "Ajay", 26000);
	em.add(em1);
	em.add(em2);
	em.add(em3);
	em.add(em4);
	em.add(em5);
	for (Employe k : em) {
	System.out.println(k);
	}
	}
	}

