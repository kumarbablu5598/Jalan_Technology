/*Please implement a software for a car service station using Object Oriented Programming. If you are not familiar or
comfortable with object-oriented programming, we suggest you give this article a quick read to ensure you understand it before you attempt it.
It should have the following features:
The car service station caters to different types of cars – Hatchback, Sedan, SUV.
It provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.
Each service has a service code associated with it and different prices for different types of cars.
Service Code Service Hatchback Sedan SUV
BS01 Basic Servicing ₹ 2000 ₹ 4000 ₹ 5000
EF01 Engine Fixing ₹ 5000 ₹ 8000 ₹ 10000
CF01 Clutch Fixing ₹ 2000 ₹ 4000 ₹ 6000
BF01 Brake Fixing ₹ 1000 ₹ 1500 ₹ 2500
GF01 Gear Fixing ₹ 3000 ₹ 6000 ₹ 8000

The software should generate a detailed bill with the total amount for each service request based on the Type of
Car specified and the requested Service Codes.
Example:
Type of Car – Hatchback
Service Codes – BS01, EF01
Charges for Basic Servicing – ₹ 2000
Charges for Engine Fixing – ₹ 5000
Total Bill – ₹ 7000
In addition, if the total service bill is more than ₹ 10000, a complimentary cleaning should be provided and specified
in the bill. */



import java.io.*;
import java.util.*;
public class Solution {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Carservice arr[] = new Carservice[5];
		arr[0]= new Carservice("BS01","Basic Servicing",2000,4000,5000);
		arr[1]= new Carservice("EF01","Engine Fixing",5000,8000,10000);
		arr[2]= new Carservice("CF01","Clutch Fixing",2000,4000,6000);
		arr[3]= new Carservice("BF01","Brake Fixing",1000,1500,2500);
		arr[4]= new Carservice("GF01","Gear Fixing",3000,6000,8000);
		
		String typeOfCar= sc.next();
		String servicecode1=sc.next();
		String servicecode2=sc.next();
		int sum=0;
		for(Carservice cr: arr)
		{
		    if(cr.getCode().equals(servicecode1)){
		        
		        if(typeOfCar.equals("Hatchback")) sum+=cr.getHathback();
		        else if(typeOfCar.equals("Sedan")) sum+=cr.getSedan();
		        else if(typeOfCar.equals("SUV"))  sum+=cr.getSuv();
		    }
		    else if(cr.getCode().equals(servicecode2)){
		        if(typeOfCar.equals("Hatchback")) sum+=cr.getHathback();
		        else if(typeOfCar.equals("Sedan")) sum+=cr.getSedan();
		        else if(typeOfCar.equals("SUV"))  sum+=cr.getSuv();
		    }
		   
		}
		if(sum>10000)
		{ 
		   System.out.println("A complimentary cleaning should be provided and specified in the bill");
		   System.out.println(sum);
		}
		 else System.out.println(sum);	
		
	}
}
 class Carservice
{
    
    String code, service;
    int hatchback,sedan,suv;
    Carservice(String code,String service,int hatchback,int sedan,int suv){
        this.code=code;
        this.service=service;
        this.hatchback=hatchback;
        this.sedan=sedan;
        this.suv=suv;
    }
    public String getCode(){
        return code;
    }
    
    public String getServce(){
        return service;
    }
    
    public int getHathback() {
        return hatchback;
    }
    
    public int getSedan(){
        return sedan;
    }
    
    public int getSuv() {
        return suv;
    }

}
