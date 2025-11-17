package org.example;

import java.util.Scanner;

public class stack_array {
    Scanner masuk = new Scanner(System.in);

    int choice, i;
    char item;
    char[] arr_stack = new char[100];
    int count = 0;
    int keluar = 0;

    public void push(char item) {
        if (count == arr_stack.length) {
            System.out.print("\n# Stack Penuh");
        } else {
            arr_stack[count] = item;
            System.out.println("\n# PUSH No urut/index: " + count + ", Push: " + item);
            count++;
        }
    }

    public void pop() {
        if (count == 0)
            System.out.print("\n## Stack Kosong");
        else {
            --count;
            System.out.print("\n##POP No urut/index: " + count + ", Value: " + arr_stack[count]);
        }
    }

    public void printAll() {
        System.out.print("\n## Stack size: " + count);
        for (i = (count - 1); i >= 0; i--)
            System.out.print("\n## No urut/index: " + i + ", Value: " + arr_stack[i]);
    }

    public void menu() {
        while (keluar == 0) {
            System.out.print("\nMasukkan operasi yang akan dilakukan (1:push, 2:pop, 3:print):");
            choice = masuk.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nMasukkan huruf yang akan dipush:");
                    String items = masuk.next();
                    char[] itemsArray = items.toCharArray();
                    for (i = 0; i < itemsArray.length; i++) {
                        item = itemsArray[i];
                        push(item);
                    }
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    printAll();
                    break;
                default:
                    System.out.print("\n1:push, 2:pop, 3:print\n");
                    keluar = 1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        stack_array star = new stack_array();
        star.menu();

    }
}