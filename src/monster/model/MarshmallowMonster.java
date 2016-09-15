package monster.model;

public class MarshmallowMonster
{
	
	private String name;
	private double antennaCount; 
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount; 
	private int noseCount;
	
	public MarshmallowMonster()
	{
			this.name = "no name here";
			this.antennaCount = -23423.131235;
			this.eyeCount = -2345678;
			this.hasBellyButton = false; 
			this.armCount = -32436;
			this.noseCount = -7765;
	}
	
	public MarshmallowMonster(String name,
								double antennaCount, 
								int eyeCount, 
								boolean hasBellyButton, 
								int armCount, 
								int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
		
	}
	public String toString()
	{
		String description = "Name is"+ this.name;
		
		return description; 
	}
	
	public int getEyeCount()
	{
		return eyeCount;
		
	}
	public double getantennaCount()
	{
		return antennaCount;
		
	}
	public boolean gethasBellyButton()
	{
		return hasBellyButton;
		
	}
	public int getarmCount()
	{
		return armCount;
		
	} 
	public int getnoseCount()
	{
		return noseCount;
		
	}
	
}
