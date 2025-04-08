package march.mock.pkg;


class AgeNotValidException extends Exception
{
	public AgeNotValidException(String message)
	{
		super(message);
	}
}

class Voter
{
	private String name;
	private int age;
	
	public Voter(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void checkELigibility() throws AgeNotValidException
	{
		if(age < 18)
		{
			throw new AgeNotValidException("Age not valid for voting : "+age);
		}
		System.out.println(name+" is eligible to vote");
	}
}

class VotingThread extends Thread
{
	private Voter voter;
	
	public VotingThread(Voter voter)
	{
		this.voter = voter;
	}
	
	public void run()
	{
		try
		{
			voter.checkELigibility();
		}
		catch(AgeNotValidException e)
		{
			System.out.println("Exception catched : "+e.getMessage());
		}
	}
}

public class VotingSystem
{
	public static void main(String[] args)
	{
		Voter v1 = new Voter("Ajay", 12);
		VotingThread t1 = new VotingThread(v1);
		t1.start();
		
		Voter v2 = new Voter("Rahul", 25);
		VotingThread t2 = new VotingThread(v2);
		t2.start();
	}
}
