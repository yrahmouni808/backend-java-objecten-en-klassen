package src;

import java.time.LocalDate;

public record Film(String title, String director, LocalDate releaseDatum, String genre) {

    public void printInfo() {
        System.out.println(
                "Title: " + title + ".\nDirector: " + director + ".\nRelease date: " +
                        releaseDatum.getDayOfMonth() + "-" + releaseDatum.getMonthValue() +
                        "-" + releaseDatum.getYear() + ".\nGenre: " + genre + "."
        );
    }
}
