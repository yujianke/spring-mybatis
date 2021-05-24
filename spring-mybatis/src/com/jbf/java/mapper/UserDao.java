package com.jbf.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jbf.java.pojo.User;
@Mapper
public interface UserDao{
    // ���� id ��ѯ�û���Ϣ
    public User findUserById(String username);
    
	@Select("SELECT * FROM user01 WHERE username = #{username}")
    public User findUserById2(String username);
}