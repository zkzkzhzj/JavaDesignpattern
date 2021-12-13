package com.zkzkzhzj.lib.strategy

abstract class Character(private val name: String) {
    private var normalSkill: NormalSkill = NormalMeleeSkill()
    private var highSkill: HighSkill = HighMeleeSkill()

    fun normalSkill(){
        normalSkill.normalSkill(name)
    }

    fun highSkill(){
        highSkill.highSkill(name)
    }

    fun setNormalSkill(normalSkill: NormalSkill){
        this.normalSkill = normalSkill
    }

    fun setHighSkill(highSkill: HighSkill){
        this.highSkill = highSkill
    }
}