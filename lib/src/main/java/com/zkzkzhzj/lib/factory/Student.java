package com.zkzkzhzj.lib.factory;

public class Student extends Notebook{
    private final String company;
    private final String cpu;
    private final String ram;

    public Student(String company, String cpu, String ram){
        this.company = company;
        this.cpu = cpu;
        this.ram = ram;
    }


    @Override
    public String getUsePlace() {
        return "학교";
    }

    @Override

    public String getCompany() {
        return company;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }
}
