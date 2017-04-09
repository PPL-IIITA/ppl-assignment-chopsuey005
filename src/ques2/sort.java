/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques2;

/**
 *
 * @author Rajat
 */
public class sort {
    
        public void selectionSort(int[] arr,int[] arr2,int[] arr3){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;
            
            smallerNumber = arr2[index];   
            arr2[index] = arr2[i];  
            arr2[i] = smallerNumber;
            
            smallerNumber = arr3[index];   
            arr3[index] = arr3[i];  
            arr3[i] = smallerNumber;
            
        } 
        
    }  
       
      
    
       public void sort1(int[] arr,String[] arr2,String[] arr3){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;
            
            String smallerNumber1 = arr2[index];   
            arr2[index] = arr2[i];  
            arr2[i] = smallerNumber1;
            
            smallerNumber1 = arr3[index];   
            arr3[index] = arr3[i];  
            arr3[i] = smallerNumber1;
            
        } 
        
    }

    
        }
