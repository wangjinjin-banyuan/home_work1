package club.banyuan;

import club.banyuan.AnimalMonitor;
import club.banyuan.Sighting;

import java.util.*;

/**
 * 监视不同种类动物的数量。由观察者记录目击事件。
 */
public class AnimalMonitorImpl implements AnimalMonitor {

  // 记录所有发现的动物。
  private List<Sighting> sightings;

  public List<Sighting> getSightings() {
    return sightings;
  }
  /**
   * 创建一个AnimalMonitor。
   */
  public AnimalMonitorImpl() {
    this.sightings =  new SightingFiller().getSightings();
  }



  /**
   * 打印所有目击动物的详细信息。
   */
  @Override
  public void printList() {
    for (Sighting one : sightings) {
      System.out.println(one.getDetails());
    }
  }

  /**
   * 打印给定动物的所有目击细节。
   *
   * @param animal 动物的类型。
   */
  @Override
  public void printSightingsOf(String animal) {
    for (Sighting one : sightings) {
      if (one.getAnimal().equals(animal)) {
        one.getDetails();
      } else {
        System.out.println("未发现此动物信息！");
      }
    }
  }

  /**
   * 打印给定观察者的所有目击动物。
   *
   * @param spotter 观察者的ID。
   */
  @Override
  public void printSightingsBy(int spotter) {
    for (Sighting one : sightings) {
      if (one.getSpotter() == spotter) {
        System.out.println(one.getAnimal());
      } else {
        System.out.println("无此观察者ID！");
      }
    }
  }

  /**
   * 打印一份被视为濒临灭绝的动物的清单。
   *
   * @param animalNames     动物名称列表。
   * @param dangerThreshold 小于或等于此级别的动物总数被认为濒临灭绝的
   */
  @Override
  public void printEndangered(List<String> animalNames, int dangerThreshold) {
    int num = 0;
    for (String name : animalNames) {

      for (Sighting one : sightings) {
        if (name.equals(one.getAnimal())) {
          num++;
        }
      }

      if (num > dangerThreshold) {
        animalNames.remove(name);
      }
    }
    for (String animal : animalNames) {
      System.out.println(animal);
    }
  }


  /**
   * 打印在特定期间periodID内记录的所有目击事件的详细信息，并将其作为参数传递给该方法
   *
   * @param period 日期ID
   * @return 指定日期的清单
   */
  @Override
  public List<Sighting> printSightingsInPeriod(int period) {
    List<Sighting> newPeriodList=new LinkedList<>();
    for (Sighting one : sightings){
      if(one.getPeriod()==period){
        newPeriodList.add(one);
        System.out.println(one.getDetails());
      }
    }
    return newPeriodList ;
  }

  /**
   * 打印并返回指定日期区间内的清单
   *
   * @param fromPeriod 日期开始
   * @param toPeriod   日期结束
   * @param animal     动物类型
   */
  @Override
  public List<Sighting> printSightingsOfInPeriod(int fromPeriod, int toPeriod, String animal) {
    List<Sighting> pointPeriodAndAnimal=new LinkedList<>();
    for(Sighting one : sightings){
      if((one.getPeriod()>=fromPeriod&&one.getPeriod()<=toPeriod)&&(one.getAnimal().equals(animal))){

          System.out.println(one.getDetails());
          pointPeriodAndAnimal.add(one);
      }
    }
    return pointPeriodAndAnimal;
  }

  /**
   * 打印特定动物类型的总的目击数量
   *
   * @param animal 动物类型
   */
  @Override
  public List<Sighting> printCounts(String animal) {
    int num=0;
    List<Sighting> animalGetCount=new LinkedList<>();
    for(Sighting one :sightings){
      if(one.getAnimal().equals(animal)){
        num++;
        animalGetCount.add(one);
      }
    }
    System.out.println(num);
    return animalGetCount;
  }

  /**
   * 返回给定动物目击次数。
   *
   * @param animal 动物的类型。
   * @return 给定动物的目击次数总数。
   */
  @Override
  public int getCount(String animal) {
    int num=0;
    for(Sighting one :sightings){
      if(one.getAnimal().equals(animal)){
        num+=one.getCount();
      }
    }
    return num;
  }

  /**
   * 从发现清单中删除计数为零的记录。
   */
  @Override
  public void removeZeroCounts() {
    sightings.removeIf(one -> one.getCount() == 0);
  }

  /**
   * 返回特定区域内给定类型的动物的所有动物清单。
   *
   * @param animal 动物的类型。
   * @param area   区域的ID。
   * @return 目击清单。
   */
  @Override
  public List<Sighting> getSightingsInArea(String animal, int area) {
    List<Sighting> sightAnimal=new LinkedList<>();
    for(Sighting one : sightings){
      if(one.getAnimal().equals(animal)&&one.getArea()==area){
        sightAnimal.add(one);
      }
    }
    return sightAnimal;
  }

  /**
   * 返回给定动物的所有目击清单。
   *
   * @param animal 动物的类型。
   * @return 给定动物的所有目击物清单。
   */
  @Override
  public List<Sighting> getSightingsOf(String animal) {
    List<Sighting> sightAllAnimal=new LinkedList<>();
    for(Sighting one : sightings){
      if(one.getAnimal().equals(animal)){
        sightAllAnimal.add(one);
      }
    }
    return sightAllAnimal;
  }

  /**
   * @param spotter
   * @param period
   * @return 包含该观察者在特定日期看到的动物的名称，只包括数量大于零的动物
   */
  @Override
  public List<String> getAnimalBy(int spotter, int period) {
    Set<String> spotterSeeAnimal =new HashSet<>();
    for(Sighting one : sightings){
      if(one.getSpotter()==spotter&&one.getPeriod()==period&&one.getCount()>0){
        spotterSeeAnimal.add(one.getAnimal());
      }
    }
    return new ArrayList<>(spotterSeeAnimal);
  }

  /**
   * @param animal
   * @param period
   * @return 在该特定日期看到该动物的观察者
   */
  @Override
  public List<Integer> getSpotterBy(String animal, int period) {
    Set<Integer> spotter = new HashSet<>();
    for(Sighting one : sightings){
      if(one.getAnimal().equals(animal)&&one.getPeriod()==period){
        spotter.add(one.getSpotter());
      }
    }
    return new ArrayList<>(spotter);
  }
}
