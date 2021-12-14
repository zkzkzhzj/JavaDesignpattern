package com.zkzkzhzj.lib

import com.zkzkzhzj.lib.strategy.*
import kotlin.random.Random


fun main(){
    val bossType = listOf(Dungeon.MELEE, Dungeon.RANGE, Dungeon.MIX)
    val firstUser = FirstUser("user1")
    val secondUser = SecondUser("user2")

    when(bossType[Random.nextInt(bossType.size)]){
        Dungeon.MELEE -> {
            firstUser.setNormalSkill(NormalMeleeSkill())
            firstUser.setHighSkill(HighMeleeSkill())
            secondUser.setNormalSkill(NormalMeleeSkill())
            secondUser.setHighSkill(HighMeleeSkill())
        }

        Dungeon.RANGE -> {
            firstUser.setNormalSkill(NormalRangeSkill())
            firstUser.setHighSkill(HighRangeSkill())
            secondUser.setNormalSkill(NormalRangeSkill())
            secondUser.setHighSkill(HighRangeSkill())
        }

        else -> {
            firstUser.setNormalSkill(NormalMeleeSkill())
            firstUser.setHighSkill(HighRangeSkill())
            secondUser.setNormalSkill(NormalRangeSkill())
            secondUser.setHighSkill(HighMeleeSkill())
        }
    }

    firstUser.normalSkill()
    firstUser.highSkill()
    secondUser.normalSkill()
    secondUser.highSkill()
}