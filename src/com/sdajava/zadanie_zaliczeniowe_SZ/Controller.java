package com.sdajava.zadanie_zaliczeniowe_SZ;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by RENT on 2017-03-18.
 */
public class Controller {


    public UserInput userInput = new UserInput();
    public List<Worker> workers = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Worker w1 = new Worker();

    public void addWorker(){
    Worker w = userInput.userInput();
    workers.add(w);
    }



    public void  showAll() {

        System.out.println(workers);
        int i = in.nextInt();
        Worker w1 = workers.get(i);


        System.out.println("Dane Pracownike : ");
        System.out.println('\n');
        System.out.printf("Imie : " + w1.getName());
        System.out.println("Nazwisko : " + w1.getSurname());
        System.out.println("Plec : " + w1.getSex());
        System.out.println("Numer Dywizji : " + w1.getDivisionNumber());
        System.out.println("Wynagrodzenie : " + w1.getSalary());
        System.out.println("Wiek : " + w1.getAge());
        System.out.println("Dzieci : " +w1.getAge());
        System.out.println("Stan Cywilny : " + w1.isMartialStatus());


    }
}
