package com.zhangtao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangtao on 2017/6/26.
 */
@Controller
@RequestMapping("/getid")
public class IdController {
    @RequestMapping("/")
    @ResponseBody
    public long getid() {
        return SnowflakeIdWorker.nextId();
    }
}
