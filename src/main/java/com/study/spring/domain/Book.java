//package com.study.spring.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "book")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long bookId;
//
//    private String title;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "bookId")
//    private List<Story> stories = new ArrayList<>();
//
//    public Book() {
//    }
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//    public Long getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Long bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<Story> getStories() {
//        return stories;
//    }
//
//    public void setStories(List<Story> stories) {
//        this.stories = stories;
//    }
//}
