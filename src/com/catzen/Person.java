package com.catzen;

public class Person {
    private String personSurname;
    private String personName;
    private String personFathername;
    private int personDayOfBirth;
    private int personMonthOfBirth;
    private int personYearOfBirth;

    public Person() {
    }

    public Person(String personSurname, String personName, String personFathername, int personDay, int personMonth, int personYear) {
        this.personSurname = personSurname;
        this.personName = personName;
        this.personFathername = personFathername;
        this.personDayOfBirth = personDay;
        this.personMonthOfBirth = personMonth;
        this.personYearOfBirth = personYear;
    }

    public Person(String personSurname, String personName, String personFathername) {
        this.personSurname = personSurname;
        this.personName = personName;
        this.personFathername = personFathername;
    }

    public Person(String string) {
        String[] personString = string.split(" ");
        if (personString.length > 3) {
            System.out.println("ERROR!!! Please enter next time three parameters of person (Surname, Name, Fathername)");
        } else {
            this.personSurname = personString[0];
            this.personName = personString[1];
            this.personFathername = personString[2];
        }
    }

    public void setPersonDay(int personDay) {
        this.personDayOfBirth = personDay;
    }

    public void setPersonMonth(int personMonth) {
        this.personMonthOfBirth = personMonth;
    }

    public void setPersonYear(int personYear) {
        this.personYearOfBirth = personYear;
    }

    public int getPersonDay() {
        return personDayOfBirth;
    }

    public int getPersonMonth() {
        return personMonthOfBirth;
    }

    public int getPersonYear() {
        return personYearOfBirth;
    }

    public String getPersonSurname() {
        return personSurname;
    }


    public String getPersonName() {
        return personName;
    }

    public String getPersonFathername() {
        return personFathername;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personSurname='" + personSurname + '\'' +
                ", personName='" + personName + '\'' +
                ", personFathername='" + personFathername + '\'' +
                ", personDay=" + personDayOfBirth +
                ", personMonth=" + personMonthOfBirth +
                ", personYear=" + personYearOfBirth +
                '}';
    }
}
