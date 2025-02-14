package bo.umss.app.inventorySB.business.codeProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bo.umss.app.inventorySB.business.codeProduct.model.NotProvidedProvider;

@Repository
public interface NotProvidedProviderRepository extends JpaRepository<NotProvidedProvider, Long> {

	NotProvidedProvider findByCode(String code);

	boolean existsByCode(String code);
}
