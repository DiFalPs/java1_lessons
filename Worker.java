package ru.geekbrains.lesson_3;

public class Worker {
   private static final int CURRENT_YEAR = 2020;
   private String LFP;
   private int salary;
   private int birthDate;
   private int id;

    Worker (String LFP, int salary, int age) {
        this.LFP = LFP;
        this.salary = salary;
        this.setBirthDate(age);
    }

    public String getFLP() {
        return this.LFP;
    }

    public int getSalary() {
        return this.salary;
    }
    public int getAge() {
        return CURRENT_YEAR - this.birthDate;
    }

    public void setBirthDate (int age) {
        this.birthDate = CURRENT_YEAR - age;
    }

    public void setSalary(int salary) {
       this.salary = salary;
    }





}
