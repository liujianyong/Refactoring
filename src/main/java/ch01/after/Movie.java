package ch01.after;

/**
 * Movie 只是简单的一个纯数据类
 * @author liujianyong
 *
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }
    
    double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
        case Movie.REGULAR:
            result += 2;
            if (daysRented > 2) {
                result += (daysRented - 2) * 1.5;
            }
            break;
        case Movie.NEW_RELEASE:
            result += daysRented * 3;
            break;
        case Movie.CHILDRENS:
            result += 1.5;
            if (daysRented > 3) {
                result += (daysRented - 3) * 1.5;
            }
            break;
        }
        return result;
    }
    
    int getFrequentRenterPoints(int daysRented) {
        // add bouns for a tow day new release rental
        if ((_priceCode == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        }else{
            // add frequent renter points
            return 1;
        }
    }
}
