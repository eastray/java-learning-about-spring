package property_file_for_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);
		
		System.out.println("adminId: " + connection.getAdminId());
		System.out.println("adminPw: " + connection.getAdminPw());
		System.out.println("sub_adminId: " + connection.getSub_adminId());
		System.out.println("sub_adminPw: " + connection.getSub_adminPw());
		
		ctx.close();
	}

}
