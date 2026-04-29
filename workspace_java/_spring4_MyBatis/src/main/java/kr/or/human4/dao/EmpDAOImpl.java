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

	@Override
	public EmpDTO selectEmpno(int empno) {
		EmpDTO empDTO = null;
		
		empDTO = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("selectEmpno: empDTO: "+ empDTO);
		
		return empDTO;
	}

	@Override
	public List selectEname(String ename) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectEname", ename);
		System.out.println("selectEmpno: empDTO: "+ list);
		
		return list;
	}
	
	@Override
	public List selectJob(String job) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectJob", job);
		System.out.println("selectJob: empDTO: "+ list);
		
		return list;
	}

	@Override
	public List selectJobEname(EmpDTO dto) {
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("mapper.emp.selectJobEname", dto);
		System.out.println("selectJobEname: empDTO: "+ list);
		
		return list;
	}
	@Override
	public int insertEmp2(EmpDTO dto) {
		int result = -1;
		result = sqlSession.insert("mapper.emp.insertEmp2", dto);
		System.out.println("insertEmp2: result: "+ result);
		
		return result;
	}
	
}












