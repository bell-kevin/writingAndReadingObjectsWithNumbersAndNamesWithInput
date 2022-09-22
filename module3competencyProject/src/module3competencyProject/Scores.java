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
} // end NumberList class
