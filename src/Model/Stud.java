package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stud 
{
	@Id
	private int rno;
	private String name;
	
	public void setR(int rno)
	{
		this.rno=rno;
	}
	public int getR()
	{
		return rno;
	}
	public void setN(String name)
	{
		this.name=name;
	}
	public String getN()
	{
		return name;
	}
}
