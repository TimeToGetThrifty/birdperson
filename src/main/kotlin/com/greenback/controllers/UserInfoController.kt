package com.greenback.controllers

import com.greenback.entities.UserInfo
import com.greenback.services.UserInfoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/greenback/api")
class UserInfoController(private val service: UserInfoService) {
    @PostMapping("/userInfo")
    fun createUser(@RequestBody userInfo: UserInfo): UserInfo {
        return service.createUser(userInfo)
    }
}