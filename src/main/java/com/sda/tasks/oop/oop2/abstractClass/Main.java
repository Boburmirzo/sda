package com.sda.tasks.oop.oop2.abstractClass;

import java.util.Scanner;

public class Main {

  public static void main(String []args){
//    Book new_novel=new Book();
    Scanner sc=new Scanner(System.in);
    String title=sc.nextLine();
    MyBook new_novel=new MyBook();
    new_novel.setTitle(title);
    System.out.println("The title is: "+new_novel.getTitle());
    sc.close();

  }
}
