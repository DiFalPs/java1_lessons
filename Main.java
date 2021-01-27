package ru.geekbrains.jalgoritmi.lessons;

public class Main {

    public static void insertBefore() {
        Cat c1 = new Cat(1, "!1");
        Cat c2 = new Cat(2, "@2");
        Cat c3 = new Cat(3, "#3");
        Cat c4 = new Cat(4, "$4");
        Cat c5 = new Cat(5, "%5");
        SingleLinkedList listCats = new SingleLinkedList();
        listCats.push(c1);
        listCats.push(c2);
        listCats.push(c3);
        listCats.push(c4);
        CatsIterator cIterator = listCats.getIterator();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }
        cIterator.reset();
        cIterator.next();
        System.out.println("=====================");
        System.out.println(cIterator.getCurrent() + " this is Current");
        System.out.println("=====================");
        cIterator.insertBefore(c5);
        cIterator.reset();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }



    }

    public static void insertAfter() {
        Cat c1 = new Cat(1, "!1");
        Cat c2 = new Cat(2, "@2");
        Cat c3 = new Cat(3, "#3");
        Cat c4 = new Cat(4, "$4");
        Cat c5 = new Cat(5, "%5");
        SingleLinkedList listCats = new SingleLinkedList();
        listCats.push(c1);
        listCats.push(c2);
        listCats.push(c3);
        listCats.push(c4);
        CatsIterator cIterator = listCats.getIterator();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }
        cIterator.reset();
        System.out.println("=====================");
        System.out.println(cIterator.getCurrent() + " this is Current");
        System.out.println("=====================");
        cIterator.insertAfter(c5);
        cIterator.reset();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }



    }

    public static void deleteCurrent() {
        Cat c1 = new Cat(1, "!1");
        Cat c2 = new Cat(2, "@2");
        Cat c3 = new Cat(3, "#3");
        Cat c4 = new Cat(4, "$4");
        Cat c5 = new Cat(5, "%5");
        SingleLinkedList listCats = new SingleLinkedList();
        listCats.push(c1);
        listCats.push(c2);
        listCats.push(c3);
        listCats.push(c4);
        listCats.push(c5);
        CatsIterator cIterator = listCats.getIterator();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }
        cIterator.reset();
        System.out.println("=====================");
        System.out.println(cIterator.getCurrent() + " this is Current");
        for (int i = 0; i < 2; i++) {
            cIterator.next();
        }
        System.out.println(cIterator.getCurrent() + " now this is Current");
        cIterator.deleteCurrent();
        System.out.println("=====================");
        cIterator.reset();
        for(int i = 0; i < 5; i++){
            System.out.println(cIterator.next());
        }



    }


    public static void main(String[] args) {
//        insertBefore();
//        insertAfter();
//        deleteCurrent();
    }
}
