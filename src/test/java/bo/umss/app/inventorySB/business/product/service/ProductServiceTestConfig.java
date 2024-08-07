package bo.umss.app.inventorySB.business.product.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import bo.umss.app.inventorySB.business.product.service.impl.ProductServiceImpl;

public class ProductServiceTestConfig {

	/*
	@Bean
	@Primary
	@Qualifier("productService")
	ProductService getProductService() {
		return new ProductServiceImpl();
	}
	*/
}
