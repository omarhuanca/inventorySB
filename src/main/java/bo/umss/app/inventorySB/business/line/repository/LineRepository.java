package bo.umss.app.inventorySB.business.line.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bo.umss.app.inventorySB.business.line.model.Line;

@Repository
public interface LineRepository extends JpaRepository<Line, Long> {

	Line findByName(String potentialName);

	boolean existsByName(String potentialName);
}
