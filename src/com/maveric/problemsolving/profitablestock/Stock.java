package com.maveric.problemsolving.profitablestock;

public class Stock {

        private String id;

        private String name;

        private double totalValue;

        private long availableUnits;

        private double totalExpectedProfitPerMonth;

    public Stock(String id, String name, double totalValue, long availableUnits, double totalExpectedProfitPerMonth) {
        this.id = id;
        this.name = name;
        this.totalValue = totalValue;
        this.availableUnits = availableUnits;
        this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public long getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(long availableUnits) {
        this.availableUnits = availableUnits;
    }

    public double getTotalExpectedProfitPerMonth() {
        return totalExpectedProfitPerMonth;
    }

    public void setTotalExpectedProfitPerMonth(double totalExpectedProfitPerMonth) {
        this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totalValue=" + totalValue +
                ", availableUnits=" + availableUnits +
                ", totalExpectedProfitPerMonth=" + totalExpectedProfitPerMonth +
                '}';
    }
}
