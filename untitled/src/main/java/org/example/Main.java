package org.example;

import Company.Company;
import JobAgency.JobAgency;
import Workers.Master;
import Workers.Student;

public class Main {

    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Yandex", 100000, jobAgency);
        Company yandex = new Company("Google", 120000, jobAgency);

        Master ivanov = new Master("Mikheev");
        Master petrov = new Master("Borisov");
        Student sidorov = new Student("Petrov");

        jobAgency.registerObserver(mikheev);
        jobAgency.registerObserver(borisov);
        jobAgency.registerObserver(petrov);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            System.out.println();
        }
    }
}