package com.company;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookObject {
    private String sku;
    private String title;
    private String author;
    private String description;
    private double price;

    public BookObject(){
        this.sku=sku;

    }
    public BookObject(String sku, String title, String Author, String description, double price) {
        this.author=author;
        this.description=description;
        this.price=price;
        this.sku=sku;
        this.title=title;
    }

    public void setPrice(double price) {
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }
    public void books(String sku, ArrayList<Book> arrayName) {

        System.out.println();


    }
}
