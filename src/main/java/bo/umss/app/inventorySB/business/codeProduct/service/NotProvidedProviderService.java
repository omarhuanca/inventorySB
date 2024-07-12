package bo.umss.app.inventorySB.business.codeProduct.service;

import bo.umss.app.inventorySB.business.codeProduct.model.NotProvidedProvider;
import bo.umss.app.inventorySB.service.CrudService;

public interface NotProvidedProviderService extends CrudService<NotProvidedProvider, Long> {

	NotProvidedProvider findByCode(String potentialCode);

	boolean existsByCode(String potentialCode);
}
