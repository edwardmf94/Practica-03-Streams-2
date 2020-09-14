package main;

import java.io.*;

public class Objecto3d implements Serializable{
	public int scale;
	private Point point;
	private Rotation rotation;
	Objecto3d(Point point, Rotation rotation, int scale){
		this.point=point;
		this.rotation=rotation;
	}
}
