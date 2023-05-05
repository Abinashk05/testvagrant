package javaSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Login {

	public static void main(String[] args) throws FileNotFoundException {
		//File f = new File("src\\practice.xlsx")
		FileInputStream fis = new FileInputStream(new File("src\\practice.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	}

}
