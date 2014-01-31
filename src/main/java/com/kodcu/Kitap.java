package com.kodcu;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 23.07.2013
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
public class Kitap {

    private String name;
    private String author;
    private double price;

    public Kitap() {
    }

    public Kitap(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
