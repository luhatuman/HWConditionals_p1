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

        //Task 5
        System.out.println();
        System.out.println("Task 5");
        byte person_v2 = 25; //Вводим возраст человека
        if (person_v2 >= 7 && person_v2 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (person_v2 >= 18 && person_v2 < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }
        }

        //Task 6
        System.out.println();
        System.out.println("Task 6");
        byte seat_v2 = 60; //Вводим текущее число пассажиров занимающих места
        if (seat_v2 >= 0 && seat_v2 < 60) {
            System.out.println("В вагоне есть " + (60 - seat_v2) + " сидячих мест(а)");
        } else if (seat_v2 >= 60 && seat_v2 < 102) {
                System.out.println("В вагоне только " + (102 - seat_v2) + " стоячих мест(а)");
            } else {
                    System.out.println("Мест нет!");
            }

        //Task 7
        System.out.println();
        System.out.println("Task 7");
        byte ageOfThePearson = 2; //Вводим возраст человека
        if (ageOfThePearson >= 2 && ageOfThePearson <= 6) {
            System.out.println("Если возрасл человека равен " + ageOfThePearson + ", то ему нужно ходить в детский сад");
        } else if (ageOfThePearson >= 7 && ageOfThePearson <= 18) {
            System.out.println("Если возрасл человека равен " + ageOfThePearson + ", то ему нужно ходить в школу");
        } else if (ageOfThePearson > 18 && ageOfThePearson <= 24) {
            System.out.println("Если возрасл человека равен " + ageOfThePearson + ", то его место в университете");
        } else if (ageOfThePearson > 24) {
            System.out.println("Если возрасл человека равен " + ageOfThePearson + ", то ему пора ходить на работу");
        }
        }
    }