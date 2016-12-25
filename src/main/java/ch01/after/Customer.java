package ch01.after;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public static void main(String[] args) {
        Customer cust = new Customer("Liujianyong");
        Movie movie = new Movie("CHILDRENS", 2);
        Rental r = new Rental(movie, 3);
        cust.addRental(r);
        String statement = cust.statement();
        System.out.println(statement);
    }

    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;

    }
    
    private double getTotalCharge(){
        Enumeration<Rental> rentals = _rentals.elements();
        double result = 0;
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    
    private int getTotalFrequentRenterPoints(){
        Enumeration<Rental> rentals = _rentals.elements();
        int result = 0;
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
