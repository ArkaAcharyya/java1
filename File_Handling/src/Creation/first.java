package Creation;

import java.io.*;
public class first {
	public static void main(String[] args) {
		File file=new File("testing.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("New File created");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
