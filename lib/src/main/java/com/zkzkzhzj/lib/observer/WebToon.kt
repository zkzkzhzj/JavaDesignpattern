package com.zkzkzhzj.lib.observer

class WebToon {
    private val user = arrayListOf<User>()
    private var story = 1

    fun addUser(user: User){
        this.user.add(user)
    }

    fun removeUser(user: User){
        this.user.remove(user)
    }

    fun update(){
        user.forEach { user ->
            user.update(story)
        }
        story++
    }
}