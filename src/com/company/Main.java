package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KolkoIKrzyzyk kolkoIKrzyzyk = new KolkoIKrzyzyk();

        kolkoIKrzyzyk.tableDrawing();
        int poleNumber;

        kolkoIKrzyzyk.setxO();

        while(!kolkoIKrzyzyk.isFull()){
            System.out.println("Podaj nr pola(zaczyna X):");
            poleNumber = scanner.nextInt();
            kolkoIKrzyzyk.setTable(poleNumber);
            kolkoIKrzyzyk.xODrawing();
            if (kolkoIKrzyzyk.checkLine()){
                break;
            }
        }


    }
}
