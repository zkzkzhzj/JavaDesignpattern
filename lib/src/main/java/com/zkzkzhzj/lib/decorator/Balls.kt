package com.zkzkzhzj.lib.decorator

class Balls : TreeDecorator {

    constructor(christmasTree: ChristmasTree): super(christmasTree)

    override fun decorator(): String {
        return "${super.decorator()} with Balls"
    }
}