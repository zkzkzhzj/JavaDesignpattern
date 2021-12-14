package com.zkzkzhzj.lib.strategy

abstract class Character(private val name: String) {
    private var normalSkill: NormalSkill? = null
    private var highSkill: HighSkill? = null

    fun normalSkill(){
        normalSkill?.normalSkill(name) ?: println("스킬 세팅이 되지 않았습니다")
    }

    fun highSkill(){
        highSkill?.highSkill(name) ?: println("스킬 세팅이 되지 않았습니다")
    }

    fun setNormalSkill(normalSkill: NormalSkill){
        this.normalSkill = normalSkill
    }

    fun setHighSkill(highSkill: HighSkill){
        this.highSkill = highSkill
    }
}