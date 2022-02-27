package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = keyboard.nextLine();

        System.out.println("Middle initial: ");
        String middleInitial = keyboard.nextLine();

        System.out.println("Last name: ");
        String lastName = keyboard.nextLine();

        System.out.println("Year of birth: ");
        int yearBorn = Integer.parseInt(keyboard.nextLine());

        System.out.println("Month of birth (use numbers): ");
        int monthBorn = Integer.parseInt(keyboard.nextLine());

        System.out.println("Day of birth: ");
        int dayBorn = Integer.parseInt(keyboard.nextLine());

        System.out.println("Gender (M or F): ");
        char gender = keyboard.next().charAt(0);

        try {
            DriversLicense driversLicense = new DriversLicense();
            FirstNameUtility firstNameUtility = new FirstNameUtility();
            LastNameUtility lastNameUtility = new LastNameUtility();
            MonthDayGenderUtility monthDayGenderUtility = new MonthDayGenderUtility();
            driversLicense.setSoundexCode(lastNameUtility.encodeLastName(lastName));
            driversLicense.setFirstNameMiddleInitial(firstNameUtility.encodeFirstName(firstName, middleInitial));
            driversLicense.setBirthYear(yearBorn);
            driversLicense.setBirthMonthDayGender(monthDayGenderUtility.encodeMonthDayGender(yearBorn, monthBorn,
                    dayBorn, gender));

            driversLicense.setOverflow(0);

            FloridaFormatter floridaFormatter = new FloridaFormatter();
            WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();

            System.out.println(floridaFormatter.formatLicenseNumber(driversLicense));
            System.out.println(wisconsinFormatter.formatLicenseNumber(driversLicense));
        }
        catch (MissingNameException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch (UnknownGenderCodeException e){
            System.out.println(e.getMessage());
            System.exit(2);
        }
        catch (InvalidBirthdayException e){
            System.out.println(e.getMessage());
            System.exit(3);
        }


    }
}
