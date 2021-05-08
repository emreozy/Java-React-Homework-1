
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(01, "JavaGiris", "Engin Demirog", "-", "-");
		Course course2 = new Course(02, "C# + Angular", "Engin DEmirog", "-", "-");
		Course course3 = new Course(03, "Programlamaya Giris için Temel Kurs"
				,"Engin Demirog", 
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Temel Kurulumlar,\n"
				+ "Programlama Mantýðýný Anlamak\n"
				+ "Deðiþkenler ve Veri Tiplerini Anlamak\n"
				+ "Temel Deðiþken Yapýsýný Anlamak\n"
				+ "Temel Kurallarý Öðrenelim");
		
		Course[] courses = {course1, course2, course3};
		
		System.out.println("Courses: ");
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.CategoryId = 01;
		category1.name = "(C# + ANGULAR)";
		
		Category category2 = new Category();
		category2.CategoryId = 2;
		category2.name = "(JAVA + REACT)";
		
		Category category3 = new Category();
		category3.CategoryId = 3;
		category3.name = "Temel";
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.register(course2);
		courseManager.register(course3);
			

	}

}
