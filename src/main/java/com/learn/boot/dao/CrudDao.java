package com.learn.boot.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CrudDao {
    /**
     *
     * @param userName
     * 根据用户名删除用户
     */
    public void delete(@Param("userName")String userName);

    /**
     *
     * @param userName
     * @param passWord
     * @param power
     * 增加用户
     */
    public void add(@Param("userName")String userName,@Param("passWord")String passWord,@Param("power") String power);

    /**
     *
     * @param userName
     * @param passWord
     * @param permission
     * 修改用户信息
     */
    public void update(@Param("userName")String userName,@Param("passWord")String passWord,@Param("permission")String permission);
}
