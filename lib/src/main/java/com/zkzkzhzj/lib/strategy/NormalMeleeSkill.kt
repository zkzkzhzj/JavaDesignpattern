package com.zkzkzhzj.lib.strategy

class NormalMeleeSkill: NormalSkill {
    override fun normalSkill(name: String) {
        println("$name 의 근거리 일반 스킬 발동")
    }
}