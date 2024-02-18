package com.example.userManeger.userManeger.controller

import com.example.userManeger.userManeger.entity.User
import com.example.userManeger.userManeger.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(@Autowired val userService: UserService) {

    @GetMapping()
    fun getUsers(): List<User> = userService.getUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") id:Long): User? = userService.getUserById(id)


    @PostMapping()
    fun postUser( @RequestBody user: User ){
        userService.AddUser(user)
    }

    @PutMapping("{id}")
    fun UpdateUser( @PathVariable("id") id: Long, @RequestBody user: User ){

        userService.updateUser(id,user)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable("id") id: Long){
        userService.deleteUser(id)
    }
}

