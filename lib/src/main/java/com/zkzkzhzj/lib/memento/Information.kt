package com.zkzkzhzj.lib.memento

// Stat 관리를 위한 정보 클래스
class Information(private var stat: Stat) {
    // memento 생성
    fun createMemento(): Memento{
        return Memento(this.stat)
    }

    // stat 을 memento 에서 꺼내와 재구성
    fun restoreMemento(memento: Memento){
        this.stat = memento.getStat()
    }

    // stat 값 변경
    fun setStat(stat: Stat){
        this.stat = stat
    }

    // stat 값 가져오기
    fun getStat(): Stat{
        return this.stat
    }
}