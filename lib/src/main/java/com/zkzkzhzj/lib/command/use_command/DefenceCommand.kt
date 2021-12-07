package com.zkzkzhzj.lib.command.use_command

// Command 인터페이스를 확장하여 기능을 전달받아 기능을 처리
class DefenceCommand(private val defenceC: DefenceC) : CommandC {
    override fun execute() {
        defenceC.execute()
    }
}