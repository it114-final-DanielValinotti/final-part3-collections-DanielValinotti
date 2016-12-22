/**
 * 
 */
package section1;

/**
 * @author Dan
 *
 */
public class Student implements Comparable<Student>{
	private String name;
	private Integer age;
	private Integer grade;
	private Double average;

	public Student (String n, Integer a, Integer g, Double avg){
		name = n;
		age = a;
		grade = g;
		average = avg;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getAge(){
		return age;
	}
	
	public Integer getGrade(){
		return grade;
	}
	
	public Double getAverage(){
		return average;
	}
	
	public int compareTo(Student arg0) {
		int result = 0;
		if (this.age == arg0.age)
			result = 1;
		return result;
	}
	
	public String toString(){
		return "{name:" + name +", age:" + age + ", grade:" + grade + ", average:" + average +"}";
	}

}
