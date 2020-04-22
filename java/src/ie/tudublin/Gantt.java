package ie.tudublin;

import processing.core.PApplet;

public class Gantt extends PApplet
{	
	//arraylist task
	public ArrayList<Task> colors = new ArrayList<Task>();

	public void settings()
	{
		size(800, 600);
	}

	public void loadTasks()
	{
		
	}

	public void printTasks()
	{
		Table t = loadTable("tasks.csv", "header");
		for(TableRow row:t.rows())
		{
			Task ta = new Task(row);
			tasks.add(ta);
		}
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
	}
}
