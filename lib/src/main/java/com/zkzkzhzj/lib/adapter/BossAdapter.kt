package com.zkzkzhzj.lib.adapter

class BossAdapter(hp: Double, attack: Double) : BossInterface {
    private val stat = Stat(hp, attack)

    override fun easyBoss() {
        convertBoss(stat, 1.2)
    }

    override fun normalBoss() {
        stat.toString()
    }

    override fun hardBoss() {
        convertBoss(stat, 0.8)
    }

    private fun convertBoss(stat: Stat, num: Double){
        Stat(stat.hp/num, stat.attack/num).toString()
    }
}