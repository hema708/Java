
package com.java.basics1;

public class ElectricityBill {
	float calculateBill(int units) {
        float bill;
        if(units<=100){
            bill=units*2;
        } else if(units<=200){
            bill=(100*2)+(units-100)*3;
        } else {
            bill=(100*2)+(100*3)+(units-200)*5;
        }
        return bill;
	}
	 float addFixedCharge(float bill) {
	        return bill + 50;
	    }
	    void displayBill(float bill, float finalBill) {
	        System.out.println("Energy Charge:"+bill);
	        System.out.println("Final Bill:"+finalBill);
	    }
	public static void main(String[] args) {
		ElectricityBill obj=new ElectricityBill();
        float bill=obj.calculateBill(250);
        float finalBill=obj.addFixedCharge(bill);
        obj.displayBill(bill,finalBill);
	}
}
