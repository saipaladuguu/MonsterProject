package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	
	{
		firstMonster = new MarshmallowMonster(" Mike ", 342.324,123, false, 2234, 213);
	}
	
	public void start()
	{
		System.out.println("Here is my Moonster: "+ firstMonster);
		System.out.println("My moster has this many eyes:"+ firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
		{
			System.out.println("Thats a lot of eyes!!!!");
			
		}
		
	}
								

}