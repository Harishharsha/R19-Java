package Unit3;

import java.io.*;
class CopyFile {
public static void main(String args[]) throws IOException
{
int i;
String file1="c:\\\\Users\\\\haris\\\\OneDrive\\\\Desktop\\\\hello.txt";
String file2="c:\\\\Users\\\\haris\\\\OneDrive\\\\Desktop\\\\hello1.txt";
FileInputStream fin = null;
FileOutputStream fout = null;

//Copy a File.
try {
//Attempt to open the files.
fin = new FileInputStream(file1);
fout = new FileOutputStream(file2);
do {
i = fin.read();
if(i != -1) fout.write(i);
} while(i != -1);
} catch(IOException e) {
System.out.println("I/O Error: " + e);
} finally {
try {
if(fin != null) fin.close();
} catch(IOException e2) {
System.out.println("Error Closing Input File");
}
try {
if(fout != null)
	{
	fout.close();
	System.out.println("File Copied Successfully");
	
	}
} catch(IOException e2) {
System.out.println("Error Closing Output File");
}
}
}
}
