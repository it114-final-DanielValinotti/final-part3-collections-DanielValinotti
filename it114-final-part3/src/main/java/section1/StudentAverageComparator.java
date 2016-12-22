/**
 * 
 */
package section1;

import java.util.Comparator;

/**
 * @author Dan
 *
 */
public class StudentAverageComparator implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		int result = 0;
		if (o1.getAverage() > o2.getAverage()){
			result = 1;
		}
		else if (o1.getAverage() < o2.getAverage())
			result = -1;
		return result;
	}
	
}
