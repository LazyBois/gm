package com.pwrd.gm.gmc.test;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pwrd.gm.gmm.dao.Test;
import com.pwrd.gm.gms.test.TestService;

/**
 * 这个测试类用来测试和学习各种功能
 * @author wangtong
 */
@Controller
@RequestMapping("test")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    @ResponseBody
    public String allFunc() {
        return allFuncs;
    }

    @ResponseBody
    @GetMapping("hello")
    public String hello() {
        return "Hello world!";
    }

    @ResponseBody
    @GetMapping("callservice")
    public String callservice() {
        return testService.callHelloWorld();
    }

    // 操作数据库
    @ResponseBody
    @GetMapping("add")
    public Test add() {
        return testService.insert();
    }

    @ResponseBody
    @GetMapping("del")
    public String del() {
        return testService.del();
    }

    @ResponseBody
    @GetMapping("update")
    public String update() {
        return testService.update(System.currentTimeMillis());
    }

    @ResponseBody
    @GetMapping("query")
    public List<Test> query() {
        return testService.queryAll();
    }

    @GetMapping("showview")
    public String showView() {
        return "test/test";
    }

    @GetMapping("showViewData")
    public ModelAndView showViewData() {
        ModelAndView result = new ModelAndView();
        result.setViewName("test/test");
        result.addObject("tests", testService.queryAll());
        return result;
    }

    @GetMapping("showException")
    public String showException() throws NullPointerException {
        throw new NullPointerException("NullPointerException");
    }

    // 通过注解读取所有测试接口
    private static String allFuncs = "";

    static {
        TestController testController = new TestController(null);

        for (Method method : testController.getClass().getDeclaredMethods()) {

            GetMapping getMapping = method.getAnnotation(GetMapping.class);
            if (getMapping != null) {
                for (String value : getMapping.value()) {
                    allFuncs = allFuncs + " <li><a href=test/" + value + ">" + value + "</a></li>";
                }
            }

            PostMapping posMapping = method.getAnnotation(PostMapping.class);
            if (posMapping != null) {
                for (String value : posMapping.value()) {
                    allFuncs = allFuncs + " <li><a href=test/" + value + ">" + value + "</a></li>";
                }
            }
        }

        allFuncs = "<ul> " + allFuncs + " </ul>";

//        System.out.println(allFuncs);
    }

//    public static void main(String[] args) {
//        TestController testController = new TestController(null);
//    }
}
