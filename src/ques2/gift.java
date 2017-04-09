/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques2;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajat
 */
public class gift {
    
    void make() {
                            
                System.out.println("creating csv file");
		
		String outputFile = "D:\\essential.csv";
		
		// before we open the file check to see if it already exists
		boolean alreadyExists = new File(outputFile).exists();
			
		try {
			// use FileWriter constructor that specifies open for appending
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
			 int i;
                         ArrayList  number = new ArrayList();
                        for(i=1;i<=50;i++)
                        {
                            Random ab = new Random();
                            int type = ab.nextInt(4);
                            csvOutput.write(String.valueOf(type));
                            
                            Random r = new Random();
                            int price = r.nextInt(1000-500) + 500;
                            csvOutput.write(String.valueOf(price));
                            Random a = new Random();
                            int value = a.nextInt(11) ;
                            
                            csvOutput.write(String.valueOf(value));
                            
                            
                            csvOutput.endRecord();
                        }
                        csvOutput.close();
    
}       catch (IOException ex) {
            Logger.getLogger(gift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
