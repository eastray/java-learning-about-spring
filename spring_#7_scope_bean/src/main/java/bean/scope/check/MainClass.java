package bean.scope.check;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setAge(20);
		student2.setName("김동휘");
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
	}

}
