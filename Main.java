package ru.geekbrains.lesson_3;

public class Main {

    private static void homework5 (Worker[] arr1) {
        for (int i = 0; i < arr1.length; i++ ) {
            if (arr1[i].getAge() > 40) {
                System.out.println(arr1[i].getFLP() + " - этот cотрудник  старше 40");
            }
            if (arr1[i].getAge() > 45) {
               arr1[i].setSalary(5000 + arr1[i].getSalary());
                System.out.println("У сотрудника " +arr1[i].getFLP() + " изменилась зарплата на: " + arr1[i].getSalary());
            }
        }
    }

    private static void homework6 (Worker[] arr1) {
        float avarage = 0;
        if (arr1.length > 0) {
            float sum = 0;
            for (int i = 0; i < arr1.length; i++ ) {
                sum += arr1[i].getSalary();
            }
            avarage = sum / arr1.length;
            System.out.println("Среднее арифмитическое по ЗП: " + avarage);
        }
    }

    public static void main (String[] args) {
        Worker p1 = new Worker("Филиппов Дмитрий Олегович", 1203, 20);
        System.out.println("ФИО: " + p1.getFLP() + ", Возраст:" + p1.getAge());

        Worker p2 = new Worker("Кошелев Артём Викторович", 1100, 25);
        Worker p3 = new Worker("Петраш Алёна Андреевна", 900, 41);
        Worker p4 = new Worker("Сташешен Сергей Сергеевич ", 800, 40);
        Worker p5 = new Worker("Грановский Сергей Вадимович", 700, 44);


        Worker[] arr1 = {p1, p2, p3, p4, p5};
       homework5(arr1);
       homework6(arr1);

    }


}
