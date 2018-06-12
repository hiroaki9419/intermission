package com.homepage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.homepage.dto.Members;

public interface MemberDao {
	Members join(Members members);
}
