package spring1218.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//baen을 자동 생성해주는 어노테이션
@Repository
public class GoodDAO {
	//MyBatis 연동 객체를 주입 :XML 이용
	@Autowired
	private SqlSession sqlSession;
	
	//테이블의 전체 데이터 가져오는 메소드
	public List<GoodVO> getlist(){
		return sqlSession.selectList("good.goodlist");
	}
	
	//code를 가지고 1개의 데이터를 찾아오는 메소드
	public GoodVO getgood(int code) {
		return sqlSession.selectOne("good.getgood", code);
	}
}
