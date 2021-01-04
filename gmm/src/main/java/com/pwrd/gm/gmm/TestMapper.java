package com.pwrd.gm.gmm;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pwrd.gm.gmm.dao.Test;

/**
 *
 * @author wangtong
 */
@Mapper
public interface TestMapper {

    @Insert("insert into test(string,stringch) value(#{string},#{stringch})")
    int insert(Test test);

    @Select("select * from test")
    List<Test> queryAll();

    @Update("update test set dateval=#{dateval}")
    int update(Test test);

    @Delete("delete from test where id=#{id}")
    int del(Test needDel);
}
