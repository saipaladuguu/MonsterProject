package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	
	{
		firstMonster = new MarshmallowMonster(" Mike ", 342.324,123, false, 2234, 213);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("Here is my Monster: "+ firstMonster);
		System.out.println("My monster has this many eyes:"+ firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
			
		//System.out.println("Here is my Monster: "+ firstMonster);
		//System.out.println("Monter does not have any bellybottons"+ firstMonster.getarmCount));
		//if(firstMonster.getarmCount() > 3)
		
		{
	//		System.out.println("Thats a lot of eyes!!!!");
			
		}
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Fine, dont Change my name!!!");			
		}
		System.out.println(firstMonster);
	}
}