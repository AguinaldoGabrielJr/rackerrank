package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class compareStudante implements Comparator<Student> {
	public int compare(Student p1, Student p2) {
		if (p1.getCgpa() > p2.getCgpa())
			return -1;
		else if (p1.getCgpa() < p2.getCgpa())
			return 1;
		else {
			if (!p1.getFname().equals(p2.getFname()))
				return p1.getFname().compareTo(p2.getFname());
			else {
				if (p2.getId() < p1.getId())
					return 1;
				else
					return -1;
			}
		}
	}

}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		compareStudante cs = new compareStudante();
		Collections.sort(studentList, cs);
		
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
