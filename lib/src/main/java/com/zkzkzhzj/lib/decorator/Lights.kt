package com.zkzkzhzj.lib.decorator

class Lights( val christmasTree: ChristmasTree) : TreeDecorator(christmasTree) {

    override fun decorator(): String {
        return "${super.decorator()} with Lights"
    }
}