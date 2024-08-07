package bo.umss.app.inventorySB.business.product.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import bo.umss.app.inventorySB.TestObjectBucket;
import bo.umss.app.inventorySB.business.codeProduct.model.CodeProduct;
import bo.umss.app.inventorySB.business.product.model.Product;
import bo.umss.app.inventorySB.business.product.repository.ProductRepository;
import bo.umss.app.inventorySB.exception.EntityNotFoundException;
import bo.umss.app.inventorySB.exception.NullFieldException;

public class ProductServiceTest {

	/*
	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	@MockBean(name = "productRepositoryMocked")
	@Qualifier("productRepository")
	private ProductRepository productRepository;

	private TestObjectBucket testObjectBucket = new TestObjectBucket();

	@Test
	public void verifyListIsEmpty() {
		List<Product> productList = productService.findAll();
		Mockito.when(productRepository.findAll()).thenReturn(productList);

		assertEquals(0, productList.size());
	}

	@Test
	public void verifyListHasElementAfterWasAdd() {
		List<Product> productList = productService.findAll();
		Product plate = testObjectBucket.createPlate();
		productList.add(plate);
		Mockito.when(productRepository.findAll()).thenReturn(productList);

		assertEquals(1, productList.size());
	}

	@Test
	public void verifyCanNotBeNullCodeProduct() {
		assertThrows(NullFieldException.class, () -> productService.findByCodeProduct(null),
				CodeProduct.CODE_CAN_NOT_BE_NULL);
	}

	@Test
	public void verifyDoesntExistCodeProduct() {
		CodeProduct codeProductPlate = testObjectBucket.createNotProvidedProviderPlate();

		assertThrows(EntityNotFoundException.class, () -> productService.findByCodeProduct(codeProductPlate));
	}

	@Test
	public void verifyAlreadyCodeProduct() {
		CodeProduct codeProductPlate = testObjectBucket.createNotProvidedProviderPlate();
		Product productPlate = testObjectBucket.createPlate();
		Mockito.when(productRepository.findByCodeProduct(codeProductPlate)).thenReturn(productPlate);
		Product productRecovered = productService.findByCodeProduct(codeProductPlate);

		assertTrue(productRecovered.equals(productPlate));
	}

	@Test
	public void verifyNotCompareCodeProduct() {
		CodeProduct codeProductPlate = testObjectBucket.createNotProvidedProviderPlate();
		Product productPlate = testObjectBucket.createPlate();
		Mockito.when(productRepository.findByCodeProduct(codeProductPlate)).thenReturn(productPlate);
		Product productRecovered = productService.findByCodeProduct(codeProductPlate);
		Product productCup = testObjectBucket.createCup();

		assertFalse(productRecovered.equals(productCup));
	}

	@Test
	public void test20() {
		assertThrows(NullFieldException.class, () -> productService.existsByCodeProduct(null), Product.CODE_CAN_NOT_BE_NULL);
	}
	*/
}
