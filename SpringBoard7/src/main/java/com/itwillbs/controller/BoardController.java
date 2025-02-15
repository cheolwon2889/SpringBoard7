package com.itwillbs.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.service.BoardService;

@Controller
@RequestMapping(value ="/board/*") // /board/~ 로 시작하는 모든 주소를 처리하는 컨트롤러
public class BoardController {

	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService bService;
	
	// 글쓰기 - 게시판에 작성될 내용을 입력받는 동작 - GET
	@RequestMapping(value = "/regist" ,method=RequestMethod.GET)
	public String registGET() {
		logger.debug("registGET() 실행 ");
		logger.debug(" /views/board/regist.jsp 페이지 매핑 ");
		
		return "/board/regist";
	}
	
	// 글쓰기 - 입력받은 정보를 처리하는 동작 - post
	@RequestMapping(value = "/regist" ,method=RequestMethod.POST)
	public String registPOST(BoardVO vo) throws Exception {
		logger.debug("registPOST() 실행 ");
		logger.debug(" /views/board/regist.jsp 페이지 매핑 ");
		
		// 한글처리 인코딩 => 생략(web.xml 필터)
		// 전달된 정보(파라메터)를 저장
		logger.debug("vo : "+ vo);

		// 서비스객체 -> DAO 객체 호출
		bService.regist(vo);
		// 페이지 이동(list)

		
		return "redirect:/board/listAll";
	}
	
	// 게시판 리스트 - GET
	@RequestMapping(value ="/listAll" , method = RequestMethod.GET)
	public void listAllGET() throws Exception{
		logger.debug(" listAllGET() 실행 ");
		
		// 서비스 -> DAO 메서드 호출 (출력할 정보가져오기)
		List<BoardVO> boardList = bService.listAll();
		logger.debug("boardList : "+ boardList);
		// Model 객체를 사용해서 정보를 저장
		// 연결된 DB 정보 가져오기.
		
	}
	
	
	
}
