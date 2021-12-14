package com.zkzkzhzj.lib.strategy

class HighRangeSkill: HighSkill {
    override fun highSkill(name: String) {
        println("$name 의 고급 스킬은 원거리")
    }
}