package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //数据准备好了
            int max = arr[0];//用来记录和最大的值
            for (int i = 0; i < n; i++) {
                int sum = 0;//记录第i到j的元素和
                for (int j = i; j < n; j++) {
                    sum+=arr[j];
                    if (sum > max) {
                        max = sum;
                    }

                }
            }
                System.out.println(max);
            }

        }
    }
