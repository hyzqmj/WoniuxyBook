package com.woniuxy.domain;

import java.math.BigDecimal;

public class Book {
    private Integer bookid;

    private String bookame;

    private String booktype;

    private String author;

    private String publisher;

    private BigDecimal bidprice;

    private Integer pid;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookame() {
        return bookame;
    }

    public void setBookame(String bookame) {
        this.bookame = bookame;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getBidprice() {
        return bidprice;
    }

    public void setBidprice(BigDecimal bidprice) {
        this.bidprice = bidprice;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}