import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file you would like to work with?");
		String fileName = input.next();
		input.nextLine();
		File myFile = createFile(fileName);
//		System.out.println("what do you want to write to the file?");
//		String str = input.nextLine();
//		
//		writeFile(fileName, str);
		
//		System.out.println("what do you want to append to the file?");
//		String str2 = input.nextLine();
//		appendTo(fileName, str2);
		
//		readFile(myFile);
		deleteFile(myFile);	
		
		
		

	
		}

	private static void deleteFile(File myFile) {
		if(myFile.delete())
		{
			System.out.println(myFile.getName() + " was deleted successfully");
		}
			else
			{
				System.out.println("File was not sucessfully deleted");
			}
		
		
	}

	private static void readFile(File myFile) {
		try (Scanner myReader = new Scanner(myFile)){
			while(myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}
			
			
			catch (FileNotFoundException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		
	}

	private static void appendTo(String fileName, String str2) {
		try {
			FileWriter myWriter = new FileWriter(fileName, true);
			myWriter.write("\n");
			myWriter.write(str2);
			System.out.println("Appended successfully.");
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeFile(String name, String strToWrite) {
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write(strToWrite);
			System.out.println("Written successfully.");
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static File createFile(String fileName) {
		try {
			File myFile = new File(fileName);
			if (myFile.createNewFile()) {
				System.out.println("File created succesfully!");
			} else {
				System.out.println("File: " + myFile.getName() + " already exists.");
			}
			return myFile;
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		return null;
	}

}
