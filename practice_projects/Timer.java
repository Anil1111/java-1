import java.util.*;
import java.util.concurrent.TimeUnit;
import static java.lang.Math.toIntExact;

public class practice {
  static void print(Object obj) {
    System.out.print(obj);
  }
  public static void main(String[] args){
    long startTime = System.currentTimeMillis();
    long a = 0;

    while (true) {
      long elapsedTime = System.currentTimeMillis() - startTime;
      long eSeconds = elapsedTime / 1000;
      int elapsedSeconds = toIntExact(eSeconds);
      int secondsDisplay = elapsedSeconds % 60;
      int elapsedMinutes = elapsedSeconds / 60;
      int minutesDisplay = elapsedMinutes % 60;
      int elapsedHours = elapsedMinutes /60;
      int hoursDisplay = elapsedHours % 60;
      if (elapsedSeconds > a){
        System.out.print("\r");
        a += 1;
        if (hoursDisplay < 10) {
          switch (hoursDisplay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
              System.out.print("0"+hoursDisplay+":");
              break;
          }
        }
        else {
          System.out.print(hoursDisplay+":");
        }
        if (minutesDisplay < 10){
          switch (minutesDisplay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
              System.out.print("0"+minutesDisplay+":");
              break;
          }
        }
        else {
          System.out.print(minutesDisplay+":");
        }
        if (secondsDisplay < 10) {
          switch (secondsDisplay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
              System.out.print("0"+secondsDisplay);
              break;
          }
        }
        else {
          System.out.print(secondsDisplay);
        }
      }
    }
  }
}