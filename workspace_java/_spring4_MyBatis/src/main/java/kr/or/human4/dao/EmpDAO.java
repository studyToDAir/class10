package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {
	
	List<EmpDTO> selectAllEmp();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
}
