package com.basics;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int myAge = 23;
//        System.out.println(myAge);

        //primitive data types
        byte age=30;
        long views=4_326_853_927L;
        float price=10.99F;
        char letter='A';
        boolean isEligible= false;

        //reference type
        Date now = new Date();
        System.out.println(now);

        // primitive vs reference
        byte x=2;
        byte y=x;
        x=3;
        System.out.println(y);

        Point p1=new Point(1, 2);
        Point p2=p1;
        p1.x=3;
        System.out.println(p2);

        //strings
        String message = "   hello world    ";
        System.out.println(message);
        System.out.println(message.endsWith("d"));
        System.out.println(message.startsWith("d"));
        System.out.println(message.length());
        System.out.println(message.indexOf("w"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace(" ","_"));//returns new strings
        System.out.println(message); //strings are immutable
        System.out.println(message.trim());

        //escape sequence
        String msg = "hello \"tahir\"";
        System.out.println(msg);

        //c:\windows\...
        String msg2 = "c:\\windows\\..";
        System.out.println(msg2);

        //arrays
        int[] nums = new int[5]; //old way
        int [] nums1 = {1,3,43,56,7,6}; //new way

        nums[0] = 1;
        nums[1] = 2;
//        nums[10] = 1; //error
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println(nums1.length);
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        //multidimensional array
        int [][] nums2 = new int[2][3];
        nums2[0][0] =1;
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.deepToString(nums2));

        //constants
        final float PI = 3.14F;

        //operators
        int res = 10/3;
        double res1 = (double)10/(double)3;
        System.out.println(res);
        System.out.println(res1);

        //post pre increment
        int xx = 1;
        int yy = xx++;
        System.out.println(xx);
        System.out.println(yy);
        int zz =  ++xx;
        System.out.println(zz);
        System.out.println(xx);

        //casting
        //implicit
        short xxx = 2;
        int yyy = xxx + 2;

        double a=1.1;
        double b=a+2; //2.0
        System.out.println(yyy);
        System.out.println(b);

        //explicit
        double aa = 1.1;
        String ss= "1";
        int bb = (int)aa + 3;
        System.out.println(bb);
        int cc = Integer.parseInt(ss) + 2;
        System.out.println(cc);

        //math class
        int result = (int) (Math.random() * 100);
        System.out.println("random number: " + result);

        //number format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String ress =  currency.format(12234.534);
        System.out.println(ress);

        // clean code
        String resss  = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resss);

        // input
//        Scanner scan = new Scanner(System.in);
//        System.out.print("what is ur age?");
//        byte age1 = scan.nextByte(); //nextfloat nextdouble
//        System.out.println("you are : "+age1);
//
//        Scanner nameInput = new Scanner(System.in);
//        System.out.print("what is ur name?");
//        String name = nameInput.nextLine().trim(); //full name
//        System.out.println("you is : "+name);

        // control flow
        int temp = 30;
        if (temp > 27){
            System.out.println("hot day");
        } else if (temp >20 && temp<=27) {
            System.out.println("normal day");
        }else {
            System.out.println("cold day");
        }


        int income = 120_000;
        String className;
        boolean hasHighIncome = (income>100_000);

        // ternary operator
//        if (income > 100_000){
//            className = "first";
//        }else{
//            className = "economy";
//        }
        className  =income > 100_000 ? "first" : "economy";

        //switch statements
        String role = "dev";
        switch (role){
            case  "admin":
                System.out.println("you are admin");
                break;
            case "dev":
                System.out.println("you are awesome dev");
                break;
            default:
                System.out.println("you are shit");
        }

        //for loop
        for (int i=0;i<5;i++){
            System.out.println("iam awesome!");
        }

        //while loop
        int i=0;
        while (i<5){
            System.out.println("yes!");
            i++;
        }

//        Scanner scan = new Scanner(System.in);
//        String input = "";
//        while(true){
//            System.out.println("input:");
//            input = scan.next().toLowerCase();
//
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

        // for each
        String[] fruits = {"apple","mango","orange"};
        for (String fruit:fruits){
            System.out.println(fruit);
        }

        //mortgage calci
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;
        int principal=0;
        float monthlyInt=0;
        int numberOfPayments=0;

        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.println("principal: ");
            principal = sc.nextInt();
            if(principal>=1000 && principal <=1_000_000)
                break;
            System.out.println("enter valid value between 1000 and 1000000");
        }

        while(true){
            System.out.println("annual interest rate:");
            float annualInt = sc.nextFloat();
            if(annualInt>=1 && annualInt<=30){
                monthlyInt = annualInt/PERCENT/MONTHS_IN_YEAR;
                break;
            }
            System.out.println("enter value between 1 and 30");

        }

        while(true){
            System.out.println("period: ");
            byte years = sc.nextByte();
            if (years>=1 && years<=30){
                numberOfPayments = years*MONTHS_IN_YEAR;
                break;
            }
            System.out.println("enter between 1 an 30%");
        }

        double mortgage=principal*(monthlyInt*Math.pow(1+monthlyInt,numberOfPayments))/(Math.pow(1+monthlyInt,numberOfPayments)-1);
        String mortform = NumberFormat.getCurrencyInstance().format(mortgage).toString();
        System.out.println(mortform);
    }
}