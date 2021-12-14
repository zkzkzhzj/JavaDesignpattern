package com.zkzkzhzj.lib.strategy

class NormalRangeSkill: NormalSkill {
    override fun normalSkill(name: String) {
        println("$name 의 일반 스킬은 원거리")
    }
}