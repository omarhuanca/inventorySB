package bo.umss.app.inventorySB.business.measurement.service;

import bo.umss.app.inventorySB.business.measurement.model.Measurement;
import bo.umss.app.inventorySB.service.CrudService;

public interface MeasurementService extends CrudService<Measurement, Long> {

	Measurement findByCode(String potentialCode);

	boolean existsByCode(String potentialCode);
}
