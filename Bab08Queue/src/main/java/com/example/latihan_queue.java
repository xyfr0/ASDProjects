package com.example;

import java.util.Scanner;

public class latihan_queue {
    Scanner masuk = new Scanner(System.in);
    int choice, i;
    char item;
    char[] arr_stack = new char[100];
    int count = 0;
    int keluar = 0;
    int front, rear = 0;

    public void enqueue(char item) {
        if (rear == arr_stack.length) {
            System.out.print("\n# Queue penuh");
        } else {
            if(arr_stack != null){
                char[] newArr = arr_stack;
                for(int i = rear; i > front; i--){
                    arr_stack[i] = newArr[i-1];
                }
            }            
            arr_stack[front] = item;
            rear++;
        }
    }

    public void dequeue() {
        if (rear == 0) {
            System.out.print("\n## Queue kosong");
        } else {
            System.out.print("\n##Dequeue Value :" + arr_stack[0]);
            for (i = 1; i <= rear; i++) {
                char temp = arr_stack[i];
                arr_stack[i - 1] = temp;
            }
            rear--;
            count--;
        }
    }

    public void printAll() {
        System.out.print("\n## Queue Size : " + rear);
        for (i = 0; i < rear; i++)
            System.out.print("\n## No Urut/index : " + i + ", Value :" + arr_stack[i]);
    }

    public void menu() {
        while (keluar == 0) {
            System.out.print("\nMasukkan operasi yang akan dilakukan (1:enqueue, 2:dequeue, 3:print) : ");
            choice = masuk.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("\nMasukkan huruf yang akan di-enqueue : ");
                    String items = masuk.next();
                    char[] itemsArray = items.toCharArray();
                    for (i = 0; i < itemsArray.length; i++) {
                        item = itemsArray[i];
                        enqueue(item);
                    }
                }
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    printAll();
                    break;
                default:
                    System.out.print("\n1:enqueue, 2:dequeue, 3:print\n");
                    keluar = 1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        latihan_queue lQueue = new latihan_queue();

        lQueue.menu();

    }

}
