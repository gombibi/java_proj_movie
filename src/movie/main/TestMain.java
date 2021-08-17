package movie.main;

public class TestMain {

	public static void main(String[] args) {
		
		MainMenu main = new MainMenu();
		main.run();
		
	}
//		AdminDataSource source = new AdminDataSource();
//
//		for (int i = 0; i < 20; i++) {
//			source.addAdminAccount("test" + i, "1234");
//		}
//
//		source.addAdminAccount("test2", "1234");
//		source.addAdminAccount("test", "1234");
//		source.removeAdminAccount("test");
//
//		System.out.println(source.login("test", "1234"));
//		System.out.println(source.login("test2", "1234"));

//		Student stu = new Student();
//		stu.name = "보배";
//		stu.grade = 23;
//		
//		Student stu2 = new Student();
//		stu2.name = "보배";
//		stu2.grade = 2;
//		
//		StudentEntity entity = new StudentEntity();
//		entity.list = new ArrayList();
//		entity.list.add(stu);
//		entity.list.add(stu2);
//		entity.count = entity.list.size();
//		
//		for (Student _stu : entity.list) {
//			_stu.count = entity.count;
//		}
//		
//		
//		IOUtils.fileWriter(entity, "student.txt");
//		
//		StudentEntity readEntity = IOUtils.fileReader(new TypeReference<StudentEntity>() {}, "student.txt");
//		
//		System.out.println(readEntity.count);
//
//	}

}
