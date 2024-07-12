package bo.umss.app.inventorySB.business.codeProduct.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bo.umss.app.inventorySB.TestObjectBucket;
import bo.umss.app.inventorySB.business.line.model.Line;
import bo.umss.app.inventorySB.business.provider.model.Provider;

public class ProvidedProviderTest {

	private Line line;
	private Provider provider;

	@BeforeEach
	public void setUp() {
		line = Line.at(TestObjectBucket.PLATE_NAME);
		provider = Provider.at(TestObjectBucket.JUAN_PEREZ_NAME, TestObjectBucket.JUAN_PEREZ_CELLPHONE);
	}

	@Test
	public void canNotCreateBlankCode() {
		assertThrows(RuntimeException.class,
				() -> ProvidedProvider.at("", TestObjectBucket.BOWL8_DESCRIPTION, line, provider),
				CodeProduct.CODE_CAN_NOT_BE_BLANK);
	}

	@Test
	public void canNotCreateBlankDescription() {
		assertThrows(RuntimeException.class, () -> ProvidedProvider.at(TestObjectBucket.BOWL8_CODE, "", line, provider),
				CodeProduct.DESCRIPTION_CAN_NOT_BE_BLANK);
	}

	@Test
	public void canNotCreateNullLine() {
		assertThrows(RuntimeException.class, () -> ProvidedProvider.at(TestObjectBucket.BOWL8_CODE,
				TestObjectBucket.BOWL8_DESCRIPTION, null, provider), CodeProduct.DESCRIPTION_CAN_NOT_BE_BLANK);
	}

	@Test
	public void canNotCreateNullProvider() {
		assertThrows(RuntimeException.class,
				() -> ProvidedProvider.at(TestObjectBucket.BOWL8_CODE, TestObjectBucket.BOWL8_DESCRIPTION, line, null));
	}
}
