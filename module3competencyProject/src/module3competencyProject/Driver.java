/** ****************************************************************************
 * writingAndReadingObjectsWithNumbersWithInput.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package module3competencyProject;

import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Module 3 Student Scores by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        double score;
        double[] numbers;
        String name;
        String[] names;
        names = new String[5];
        numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            name = computerKeyboardInput.next();
            names[i] = name;
            System.out.print("Enter test score: ");
            score = computerKeyboardInput.nextDouble();
            numbers[i] = score;
        } // end for loop
        Students studentList = new Students(names);
        Scores numberList = new Scores(numbers);
        String fileName = "namesAndScores.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
            fileOut.writeObject(numberList);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Data written to file");
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                studentList = (Students) fileIn.readObject();
                studentList.display();
                numberList = (Scores) fileIn.readObject();
                numberList.display();
                numberList.getLowScore(numbers);
                numberList.getHighScore(numbers);
                numberList.getAverageScore(numbers);
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end writingAndReadingObjectsWithNumbers class
