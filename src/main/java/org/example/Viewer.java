package org.example;

import java.util.List;

public class Viewer {
    private String nickName;
    private int age;
    private int viewedMovies;
    List<Cinema> cinemaList;

    public Viewer(String nickName, int age, List<Cinema> cinemaList) {
        this.nickName = nickName;
        this.age = age;
        this.viewedMovies = cinemaList.size();
        this.cinemaList = cinemaList;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getViewedMovies() {
        return viewedMovies;
    }

    public void setViewedMovies(int viewedMovies) {
        this.viewedMovies = viewedMovies;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }
}
