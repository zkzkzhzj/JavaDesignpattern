package com.zkzkzhzj.lib.observer

class SecondUser : User {
    override fun update(episode: Int) {
        println("SecondUser 님 구독하신 웹툰의 $episode 화가 올라왔습니다.")
    }
}