package com.pwrd.gm.gmc.func;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwrd.gm.gmm.dao.Func;
import com.pwrd.gm.gms.func.FuncService;
import com.pwrd.gm.gms.test.TestService;

/**
 * 首页
 * @author wangtong
 */
@RestController
@RequestMapping("/func")
public class FuncController {

    private FuncService funcService;

    public FuncController(FuncService funcService) {
        this.funcService = funcService;
    }

    @PostMapping("useFunc")
    public List<Func> useFunc() {
        return funcService.queryMenu();
    }
}
