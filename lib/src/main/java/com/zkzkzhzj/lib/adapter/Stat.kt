package com.zkzkzhzj.lib.adapter

data class Stat(
    var hp: Double,
    var attack: Double
){
    override fun toString(): String {
        return println("보스의 HP : ${hp.toInt()}\n보스의 공격력 : ${attack.toInt()}").toString()
    }
}
