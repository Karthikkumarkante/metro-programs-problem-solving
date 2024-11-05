package com.maveric.problemsolving.profitableadvertiements;

public class Advertisement {
    private String id;
    private double price;
    private int height;
    private String title;
    private String content;

    public Advertisement(String id, double price, int height, String title, String content) {
        this.id = id;
        this.price = price;
        this.height = height;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
