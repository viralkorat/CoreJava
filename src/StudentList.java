
public class StudentList {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Viral", 45, 46,50);
		Student s2 = new Student(2, "Archana", 43,48,48);
		Student s3 = new Student(3, "Bhautik", 40, 43,45);
		Student s4 = new Student(4, "Urvi", 33,38,48);
		Student s5 = new Student(5, "Hiren", 35, 36,50);
	
		Student [] students = {s1,s2,s3,s4,s5};
		
		Student dummymarks = null;
		for (int i =0; i<students.length; i++) {
			for (int j = i+1; j<students.length; j++) {
				if (students[i].total < students[j].total) {
					dummymarks = students[i];
					students[i] = students[j];
					students[j] = dummymarks;
				}
			}
			
			System.out.println(dummymarks);
			
		} System.out.println("Assending order");
		System.out.println("");
		
	}
	

}
