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
		Table t = loadTable("tasks.csv", "header");
		for(TableRow tr:t.rows())
		{
			Task ta = new Task(tr);
			tasks.add(ta);
		}
	}

	//need to work on this 
	public void printTasks()
	{
		for(Task ta:tasks)
		{
			System.out.println(Task + ",");
			System.out.println(Start + ",");		
			System.out.println(End);	
			//println(ta);
		}
	}

	public displayTasks()
	{
		for(Task ta:tasks)
		{
			println(ta);
			if (ta.num == num)
			{
				//return map(i, 0, resistors.size(), 100, height - 100);
				colorMode(PApplet.HSB);
				fill(map(0, 0,100,0, 255);
				rect();
			}	
			
		}


		return null;
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
		size(500, 800);
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);

		for(int i = 0 ; i < 30 ; i ++)
		{
			float y = map(i, 0, resistors.size(), 100, height - 100);
			resistors.get(i).render(width / 2, y);
		}
	}
}
