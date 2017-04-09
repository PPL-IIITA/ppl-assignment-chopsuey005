/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Rajat
 */
public class log {
    void create(String a,String b)
    {
        Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("D:\\valentine.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
          

    } catch (   SecurityException | IOException e) {  
    } 
    logger.info(a+" gets committed with " +b);
    
    }
    
}
