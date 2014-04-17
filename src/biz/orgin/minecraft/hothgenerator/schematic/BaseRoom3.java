package biz.orgin.minecraft.hothgenerator.schematic;

import biz.orgin.minecraft.hothgenerator.HothUtils;

public class BaseRoom3 implements Schematic
{
	private static final long serialVersionUID = -6310189300237101185L;
	public static Schematic instance = new BaseRoom3();
	private static int WIDTH = 7;
	private static int LENGTH = 10;
	private static int HEIGHT = 5;
	private static String name = "BaseRoom3";
	
	private final int[][][] matrix = new int[][][]
	{
		    //   TYPEID                       DATAID
		{   // Layer 0
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4, 43,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, -1, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 1
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47, 47, 47, 47, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0, 44,  0, 47,  4,   0, 0, 0, 8 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, -1, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 2
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47, 47, 47, 47, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47,  0,  0,  0, 47,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 47, 50,  0, 50, 47,  4,   0, 0, 4, 0 ,4 ,0 ,0},
			{  4,  4,  4,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1,  0, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 3
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  5,  5,  5,  5,  5,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  5,  0,  0,  0,  5,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  5,  0, 44,  0,  5,  4,   0, 0, 0, 0 ,0 ,10,0},
			{  4,  5,  0,  0,  0,  5,  4,   0, 0, 0, 0 ,0 ,10,0},
			{  4,  5,  0,  0,  0,  5,  4,   0, 0, 0, 0 ,0 ,10,0},
			{  4,  4,  4,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1,  0, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 4
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 43, 43, 43, 43, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4, 43,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4, 43,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, 43, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		}
	};
	
	private BaseRoom3()
	{
	}
	
	public int getWidth() // Inner
	{
		return BaseRoom3.WIDTH;
	}
	public int getLength() // Middle
	{
		return BaseRoom3.LENGTH;
	}
	public int getHeight() // Outer
	{
		return BaseRoom3.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return BaseRoom3.name;
	}
	
	public Schematic rotate(int direction)
	{
		return HothUtils.rotateSchematic(direction, this);
	}
}