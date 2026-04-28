package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectAllEmp() {
		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("selectAllEmp: resultList: "+ resultList);
		
		return resultList;
	}
	
	public EmpDTO selectOneEmp() {
		kr.or.human4.dto.EmpDTO empDTO = null;
		
		empDTO = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("selectOneEmp: empDTO: "+ empDTO);
		
		return empDTO;
	}

	@Override
	public Map selectOneEmpMap() {
		Map map = null;
		
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		System.out.println("selectOneEmpMap: map: "+ map);
		
		return map;
	}

}
