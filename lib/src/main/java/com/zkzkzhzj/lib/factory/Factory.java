package com.zkzkzhzj.lib.factory;

public class Factory {
    public static String companyType = "Company";
    public static String studentType = "Student";

    public static Notebook getNoteBook(String type, String company, String cpu, String ram) {
        if (type.equals(companyType)) {
            return new Company(company, cpu, ram);
        } else if(type.equals(studentType)){
            return new Student(company, cpu, ram);
        } else {
            System.out.println("옳바르지 못한 입력입니다");
        }
        return null;
    }
}
/*
펙토리 개념의 핵심
 - 클래스의 인스턴스를 만드는 것은 서브클래스에서 결정
 - 사용하는 클래스의 서브클래스에 대한 정보 없이도 생성(결합도 낮춤)
 - factory 클래스는 인스턴스를 생성

활용성
 - 자신이 생성되는 시점을 예측할 수 없을때
 - 생성할 객체의 책임을 서브클래스가 지정했으면 할 때
*/