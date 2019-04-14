package com.example.carinscrollview;

class Vehicle {

    private String company, color;
    private int year, purchasePrice;
    private float engineSize;

    public Vehicle() {
    }

    public Vehicle(String company, int year, String color, int purchasePrice, float engineSize) {
        this.company = company;
        this.year = year;
        this.color = color;
        this.purchasePrice = purchasePrice;
        this.engineSize = engineSize;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
