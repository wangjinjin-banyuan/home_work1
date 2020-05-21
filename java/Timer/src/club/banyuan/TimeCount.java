package club.banyuan;

public class TimeCount implements Timer {
   private long startTime = 0;
   private long endTime = 0;
   private long totalTime=0;
   boolean isStart=false;
    @Override
    public void start() throws IllegalStateException {

        if(isStart ){
            throw new IllegalStateException();
        }
        startTime = System.currentTimeMillis();
        isStart=true;
    }

    @Override
    public void stop() throws IllegalStateException {
        if(isStart){
            throw new IllegalStateException();
        }
        endTime = System.currentTimeMillis();
        isStart=true;
    }

    @Override
    public void reset() {
       startTime=0;
       endTime=0;
       totalTime=0;
    }

    @Override
    public long getTimeMillisecond() {
        totalTime = endTime - startTime;
        return totalTime;
    }


}
