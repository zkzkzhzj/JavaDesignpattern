package com.zkzkzhzj.lib.memento

// 특정 시점의 stat 소유
class Memento(private val stat: Stat) {

    fun getStat(): Stat{
        return stat
    }
}