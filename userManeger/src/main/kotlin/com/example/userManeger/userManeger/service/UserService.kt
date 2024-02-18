package com.example.userManeger.userManeger.service

import com.example.userManeger.userManeger.repository.UserRepository
import com.example.userManeger.userManeger.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService ( @Autowired
                    val userRepository: UserRepository
){

        fun AddUser( user: User){
            userRepository.save(user)
        }

    fun getUsers():List<User> {

        return userRepository.findAll() as List<User>
    }

    fun getUserById(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }


        fun updateUser(id: Long, user: User){
            val newUser =userRepository.findById(id)

            if (newUser!=null){
                val updtUser= newUser.get()
                updtUser.nome=user.nome
                userRepository.save(updtUser)
            }

        }
    fun deleteUser(id: Long){
        userRepository.deleteById(id)
    }

}