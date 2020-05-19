package club.banyuan;

import club.banyuan.Measurer;
import club.banyuan.Rectangle;

public class RectangleMeasurer implements Measurer<Rectangle> {

  @Override
  public double measure(Rectangle anObject) {

    return anObject.width * anObject.height;

  }
}
