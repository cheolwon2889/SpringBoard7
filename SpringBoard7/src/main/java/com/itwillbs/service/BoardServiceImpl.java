package com.itwillbs.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;
@Service
public class BoardServiceImpl implements BoardService{
    
    
    @Inject
    private BoardDAO dao;


   private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
    @Override
    public void regist(BoardVO vo) throws Exception {
        logger.debug("regist(BoardVO vo ) 호출");
        logger.debug("DAO 객체의 해당 메서드 호출");

        dao.createBoard(vo);
        
    }
}
