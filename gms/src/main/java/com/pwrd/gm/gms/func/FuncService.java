package com.pwrd.gm.gms.func;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwrd.gm.gmm.FuncMapper;
import com.pwrd.gm.gmm.TestMapper;
import com.pwrd.gm.gmm.dao.Func;
import com.pwrd.gm.gmm.dao.Test;

/**
 *
 * @author wangtong
 */
@Service
public class FuncService {

    FuncMapper funcMapper;

    @Autowired
    public FuncService(FuncMapper funcMapper) {
        this.funcMapper = funcMapper;
    }

    public List<Func> queryAll() {
        return funcMapper.queryAll();
    }

    public List<Func> queryMenu() {
        return funcMapper.queryAllMenu();
    }
}
