package com.coforge.jenkinsJava;

public class PlayerMain {

	public static void main(String args[])
	{
		Player sachin= new Player(10, "Sachin tendulkar", "maharashtra");
		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : "+sachin.getState());
	}
}
