package com.xworkz.cloneapp;

public class PenHolder {
public static void main(String[] args) throws CloneNotSupportedException {
	Pen pen =new Pen();
	pen.setMfgDate("2021");
	pen.setName("parker");
	pen.setRate(15000);
	pen.setRefillable(true);
	pen.setType("blackballpen");
	Object object= pen.clone();
	Pen pen2 = (Pen)object;

	System.out.println(pen2);
}
}
