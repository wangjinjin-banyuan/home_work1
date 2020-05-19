package club.banyuan;

import club.banyuan.Measurer;

public class StringMeasurer implements Measurer<String> {

  @Override
  public double measure(String anObject) {
    if (anObject == null) {
      return 0;
    }
    //String string = (String) anObject;
    return anObject.length();
  }
}
