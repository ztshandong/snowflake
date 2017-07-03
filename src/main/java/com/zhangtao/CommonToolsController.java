package com.zhangtao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangtao on 2017/6/26.
 */
@Controller
@RequestMapping("/commontools")
public class CommonToolsController {
    @RequestMapping("/getid/")
    @ResponseBody
    public long getid() {
        return SnowflakeIdWorker.nextId();
    }

    @RequestMapping("/sha512")
    @ResponseBody
    public String sha512(@RequestParam String text) {
        return Encrypt.SHA512(text);
    }

    @RequestMapping("/encodeHex")
    @ResponseBody
    public String encodeHex(@RequestParam String text) {
        return Hex.encodeHexStr(text);
    }

    @RequestMapping("/decodeHex")
    @ResponseBody
    public String decodeHex(@RequestParam String text) {
        return new String(Hex.decodeHex(text));
    }

    @RequestMapping("/encodeBase64")
    @ResponseBody
    public String encodeBase64(@RequestParam byte[] text) {
        return Base64.encode(text);
    }

    @RequestMapping("/decodeBase64")
    @ResponseBody
    public byte[] decodeBase64(@RequestParam String text) {
        return Base64.decode(text);
    }


}
