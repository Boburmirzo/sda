package com.sda.tasks.codingbat;

/**
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 *
 * @author bobur
 * @version 1.0
 *
 */
public class SleepIn {

  public static void main(String[] args) {
     SleepIn sleepIn = new SleepIn();
     boolean isSleepIn = sleepIn.sleepIn1(false, true);

    System.out.println(isSleepIn == true);
  }

  /**
   * Sleep in method to check if weekday or vacation
   * @param weekday weekday if it is true
   * @param vacation vacation if it is false
   * @return return true if we sleep in
   */

  private boolean sleepIn1(boolean weekday,
                          boolean vacation) {
    if(!weekday || vacation){
      return true;
    }
    return false;
  }

  public boolean sleepIn2(boolean weekday,
                          boolean vacation) {
    return (!weekday || vacation) ? true : false;
  }

  public boolean sleepIn3(boolean weekday,
                          boolean vacation) {
    return !weekday || vacation;
  }


}
