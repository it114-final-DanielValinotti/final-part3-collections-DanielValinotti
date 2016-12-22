/**
 * 
 */
package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dan
 *
 */
public class StudentCollectionTester {
	
	public static List<Student>	createStudents(){
		List<Student> l = new ArrayList<Student>();
		l.add(new Student("Alison", 19, 1, 4.0));
		l.add(new Student("Barbara", 18, 2, 3.5));
		l.add(new Student("Charlie", 17, 1, 3.8));
		l.add(new Student("Donald", 20, 3, 3.6));
		l.add(new Student("Edward", 21, 4, 2.8));
			
		return l;
	}
	
	public static void sortStudent(List<Student> l){
		System.out.println("BEFORE sorting: " + l);
		
		Collections.sort(l);
		
		System.out.println("AFTER sorting: " + l);
	}
	
	public static void sortStudentInReverseOfNaturalOrder(List<Student> l){
		System.out.println("BEFORE sorting: " + l);
		
		Collections.sort(l);
		Collections.reverse(l);
		
		System.out.println("AFTER sorting: " + l);
	}
	
	public static void sortStudentBasedOnGrade(List<Student> l){
		System.out.println("BEFORE sorting: " + l);		
		
		l.sort(new StudentGradeComparator());
		
		System.out.println("AFTER sorting: " + l);
	}
	
	public static void sortStudentBasedOnReverseAverage(List<Student> l){
		System.out.println("BEFORE sorting: " + l);
		
		l.sort(new StudentAverageComparator());
		Collections.reverse(l);
		
		System.out.println("AFTER sorting: " + l);
	}
	
	public static void shuffleStudents(List<Student> l){
		System.out.println("BEFORE shuffling: " + l);		
		
		Collections.shuffle(l);
		
		System.out.println("AFTER shuffling: " + l);
	}
	
	public static void reverseStudents(List<Student> l) {
		System.out.println("BEFORE reversing: " + l);		
		
		Collections.reverse(l);
		
		System.out.println("AFTER reversing: " + l);
	}
	
	public static void swap1stAnd2ndStudents(List<Student> l){
		System.out.println("BEFORE swapping: " + l);		
		
		Collections.swap(l, 0,1);
		
		System.out.println("AFTER swapping: " + l);
	}
	
	public static List<Student> copyStudents(List<Student> l){
		List<Student> l2 = l;
		return l2;
	}
	
	public static Student maxStudentInStudents(List<Student> l){
		System.out.println("BEFORE finding max: " + l);
		
		Student max = Collections.max(l);
		System.out.println(max);
		
		return max;
	}
	
	public static Integer binarySearchOrderedStudents(List<Student> l){
		System.out.println("BEFORE searching: " + l);
		List<Student> list = l;
		Integer index = (Integer)Collections.binarySearch(l, new Student("Barbara", 18,1,4.0));
		System.out.println("Index: " + index);
		return index;
	}
	
	public static void main(String[] args){
		List<Student> l1 = createStudents();
		sortStudent(l1);
		List<Student> l2 = createStudents();
		sortStudentInReverseOfNaturalOrder(l2);
		List<Student> l3 = createStudents();
		sortStudentBasedOnGrade(l3);
		List<Student> l4 = createStudents();
		sortStudentBasedOnReverseAverage(l4);
		List<Student> l5 = createStudents();
		shuffleStudents(l5);
		List<Student> l6 = createStudents();
		reverseStudents(l6);
		List<Student> l7 = createStudents();
		swap1stAnd2ndStudents(l7);
		List<Student> l8 = createStudents();
		List<Student> l9 = copyStudents(l8);
		System.out.println(l9);
		List<Student> l10 = createStudents();
		binarySearchOrderedStudents(l10);
	}
}
