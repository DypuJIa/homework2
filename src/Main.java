public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + "\n");
        System.out.println("Задача 1");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");
        System.out.println("Задача 3");
        dog = (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + " кг");
        System.out.println(boxer2 + " кг");
        var totalWeight = boxer1 + boxer2;
        System.out.println(totalWeight + " кг");
        var weightDifference = boxer1 - boxer2;
        System.out.println(weightDifference + " кг " + "\n");
        System.out.println("Задача 7");
        var differenceBoxer = boxer2 % boxer1;
        System.out.println("разница между боксерами " + differenceBoxer + " кг" + "\n");
        System.out.println("Задача 8.1");
        var totalHours = 640;
        var oneEmployeeWorking = 8;
        var numberEmployees = totalHours / oneEmployeeWorking;
        System.out.println("всего работников в компании " + numberEmployees + " человек" + "\n");
        System.out.println("Задача 8.2");
        var numberEmployees2 = numberEmployees + 94;
        System.out.println(numberEmployees2);
        var totalHours2 = numberEmployees2 * oneEmployeeWorking;
        System.out.println("Если в компании работает " + numberEmployees2 + " человека, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");


    }

}



