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
    }
}