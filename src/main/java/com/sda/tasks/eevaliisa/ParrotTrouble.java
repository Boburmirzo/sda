package com.sda.tasks.eevaliisa;

/**
 We have a loud talking parrot.
 The "hour" parameter is the current hour time in the range 0..23.
 We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 Return true if we are in trouble.
 */

public class ParrotTrouble {

        public boolean parrotTrouble2(boolean talking, int hour) {
            return (talking && (hour < 7 || hour > 20));
            // Need extra parenthesis around the || clause
            // since && binds more tightly than ||
            // && is like arithmetic *, || is like arithmetic +

        }
}
