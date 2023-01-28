public class Main {
    public static void main(String[] args) {

    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
}

    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println("задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        var dog = 12.0;
        dog = dog - 3.5;
        var cat = 7.6;
        cat = cat - 1.6;
        var paper = 763793;
        paper = paper - 7639;
        System.out.println("задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }

    public static void task5() {
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("задача 6");
        var oneBoxer = 78.2;

        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Суммарный вес боксеров равен: " + totalWeight);
        var weightDifference = oneBoxer - twoBoxer;
        System.out.println("Разницa между весами бойцов: " + weightDifference);
    }

    public static void task7() {
        System.out.println("задача 7");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var remainingWeight = oneBoxer-twoBoxer;
        System.out.println("Суммарный вес боксеров равен:" + remainingWeight+"кг");
        var weight = twoBoxer%oneBoxer;
        System.out.println("остаток от деления" + weight);
    }
    public static void task8 () {
        System.out.println("задача 8");
     var summaryHours = 640;
     var workingHours = 8;
     var workers = summaryHours / workingHours;
     System.out.println ("Всего работников " + workers );
     System.out.println ("всего работников в компании - 80 человек");
    var employs = 94 + 80;
    System.out.println ("еще сотрудники компании" + employs );
    var totalTime = employs * workingHours;
    System.out.println ("поделенное время" + totalTime);
    System.out.println ( " если в компании работает 174 человек то всего 1392 часов работы может быть поделено между сотрудниками");
    System.out.println();
    System.out.println();


    }
}