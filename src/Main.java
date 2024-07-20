public class Main {
    public static void main(String[] args) {
        //вывод значений переменных согласно условиям задачи №1//
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println("dog= "+dog);
        var cat = 3.6;
        System.out.println("cat= "+cat);
        var paper = 753789;
        System.out.println( "paper= "+paper );
        //Задача 2: увеличить значения переменных на 4//
        System.out.println("Задача №2");
        var dogx4= dog*4;
        System.out.println("dogx4="+dogx4);
        var catx4= cat*4;
        System.out.println("catx4="+catx4);
        var paperx4= paper*4;
        System.out.println("paperx4="+paperx4);
        //Задача 3 : уменьшить значения переменных из задачи №1 dog на 3.5; cat на 1.6; paper на 7639//
        System.out.println("Задача №3");
        var dogMinuse = dog-3.5;
        System.out.println("dog уменьшен на 3.5 = "+dogMinuse);
        var catMinuse = cat-1.6;
        System.out.println("cat уменьшен на 1.6 ="+catMinuse);
        var paperMinuse = paper-7639;
        System.out.println("paper уменьшен на 7639 ="+paperMinuse);
        //задача №4 , решение согласно условиям задачи//
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println("friend="+friend+"  friendX2="+friend*2+"  friendX2/7="+friend*2/7);
        //Задача №5, решение согласно условиям задачи//
        System.out.println("Задача№5");
        var frog=3.5;
        System.out.println("Лягушка="+frog+"  ЛягушкаX10="+frog*10+"  ЛягушкаX10/3.5"+frog*10/3.5+"  (ЛягушкаX10/3.5)+4="+((frog*10/3.5)+4));
        //Задача6, решение согласно условиям задачи//
        System.out.println("Задача№6");
        var mass1=78.2;
        var mass2=82.7;
        var totalMass= mass1+mass2;
        var massDifference = 82.7-78.2;
        System.out.println("Общая масса бойцов="+totalMass);
        System.out.println("Разница массы="+massDifference);
        //Задача №7, решение согласно условиям задачи//
        System.out.println("Задача№7");
        System.out.println("Разница путем вычитания="+massDifference);
        var massDifference2 = mass2%mass1;
        System.out.println("Разница масс с помощью функции % ="+massDifference2);
        //Задача№8, решение согласно условиям задачи//
        System.out.println("Задача №8");
        var totalHours = 640;
        var hoursOnePerson = 8;
        var totalPerson = totalHours/hoursOnePerson;
        System.out.println("Общее кол-во сотрудников="+totalPerson+"  Если сотрудников больше на 94 то всего часов ="+(totalPerson+94)*8);

    }
}