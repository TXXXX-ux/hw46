package kg.attractor.java;

import kg.attractor.java.handler.Lesson44Server;
import kg.attractor.java.handler.Lesson46;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Lesson46("localhost", 4040).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
