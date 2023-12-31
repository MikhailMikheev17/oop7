package org.example.JobAgency;

import Company.Vacancy;
import Workers.Observer;

import java.util.List;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    List<Observer> sendOffer(Vacancy vacancy);


}