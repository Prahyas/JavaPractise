import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your age?");
            int myName = reader.read();
        System.out.println("My name is " + myName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}