package com.example.userManeger.userManeger.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var nome: String) {
}