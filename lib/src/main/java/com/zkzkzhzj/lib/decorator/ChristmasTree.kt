package com.zkzkzhzj.lib.decorator
/*
 * 장식하다 라는 뜻
 * 객체를 점점 꾸미듯이 확장하는 패턴
 * 기능을 동적으로 유연하게 확장할 수 있다
 * EX) 크리스마스 트리, 트리 -> 종 -> 반짝이 -> 별 -> 종...(원하는 만큼 확장)
 * 각, 추가 기능을 정의한 후 조합함으로써 조합을 설계하는 방식
 */
interface ChristmasTree {
    fun decorator(): String
}