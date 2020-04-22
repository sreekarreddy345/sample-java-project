package com.java.demo;

 class A {
     A(){
         this(0);
         System.out.println("HI");
     }
     A(int x){
         this(0,0);

         System.out.println("Hello");
     }
     A(int x, int y){
         System.out.println("How are you");
     }

     public static void main(String[] args) {
         A a = new A();

     }



}
