import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int person = 19;
        if (person >= 18) {
            System.out.println("тебе больше 18 лет");}

        int person_sec = 16;
        if (person_sec <= 18) {
            System.out.println("тебе меньше 18 лет");
        }

        int temp = 6;
        if (temp > 5) {
            System.out.println("На улице " + temp+ " градусов, нужно надеть шапку");
        }
        temp = 3;
        if (temp <= 5) {
                System.out.println("На улице " + temp+ " можно идти без шапки");
            }

        int speed  =100;
        if (speed > 60){
            System.out.println("«Если скорость "+ speed +" то придется заплатить штраф");
        }
        speed = 50;
        if (speed <= 60){
            System.out.println("«Если скорость "+ speed + " можно ездить спокойно ");
        }
        int personAge = 19;

        if (2 <= personAge && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " то ему надо ходить в детский сад");
        } else if (7 <= personAge && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + " то ему надо ходить в школу");
        }  else if (18 <= personAge && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " то ему надо ходить университет");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + " то ему надо ходить на работу");
        }

        int kidAge = 6;
        if (5 < kidAge && kidAge < 14) {
            System.out.println("Если возраст ребенка равен "+kidAge+", то ему можно кататься на аттракционе в сопровождении");
        } else if (5 > kidAge) {
            System.out.println("Если возраст ребенка равен "+kidAge+", то ему нельзя кататься на аттракционе");
        }  else if (14 < kidAge) {
            System.out.println("Если возраст ребенка равен "+kidAge+", то ему можно кататься без сопровождения взрослого");}

        int plase = 65;
        if (plase < 102){
            if (plase < 60){
                System.out.println("есть сидячие мееста");
            } else if (60 < plase && plase <= 102){
                System.out.println("есть стоячие места");
            }

        }else {
            System.out.println("нету мест");
        }
        int one = 34;
        int two = 2;
        int three =9;
        if (one > two){
            if (one > three){
                System.out.println(one);
            } else {
                System.out.println(three);
            }

        }else if (two > three){
            System.out.println(two);
        }else {
            System.out.println(three);
        }




    }



}