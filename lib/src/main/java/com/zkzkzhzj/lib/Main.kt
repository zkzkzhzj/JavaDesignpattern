package com.zkzkzhzj.lib

import com.zkzkzhzj.lib.strategy.FirstUser
import com.zkzkzhzj.lib.strategy.HighRangeSkill
import com.zkzkzhzj.lib.strategy.NormalRangeSkill
import com.zkzkzhzj.lib.strategy.SecondUser


fun main(){
    val firstUser = FirstUser("user1")
    val secondUser = SecondUser("user2")

    firstUser.normalSkill()
    firstUser.highSkill()
    secondUser.normalSkill()
    secondUser.highSkill()

    println()

    firstUser.setNormalSkill(NormalRangeSkill())
    secondUser.setHighSkill(HighRangeSkill())

    firstUser.normalSkill()
    firstUser.highSkill()
    secondUser.normalSkill()
    secondUser.highSkill()
}