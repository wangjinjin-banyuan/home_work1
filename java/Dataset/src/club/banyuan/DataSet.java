package club.banyuan;

import java.util.Objects;

public class DataSet  {
  // TODO: 定义private 实例变量
  private double sum;
  private double count;
  private Object maximum;
  private Measurer measurer;


  public DataSet(Measurer aMeasurer) {
    sum = 0;
    count = 0;
    maximum = null;
    measurer = aMeasurer;
  }
  public DataSet(){
    sum = 0;
    count = 0;
    maximum = null;
  }

  // TODO： 重载方法，使得Contry统计 DataSetTester 运行成功
  public void add(Object x) {
    sum = sum + measurer.measure(x);
    if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
      maximum = x;
    }
    count++;
  }
  public void add(Measurable measurer){
    sum = sum + measurer.getMeasure();
    Measurable max=(Measurable)maximum;
    if (count == 0 ||max.getMeasure() <measurer.getMeasure()) {
      maximum = measurer;
    }
    count++;
  }

  public double getAverage() {
    // TODO: Check divide by zero. Compute the average value.
    if(count==0){
      return 0;
    }
    else{
      double averageNum=sum/count;
      return averageNum;
    }
  }

  public Object getMaximum() {
    return maximum;
  }


}