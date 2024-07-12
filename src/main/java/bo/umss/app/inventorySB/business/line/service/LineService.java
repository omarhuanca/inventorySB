package bo.umss.app.inventorySB.business.line.service;

import bo.umss.app.inventorySB.business.line.model.Line;
import bo.umss.app.inventorySB.service.CrudService;

public interface LineService extends CrudService<Line, Long> {

	Line findByName(String potentialName);

	boolean existsByName(String potentialName);
}
