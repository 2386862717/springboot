package com.learn.boot.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CrudDao {
    //删除用户
    public void delete(@Param("userName")String userName);

    //添加用户
    public void add(@Param("userName")String userName,@Param("passWord")String passWord,@Param("power") String power);

    //修改用户
    public void update(@Param("userName")String userName,@Param("passWord")String passWord,@Param("permission")String permission);
}
