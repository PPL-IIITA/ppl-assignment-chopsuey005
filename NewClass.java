/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

/**
 *
 * @author Rajat
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;
import java.util.Random;

public class NewClass {
    
  
	
	public static void main(String[] args) {
                            
                System.out.println("creating csv file");
		
		String outputFile = "D:\\girl.csv";
		
		// before we open the file check to see if it already exists
		boolean alreadyExists = new File(outputFile).exists();
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
			/*
			// if the file didn't already exist then we need to write out the header line
				csvOutput.write("type");
                                csvOutput.write("name");
                                csvOutput.write("attr");
                                
				csvOutput.write("expenditure");
                                csvOutput.write("intelligence");
                               
                                csvOutput.write("bf");
                                
                                
				csvOutput.endRecord();
			*/
			// else assume that the file already has the correct header line
			
                        int i;
                        for(i=1;i<=10;i++)
                        {
                        
			
                        Random r = new Random();
                        int Low = 1;
                        int High = 10;
                        
                        Random t = new Random();
                        int type = t.nextInt(4-1) + 1;
			csvOutput.write(String.valueOf(type));
                        
                        
                        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                         StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                                    for (int j = 0; j < 5; j++) {
                                char c = chars[random.nextInt(chars.length)];
                                        sb.append(c);
                                }
                                String output = sb.toString();
                        
                        csvOutput.write(output);
                        
                        int at = r.nextInt(High-Low) + Low;
			csvOutput.write(String.valueOf(at));
                        Random a = new Random();
                        int mb = a.nextInt(10000-1000) + 1000;
			csvOutput.write(String.valueOf(mb));
                        
                        Random b = new Random();
                        int iq = b.nextInt(100-0) + 0;
			csvOutput.write(String.valueOf(iq));
                        
                        csvOutput.write("0");
                        
                        
			csvOutput.endRecord();
			
			
                        }
			csvOutput.close();
                        
		} catch (IOException e) {
			e.printStackTrace();
		}
                System.out.println ("file is created");
		
	}
}
