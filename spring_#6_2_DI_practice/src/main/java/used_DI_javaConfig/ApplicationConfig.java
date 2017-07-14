package used_DI_javaConfig;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1(){
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("운동");
		hobbys.add("술");

		Student student = new Student("김동휘");
		student.setAge(28);
		student.setHobbys(hobbys);
		
		return student;	
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("공부");
		hobbys.add("알콜");

		Student student = new Student("홍길동");
		student.setAge(27);
		student.setHobbys(hobbys);
		
		return student;
	}
	
}
