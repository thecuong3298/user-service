package com.ngs.users.controller;

import com.common.dto.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Quản lý user")
@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping
    public ResponseWrapper<String> getUserInfo() {
        return new ResponseWrapper<>("success");
    }
}
