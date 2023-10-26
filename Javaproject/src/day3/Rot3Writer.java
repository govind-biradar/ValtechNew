package day3;

import java.io.IOException;
import java.io.Writer;

public class Rot3Writer extends Writer {
	public Writer dest;
	
	public Rot3Writer(Writer dest) {
		this.dest=dest;
		
	}
	@Override
	public void write(int c) throws IOException {
		dest.write(Rot3Helper.rotate((char)c));
		
		
	}
	
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for (int i = 0; i < len; i++) {
			cbuf[off + i]=Rot3Helper.rotate(cbuf[off+i]);
			
		}
		dest.write(cbuf,off,len);
		
			
		}
		
	@Override
	public void flush() throws IOException {
		dest.flush();
		
	}
	@Override
	public void close() throws IOException {
		dest.close();
		
	}
	

}
