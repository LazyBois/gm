package com.pwrd.gm.gmc.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * 游戏调用
 * @author wangtong
 */
@RestController
@RequestMapping("/game")
public class GameController {

    @PostMapping("queryPlayer")
    public String queryPlayer(String name) {
        System.out.println(name);
        JSONObject result = new JSONObject();
        result.put("name", name);
        result.put("age", 100);
        return result.toJSONString();
    }
}
