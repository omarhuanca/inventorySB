package bo.umss.app.inventorySB.business.line.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import bo.umss.app.inventorySB.business.line.service.impl.LineServiceImpl;

@Configuration
public class LineServiceTestConfig {

	@Bean
	@Primary
	@Qualifier("lineService")
	LineService getLineService() {
		return new LineServiceImpl();
	}
}
