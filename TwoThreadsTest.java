/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplothreads;

/**
 *
 * @author jaisson.duarte
 */
public class TwoThreadsTest {

  public static void main(String[] args) {
    new SimpleThread("Ciência da Computação - Arq II").start();
    new SimpleThread("IFRS").start();

    System.out.println("************");
    System.out.println("    FIM!    ");
    System.out.println("************");
  }
}
