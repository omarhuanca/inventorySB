package bo.umss.app.inventorySB.business.measurement.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import bo.umss.app.inventorySB.business.measurement.service.impl.MeasurementServiceImpl;

@Configuration
public class MeasurementServiceTestConfig {

	@Bean
	@Primary
	@Qualifier("measurementService")
	MeasurementService getMeasurementService() {
		return new MeasurementServiceImpl();
	}
}
