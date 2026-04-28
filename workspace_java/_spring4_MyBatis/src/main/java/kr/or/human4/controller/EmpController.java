package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping("/list")
	public String list() {
		System.out.println("/list 실행");
		
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("/list: list: "+ list);
		
		return "emp";
	}

	@RequestMapping("/one")
	public String one() {
		System.out.println("/one실행");
		
		EmpDTO empDTO = empService.getEmp();
		System.out.println("/one: empDTO: "+ empDTO);
		
		return "emp";
	}
	@RequestMapping("/oneMap")
	public String oneMap() {
		System.out.println("/oneMap실행");
		
		Map map = empService.getEmpMap();
		System.out.println("/oneMap: map: "+ map);
		
		return "emp";
	}
}
