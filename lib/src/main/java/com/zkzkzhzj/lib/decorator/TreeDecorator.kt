package com.zkzkzhzj.lib.decorator

// 트리에 올라갈 장식품 추가를 위한 클래스
abstract class TreeDecorator(private val christmasTree: ChristmasTree) : ChristmasTree {

    override fun decorator(): String {
        return christmasTree.decorator()
    }
}