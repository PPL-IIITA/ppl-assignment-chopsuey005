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
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class gift {
    
  
	
	public static void main(String[] args) {
                            
                System.out.println("creating csv file");
		
		String outputFile = "D:\\gift.csv";
		
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
                        ArrayList  number = new ArrayList();
                        for(i=1;i<=100;i++)
                        {

                        Random t = new Random();
                        int type = t.nextInt(4-1) + 1;
                        
			if(type==1)
                        {
                            Random r = new Random();
                           int price = r.nextInt(1000-500) + 500;
			
                       number.add(price);
			
                        }
                        else if(type==2)
                        {
                             Random r = new Random();
                            
                           int price = (r.nextInt(2000-1000) + 1000);
                           
			  number.add(price);
                       
                        }
                        else if(type==3)
                        {
                             Random r = new Random();
                           int price = r.nextInt(3000-2000) + 1000;
			
                         number.add(price);
                        }
                      
                        }
                        
                        Collections.sort(number);
                       
                        
                        for(i=1;i<=100;i++)
                        {

                        Random t = new Random();
                        int type = t.nextInt(4-1) + 1;
                        csvOutput.write(String.valueOf(type));
                        csvOutput.write(String.valueOf(number.get(i)));
			Random a = new Random();
                        int value = a.nextInt(101-1) + 1;
			csvOutput.write(String.valueOf(value));
                        
                        
                        csvOutput.write(String.valueOf(0));
			csvOutput.endRecord();
			
			
                        }
			csvOutput.close();
                        
		} catch (IOException e) {
			e.printStackTrace();
		}
                System.out.println ("file is created");
		
	}
}
