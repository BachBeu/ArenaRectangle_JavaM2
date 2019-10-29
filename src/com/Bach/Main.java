package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int width;
        int height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: ");
        height = sc.nextInt();
        System.out.println("Nhập vào chiều rộng");
        width = sc.nextInt();
        int arena = height*width;
        System.out.println("Diện tích hình chữ nhật là: " + arena);
    }
}
