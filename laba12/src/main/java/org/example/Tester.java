package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String surname, double salary){
        this.surname=surname;
        this.salary=salary;
    }
    public Tester(String name, String surname,int expirienceInYears, String englishLevel, double salary){
        this(surname, salary);
        this.name=name;
        this.expirienceInYears=expirienceInYears;
        this.englishLevel=englishLevel;
        this.salary=salary;
    }
    public Tester(String name, String surname,int expirienceInYears, double salary){
        this(name, surname,expirienceInYears, "C1",salary);
    }
    public void showInfo() {
        System.out.println("Tester: " + name + " " + surname + ", Exp: " + expirienceInYears +
                " years, English: " + englishLevel + ", Salary: $" + salary);
    }
    public void showInfo(boolean shortFormat) {
        if (shortFormat) {
            System.out.println(name + " " + surname + " - Exp: " + expirienceInYears + " years");
        } else {
            showInfo();
        }
    }
    public void showInfo(String format) {
        if (format.equals("salary")) {
            System.out.println(surname + " - Salary: $" + salary);
        } else if (format.equals("englishLevel")) {
            System.out.println(surname + " - English Level: " + englishLevel);
        }
        else {
            showInfo();
        }
    }
    public static void printHello() {
        System.out.println("Hello from Tester!");
    }
}
