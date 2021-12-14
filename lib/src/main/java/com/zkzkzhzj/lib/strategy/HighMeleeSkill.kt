package com.zkzkzhzj.lib.strategy

class HighMeleeSkill: HighSkill {
    override fun highSkill(name: String) {
        println("$name 의 고급 스킬은 근거리")
    }
}