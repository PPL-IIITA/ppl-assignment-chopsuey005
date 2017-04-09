/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import q1.boy;
import q1.girl;
import q1.log;

/**
 *
 * @author Rajat
 */
public class breakup {
  void breakupp()
    {
        
        
        
        
        int[] gtype=new int[10];
        String[] ladki=new String[10];
        int[] gsurat=new int[10];
        int[] kharchili=new int[10];
        int[] giq=new int[10];
        int[] bf=new int[10];
        int[] ghappy=new int[10];
        
        int[] btype=new int[100];
        String[] ladka=new String[100];
        int[] bsurat=new int[100];
        int[] kharcha=new int[100];
        int[] biq=new int[100];
        int[] min=new int[100];
        int[] status=new int[100];
        double[] bhappy=new double[100];
        
        String splitBy = ",";
         int i=0;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\boy.csv"))) 
        {
            String line;
            while((line = br.readLine()) != null)
            {
                String[] b = line.split(splitBy);
                btype[i]= Integer.parseInt(b[0]);
                ladka[i]=(b[1]);
                bsurat[i]= Integer.parseInt(b[2]);
                kharcha[i]= Integer.parseInt(b[3]);
                biq[i]= Integer.parseInt(b[4]);
                min[i]= Integer.parseInt(b[5]);
                status[i]= Integer.parseInt(b[6]);
                bhappy[i]= Integer.parseInt(b[6]);
                i++;
            } 
        } catch (IOException ex) {
            Logger.getLogger(breakup.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\girl.csv"))) {
            String line;
            while((line = br.readLine()) != null){
                String[] b = line.split(splitBy);
                gtype[i]= Integer.parseInt(b[0]);
                ladki[i]= (b[1]);
                gsurat[i]= Integer.parseInt(b[2]);
                kharchili[i]= Integer.parseInt(b[3]);
                giq[i]= Integer.parseInt(b[4]);
                bf[i]= Integer.parseInt(b[5]);
                ghappy[i]= Integer.parseInt(b[6]);
                i++;
            } 
        } catch (IOException ex) {
            Logger.getLogger(breakup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    String[] men =new String[10];  
    String[] women =new String[10];  
    int j;
    int z=0;
    for(i=0;i<10;i++)
    {
        for(j=0;j<100;j++)
        {
            if(status[j] == 0 && bf[i] == 0  && min[j]<=  gsurat[i] && kharcha[j] >= kharchili[i] )
            {
                
               
                
                men[z]=ladka[j];
                women[z]=ladki[i];
                z++;
                
                
                status[j]=1;
                
                
                bf[i]=j;
                break;
            }
        }
    }
    
        
        
       
    }
}
    
