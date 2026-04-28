package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> getEmpList() {
		List<EmpDTO> result = empDAO.selectAllEmp();
		
		return result;
	}

	@Override
	public EmpDTO getEmp() {
		EmpDTO empDTO = empDAO.selectOneEmp();
		return empDTO;
	}

	@Override
	public Map getEmpMap() {
		Map map = empDAO.selectOneEmpMap();
		return map;
	}

}
