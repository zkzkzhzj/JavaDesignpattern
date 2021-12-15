package com.zkzkzhzj.lib

import com.zkzkzhzj.lib.strategy.*
import com.zkzkzhzj.lib.templatemethod.English
import com.zkzkzhzj.lib.templatemethod.Korean
import com.zkzkzhzj.lib.templatemethod.Math
import kotlin.random.Random


fun main(){
    val english = English()
    val korean = Korean()
    val math = Math()

    english.startClass()
    println()
    korean.startClass()
    println()
    math.startClass()
}