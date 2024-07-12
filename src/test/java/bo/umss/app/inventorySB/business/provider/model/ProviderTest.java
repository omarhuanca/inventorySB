package bo.umss.app.inventorySB.business.provider.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import bo.umss.app.inventorySB.TestObjectBucket;

public class ProviderTest {

	@Test
	public void canNotCreateEmptyName() {
		assertThrows(RuntimeException.class, () -> Provider.at("", TestObjectBucket.JUAN_PEREZ_CELLPHONE),
				Provider.NAME_CAN_NOT_BE_BLANK);
	}

	@Test
	public void canNotCreateEmptyPhoneNumber() {
		assertThrows(RuntimeException.class, () -> Provider.at(TestObjectBucket.JUAN_PEREZ_NAME, ""),
				Provider.NAME_CAN_NOT_BE_BLANK);
	}
}
