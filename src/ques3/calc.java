/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.log;
import java.util.logging.Level;
import java.util.logging.Logger;
import ques2.sort;

/**
 *
 * @author Rajat
 */
public class calc {
    
    void a()
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
            Logger.getLogger(calc.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(calc.class.getName()).log(Level.SEVERE, null, ex);
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
        int[] type=new int[50];
        int[] price=new int[50];
        int[] value=new int[50];
        int ii=0;
    try (BufferedReader aa = new BufferedReader(new FileReader("D:\\essential.csv"))) 
        {
            String line;
            while((line = aa.readLine()) != null)
            {
               String[] b = line.split(splitBy);
                type[ii]= Integer.parseInt(b[0]);
                price[ii]= Integer.parseInt(b[1]);
                value[ii]= Integer.parseInt(b[2]);
                ii++;
            } 
        } catch (IOException ex) {
            Logger.getLogger(calc.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    sort array=new sort();
    array.selectionSort(price, type, value);
        
        
        int sum=0,sumv=0,p=0,q=9;
        int[] bh=new int[10];
        int[] gh=new int[10]; 
        int[] h=new int[10]; 
        String[] b=new String[10]; 
    for(i=0;i<10;i++)
    {
        int exp = kharchili[i];
        int bud=kharcha[bf[i]];
        int bfindex=bf[i];
        int typeofbf = type[bfindex];
       b[i]=ladka[bfindex];
       if(typeofbf==1)
       {
           while(exp<=sum)
        {
            
                sum=sum+price[p];
                sumv=sumv+value[p];
                p++;  
                 System.out.println("gift of type :%d and price : %d"+type[p]+price[p]);
        }
           bh[i]=bud-sum;
       }
       else if(typeofbf==2)
       {
           while(bud>sum)
           {
               
               sum=sum+price[q];
               sumv=sumv+value[q];
               q--;
                System.out.println("gift of type :%d and price : %d"+type[q]+price[q]);
           }
       }
       else if(typeofbf==3)
       {
              while(exp<=sum)
        {
            
                sum=sum+price[p];
                sumv=sumv+value[p];
                System.out.println("gift of type :%d and price : %d"+type[p]+price[p]);
                p++;  
        }
              while(type[p]!=2)
                  p++;
               sum=sum+price[p];
               sumv=sumv+value[p];
               System.out.println("gift of type :%d and price : %d"+type[p]+price[p]);
              bh[i]=giq[i];
       }
       
       if(gtype[i]==1)
       {
           gh[i]= (int) log(sum-exp);
       }
       else if(gtype[i]==2)
       {
           gh[i]=sum-exp;
       }
       else if(gtype[i]==3)
       {
           gh[i]=(int) Math.exp(sum-exp);
       }
       
       h[i]=bh[i]+gh[i];
       
    }
        
        sort ar =new sort();
        ar.sort1(h,ladki,b);
        //let k=5;
        int k=5;
        for(i=10;i>5;i--)
        {
            System.out.println(ladki[i]+"and"+b[i]);
            
        }
       
        
    }
    
}

    
    

