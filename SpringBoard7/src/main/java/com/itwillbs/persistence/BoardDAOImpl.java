package com.itwillbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

    // 디비연결정보를 처리하는 객체를 주입사용
    @Inject
    private SqlSession sqlSession;

    private static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);

    // Mapper namespace 정보 저장
	private static final String NAMESPACE = "com.itwillbs.mapper.BoardMapper";

    @Override
    public void createBoard(BoardVO vo) throws Exception {
        // TODO Auto-generated method stub
        logger.debug(" createBoard(BoardVO vo) 호출 ");
        logger.debug(" 디비연결 - SQL 호출 - 실행 ");

        sqlSession.insert(NAMESPACE+".insertBoard", vo);
        
    }
    
}
