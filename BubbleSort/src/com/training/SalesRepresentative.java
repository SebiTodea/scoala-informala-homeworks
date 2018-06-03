package com.training;

public class SalesRepresentative {
    private String name;
    private int salesNo;
    private int saleQuota;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public int getSaleQuota() {
        return saleQuota;
    }

    public void setSaleQuota(int saleQuota) {
        this.saleQuota = saleQuota;
    }

    public int getSalesRevenue(){
        return this.salesNo * this.saleQuota;
    }

    @Override
    public String toString() {
        return this.name + " made " + this.salesNo + " sales with quota/sales of " + this.saleQuota + "$ worth of " + this.getSalesRevenue() + "$";
    }
}
