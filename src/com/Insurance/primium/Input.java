package com.Insurance.primium;

import java.util.Scanner;

public class Input {
	static int  goodhabit;
	static int  age;
	static String  gender;
	static int  health;
	static int badhabit;
	
	public static void getInput(){
		String ans[]=new String[4];
		String ans2[]=new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		age=sc.nextInt();
		System.out.println("Enter the gender as Male/m, Female/f or Other/o : ");
		gender=sc.next();
		System.out.println("Are you suffering from HYPERTENSION ? Answer Yes/Y or No/N");
		String hper=sc.next();
		ans[0]=hper;
		System.out.println("Are you suffering from BLOOD PRESSURE ? Answer Yes/Y or No/N");
		String presuure=sc.next();
		ans[1]=presuure;
		System.out.println("Are you suffering from BLOOD SUGAR ? Answer Yes/Y or No/N");
		String sugar=sc.next();
		ans[2]=sugar;
		
		System.out.println("Are you suffering from OVERWEIGHT ? Answer Yes/Y or No/N");
		String over=sc.next();
		ans[3]=over;
		
		for(String s:ans){
			if(s.equalsIgnoreCase("Yes") || s.equalsIgnoreCase("y")	){
				health++;
				}
			else{
				continue;
			}
			}
		
		System.out.println("Do you Excersice Daily? Answer Yes/Y or No/N");
		String exercise=sc.next();
		
		if(exercise.equalsIgnoreCase("yes") || exercise.equalsIgnoreCase("y")){
			goodhabit=1; 
		}
		else{
			 goodhabit=0;
		}
		
		System.out.println("Do you Smoke ? Answer Yes/Y or No/N");
		String smoke=sc.next();
		ans2[0]=smoke;
		System.out.println("Do you drink Alcohal  ? Answer Yes/Y or No/N");
		String alh=sc.next();
		ans2[1]=alh;
		System.out.println("Do you take Drug ? Answer Yes/Y or No/N");
		String drug=sc.next();
		ans2[2]=drug;
		
		for(String s:ans2){
			if(s.equalsIgnoreCase("Yes") || s.equalsIgnoreCase("y")	){
				badhabit++;
				}
			else{
				continue;
			}
			}
		sc.close();
		
	}

}
