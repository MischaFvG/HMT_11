package com.catzen;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String courseName;
    private int startDayOfCourse;
    private int startMonthOfCourse;
    private int startYearOfCourse;
    private int sumQuantityOfLectures;
    private int quantityOfLecturesPerWeek;
    private List<Person> personList=new ArrayList<>();

    public Group() {

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStartDayOfCourse(int startDayOfCourse) {
        this.startDayOfCourse = startDayOfCourse;
    }

    public void setStartMonthOfCourse(int startMonthOfCourse) {
        this.startMonthOfCourse = startMonthOfCourse;
    }

    public void setStartYearOfCourse(int startYearOfCourse) {
        this.startYearOfCourse = startYearOfCourse;
    }

    public void setSumQuantityOfLectures(int sumQuantityOfLectures) {
        this.sumQuantityOfLectures = sumQuantityOfLectures;
    }

    public void setQuantityOfLecturesPerWeek(int quantityOfLecturesPerWeek) {
        this.quantityOfLecturesPerWeek = quantityOfLecturesPerWeek;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getStartDayOfCourse() {
        return startDayOfCourse;
    }

    public int getStartMonthOfCourse() {
        return startMonthOfCourse;
    }

    public int getStartYearOfCourse() {
        return startYearOfCourse;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }



    @Override
    public String toString() {
        return "Group{" +
                "courseName='" + courseName + '\'' +
                ", startDayOfCourse=" + startDayOfCourse +
                ", startMonthOfCourse=" + startMonthOfCourse +
                ", startYearOfCourse=" + startYearOfCourse +
                ", sumQuantityOfLectures=" + sumQuantityOfLectures +
                ", quantityOfLecturesPerWeek=" + quantityOfLecturesPerWeek +
                ", personList=" + personList +
                '}';
    }

}
