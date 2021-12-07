package com.zkzkzhzj.lib.factory;

public abstract class Notebook {
    public abstract String getUsePlace();
    public abstract String getCompany();
    public abstract String getCPU();
    public abstract String getRAM();

    @Override
    public String toString() {
        return getUsePlace() + "에서 사용한다면 회사는 "
                + getCompany() + "(으)로 하고 CPU는 "
                + getCPU() + "이상으로 하고 RAM은 "
                + getRAM() + "이상으로 하세요";
    }
}
