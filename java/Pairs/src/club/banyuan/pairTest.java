package club.banyuan;

import club.banyuan.Country;
import org.junit.Assert;
import org.junit.Test;

public class pairTest {
    public class PairTester {
        @Test
        public void test(){
            Pair<Integer> pairTest = new Pair<>(1,2);
            pairTest.swap();//pairTest变为[2,1]
            Assert.assertEquals(pairTest.getFirst(),Integer.valueOf(2));
            Assert.assertEquals(pairTest.getSecond(),Integer.valueOf(1));

            Pair<Integer> pairTest2 = PairUtil.swap(pairTest);//pairTest为[1,2]
            Assert.assertEquals(pairTest2.getFirst(),Integer.valueOf(1));
            Assert.assertEquals(pairTest2.getSecond(),Integer.valueOf(2));
        }

        @Test
        public void pairUtilSwap(){
            Pair<Integer> pairTest = new Pair<>(1,2);
            Pair<Integer> pairTest2 = PairUtil.swap(pairTest);//pairTest为[2,1]
            Assert.assertEquals(pairTest2.getFirst(),Integer.valueOf(2));
            Assert.assertEquals(pairTest2.getSecond(),Integer.valueOf(1));
        }

        @Test
        public void pairMinmax(){
            Country[] countries= new Country[]{new Country(1000), new Country(2000),new Country(3000),new Country(4000)};
            Pair<Country> pairtest = PairUtil.minmax(countries);
            Assert.assertEquals(pairtest.getFirst(),countries[0]);
            Assert.assertEquals(pairtest.getSecond(),countries[3]);
        }

    }
}
