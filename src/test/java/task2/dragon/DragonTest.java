package task2.dragon;

import task2.Viewer;

import java.util.Scanner;

public class DragonTest {
    public static void main(String[] args) {
        System.out.println("Enter age of the dragon: ");
        int age = new Scanner(System.in).nextInt();
        Viewer.print(Dragon.countHeadsEyes(age) + "\n");
    }
}
