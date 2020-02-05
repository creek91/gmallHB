package com.atguigu.gmall.user;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallUserApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	void testServiceGetAllUser(){
		List<UmsMember> umsMemberList=userService.getAllUser();
		if (umsMemberList==null){
			System.out.println("no data!");
		}else {
			System.out.println(umsMemberList);
		}
	}
}
