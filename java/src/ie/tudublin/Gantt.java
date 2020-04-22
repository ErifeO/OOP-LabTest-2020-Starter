package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	//arraylist task
	public ArrayList<Task> tasks = new ArrayList<Task>();

	public void settings()
	{
		size(800, 600);
	}

	public void loadTasks()
	{
		Table t = loadTable("tasks.csv", "header");
		for(TableRow rows:t.rows())
		{
			Task ta = new Task(rows);
			tasks.add(ta);
		}
	}

	//need to work on this 
	public void printTasks()
	{
		for(Task ta:tasks)
		{	
			println(ta);
		}
	}

	public void displayTasks()
	{
		line(150, 50, 150 , 550);
		line(170, 50, 170 , 550);
		line(190, 50, 190 , 550);
		line(210, 50, 210 , 550);
		line(230, 50, 230 , 550);
		line(250, 50, 250 , 550);
		line(270, 50, 270 , 550);
		line(290, 50, 290 , 550);
		line(310, 50, 310 , 550);
		line(330, 50, 330 , 550);
		line(350, 50, 350 , 550);
		line(370, 50, 370 , 550);
		line(390, 50, 390 , 550);
		line(410, 50, 410 , 550);
		line(430, 50, 430 , 550);
		line(450, 50, 450 , 550);
		line(470, 50, 470 , 550);
		line(490, 50, 490 , 550);
		line(510, 50, 510 , 550);
		line(530, 50, 530 , 550);
		line(550, 50, 550 , 550);
		line(570, 50, 570 , 550);
		line(590, 50, 590 , 550);
		line(610, 50, 610 , 550);
		line(630, 50, 630 , 550);
		line(650, 50, 650 , 550);
		line(670, 50, 670 , 550);
		line(690, 50, 690 , 550);
		line(710, 50, 710 , 550);
		line(730, 50, 730 , 550);
		stroke(255,255,255);

		text("Research", 50, 100);
		fill(255);
		textSize(10);
		//rect(50, 40, 50, 20);

		text("Design", 50, 150);
		fill(255);
		textSize(10);

		text("Phase 1", 50, 200);
		fill(255);
		textSize(10);

		text("Phase 2", 50, 250);
		fill(255);
		textSize(10);

		text("Phase 3", 50, 300);
		fill(255);
		textSize(10);

		text("Integration", 50, 350);
		fill(255);
		textSize(10);

		text("Testing", 50, 400);
		fill(255);
		textSize(10);

		text("Evaluation", 50, 450);
		fill(255);
		textSize(10);

		text("Release", 50, 500);
		fill(255);
		textSize(10);
		
	}
	

	public void mousePressed()
	{
		println("Mouse pressed");
		//strokeWeight(20);	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
		//strokeWeight(20);	
	}

	
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
		displayTasks();
		//line(50,50,50,50);
		//stroke(255,255,255);

		/*
		for(int i = 0 ; i < 30 ; i ++)
		{
			float y = map(i, 0, resistors.size(), 100, height - 100);
			resistors.get(i).render(width / 2, y);
		}
		*/
	}
}
