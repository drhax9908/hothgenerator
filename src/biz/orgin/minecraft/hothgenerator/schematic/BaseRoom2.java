package biz.orgin.minecraft.hothgenerator.schematic;

import biz.orgin.minecraft.hothgenerator.HothUtils;

public class BaseRoom2 implements Schematic
{
	private static final long serialVersionUID = -8779506734265514761L;
	public static Schematic instance = new BaseRoom2();
	private static int WIDTH = 7;
	private static int LENGTH = 10;
	private static int HEIGHT = 5;
	private static String name = "BaseRoom2";
	
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
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  4,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1, -1, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 2
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  0,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4, 50,  0,  0,  0, 50,  4,   0, 1, 0, 0 ,0 ,2 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  4,  4,  0,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1,  4,  0,  4, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
			{ -1, -1, -1,  0, -1, -1, -1,   0, 0, 0, 0 ,0 ,0 ,0},
		},
		{   // Layer 3
			{  4,  4,  4,  4,  4,  4,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,  0,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0, 61,  5,  5, 43,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0,118,  4,   0, 0, 0, 0 ,0 ,0 ,0},
			{  4,  0,  0,  0,  0, 44,  4,   0, 0, 0, 0 ,0 ,10,0},
			{  4,  0,  0,  0,  0, 44,  4,   0, 0, 0, 0 ,0 ,10,0},
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
	
	private BaseRoom2()
	{
	}
	
	public int getWidth() // Inner
	{
		return BaseRoom2.WIDTH;
	}
	public int getLength() // Middle
	{
		return BaseRoom2.LENGTH;
	}
	public int getHeight() // Outer
	{
		return BaseRoom2.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return BaseRoom2.name;
	}
	
	public Schematic rotate(int direction)
	{
		return HothUtils.rotateSchematic(direction, this);
	}
}