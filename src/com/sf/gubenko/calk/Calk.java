package com.sf.gubenko.calk;

import java.util.Scanner;

public class Calk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый операнд: ");
        int op1 = scanner.nextInt();
        System.out.print("Введите операцию из множества{+, -, *, /}: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второй операнд: ");
        int op2 = scanner.nextInt();

        switch (operation) {
            case '+' :
                System.out.printf("%d %c %d = %d",op1,operation,op2,sum(op1,op2));
                break;
            case '-' :
                System.out.printf("%d %c %d = %d",op1,operation,op2,sub(op1,op2));
                break;
            case '*' :
                System.out.printf("%d %c %d = %d",op1,operation,op2,mul(op1,op2));
                break;
            case '/' :
                System.out.printf("%d %c %d = %d",op1,operation,op2,div(op1,op2));
                break;
            default:
                System.out.println("Операция " + operation + " не предусмотрена программой");
        }

    }

    private static int sum(int op1, int op2) {
        return op1 + op2;
    }

    private static int sub(int op1, int op2) {
        return op1 - op2;
    }

    private static int mul(int op1, int op2) {
        return op1 * op2;
    }

    private static int div(int op1, int op2) {
        return op1 / op2;
    }

}
