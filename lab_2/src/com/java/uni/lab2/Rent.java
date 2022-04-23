package com.java.uni.lab2;

public class Rent {
    int kits = 0;
    int days = 0;
    int hours = 0;
    int wholeHours = 0;
    int helmets = 0;
    int goggles = 0;
    double basePrice = 0;
    double totalPrice;
    double optionalElementsBP = 0;
    double optionalElementsTP;
    double helmetsPrice;
    double gogglesPrice;

    void calcHours () {
        wholeHours = days * 24;

        if (hours >= 24) {
            days += hours / 24;
            wholeHours = days * 24;
            hours = 0;
        }
        wholeHours += hours;
    }

    double totalValue (double totalPrice) {
        helmetsPrice = optionalElementsBP * helmets * wholeHours;
        gogglesPrice = optionalElementsBP * goggles * wholeHours;
        optionalElementsTP = helmetsPrice + gogglesPrice;

        return totalPrice = (basePrice * kits * wholeHours) + optionalElementsTP;
    }

    String display () {
        return ("\n\nAll info :" +
                "\n1.   " + kits + " kit(s)" +
                "\n2.   " + days + " day(s)" +
                "\n3.   " + hours + " hour(s)" +
                "\n4.   base price : $" + basePrice +
                "\n5.   " + helmets + " helmet(s)" +
                "\n6.   " + goggles + " pair(s) of goggles" +
                "\n7.   base price (optional elements) : $" + optionalElementsBP);
    }
}