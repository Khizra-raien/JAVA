package test;

import java.io.File;
public class FileHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file= new File("test.txt");
try {
	if(file.createNewFile()) {
		System.out.println("file is created"+file.getName());
	}
	else {
		System.out.println("file is alredy created "+file.getName());
	}
}catch(Exception e) {
	System.out.println("error");
	e.printStackTrace();
}
	}

}
