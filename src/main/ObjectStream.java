package main;

import java.io.*;

public class ObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Point point = new Point();
		Rotation rotation = new Rotation();
		Objecto3d objecto3d = new Objecto3d(point,rotation,1);
		
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("objeto3d.obj"));
		salida.writeObject(objecto3d);
		salida.close();
		
		ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("objeto3d.obj"));
		Objecto3d obj1=(Objecto3d)entrada.readObject();
		System.out.println("------------------------------");
		System.out.println(obj1);
		System.out.println("------------------------------");
		entrada.close();
	}
	
	
}
