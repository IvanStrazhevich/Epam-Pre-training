package task2.dragonTest;

import task2.Viewer;
import task2.dragon.Dragon;

import java.util.Scanner;

public class DragonTest {
    public static void main(String[] args) {
        System.out.println("Enter age of the dragonTest: ");
        int age = new Scanner(System.in).nextInt();

        Viewer.print("Dragon has " + Dragon.countHeads(age) + " heads at age " + age);
        Viewer.print("Dragon has " + Dragon.countEyes(age) + " eyes at age " + age);
    }
}
