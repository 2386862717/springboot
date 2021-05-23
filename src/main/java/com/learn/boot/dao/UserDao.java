package com.learn.boot.dao;

import com.learn.boot.entity.User;
import com.learn.boot.entity.Time;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;


@Mapper
@Repository
public interface UserDao {
    /**
     * @param userName
     * @param passWord
     * @return  用户的用户名 密码 权限
     * 验证密码是否正确
     */
    public User getUser(@Param("userName") String userName, @Param("passWord") String passWord);

    /**
     *
     * @return 所有用户信息
     */
    public List<User> getAllUser();

    /**
     *
     * @param userName
     * @param date
     * 更新用户登录时间
     */
    public void updateDate(@Param("userName") String userName, @Param("date") Timestamp date);

    /**
     *
     * @return 所有用户的上次登录时间
     */
    public List<Time> getAllinfo();

}
