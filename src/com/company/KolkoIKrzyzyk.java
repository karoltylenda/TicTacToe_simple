package com.company;

public class KolkoIKrzyzyk {

    Main main = new Main();
    private char lastChar = 'O';
    private char[][] xO = new char[3][3];
    private boolean p1 = false;
    private boolean p2 = false;
    private boolean p3 = false;
    private boolean p4 = false;
    private boolean p5 = false;
    private boolean p6 = false;
    private boolean p7 = false;
    private boolean p8 = false;
    private boolean p9 = false;

    public void setxO() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xO[i][j] = ' ';
            }
        }
    }

    public void setLastChar() {
        if (this.lastChar == 'X'){
            this.lastChar = 'O';
        }
        else {
            this.lastChar = 'X';
        }
    }

    public void setTable(int caseNumber) {
        switch (caseNumber) {
            case 1:
                if (xO[0][0] == ' '){
                    setLastChar();
                    xO[0][0] = lastChar;
                    p1 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 2:
                if (xO[0][1] == ' '){
                    setLastChar();
                    xO[0][1] = lastChar;
                    p2 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 3:
                if (xO[0][2] == ' '){
                    setLastChar();
                    xO[0][2] = lastChar;
                    p3 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 4:
                if (xO[1][0] == ' '){
                    setLastChar();
                    xO[1][0] = lastChar;
                    p4 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 5:
                if (xO[1][1] == ' '){
                    setLastChar();
                    xO[1][1] = lastChar;
                    p5 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 6:
                if (xO[1][2] == ' '){
                    setLastChar();
                    xO[1][2] = lastChar;
                    p6 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 7:
                if (xO[2][0] == ' '){
                    setLastChar();
                    xO[2][0] = lastChar;
                    p7 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 8:
                if (xO[2][1] == ' '){
                    setLastChar();
                    xO[2][1] = lastChar;
                    p8 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            case 9:
                if (xO[2][2] == ' '){
                    setLastChar();
                    xO[2][2] = lastChar;
                    p9 = true;
                }
                else {
                    System.out.println("Pole zajęte.");
                }
                break;
            default:
                System.out.println("Nieprawidłowe pole");
                break;
        }
    }

    public void tableDrawing() {
        int[][] ticTacToe = new int[3][3];
        int caseNumber = 1;
        System.out.println("  ---   ---   --- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = caseNumber;
                caseNumber = caseNumber + 1;
                System.out.print(" | " + ticTacToe[i][j] + " |");
            }
            System.out.println();
            System.out.println("  ---   ---   --- ");
        }
    }

    public void xODrawing() {
        System.out.println("  ---   ---   --- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + xO[i][j] + " |");
            }
            System.out.println();
            System.out.println("  ---   ---   --- ");
        }
    }

    public boolean isFull(){
        if (p1 && p2 && p3 && p4 && p5 && p6 && p7 && p8 && p9){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkLine(){
        if (xO[0][0] != ' ' && xO[0][0] == xO[0][1] && xO[0][1] == xO[0][2]){
            System.out.println("Wygrał gracz: " + xO[0][0]);
            return true;
        }
        else if (xO[1][0] != ' ' && xO[1][0] == xO[1][1] && xO[1][1] == xO[1][2]){
            System.out.println("Wygrał gracz: " + xO[1][0]);
            return true;
        }
        else if (xO[2][0] != ' ' && xO[2][0] == xO[2][1] && xO[2][1] == xO[2][2]){
            System.out.println("Wygrał gracz: " + xO[2][0]);
            return true;
        }
        else if (xO[0][0] != ' ' && xO[0][0] == xO[1][0] && xO[1][0] == xO[2][0]){
            System.out.println("Wygrał gracz: " + xO[0][0]);
            return true;
        }
        else if (xO[0][1] != ' ' && xO[0][1] == xO[1][1] && xO[1][1] == xO[2][1]){
            System.out.println("Wygrał gracz: " + xO[0][1]);
            return true;
        }
        else if (xO[0][2] != ' ' && xO[0][2] == xO[1][2] && xO[1][2] == xO[2][2]){
            System.out.println("Wygrał gracz: " + xO[0][2]);
            return true;
        }
        else if (xO[0][0] != ' ' && xO[0][0] == xO[1][1] && xO[1][1] == xO[2][2]){
            System.out.println("Wygrał gracz: " + xO[0][0]);
            return true;
        }
        else if (xO[0][2] != ' ' && xO[0][2] == xO[1][1] && xO[1][1] == xO[2][0]){
            System.out.println("Wygrał gracz: " + xO[0][2]);
            return true;
        }
        else{
            return false;
        }
    }

}
