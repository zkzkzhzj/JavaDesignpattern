package com.zkzkzhzj.lib.factory;

public class Company extends Notebook{
    private final String company;
    private final String cpu;
    private final String ram;

    public Company(String company, String cpu, String ram){
        this.company = company;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public String getUsePlace() {
        return "직장";
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
