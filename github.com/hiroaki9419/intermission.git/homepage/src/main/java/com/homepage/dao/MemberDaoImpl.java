package com.homepage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.Members;

@Repository
public class MemberDaoImpl implements MemberDao{
	private final String ns = "com.homepage.dto.Members.";
	
	@Autowired
	SqlSessionTemplate session;

	@Override
	public Members join(Members members) {
		String statement = ns+"join";
		int result = session.insert(statement, members);
		if(result==1) {
			return members;
		}else {
			return null;
		}
	}
	

}
