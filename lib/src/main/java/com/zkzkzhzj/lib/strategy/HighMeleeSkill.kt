package com.zkzkzhzj.lib.strategy

class HighMeleeSkill: HighSkill {
    override fun highSkill(name: String) {
        println("$name 의 근거리 고급 스킬 발동")
    }
}