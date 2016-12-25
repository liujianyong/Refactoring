package ch01.after2;

import ch01.after2.price.ChildrenPrice;
import ch01.after2.price.NewReleasePrice;
import ch01.after2.price.Price;
import ch01.after2.price.RegularPrice;

/**
 * Movie 只是简单的一个纯数据类
 * 
 * @author liujianyong
 *
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
        case REGULAR:
            _price = new RegularPrice();
            break;
        case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
        case CHILDRENS:
            _price = new ChildrenPrice();
            break;
        default:
            throw new IllegalArgumentException("Incorrect price code");
        }
    }
    
    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
       return _price.getFrequentRenterPoints(daysRented);
    }
}
