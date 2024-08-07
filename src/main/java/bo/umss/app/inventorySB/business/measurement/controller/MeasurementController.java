package bo.umss.app.inventorySB.business.measurement.controller;

import bo.umss.app.inventorySB.business.measurement.dto.MeasurementDto;
import bo.umss.app.inventorySB.business.measurement.mapper.MeasurementMapper;
import bo.umss.app.inventorySB.business.measurement.model.Measurement;
import bo.umss.app.inventorySB.business.measurement.service.MeasurementService;
import bo.umss.app.inventorySB.controller.CrudController;
import bo.umss.app.inventorySB.exception.BadParamsException;
import bo.umss.app.inventorySB.exception.CrudException;
import bo.umss.app.inventorySB.exception.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/measurements")
public class MeasurementController implements CrudController<MeasurementDto> {

	@Autowired
	private MeasurementService service;

	@Autowired
	private MeasurementMapper mapper;

	@PostMapping
	@Override
	public MeasurementDto create(@RequestBody @Valid MeasurementDto dto) {
		try {
			return mapper.toDto(service.create(mapper.toEntity(dto, true)));
		} catch (BadParamsException e) {
			throw new BadParamsException();
		}
	}

	@Override
	public void update(MeasurementDto dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(String code) {
		// TODO Auto-generated method stub
	}

	@GetMapping(value = "/{code}")
	@Override
	public MeasurementDto read(@PathVariable("code") String code) {
		try {
			return mapper.toDto(service.findByCode(code));
		} catch (NullPointerException e) {
			throw new BadParamsException();
		} catch (CrudException e) {
			throw new CrudException();
		} catch (EntityNotFoundException e) {
			throw new EntityNotFoundException();
		}
	}

	@GetMapping
	@Override
	public List<MeasurementDto> findAll() {
		try {
			List<MeasurementDto> measurementList = new ArrayList<>();
			for (Measurement object : service.findAll()) {
				measurementList.add(mapper.toDto(object));
			}

			return measurementList;
		} catch (CrudException e) {
			throw new CrudException();
		}
	}
}
