package com.zkzkzhzj.lib.memento

import java.util.*

class StatManagement {
    // Memento 관리를 위한 Stack
    private val memento = Stack<Memento>()

    // Memento 를 입력받아 Stack 에 저장
    fun push(memento: Memento){
        this.memento.push(memento)
    }

    // Stack 에 저장된 가장 최근의 개체를 반환하고 Stack 에서 제거
    fun pop(): Memento{
        return this.memento.pop()
    }
}