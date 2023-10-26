package day4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import corejava.Point;
import corejava.Point3D;


public class SerialTest {
	public static void main(String[] args) throws Exception{
		Point p= new Point(2,3);
		System.out.println( p);
		Point p2 =new Point3D();
		System.out.println(p2);
		ObjectOutputStream oog = new ObjectOutputStream(new FileOutputStream(new File("Object")));
		oog.writeObject(p);
		oog.flush();
		oog.close();
		
		
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Object")));
		Point p1 = (Point) ois.readObject()	;
		System.out.println(p1);
		System.out.println(p==p1);
	}

}
