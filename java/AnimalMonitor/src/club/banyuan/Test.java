package club.banyuan;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class Test {

    @org.junit.Test
    public void printList() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        animalMonitorImpl.printList();
    }

    @org.junit.Test
    public void printSightingsOf() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        animalMonitorImpl.printSightingsOf("河马");

    }

    @org.junit.Test
    public void printSightingsBy() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        animalMonitorImpl.printSightingsBy(0);
    }

    @org.junit.Test
    public void printEndangered() {
        //"河马" 105,"水牛" 28,"山地大猩猩" 14,"大象" 24
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        animalMonitorImpl.printEndangered(Arrays.asList("河马","水牛","山地大猩猩","大象"),30);
    }

    @org.junit.Test
    public void printSightingsInPeriod() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        List<Sighting> list = animalMonitorImpl.printSightingsInPeriod(1);
        for(Sighting one : list){
            Assert.assertEquals(one.getPeriod(),1);
        }
    }

    @org.junit.Test
    public void printSightingsOfInPeriod() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        List<Sighting> list = animalMonitorImpl.printSightingsOfInPeriod(0,1,"水牛");
        for(Sighting one : list){
            Assert.assertNotEquals(one.getPeriod(),2);
            Assert.assertEquals(one.getAnimal(),"水牛");
        }
    }

    @org.junit.Test
    public void printCounts() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        List<Sighting> list = animalMonitorImpl.printCounts("大象");
        for(Sighting one : list){
            Assert.assertEquals(one.getAnimal(),"大象");
        }
    }

    @org.junit.Test
    public void getCount() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
       // animalMonitorImpl.getCount("山地大猩猩");
        Assert.assertEquals(animalMonitorImpl.getCount("山地大猩猩"),14);
        Assert.assertEquals(animalMonitorImpl.getCount("大象"),24);
        Assert.assertEquals(animalMonitorImpl.getCount("水牛"),28);
        Assert.assertEquals(animalMonitorImpl.getCount("河马"),105);

    }

    @org.junit.Test
    public void removeZeroCounts() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        animalMonitorImpl.removeZeroCounts();
        for(Sighting one : animalMonitorImpl.getSightings()){
            Assert.assertNotEquals(one.getCount(),0);
        }
    }

    @org.junit.Test
    public void getSightingsInArea() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        List<Sighting> list = animalMonitorImpl.getSightingsInArea("大象",1);
        for(Sighting one : list){
            Assert.assertEquals(one.getAnimal(),"大象");
            Assert.assertEquals(one.getArea(),1);
        }

    }

    @org.junit.Test
    public void getSightingsOf() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        List<Sighting> list = animalMonitorImpl.getSightingsOf("大象");
        for(Sighting one : list){
            Assert.assertEquals(one.getAnimal(),"大象");
        }
    }

    @org.junit.Test
    public void getAnimalBy() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        Assert.assertTrue(animalMonitorImpl.getAnimalBy(0,0).containsAll(Arrays.asList("山地大猩猩","水牛")));
    }

    @org.junit.Test
    public void getSpotterBy() {
        AnimalMonitorImpl animalMonitorImpl = new AnimalMonitorImpl();
        Assert.assertTrue(animalMonitorImpl.getSpotterBy("水牛",0).containsAll(Arrays.asList(0,3)));

    }
}
