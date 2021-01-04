package com.pwrd.gm.gms.test;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwrd.gm.gmm.dao.Test;
import com.pwrd.gm.gmm.TestMapper;

/**
 *
 * @author wangtong
 */
@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    /**
     * 验证service调用
     * @return
     */
    public String callHelloWorld() {
        return "调用service成功";
    }

    public Test insert() {
        Test test = new Test();
        test.setString("this is a words");
        test.setStringch("这是一段字符串");
        test.setId(testMapper.insert(test));
        return test;
    }

    public List<Test> queryAll() {
        return testMapper.queryAll();
    }

    public String update(long timestamp) {
        Test test = new Test();
        test.setDateval(new Timestamp(timestamp));
        if (testMapper.update(test) > 0) {
            return "update success";
        } else {
            return "update falied";
        }
    }

    public String del() {
        List<Test> tests = queryAll();

        Test needDel = null;
        if (!tests.isEmpty()) {
            needDel = tests.get(tests.size() - 1);
        }

        if (needDel != null && testMapper.del(needDel) > 0) {
            return "del success";
        } else {
            return "del falied";
        }
    }
}
