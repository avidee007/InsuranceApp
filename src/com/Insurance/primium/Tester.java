package com.Insurance.primium;


public class Tester {

	public static void main(String[] args) {
		PremiumCalculator cal=new PremiumCalculator();
		Input.getInput();
		double rate=cal.getPremimumRate(Input.age, Input.gender, Input.health, Input.goodhabit, Input.badhabit);
		System.out.println("Your Premimum as per above records submitted by you is Rs. "+Math.round(rate));
			}
}
