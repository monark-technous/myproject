package custom;

import java.util.Scanner;

/**
 * In this class get ATM card and valildate that restriction for people.
 * */
public class PeopleATM {

    public void getATM(String name,int age)throws MinorException {

        if(age<18)
            throw new MinorException(name+" you are not mazor so you have not get ATM card");
        else
            System.out.println("Hello, "+name+" congratulations...your atm card create successfully");
    }

    public static void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        try{
            // Call PeopleATM method for get an ATM card.
            PeopleATM peopleATM = new PeopleATM();
            peopleATM.getATM(name,age);
        }
        catch (MinorException e){

            e.printStackTrace();
        }
    }
}
