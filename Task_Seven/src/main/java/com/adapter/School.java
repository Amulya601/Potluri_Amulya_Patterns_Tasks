package com.adapter;
import com.animal.AdapterPen;
public class School {
	public static void main(String args[])
	{
		Pen p=new PenAdapter();
		
		
		Assignment a=new Assignment();
		a.setP(p);
		a.writeassignment("I am about to finish my Assignment");
	}

}
