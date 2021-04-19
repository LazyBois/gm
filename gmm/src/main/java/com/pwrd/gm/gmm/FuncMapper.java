package com.pwrd.gm.gmm;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pwrd.gm.gmm.dao.Func;
import com.pwrd.gm.gmm.dao.Test;

/**
 *
 * @author wangtong
 */
@Mapper
public interface FuncMapper {
    @Select("select * from func")
    List<Func> queryAll();

    @Select("select path,name,component from func")
    List<Func> queryAllMenu();
}
