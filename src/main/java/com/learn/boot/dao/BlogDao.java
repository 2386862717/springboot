package com.learn.boot.dao;

import com.learn.boot.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {

    /**
     *
     * @param userName
     * @return 当前用户所读的书的名称
     */
    public List<String> getBookName(@Param("userName") String userName);

    /**
     *
     * @return 所有书的名称和url地址
     */
    public List<Book> getAllBookName();

}
