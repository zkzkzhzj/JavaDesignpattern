package com.zkzkzhzj.lib.decorator

// 아무 장식이 없는 default Tree
class DefaultChristmasTree : ChristmasTree {
    override fun decorator(): String {
        return "Christmas Tree"
    }
}