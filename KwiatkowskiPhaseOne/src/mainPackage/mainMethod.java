package mainPackage;

import java.util.Scanner;



import java.io.File;
import java.io.IOException;

public class mainMethod {

	public static void main(String[] args) throws IOException {
		int num=0;
		String h=null;
		mainMethod obj = new mainMethod();
		SortFiles sfi = new SortFiles();
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
        System.out.println(" 4. Sort the Directory");
        System.out.println(" 5. Exit the Application");
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
           case 4: System.out.println("Sort the files in Directory");  
           new SortFiles().main(args);
           break;
           case 5: System.out.println("Exiting");  
           System.exit(num);
           break;
           default: System.out.println("Please select 1 or 2 option");
           }

	}

	private void searchFile() throws IOException {

		System.out.println("You want to search");
		Scanner scnr = new Scanner(System.in);
		String newName = scnr.next();
		File file = new File("C://Users//mattk//Desktop//"+newName);
		mainMethod obj = new mainMethod();
		if(file.exists()) {
			System.out.println(newName+" exists.");
			obj.mainMethod();
		}
		else {
			System.out.println("File does not exist.");
			
			 obj.mainMethod();
		}
	}

	void mainMethod() throws IOException {
		// TODO Auto-generated method stub
		int num=0;
		String h=null;
		mainMethod obj = new mainMethod();
		SortFiles sfi = new SortFiles();
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
        System.out.println(" 4. Exit the Application");
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







	private void deleteFile() throws IOException {
		mainMethod obj = new mainMethod();
		System.out.println("Type the file you wish to delete: ");
		Scanner scnr = new Scanner(System.in);
		String newName = scnr.next();
		File file = new File("C://Users//mattk//Desktop//"+newName);
		file.delete();
		System.out.println(newName+" deleted.");
		obj.mainMethod();
		}
	
	void  addFile() throws IOException 
	{
				Scanner scnr = new Scanner(System.in); 
				mainMethod obj = new mainMethod();
		System.out.println("Please enter file name: "); 
    	String newName = scnr.next();
		
		
		File file = new File("C://Users//mattk//Desktop//"+newName);
		if (file.createNewFile()) {
			System.out.println("New File is created!");
			obj.mainMethod();
	
		} else {
			if(file.exists())
		{
			System.out.println("File already exists.");
			obj.mainMethod();
				}
		}
	}

}

