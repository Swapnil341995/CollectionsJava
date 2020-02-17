package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

class student {
	int RollNo;
	String StudentName;

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

}

public class Arrlist {

	public static void main(String[] args) {

		student st1 = new student();
		st1.RollNo = 3;
		st1.StudentName = "Aditya";

		student st2 = new student();
		st2.RollNo = 1;
		st2.StudentName = "Nikhil";

		student st3 = new student();
		st3.RollNo = 2;
		st3.StudentName = "Swapnil";

		ArrayList<student> al1 = new ArrayList<>();
		al1.add(st1);
		al1.add(st2);
		al1.add(st3);

		System.out.println();

		student st4 = new student();
		st4.RollNo = 4;
		st4.StudentName = "Ratna";

		System.out.println(al1.contains(st4));
		System.out.println(al1.size());
		System.out.println(al1.subList(0, 2).toString());
		Iterator<student> iter = al1.iterator();
		while (iter.hasNext()) {
			student st = (student) iter.next();
			System.out.println(st.getRollNo() + " " + st.getStudentName());
		}

		Collections.reverse(al1);
		System.out.println(al1);
		Iterator<student> iter1 = al1.iterator();
		while (iter1.hasNext()) {
			student st = (student) iter1.next();
			System.out.println(st.getRollNo() + " " + st.getStudentName());
		}

		List<String> li = new ArrayList<>();
		li.add("a1");
		li.add("a2");
		li.add("a3");
		li.add("a4");
		li.add("a5");
		li.add("a6");
		li.add("a1");
		li.remove(("a1"));

		System.out.println(li);
		
		System.out.println("sdfghjk");
		
		List<Integer> li1 = new ArrayList();
		li1.add(10);
		li1.add(2);
		li1.add(35);
		li1.add(35);
		li1.add(14);
		li1.add(14);
		li1.add(15);
		li1.add(15);
		li1.add(69);
		li1.add(87);
		li1.add(18);
		
		System.out.println(li1);
		
		Iterator<Integer> it = li1.iterator();
		while(it.hasNext()) {
			//it.remove();
			System.out.println(it.next());
		}
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(li1);
		System.out.println(lhs);
		li1.clear();
		li1.addAll(lhs);
		System.out.println(li1);
		

	}

}
