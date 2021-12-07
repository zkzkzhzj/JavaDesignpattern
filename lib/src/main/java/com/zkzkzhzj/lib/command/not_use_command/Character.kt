package com.zkzkzhzj.lib.command.not_use_command

class Character(private val attack: Attack, private val defence: Defence) {
    enum class Mode{
        ATTACK, DEFENCE
    }

    fun execute(mode: Mode){
        when(mode){
            Mode.ATTACK -> {
                attack.execute()
            }

            Mode.DEFENCE -> {
                defence.execute()
            }
        }
    }

}