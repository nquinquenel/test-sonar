package org.example;

import java.util.Enumeration;

public class MyClass implements Enumeration {
  @Override
  public boolean hasMoreElements() {
    return false;
  }

  @Override
  public Object nextElement() {
    return null;
  }  // Noncompliant
  /* ... */
}
