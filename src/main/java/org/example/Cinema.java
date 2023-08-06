package org.example;

public class Cinema {
    private String name;
    private String genre;
    private double durationInHours;

    public Cinema(String name, String genre, double durationInHours) {
        this.name = name;
        this.genre = genre;
        this.durationInHours = durationInHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", durationInHours=" + durationInHours +
                '}';
    }
}
