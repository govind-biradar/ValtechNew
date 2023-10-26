package day3;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.FileInputStream;

public class IOTest {
	public static void main(String[] args)throws IOException {
		//WriteToFile();
	  // readToFile();
		
		rotateAndWrite();
		rotateAndRead();
		
		
	}
	

	private static void rotateAndRead()throws IOException {
		char[] buffer = new char[1024];
		int bytesRead=in.read(buffer);
		in.close();
		System.out.println(new String(buffer,0,bytesRead));
		
		
	}


	private static void rotateAndWrite() throws IOException{
		Writer out= new Rot3Writer(new FileWriter(new File("hello.txt")));
		out.write("Hello World");
		out.flush();
		out.close();
	
		
	}

	private static void readToFile()throws IOException {
		FileInputStream is = new FileInputStream(new File("hello.txt"));
		byte[] buffer = new byte[1024];
		int bytesRead= is.read(buffer);
		System.out.println("Byte read ="+bytesRead);
		System.out.println(new String(buffer,0,bytesRead));
		
		
	}

	private static void WriteToFile()throws IOException {
		String msg ="Hello World";
		FileOutputStream fos = new FileOutputStream(new File("hello.txt"));
		fos.write(msg.getBytes());
		fos.flush();
		fos.close();
		
	}
	

}
