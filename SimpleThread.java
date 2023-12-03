/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplothreads;

/**
 *
 * @author jaisson.duarte
 */
public class SimpleThread extends Thread {

  public SimpleThread(String str) {
    super(str);
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + " " + getName());
      try {
        sleep((long) (Math.random() * 1000));
      } catch (InterruptedException e) {
        System.out.println("Erro: " + e.getMessage());
      }
    }

    System.out.println("************");
    System.out.println("    FIM???    ");
    System.out.println("************");
  }
}
