package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	System.out.println("Enter the boundary to find the sum");
	int boundary = in.nextInt();
	int i = 1, sum = 0;
	while(i<=boundary)
    {
        sum = sum + i;
        i++;
    }
	System.out.println("Sum of 1 to "+boundary+" is "+sum);
    }
}
