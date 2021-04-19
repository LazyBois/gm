package com.pwrd.gm.gmc.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 首页
 * @author wangtong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("login")
    public String login(String userName,String password) {
        JSONObject result = new JSONObject();
        result.put("status", "ok");
        result.put("type", "account");
        result.put("currentAuthority", "admin");

        return result.toJSONString();
    }

    @GetMapping("currentUser")
    public String currentUser() {
        JSONObject result = new JSONObject();
        result.put("name", "大帅逼");
        result.put("type", "account");
        result.put("currentAuthority", "admin");

        return result.toJSONString();
    }

    @GetMapping("notices")
    public String notices() {
        JSONObject notification = new JSONObject();
        notification.put("id", "000000012");
        notification.put("avatar", "https://gw.alipayobjects.com/zos/rmsportal/ThXAXghbEsBCCSDihZxY.png");
        notification.put("datetime", "2017-08-09");
        notification.put("type", "notification");

        JSONObject message = new JSONObject();
        message.put("id", "000000006");
        message.put("avatar", "https://gw.alipayobjects.com/zos/rmsportal/fcHMVNCjPOsbUGdEduuv.png");
        message.put("title", "陈羊 评论了你");
        message.put("description", "请你吃饭");
        message.put("datetime", "2017-08-07");
        message.put("type", "message");
        message.put("clickClose", "true");

        JSONObject event = new JSONObject();
        event.put("id", "000000012");
        event.put("title", "gp 评论了你");
        event.put("description", "请你吃饭");
        event.put("extra", "进行中");
        event.put("status", "processing");
        event.put("type", "message");

        JSONArray result = new JSONArray();
        result.add(notification);
        result.add(message);
        result.add(event);

        return result.toJSONString();
    }
}
