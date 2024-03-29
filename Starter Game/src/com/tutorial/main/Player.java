package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject
{
	public Player(int x, int y, ID id)
	{
		super(x, y, id);
		
		velX = 1;
		velY = 0;
	}
	
	public void tick()
	{
		x += velX;
		y += velY;
	}
	
	public void render(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.drawRect(x, y, 100, 100);
	}
}
