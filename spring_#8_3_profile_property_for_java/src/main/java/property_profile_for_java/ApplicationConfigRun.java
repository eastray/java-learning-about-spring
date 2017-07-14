package property_profile_for_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		
		info.setIpNum("333.333.333.333");
		info.setPortNum("8002");
		
		return info;
	}
	
}
