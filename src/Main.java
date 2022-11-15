public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        byte userAge = 17;
        if (userAge >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (userAge < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        byte person = 18; //Вводим возраст человека
        if (person >= 7 && person < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (person >= 18 && person < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (person >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        byte seat = 60; //Вводим текущее число пассажиров занимающих места
        if (seat >= 0 && seat <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (seat > 60 && seat <= 102) {
            System.out.println("В вагоне только стоячие места");
        }
        if (seat > 102) {
            System.out.println("Мест нет!");
        }

        //Task 4
        System.out.println();
        System.out.println("Task 4");
        byte userAge_v2 = 19;
        if (userAge_v2 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
    }
}