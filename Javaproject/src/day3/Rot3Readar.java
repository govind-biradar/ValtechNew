package day3;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Rot3Readar extends Reader{
	private Reader source;
	

	public Rot3Readar(FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int bytesRead=source.read(cbuf, off, len);
		for (int i = 0; i < bytesRead; i++) {
			cbuf[off+i]=Rot3Helper.rotate(cbuf[off+i]);
			
			
		}
		return bytesRead;
	}
	@Override
	public void close() throws IOException {
		source.close();
		
	}
	

}
