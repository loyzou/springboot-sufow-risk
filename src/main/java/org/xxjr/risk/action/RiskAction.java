package org.xxjr.risk.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskAction {
    @RequestMapping("/")
    public String register() {

        // 1.校验ip的合法性

        // 2.校验手机号

        // 3.进行征信、社保、公积金、微粒贷、房产、车产等评估

        // 4.评分卡生成



        return "loy";
    }
}
