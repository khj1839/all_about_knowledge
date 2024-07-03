package kr.co.sist.aak.module.instructor.login.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.aak.domain.instructor.InstructorInfoDomain;
import kr.co.sist.aak.domain.instructor.vo.InstructorInfoVO;
import kr.co.sist.aak.util.MybatisDAO;

@Repository
public class LoginDAO {
	
	@Autowired(required = false)
	private SqlSession sqlSession;
	
	public InstructorInfoDomain selectInstrucId(InstructorInfoVO instVO) throws PersistenceException {
		InstructorInfoDomain instd=null;
		
		MybatisDAO mbDAO= MybatisDAO.getInstance();
		SqlSession ss=mbDAO.getMyBatisHandler(false);
		
		instd=ss.selectOne("kr.co.sist.aak.instructor.loginInstructor",instVO);
		mbDAO.closeHanlder(ss);
		
		return instd;
	}
	

}
