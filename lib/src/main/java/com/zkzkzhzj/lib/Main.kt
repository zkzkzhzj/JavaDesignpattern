package com.zkzkzhzj.lib

import com.zkzkzhzj.lib.observer.FirstUser
import com.zkzkzhzj.lib.observer.SecondUser
import com.zkzkzhzj.lib.observer.WebToon


fun main(){
    val webToon = WebToon()

    val firstUser = FirstUser()
    val secondUser = SecondUser()

    webToon.addUser(firstUser)
    webToon.addUser(secondUser)

    webToon.update()

    webToon.update()
}