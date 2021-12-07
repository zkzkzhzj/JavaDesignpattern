package com.zkzkzhzj.lib.observer

class FirstUser : User {
    override fun update(episode: Int) {
        println("FirstUser 님 구독하신 웹툰의 $episode 화가 올라왔습니다.")
    }
}