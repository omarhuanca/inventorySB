package bo.umss.app.inventorySB.business.codeProduct.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import bo.umss.app.inventorySB.business.codeProduct.service.impl.NotProvidedProviderServiceImpl;

@Configuration
public class NotProvidedProviderServiceTestConfig {

	@Bean
	@Primary
	@Qualifier("notProvidedProviderService")
	NotProvidedProviderService getNotProvidedProvider() {
		return new NotProvidedProviderServiceImpl();
	}
}
