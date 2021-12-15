package com.zkzkzhzj.lib.templatemethod

abstract class Teacher {

    fun startClass() {
        inside()
        attendance()
        teach()
        outside()
    }

    private fun inside(){
        println("선생님이 강의실로 들어옵니다.")
    }

    private fun attendance(){
        println("선생님이 출석을 부릅니다.")
    }

    private fun outside(){
        println("선생님이 강의실을 나갑니다.")
    }

    abstract fun teach()
}