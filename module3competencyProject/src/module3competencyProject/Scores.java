/** ****************************************************************************
 * NumberList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of scores.
 **************************************************************************** */
package module3competencyProject;

import java.util.*;
import java.io.*;

public class Scores implements Serializable {

    ArrayList<Double> scores = new ArrayList<>();
    int n = scores.size();
//******************************************************************************

    public Scores(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            scores.add(numbers[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************

    public double getLowScore(double[] numbers) {
        double min = Collections.min(scores);
        System.out.println("Low score: " + min);
        return min;
    } // end getLowScore method
//******************************************************************************

    public double getHighScore(double[] numbers) {
        double max = Collections.max(scores);
        System.out.println("High score: " + max);
        return max;
    } // end getLowScore method
//******************************************************************************

    public double getAverageScore(double[] numbers) {
        double total = 0;
        double avg = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
            avg = total / scores.size(); // finding ther average value
        }
        System.out.println("Average score: " + avg);
        return avg;
    } // end getLowScore method
//******************************************************************************
} // end NumberList class
