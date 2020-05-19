package club.banyuan;

import club.banyuan.Measurable;
import club.banyuan.Measurer;

public class DataSet<T> {

  private double sum;
  private int count;
  private Object maximum;
  private Measurer<T> measurer;

  public DataSet() {
  }

  public DataSet(Measurer<T> aMeasurer) {
    sum = 0;
    count = 0;
    maximum = null;
    measurer = aMeasurer;
  }

  public void add(T x) {
    if (x instanceof Measurable) {
      add((Measurable) x);
    } else {
      addByMeasurer(x);
    }
  }

  public void addByMeasurer(T x) {
    sum = sum + measurer.measure(x);
    if (count == 0 || measurer.measure((T) maximum) < measurer.measure(x)) {
      maximum = x;
    }
    count++;
  }

  public void add(Measurable measurable) {
    sum = sum + measurable.getMeasure();
    if (count == 0 || ((Measurable) maximum).getMeasure() < measurable.getMeasure()) {
      maximum = measurable;
    }
    count++;
  }

  public double getAverage() {
    if (count == 0) {
      return 0;
    }
    return sum / count;
  }

  public T getMaximum() {
    return (T)maximum;
  }


}