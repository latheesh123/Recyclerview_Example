package com.example.latheeshvirupakshi.contextmenu;

/**
 * Created by latheeshvirupakshi on 3/15/17.
 */

public class Movie {


    private String Title,genre,Year;


    public  Movie()
    {

    }

public Movie(String Title,String genre,String Year)
{
    this.Title=Title;
    this.genre=genre;
    this.Year=Year;

}

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
