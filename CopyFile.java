package test;
import java.io.*;
public class CopyFile {
public static void main(String[] args) {
	try {
		FileReader r=new FileReader("test.txt");
		FileWriter w=new FileWriter("text.txt");
		int chr;
		int index=0;
		while((chr=r.read())!=-1) {
			if(index%2==0) {
				w.write(chr);
			}
		}
		index++;
		r.close();
		w.close();
		System.out.println("alternate the charcter of file");
	}catch(Exception e) {
	System.out.println("error");
	
	}
	}

}
