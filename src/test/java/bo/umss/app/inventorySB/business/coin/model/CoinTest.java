package bo.umss.app.inventorySB.business.coin.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CoinTest {

	@Test
	public void verifyCodeCannotBeEmpty() {
		assertThrows(RuntimeException.class, () -> Coin.at(""), Coin.CODE_CAN_NOT_BE_EMPTY);
	}
}
