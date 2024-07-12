package bo.umss.app.inventorySB.business.line.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.umss.app.inventorySB.business.line.dto.LineDto;
import bo.umss.app.inventorySB.business.line.model.Line;
import bo.umss.app.inventorySB.business.line.service.LineService;
import bo.umss.app.inventorySB.mapper.IMapper;

@Service
public class LineMapper implements IMapper<Line, LineDto> {

	@Autowired
	private LineService service;

	@Override
	public LineDto toDto(Line entity) {
		return LineDto.at(entity.getName());
	}

	@Override
	public Line toEntity(LineDto dto, boolean isNew) {
		if (isNew) {
			return Line.at(dto.getName());
		} else {
			return service.findByName(dto.getName());
		}
	}
}
