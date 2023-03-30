package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  int myPow(int num, int exponent) {
    num = num * myPow(num, exponent - 1);
    return num;  // this is never reached
  }

  int myPow10(int num, int exponent) {
    num = num * myPow(num, exponent - 1);
    return num;  // this is never reached
  }

  int myPow8(int num, int exponent) {
    num = num * myPow(num, exponent - 1);
    return num;  // this is never reached
  }

}
