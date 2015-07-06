package com.hyd.test;

import com.hyd.northpj.entity.User;

public class ObjectTest {
	public static void test(User myUser)
	{
		User tempUser=new User();
		tempUser.setName("hello");
		myUser=tempUser;
		System.out.println(myUser.getName());
		myUser.setName("hellow");
		myUser.username="hhh";
	}
	public static void main(String[] args) {
		User myUser=new User();
		test(myUser);
		System.out.println(myUser.getUsername());
	}
}
