package com.example.userManeger.userManeger.repository

import com.example.userManeger.userManeger.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
}