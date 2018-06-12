package com.homepage.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homepage.dao.MemberDao;
import com.homepage.dto.Members;
@Service
public class MemberServiceImpl implements MemberService{
	private static Logger mylog = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	MemberDao mDao;
	
	@Override
	@Transactional
	public Members join(Members member) {
		Members members = null;
		try {
			members = mDao.save(member);
		}catch(Exception e) {
			mylog.error("회원 가입 실패: ", e);
		}
		mylog.trace("축하합니다. 회원 가입 성공!");
		return members;
	}
}
