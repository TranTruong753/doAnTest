/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Admin
 */


import com.itextpdf.text.log.SysoLogger;
import java.util.* ;
public class testIf {
   public static void test(int x){
        if(x>0){
            System.out.println("dk1");
        }
        if(x>1){
             System.out.println("dk2");
        }
    } 
   
    public static  void test1(){
        ArrayList<String> sos = new ArrayList<>() ;
        System.out.println(sos.size());
        for(String i:sos){
            System.out.println("Test.testIf.test1()");
        }
    }
    public static void main(String[] args) {
        test1();
    }
}
