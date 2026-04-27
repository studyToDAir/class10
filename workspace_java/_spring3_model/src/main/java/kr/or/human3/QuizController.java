package kr.or.human3;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	
	@GetMapping(value="/cafe.do")
	public String cafe() {
		return "coffee";
	}
	@RequestMapping(value="/cafe", method=RequestMethod.POST)
	public ModelAndView order(
			HttpServletRequest req, 
			HttpServletResponse resp,
			Model model,
//			@RequestParam(value="menu", required=true)
			String menu, 
			int count
	) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		System.out.println("quiz/cafe 실행");
		
		System.out.println("menu: "+ menu);
		System.out.println("count: "+ count);

		int price = -1;
		if("americano".equals(menu)) {
			price = 2000;
		} else if("cider".equals(menu)) {
			price = 3000;
		} else if("latte".equals(menu)) {
			price = 3001;
		} else if("peppermint".equals(menu)) {
			price = 6000;
		}
		
		req.setAttribute("menu", menu);
		model.addAttribute("price", price);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("coffee");
		mav.addObject("count", count);
		
		return mav;
	}
	@RequestMapping(value="/cafe2", method=RequestMethod.POST)
	@ResponseBody
	public Map order2(HttpServletRequest req, HttpServletResponse resp, Model model
			,@RequestBody Map map
			) {
		
		System.out.println("quiz/cafe2 실행");
		
		System.out.println("map: "+ map);
		String menu = (String)map.get("menu");
		int count = Integer.parseInt((String)map.get("count"));
		
		int price = -1;
		if("americano".equals(menu)) {
			price = 2000;
		} else if("cider".equals(menu)) {
			price = 3000;
		} else if("latte".equals(menu)) {
			price = 3001;
		} else if("peppermint".equals(menu)) {
			price = 6000;
		}
		
		////////////////////
		Map resultMap = new HashMap();
		resultMap.put("menu", menu);
		resultMap.put("count", count);
		resultMap.put("price", price);
		
		return resultMap;
	}

	@RequestMapping(value="/cafe3", method= {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String order3(HttpServletRequest req, HttpServletResponse resp, Model model
//			,@RequestParam Map map
			,
			@ModelAttribute
			QuizCafeDTO dto
			) {
		
		System.out.println("quiz/cafe3 실행");
		
//		System.out.println("map: "+ map);
		System.out.println("dto: "+ dto);
		
		
		return "cafe";
	}

	@RequestMapping(value="/cafe4", method= {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String order4(HttpServletRequest req, HttpServletResponse resp, Model model
//			,@RequestParam Map map
			,
			@RequestBody
			List<QuizCafeDTO> list
			) {
		
		System.out.println("quiz/cafe3 실행");
		
		System.out.println("list: "+ list);
		
		
		return "cafe";
	}

}
