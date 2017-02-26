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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class jodi {
    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception {
        List btype = new ArrayList();
        List ladka = new ArrayList();
        List bsurat = new ArrayList();
        List  kharcha = new ArrayList();
        List biq = new ArrayList();
        List min = new ArrayList();
        List status = new ArrayList();
        List bf = new ArrayList();
        
         String splitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\boys.csv"))) {
            String line;
            while((line = br.readLine()) != null){
                String[] b = line.split(splitBy);
                btype.add(b[0]);
                ladka.add(b[1]);
                bsurat.add(b[2]);
                kharcha.add(b[3]);
                biq.add(b[4]);
                min.add(b[5]);
                status.add(b[6]);
                
                
            } 
        }
        
        List gtype = new ArrayList();
        List ladki = new ArrayList();
        List gsurat = new ArrayList();
        List  kharchili = new ArrayList();
        List giq = new ArrayList();
     
        
        
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\girl.csv"))) {
            String line;
            while((line = br.readLine()) != null){
                String[] b = line.split(splitBy);
                gtype.add(b[0]);
                ladki.add(b[1]);
                gsurat.add(b[2]);
                kharchili.add(b[3]);
                giq.add(b[4]);
                bf.add(b[5]);
                
                
            } 
        }
        List  price = new ArrayList();
        List value = new ArrayList();
     
        
        
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\girl.csv"))) {
            String line;
            while((line = br.readLine()) != null){
                String[] b = line.split(splitBy);
                gtype.add(b[0]);
                ladki.add(b[1]);
        
        Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("valentine.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
          

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    } 
        
    int i,j;
    for(i=0;i<10;i++)
    {
        for(j=0;j<50;j++)
        {
            if((Integer.parseInt((String) status.get(j)) == 0 )&& Integer.parseInt((String) min.get(j))<Integer.parseInt((String) gsurat.get(i)) && Integer.parseInt((String) kharcha.get(j)) > Integer.parseInt((String) kharchili.get(i)))
            {
                logger.info(ladki.get(i)+" gets committed with " +ladka.get(j));
                status.remove(j);
                
                status.add(j, "1");
                bf.remove(i);
                
                bf.add(i, j);
                break;
            }
        }
    }
    
    
    
        
    
        
   
    

  
}
        }
    }
}