package com.mayikt.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 余胜军
 * @ClassName MayiktService
 * @qq 644064779
 * @addres www.mayikt.com
 * @createTime 2021年05月11日 15:43:00
 */
@RestController
public class MayiktService {
    @GetMapping("/getMayikt")
    public String getMayikt(){
        return "王麻子 每特教育第九期即将要开始啦!!";
    }
}
