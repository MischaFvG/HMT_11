package com.catzen;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_11");
        System.out.println("Task_1_of_homework_number_11");
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        String personFullName;
        String personInitials;
        System.out.println("Enter person`s full name (Surname, Name, Fathername)");
        personFullName = s.nextLine();
        Person person = new Person(personFullName);
        String personN = returnFullPersonName(person);
        System.out.println("Full person`s name is " + personN);
        personInitials = returnPersonInitials(person);
        System.out.println("Person`s initials are " + personInitials);
        int personDay;
        int personMonth;
        int personYear;
        int todayYear;
        System.out.println("Enter today year");
        todayYear = w.nextInt();
        System.out.println("Today year is " + todayYear);
        System.out.println("Enter person`s day of birth");
        personDay = w.nextInt();
        person.setPersonDay(personDay);
        System.out.println("Enter person`s month of birth");
        personMonth = w.nextInt();
        person.setPersonMonth(personMonth);
        System.out.println("Enter person`s year of birth");
        personYear = w.nextInt();
        person.setPersonYear(personYear);
        System.out.println(person);
        int personFullAge = returnPersonFullAge(person, todayYear);
        System.out.println("Person`s full age is " + personFullAge);
        System.out.println("Task_2_of_homework_number_11");
        Group group = new Group();
        String courseName;
        int startDayOfCourse;
        int startMonthOfCourse;
        int startYearOfCourse;
        int sumQuantityOfLectures;
        int quantityOfLecturesPerWeek;
        System.out.println("Enter course name");
        courseName = s.nextLine();
        group.setCourseName(courseName);
        System.out.println("Enter start day of course");
        startDayOfCourse = w.nextInt();
        group.setStartDayOfCourse(startDayOfCourse);
        System.out.println("Enter start month of course");
        startMonthOfCourse = w.nextInt();
        group.setStartMonthOfCourse(startMonthOfCourse);
        System.out.println("Enter start year of course");
        startYearOfCourse = w.nextInt();
        group.setStartYearOfCourse(startYearOfCourse);
        System.out.println("Enter sum quantity of lectures");
        sumQuantityOfLectures = w.nextInt();
        group.setSumQuantityOfLectures(sumQuantityOfLectures);
        System.out.println("Enter quantity of lectures per week");
        quantityOfLecturesPerWeek = w.nextInt();
        group.setQuantityOfLecturesPerWeek(quantityOfLecturesPerWeek);
        returnCourseNameAndDate(group);
        returnEndDate(startDayOfCourse, startMonthOfCourse, startYearOfCourse, sumQuantityOfLectures, quantityOfLecturesPerWeek);
        List<Person> personGroupList = new ArrayList<>();
        enterGroupPerson(personGroupList);
        group.setPersonList(personGroupList);
        System.out.println(group);
        easterEggFromMischik();
    }

    public static String returnFullPersonName(Person person) {
        String str;
        str = person.getPersonSurname() + "_" + person.getPersonName() + "_" + person.getPersonFathername();
        return str;
    }

    public static String returnPersonInitials(Person person) {
        String str1 = person.getPersonSurname();
        String str2 = person.getPersonName();
        String str3 = person.getPersonFathername();
        String personInitials;
        personInitials = str1 + "_" + str2.charAt(0) + "_" + str3.charAt(0);
        return personInitials;
    }

    public static int returnPersonFullAge(Person person, int todayYear) {
        int personFullAge;
        personFullAge = todayYear - person.getPersonYear();
        return personFullAge;
    }

    public static int enterGroupPerson(List<Person> personList) {
        Scanner w = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Please enter what you would like to do");
        System.out.println("1 is adding person in the list");
        System.out.println("2 is adding person in some position in the list");
        System.out.println("3 is setting(changing) person in some position in the list");
        System.out.println("4 is deleting person by his/her index from the list");
        System.out.println("5 is deleting person by his/her index and by checking person`s name");
        System.out.println("6 is checking person by his/her index and by person`s name");
        System.out.println("7 is printing list on the desktop");
        System.out.println("8 is cleaning the list");
        System.out.println("9 is exit from the method of work with the list");
        System.out.println("So. What would you like to do? Enter, please");
        number = w.nextInt();
        switch (number) {
            case 1:
                personList.add(addPerson());
                System.out.println("You have just added person in list");
                break;
            case 2:
                int iPersonPosition;
                System.out.println("Enter person`s position in the list");
                iPersonPosition = w.nextInt();
                personList.add(iPersonPosition, addPerson());
                System.out.println("You have just added person in the " + iPersonPosition + " position of the list");
                break;
            case 3:
                int iPerson;
                System.out.println("Enter person`s position in the list");
                iPerson = w.nextInt();
                personList.set(iPerson, addPerson());
                System.out.println("You have just changed person int the " + iPerson + " position of the list");
                break;
            case 4:
                int iPerson2;
                System.out.println("Enter person`s position in the list");
                iPerson2 = w.nextInt();
                personList.remove(iPerson2);
                System.out.println("You have just deleted person from " + iPerson2 + " position of the list");
                break;
            case 5:
                deletePersonByName(personList);
                break;
            case 6:
                chekPerson(personList);
                break;
            case 7:
                System.out.println(personList);
                break;
            case 8:
                personList.clear();
                System.out.println("You have just cleaned list");
                break;
            case 9:
                return 0;
            default:
        }
        return enterGroupPerson(personList);
    }

    public static void chekPerson(List<Person> list) {
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        String personName;
        int i;
        System.out.println("Enter person`s name");
        personName = s.nextLine();
        System.out.println("Enter person`s position in list");
        i = w.nextInt();
        if ((list.get(i).getPersonName()).equals(personName)) {
            System.out.println("Person exists in the list");
            System.out.println(list);
        } else {
            System.out.println("Sorry. Person does not exist in the list. Please check your data");
            System.out.println(list);
        }
    }

    public static void deletePersonByName(List<Person> list) {
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        String personName;
        int i;
        System.out.println("Enter person`s name");
        personName = s.nextLine();
        System.out.println("Enter person`s position in the list");
        i = w.nextInt();
        if ((list.get(i).getPersonName()).equals(personName)) {
            list.remove(i);
            System.out.println("You have just deleted person from " +i +" position by " +personName +" name");
            System.out.println(list);
        } else {
            System.out.println("Sorry. Person does not exist in the list. You can not delete him/her from the list. Please check your data");
            System.out.println(list);
        }
    }

    public static Person addPerson() {
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        String personName;
        String personSurname;
        String personFathername;
        int personDayOfBirth;
        int personMonthOfBirth;
        int personYearOfBirth;
        System.out.println("Enter person`s surname");
        personSurname = s.nextLine();
        System.out.println("Enter person`s name");
        personName = s.nextLine();
        System.out.println("Enter person`s fathername");
        personFathername = s.nextLine();
        System.out.println("Enter person`s day of birth");
        personDayOfBirth = w.nextInt();
        System.out.println("Enter person`s month of birth");
        personMonthOfBirth = w.nextInt();
        System.out.println("Enter person`s year of birth");
        personYearOfBirth = w.nextInt();
        Person person = new Person(personSurname, personName, personFathername, personDayOfBirth, personMonthOfBirth, personYearOfBirth);
        return person;
    }

    public static void returnCourseNameAndDate(Group group) {
        String str;
        int startDay;
        int startMonth;
        int startYear;
        str = group.getCourseName();
        startDay = group.getStartDayOfCourse();
        startMonth = group.getStartMonthOfCourse();
        startYear = group.getStartYearOfCourse();
        System.out.println("Course name is " + str);
        System.out.println("Starting course date is " + startDay + "/" + startMonth + "/" + startYear);
    }

    public static void returnEndDate(int startDay, int startMonth, int startYear, int sumQ, int qLec) {
        int qWeeks;
        int qMonthes;
        qWeeks = sumQ / qLec;
        qMonthes = qWeeks / 4;
        startMonth = startMonth + qMonthes - 1;
        startDay = qWeeks;
        if (startMonth > 12) {
            startMonth = startMonth - 12;
            startYear++;
        }
        System.out.println("Date of end weer of course is " + startDay + "/" + startMonth + "/" + startYear);
    }

    private static int easterEggFromMischik() {
        Scanner s = new Scanner(System.in);
        String Y;
        System.out.println("Enter Y");
        Y = s.nextLine();
        if (Y.equals("Y")) {
            System.out.println("Congratulation my dear friend!!! You have found and activated easter_Egg_From_Mishik");
            try {
                FileInputStream file = new FileInputStream("ahhah.mp3");
                try {
                    Player play = new Player(file);
                    play.play();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return 0;
        }
        return easterEggFromMischik();
    }
}

