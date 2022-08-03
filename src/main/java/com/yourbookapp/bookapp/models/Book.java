package com.yourbookapp.bookapp.models;

import javax.persistence.Entity;

@Entity
public class Book extends AbstractEntity {

    private String name;
    private String isbn;
    private String published;
    private int averageRating;

    public Book(String name, String isbn, String published, int averageRating) {
        this.name = name;
        this.isbn = isbn;
        this.published = published;
        this.averageRating = averageRating;
    }

    public Book() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return name;
    }
}
