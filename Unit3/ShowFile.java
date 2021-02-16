package Unit3;

import java.io.*;
public class ShowFile {
public static void main(String args[])
{

	String path="c:\\Users\\haris\\OneDrive\\Desktop\\ShowFile.java";
	
	
int i;
FileInputStream fin;
// First, confirm that a filename has been specified.

// Attempt to open the file.
try {
fin = new FileInputStream(path);
} catch(FileNotFoundException e) {
System.out.println("Cannot Open File");
return;
}
// At this point, the file is open and can be read.
// The following reads characters until EOF is encountered.
try {
do {
i = fin.read();
if(i != -1) System.out.print((char) i);
} while(i != -1);
} catch(IOException e) {
System.out.println("Error Reading File");
}
// Close the file.
try {
fin.close();
} catch(IOException e) {
System.out.println("Error Closing File");
}
}
}