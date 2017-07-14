package property_profile_for_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("222.222.222.222");
		info.setPortNum("8001");
		return info;
	}
}
