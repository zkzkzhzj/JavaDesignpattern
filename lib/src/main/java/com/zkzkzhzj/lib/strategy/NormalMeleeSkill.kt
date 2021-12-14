package com.zkzkzhzj.lib.strategy

class NormalMeleeSkill: NormalSkill {
    override fun normalSkill(name: String) {
        println("$name 의 일반 스킬은 근거리")
    }
}