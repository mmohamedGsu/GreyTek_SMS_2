/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

/**
 *
 * @author cybschuma
 */
public class Person {

   protected String lname;
   protected String fname;
   protected char minitial;
   
   protected int ssn;
   
   protected int phone;
   
   protected String address;
   
   protected char gender;
   
   protected String email;
   
   protected int DOBDAy;
   protected int DOBMonth;
   protected int DOByear;
   
   
   public Person(){
       lname = "";
       fname = "";
       minitial = '\0';     //find way to make emoty char
       phone = 0;
       address = "";
       gender = '\0';
       email = "";
       
   }
   
   public void setName(String f, char m, String l, int s){
       
       this.fname = f;
       this.minitial = m;
       this.lname = l;
       this.ssn = s;
   }
   
   public void setAddress(String a){
       this.address = a;
   }
   
   
   public void setEmail (String e){
       this.email = e;
   }
   
   public void setGender (char g){
       this.gender = g;
   }
   
   public void setDOB (int d, int m, int y){
       this.DOBDAy = d;
       this.DOBMonth = m;
       this.DOByear = y;
   }
   
   
   
}
