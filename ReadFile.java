/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexTreeShake;


import java.io.*;

public class ReadFile {

        public static void main(String [] args) {
            
            IndexTree tree = new IndexTree();

		String fileName = "/Users/kavunnuggihalli/NetBeansProjects/DataStructures/src/IndexTreeShake/pg2240.txt";
		String line = null;
		BufferedReader bufferedReader;

		try {

			bufferedReader= new BufferedReader(new FileReader(fileName));
                        int x=0;//current line
			while(bufferedReader.ready()) {
				line = bufferedReader.readLine();
                                String[] ar = line.split(" "); 
                                //System.out.println(line);
				for ( String ss : ar) {
                                   //Each word
                                    //System.out.println(ss+"___"+x);
                                   tree.add(ss, x);
                                }
                                x++;
			}
                       tree.printIndex();

			bufferedReader.close();         
		}
		catch(FileNotFoundException e) { 
			System.err.println("File not found");                
		}
		// catch any other exception
		catch(Exception e) {
			e.printStackTrace();
		}
                
                
                
	}
}


