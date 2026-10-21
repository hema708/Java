package com.java.basics1;

public class ShoppingCart {
	float calculateTotal(float p1,float p2,float p3) {
		float total=p1+p2+p3;
		return total;
	}
	float calculateDiscount(float total, String membership) {
		float discount;
        if(membership.equals("Gold")){
            discount=total*20/100;
        } else if(membership.equals("Silver")){
            discount=total*10/100;
        } else {
            discount=total*5/100;
        }
        return discount;
	}
	float calculateFinalAmount(float total, float discount) {
        return total - discount;
	}
	public static void main(String[] args) {
		ShoppingCart obj=new ShoppingCart();
        float total=obj.calculateTotal(2000.0f,1500.0f,500.0f);
        float discount=obj.calculateDiscount(total,"Gold");
        float finalAmount=obj.calculateFinalAmount(total,discount);

        System.out.println("Total Amount:"+total);
        System.out.println("Discount:"+discount);
        System.out.println("Final Amount:"+finalAmount);

	}
}
