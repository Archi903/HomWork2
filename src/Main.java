public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Домашнее задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Часть 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Часть 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Домашнее задание 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Часть 2");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3() {
        System.out.println("Домашнее задание 3");
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Общий вес бойцов состовляет " + totalWeight);
        System.out.println("Часть 2");
        var weightDifferent = fighterWeight2 - fighterWeight1;
        System.out.println("Разница в весе, 1 вариант " + weightDifferent);
        var weightDifferent2 = fighterWeight2 % fighterWeight1;
        System.out.println("Разница в весе, 1 вариант " + weightDifferent2);
        System.out.println("Часть 3");
        var workHours = 640;
        var hoursForOne = 8;
        var Workers = workHours / hoursForOne;
        System.out.println("Всего работников в компании " + Workers + " человек");
        Workers = Workers + 94;
        var realHours = hoursForOne * Workers;
        System.out.println("Если в компании работает " + Workers + " человек, то всего " + realHours +
                " часа работы может быть поделено между сотрудниками");
    }
}