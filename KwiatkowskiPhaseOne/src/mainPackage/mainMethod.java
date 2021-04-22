package mainPackage;

import java.util.Scanner;
 
import java.io.File;
import java.io.IOException;

public class mainMethod {

	public static void main(String[] args) throws IOException {
		int num=0;
		String h=null;
		mainMethod obj = new mainMethod();
        
        //Take user Option from the below mentioned Menu
        Scanner input = new Scanner(System.in);
        System.out.println("****************************************************************");
        System.out.println("******************  Kwiatkowski's Imposium  ********************");
        System.out.println("****************  Created By Matt Kwiatkowski  *****************");
        System.out.println("****************************************************************");
        System.out.println();
        
        System.out.println(" 1. Add File to Directory");
        System.out.println(" 2. Delete File from Directory");
        System.out.println(" 3. Search for a File");
        System.out.println(" 4. Exit application");
        System.out.println();
        
        System.out.println("Enter Your Choice:");
        num = input.nextInt();   
         
           switch(num){    
           case 1: System.out.println("Add File to Directory"); 
                   obj.addFile(); 
                   break;  
           case 2: System.out.println("Delete File from Directory");  
                   obj.deleteFile();
                   break;
           case 3: System.out.println("Search for File from Directory");  
           obj.searchFile();
           break;
           case 4: System.out.println("Exiting");  
           System.exit(num);
           break;
           default: System.out.println("Please select 1 or 2 option");
           }

	}

	private void searchFile() {

		System.out.println("You want to search");
		Scanner scnr = new Scanner(System.in);
		String newName = scnr.next();
		File file = new File("C://Users//mattk//Desktop//"+newName);
		if(file.exists()) {
			System.out.println(newName+" exists.");
		}
		else {
			System.out.println("File does not exist.");
		}
	}

	private void deleteFile() {
		
		System.out.println("Type the file you wish to delete: ");
		Scanner scnr = new Scanner(System.in);
		String newName = scnr.next();
		File file = new File("C://Users//mattk//Desktop//"+newName);
		file.delete();
		System.out.println(newName+" deleted.");
			
		}
	
	void  addFile() throws IOException 
	{
				Scanner scnr = new Scanner(System.in); 
		
		System.out.println("Please enter file name: "); 
    	String newName = scnr.next();
		
		
		File file = new File("C://Users//mattk//Desktop//"+newName);
		if (file.createNewFile()) {
			System.out.println("New File is created!");
	
		} else {
			if(file.exists())
		{
			System.out.println("File already exists.");
				}
		}
	}
}
