package com.zkzkzhzj.lib.command.use_command

// Command 에게 작업을 요청
class CharacterC {
    private  var commandC: CommandC? = null

    fun setCommand(commandC: CommandC){
        this.commandC = commandC
    }

    fun execute(){
        this.commandC?.execute() ?: println("커맨드 설정을 해주세요")
    }
}