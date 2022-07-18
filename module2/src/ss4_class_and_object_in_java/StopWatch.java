package ss4_class_and_object_in_java;

import javafx.scene.paint.Stop;

public class StopWatch {
    private long starTime, endTime;

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public StopWatch(){
        starTime = System.currentTimeMillis();
    }
    public void  start(){
        starTime = System.currentTimeMillis();
    }
    public void end(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-starTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long x = 0 ;
        for (long i = 0; i < 100000000 ; i++) {
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
