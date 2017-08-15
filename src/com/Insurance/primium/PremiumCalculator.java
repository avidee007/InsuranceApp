package com.Insurance.primium;

public class PremiumCalculator {
	
	public double getPremimumRate(int age,String gender,int precondition,int goodhabit,int badhabit){
		double rate;	
		rate=getAgeRate(age);
		rate=getGenderRate(gender,rate);
		rate=getPreconditionRate(precondition,rate);
		rate=getHabitRate(goodhabit,badhabit,rate);
		return rate;
		
	}
	
	private double getAgeRate(int age){
		double rate=5000;
		if((age>18)){
			rate=rate*1.1;
			if((age>=25)){
				rate=rate*1.1;
				if((age>=30)){
					rate=rate*1.1;
					if((age>=35)){
						rate=rate*1.1;
						int x=40;
						while(age>=x){
							rate=rate*1.2;
							x+=5;
						}
					}
				}
			}
		}
		return rate;
	}
	
	private double getGenderRate(String gender,double rate){
		if(gender.equalsIgnoreCase("male")|| gender.equalsIgnoreCase("m") ){
			 return rate=rate*1.02;
		}
		else{
			return rate;
		}
	}
	
	private double getPreconditionRate(int conditions,double rate){
		if(conditions>0){
			return (rate+(rate*conditions/100));
		}
		return rate;
	}
	
	private double getHabitRate(int goodhabit,int badhabit,double rate){
	
		if(goodhabit==1 && badhabit==0){
			return rate=rate*0.97;
		}
		else if(goodhabit==badhabit){
			return rate;
			
		}
		else if( goodhabit==1 && badhabit==2 ){
			return rate=rate*1.03;
		}
		else if(goodhabit==1 && badhabit==3 ){
			return rate=rate*1.06;
		}
		else{
			return rate=rate*1.09;
		}
		
	}
}
