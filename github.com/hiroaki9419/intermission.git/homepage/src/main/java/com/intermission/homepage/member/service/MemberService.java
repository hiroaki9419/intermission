package com.intermission.homepage.member.service;

import javax.servlet.http.HttpServletResponse;

import com.intermission.homepage.member.db.MemberDTO;

public interface MemberService {
	
	public void check_id(String id, HttpServletResponse response) throws Exception;

	public void check_email(String email, HttpServletResponse response) throws Exception;

	public int join_member(MemberDTO member, HttpServletResponse response) throws Exception;

}
