public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int fullAge = 18;
        int age = 10;
        if (age >= fullAge) {
            System.out.println("Если возраст человека равен или больше " + fullAge + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека меньше " + fullAge + ", то он еще несовершеннолетний");
        }
        System.out.println("Задача 2");
         int lowTemp = 5;
         int temp = 2;
         if (temp >= lowTemp) {
            System.out.println("На улице " + temp + " градусов можно идти без шапки");
        }
        else {
            System.out.println("На улице " + temp + " нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int allowedSpeed = 60;
        int speed = 70;
        if(speed <= allowedSpeed) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        }

        System.out.println("Задача 4");
        int agePerson = 4;
        if (agePerson < 2) {
            System.out.println("Если тебе " + agePerson + ", то пора спать");
        }
        else if (agePerson >= 2 && agePerson <= 6 ) {
            System.out.println("Если тебе " + agePerson + ", то ты ходишь в садик");
        }
       else  if (agePerson >= 7 && agePerson < 18) {
            System.out.println("Если тебе " + agePerson + ", то надо ходить в школу");
        }
        else if (agePerson >= 18 && agePerson < 24) {
            System.out.println("Если тебе " + agePerson + ", то надо учиться в университете");
        }
        else if (agePerson >= 24 && agePerson < 60) {
            System.out.println("Если тебе " + agePerson + ", то надо работать");
        }
        else if (agePerson >= 60) {
            System.out.println("Если тебе " + agePerson + ", то можно отдохнуть");
        }

        System.out.println("Задача 5");
        int ageKid = 1;
        if (ageKid < 5) {
            System.out.println("Если ребенку " + ageKid + ", то ему нельзя кататься на аттракционе");
        }
        else if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Если ребенку " + ageKid + ", то ему можно кататься в сопровождении взрослого");
        }
        else if (ageKid >= 14) {
            System.out.println(" Если ребенку " + ageKid + ", то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        int seat = 103;
        if (seat <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (seat > 60 && seat <= 102){
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("Мест нет");
        }

        System.out.println("Задача 7");
        int one = 5;
        int two = 10;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше");
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " больше");
        }
        else {
            System.out.println("Число " + three + " больше");
        }
    }
}