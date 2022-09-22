/** ****************************************************************************
 * Scores.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package module3competencyProject;

import java.util.*;
import java.io.*;

public class Students implements Serializable {

    ArrayList<String> students = new ArrayList<>();
//******************************************************************************

    public Students(String[] names) {
        for (int i = 0; i < names.length; i++) {
            students.add(names[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************
} // end StudentList class
