package com.java8.function;

import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.realtime.Employee;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}

public class StudentGradeFunction {
	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Distiction]";
			else if (marks > 60)
				grade = "B[First Class]";
			else if (marks > 50)
				grade = "C[Second Class]";
			else if (marks > 35)
				grade = "D[Third Class]";
			else
				grade = "E[Failed]";
			return grade;
		};
		Predicate<Student> p = e -> e.marks > 60;
		Student[] s = { new Student("ammer", 30), new Student("ashok", 45), new Student("vinod", 85),
				new Student("srinivas", 55), new Student("shankar", 65), new Student("ram", 95),
				new Student("prasad", 20) };
		for (Student s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1.name);
				System.out.println(s1.marks);
				System.out.println(f.apply(s1));
				System.out.println();
			}
		}
	}
}