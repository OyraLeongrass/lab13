package org.example;

public class App {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Johnson", 2334);
        Tester tester2 = new Tester("John", "Doe", 5, "Advanced", 6654);
        Tester tester3 = new Tester("Alice", "Smith", 3, 34542);

        tester2.showInfo();
        tester3.showInfo(true);
        tester1.showInfo("salary");

        Tester.printHello();
    }
}
