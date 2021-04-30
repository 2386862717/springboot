package com.learn.boot.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CrudDao {
    //删除
    public void delete(@Param("userName")String userName);

    //添加
    public void add(@Param("userName")String userName,@Param("passWord")String passWord);

    //修改
    public void update(@Param("userName")String userName,@Param("passWord")String passWord,@Param("permission")String permission);
}
