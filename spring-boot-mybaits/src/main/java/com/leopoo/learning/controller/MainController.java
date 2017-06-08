package com.leopoo.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Controller
 *
 * @author zbb
 * @create 2017-06-08 15:32
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @RequestMapping("")
    public Object index() {
        return "{'index':123}";
    }

    @RequestMapping("/abc")
    public Object ABC() {
        return "{'index':123}";
    }

}
