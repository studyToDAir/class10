package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {

	List<EmpDTO> getEmpList();
	EmpDTO getEmp();
	Map getEmpMap();
}
