package com.longbig.controller;

import com.google.common.collect.Maps;
import com.longbig.utils.OkHttpUtils;
import lombok.extern.slf4j.Slf4j;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yuyunlong
 * @date 2023/1/3 11:01 下午
 * @description
 */
@Slf4j
@RestController
public class JueJinController {

    /**
     * 掘金自动签到
     *
     * @return
     */
    @GetMapping("/juejin/sign")
    public String juejinSign() {
        log.info("掘金自动签到开始");
        Map<String, String> header = Maps.newHashMap();
        String url = "https://api.juejin.cn/growth_api/v1/check_in";
        String cookie = "uid_tt=替换掉;sid_tt=替换掉";
        RequestBody requestBody = new FormBody.Builder().build();
        String response = OkHttpUtils.post(url, cookie, requestBody, header);

        return response;
    }
}
