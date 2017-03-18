package com.sdajava.zadanie_zaliczeniowe_SZ;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-18.
 */
public class UserInput {



    public Worker userInput(){

        Worker w = new Worker();
        Scanner in = new Scanner(System.in);


        System.out.println("Podaj Imie");
        w.name = in.nextLine();
        System.out.println("Podaj Naziwsko");
        w.surname = in.nextLine();
        System.out.println("Podaj Plec, K lub M");
        w.sex = in.next().charAt(0);
        System.out.println("Podaj Numer Dywizji");
        w.divisionNumber = in.nextInt();
        System.out.println("Podaj Pensje");
        w.salary = in.nextFloat();
        System.out.println("Podaj Wiek");
        w.age = in.nextInt();
        System.out.println("Podaj Liczbe Dzieci");
        w.children = in.nextInt();
        System.out.println("Podaj Czy Pracownik Jest w Zwiazku Malzenskim");
        w.martialStatus = in.hasNextBoolean();

        return w;

    }
}
