package bo.umss.app.inventorySB;

import java.time.LocalDate;

import bo.umss.app.inventorySB.business.codeProduct.model.CodeProduct;
import bo.umss.app.inventorySB.business.codeProduct.model.NotProvidedProvider;
import bo.umss.app.inventorySB.business.coin.model.Coin;
import bo.umss.app.inventorySB.business.line.model.Line;
import bo.umss.app.inventorySB.business.measurement.model.Measurement;
import bo.umss.app.inventorySB.business.price.model.Price;
import bo.umss.app.inventorySB.business.product.model.Product;
import bo.umss.app.inventorySB.business.stock.model.Stock;

public class TestObjectBucket {

	public static final String JUAN_PEREZ_NAME = "Juan Perez";
	public static final String JUAN_PEREZ_NIT = "123456";
	public static final String JUAN_PEREZ_CELLPHONE = "88888888";
	public static final String PLATE_PURCHEASE_DESCRIPTION = "purchase porcelain plates";
	public static final String CUP_PURCHASE_DESCRIPTION = "purchase porcelain cupes";
	public static final String BOWL7_DESCRIPTION = "bowl7 a round plate of porcelain";
	public static final String PLATE_CODE = "PLA-1";
	public static final String PLATE_NAME = "bowl8 porcelain";
	public static final String CUP_CODE = "CUP-1";
	public static final String CUP_NAME = "cup porcelain isaylin";
	public static final String BOWL8_CODE = "PLA-2";
	public static final String BOWL8_DESCRIPTION = "bowl8 porcelain plate";
	public static final String CODE_PZA = "pza";
	public static final String CODE_DOC = "doc";
	public static final String CODE_USA = "USD";
	public static final String CODE_BS = "BS";
	public static final String POT_CODE = "POT-1";
	public static final String POT_NAME = "Set of pot";
	public static final String INVOICE_NUMBER = "654987";

	public Product createPlate() {
		CodeProduct notProvidedProvider = createNotProvidedProviderPlate();
		Coin coin = Coin.at(CODE_BS);
		Price priceCost = Price.at(5.0, coin);
		Price priceSale = Price.at(10.0, coin);
		Measurement measurement = createMeasurementPiece();
		Stock stock = Stock.at(10, measurement);

		return Product.at(notProvidedProvider, stock, priceCost, priceSale);
	}

	public Measurement createMeasurementPiece() {
		return Measurement.at(CODE_PZA);
	}

	public Product createCup() {
		NotProvidedProvider notProvidedProvider = createNotProvidedProviderCup();
		Coin coin = Coin.at(CODE_BS);
		Price priceCost = Price.at(8.0, coin);
		Price priceSale = Price.at(16.0, coin);
		Measurement measurement = createMeasurementPiece();
		Stock stock = Stock.at(10, measurement);

		return Product.at(notProvidedProvider, stock, priceCost, priceSale);
	}

	public LocalDate createDate() {
		return LocalDate.of(2024, 05, 15);
	}

	public Product createPot() {
		Line line = Line.at(POT_NAME);
		NotProvidedProvider notProvidedProvider = NotProvidedProvider.at(POT_CODE, "OLLA TRILLIUM INOX 3 PCS", line);
		Coin coin = Coin.at(CODE_USA);
		Price priceCost = Price.at(205.0, coin);
		Price priceSale = Price.at(246.0, coin);
		Measurement measurement = createMeasurementPiece();
		Stock stock = Stock.at(80, measurement);

		return Product.at(notProvidedProvider, stock, priceCost, priceSale);
	}

	public NotProvidedProvider createNotProvidedProviderPlate() {
		Line line = createLinePlate();
		return NotProvidedProvider.at(PLATE_CODE, "PLATO ZETA BOWL 8 PORCELANA CUADRADO", line);
	}

	public Line createLinePlate() {
		return Line.at(PLATE_NAME);
	}

	public NotProvidedProvider createNotProvidedProviderCup() {
		Line line = createLineCup();
		return NotProvidedProvider.at(CUP_CODE, "TAZA ISAYLIN PORCELANA RECTO", line);
	}

	public Line createLineCup() {
		Line line = Line.at(CUP_NAME);
		return line;
	}
}
