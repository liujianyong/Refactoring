package ch01.before;

import ch01.before.Movie;

/**
 * 
 * @author liujianyong Rental ��ʾĳ���˿�����һ��ӰƬ
 *
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        super();
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie _movie) {
        this._movie = _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }
}
