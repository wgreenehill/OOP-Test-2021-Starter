package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	// String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList <Note> NotesList = new ArrayList<Note> ();
	String noteType;
	int noteDur = 1;

	public void loadScore()
	{
		for(int i = 0; i < score.length(); i ++)
		{
			if((i + 1) != score.length())
			{
				if(score.charAt(i + 1) == '2')
				{
					noteDur = 2;
				}
				else
				{
					noteDur = 1;
				}
			}

			Note note = new Note(score.charAt(i), noteDur);
			NotesList.add(note);

			if(score.charAt(i) == '2')
			{
				NotesList.remove(note);
			}
		}
	}

	public void printScore()
	{
		for(Note note : NotesList)
		{
			if(note.getDuration() == 2)
			{
				noteType = "Crotchet";
			}
			else
			{
				noteType = "Quaver";
			}

			System.out.println(note.toString() + " " + noteType);
		}
	}

	public void drawStaves()
	{
		strokeWeight(3);
		line(50, 200, 1350, 200);
		line(50, 225, 1350, 225);
		line(50, 250, 1350, 250);
		line(50, 275, 1350, 275);
		line(50, 300, 1350, 300);
	}
	
	public void settings()
	{
		size(1500, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
		printScore();
	}

	public void draw()
	{
		background(255);
		stroke(0);
		textSize(25);
		drawStaves();
		drawNotes();
	}

	public void drawNotes()
	{
		int ellDiameter = 25;
		int xLocation = 75;
		for(int i = 0; i < NotesList.size(); i ++)
		{
			fill(0);
			if(mouseX > xLocation - 25 && mouseX < xLocation + 25)
			{
				fill(255, 0, 0);
				stroke(255, 0, 0);
			}
			else
			{
				fill(0);
				stroke(0);
			}

			switch(NotesList.get(i).toString())
			{
				case "D 1":
					ellipse(xLocation, 313, ellDiameter, ellDiameter);
					line(xLocation + 10, 313, xLocation + 10, 253);
					text("D", xLocation, 125);				
					break;
				case "E 1":
					ellipse(xLocation, 300, ellDiameter, ellDiameter);
					line(xLocation + 10, 300, xLocation + 10, 240);
					text("E", xLocation, 125);			
					break;
				case "F 1":
					ellipse(xLocation, 288, ellDiameter, ellDiameter);
					line(xLocation + 10, 288, xLocation + 10, 228);
					text("F", xLocation, 125);	
					break;
				case "G 1":
					ellipse(xLocation, 275, ellDiameter, ellDiameter);
					line(xLocation + 10, 275, xLocation + 10, 215);
					text("G", xLocation, 125);	
					break;
				case "A 1":
					ellipse(xLocation, 263, ellDiameter, ellDiameter);
					line(xLocation + 10, 263, xLocation + 10, 203);
					text("A", xLocation, 125);	
					break;
				case "B 1":
					ellipse(xLocation, 250, ellDiameter, ellDiameter);
					line(xLocation + 10, 250, xLocation + 10, 190);
					text("B", xLocation, 125);	
					break;
				case "c 1":
					ellipse(xLocation, 238, ellDiameter, ellDiameter);
					line(xLocation + 10, 238, xLocation + 10, 178);
					text("c", xLocation, 125);	
					break;
				case "d 1":
					ellipse(xLocation, 225, ellDiameter, ellDiameter);
					line(xLocation + 10, 225, xLocation + 10, 165);
					text("d", xLocation, 125);	
					break;
				case "D 2":
					ellipse(xLocation, 313, ellDiameter, ellDiameter);
					line(xLocation + 10, 313, xLocation + 10, 253);	
					line(xLocation + 10, 253, xLocation + 25, 268);
					text("D", xLocation, 125);			
					break;
				case "E 2":
					ellipse(xLocation, 300, ellDiameter, ellDiameter);
					line(xLocation + 10, 300, xLocation + 10, 240);
					line(xLocation + 10, 240, xLocation + 25, 255);		
					text("E", xLocation, 125);	
					break;
				case "F 2":
					ellipse(xLocation, 288, ellDiameter, ellDiameter);
					line(xLocation + 10, 288, xLocation + 10, 228);
					line(xLocation + 10, 228, xLocation + 25, 243);
					text("F", xLocation, 125);	
					break;
				case "G 2":
					ellipse(xLocation, 275, ellDiameter, ellDiameter);
					line(xLocation + 10, 275, xLocation + 10, 215);
					line(xLocation + 10, 215, xLocation + 25, 230);
					text("G", xLocation, 125);	
					break;
				case "A 2":
					ellipse(xLocation, 263, ellDiameter, ellDiameter);
					line(xLocation + 10, 263, xLocation + 10, 203);
					line(xLocation + 10, 203, xLocation + 25, 218);
					text("A", xLocation, 125);	
					break;
				case "B 2":
					ellipse(xLocation, 250, ellDiameter, ellDiameter);
					line(xLocation + 10, 250, xLocation + 10, 190);
					line(xLocation + 10, 190, xLocation + 25, 205);
					text("B", xLocation, 125);	
					break;
				case "c 2":
					ellipse(xLocation, 238, ellDiameter, ellDiameter);
					line(xLocation + 10, 238, xLocation + 10, 178);
					line(xLocation + 10, 178, xLocation + 25, 193);
					text("c", xLocation, 125);	
					break;
				case "d 2":
					ellipse(xLocation, 225, ellDiameter, ellDiameter);
					line(xLocation + 10, 225, xLocation + 10, 165);
					line(xLocation + 10, 165, xLocation + 25, 180);
					text("d", xLocation, 125);	
					break;
				
			}
			xLocation += 75;
		}
	}
}
