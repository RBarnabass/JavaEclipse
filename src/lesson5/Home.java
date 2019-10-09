package lesson5;

import java.util.Scanner;

public class Home {	

    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static String[] schedule = {"1. Prepare to eat; \n2. Go to a friend; \n3. Do homework",
            "1. Go to university; \n2. Going for a friend's birthday", "1. Go to work; \n2. Go for a walk in the city",
            "1. Go to workout; \n2. Start cleaning in the room",
            "1. Get ready for the weekend", "1. Rest all day long; \n2. Prepare to eat",
            "1. Meet your friends and go for a walk; 2. \nGet ready for the start of the new week"};


    public static void main(String[] args) {

        System.out.println("\nEnter 'close' for exit");

        boolean isCycle = true;
        int correctDay;

        Scanner scanData = new Scanner(System.in);

        while (isCycle) {

            System.out.print("\nEnter a name for the day of the week to display the schedule:  ");
            String data = scanData.next();
            isCycle = isContinue(data);

            correctDay = isCorrectDay(data);

            if (correctDay >= 0) {
                System.out.println("Set todo list: ");
                data = scanData.next();
                schedule[correctDay] = data;
            }

            detectAndPrintSchedule("monday");
        }

        scanData.close();
    }

    private static boolean isContinue(String data) {
        if (data.equalsIgnoreCase("close")) {
            return false;
        }
        return true;
    }

    private static void detectAndPrintSchedule(String data) {
        for (int i = 0; i < days.length; i++) {

            if (data.equalsIgnoreCase(days[i])) {
                System.out.println("Schedule for " + days[i]);
                System.out.println(schedule[i]);
                break;
            }

        }
    }

    private static int isCorrectDay(String data) {

        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase(data)) {
                return i;
            }
        }
        return -1;
    }
}
