package com.zkzkzhzj.lib.singleton

object MyNotebook {
    // const val 컴파일 시간에 결정되는 상수
    const val name = "G731GU"
    const val cpu = "i7-9750H"
    const val graphics = "GTX-1660Ti"
    var ram = 24
}

class MyCar constructor(private val msg: String){
    companion object{
        const val name = "G80"
        var pay = 20000000
    }

    fun msg(){
        println(msg)
    }
}

/* https://www.bsidesoft.com/8187
 * 래퍼런스 타입,  원시타입 == ===
 * object = 익명 객체 사용
 *          명시적으로 선언없이 class 생성(object : class)
 *        = * 싱글톤 용도로 사용
 *            프로세스 시작시 생성
 *
 * companion object = 동반 객체
 *                    클래스 인스턴스 없이 내부에 접근하고 싶을 때 선언
 *                    클래스 당 1개만 생성
 *                    클래스가 메모리에 적재되며 함께 생성(동반)
 *
 * 자바에서는 원시 타입을 비교하기 위해 == 사용(값이 같은지 비교, 동등성)
 * 참조 타입 사이에 == 할 경우 주소값으로 비교하게 된다(동일성)
 *
 * 코틀린에서는 == 을 사용할 경우 내부적으로 자바의 == 와 equals 를 호출(동등성을 비교)
 *
 * 자바에서는 없는 === 를 사용할 경우 주소값 비교(동일성)
*/