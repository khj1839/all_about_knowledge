package kr.co.sist.aak.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDAO {
	private static MybatisDAO mDAO;
	private static SqlSessionFactory ssf;

	private MybatisDAO() {
		org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
	}// MybatisDAO

	public static MybatisDAO getInstance() {
		if (mDAO == null) {
			mDAO = new MybatisDAO();
		} // end if
		return mDAO;
	}// getInstance

	static {
		if (ssf == null) {
			Reader reader;
			try {
				reader = Resources.getResourceAsReader("kr/co/sist/aak/mappers/mybatis-config.xml");
				ssf = new SqlSessionFactoryBuilder().build(reader);
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// static �쁺�뿭

	public SqlSession getMyBatisHandler(boolean autoCommit) {
		return ssf.openSession(autoCommit);
	}// getMyBatisHandler

	public void closeHanlder(SqlSession ss) {
		if (ss != null) {
			ss.close();
		}
	}// closeHanlder
}// MybatisDAO
