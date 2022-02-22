/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erna
 */
public class Array {
    public static void main(String[] args) {
        
        //CAra membuat Array
        String[] name;
        name = new String [15];
        name [0] = "Yang";
        name [1] = "Yang";
        name [2] = "Yang";
        name [3] = "Yang";
        
        
       //cara 2
       int[] umur = new int[] {
         9, 20, 24
       };
       
       //cara 3
       String[] mahasiswa = {
           "nandini", "chelsy", "risna"
       };
       
       System.out.println(mahasiswa[1]); //mengambil
       var result = mahasiswa[0] = "nandini"; 
       System.out.println(result);
       System.out.println(mahasiswa.length); //mengambil panjang
       
      //Array dalam array
      String [][] data = {
        {
          "nandini", "Nayfah", "Ufairoh"
        },
       
        {
          "Kim", "Taehyung"
        }
      };
      
    //cara mengambil data
    String[] hasil = data [0];
    System.out.println(hasil[1]);
    
    
             
             
               
               }]
              
        
                
                
               
        
    } 
}
