/**
 * 
 */
package section1;

import java.util.Comparator;

/**
 * @author Dan
 *
 */
public class StudentGradeComparator implements Comparator<Student>{
	
	public int compare(Student arg0, Student arg1) {
		int result = 0;
		if (arg0.getGrade() > arg1.getGrade()){
			result = 1;
		}
		else if (arg0.getGrade() < arg1.getGrade())
			result = -1;
		return result;
	}
}
