package Intervals;

//https://www.codewars.com/kata/52b7ed099cdc285c300001cd/train/java


import java.util.ArrayList;
import java.util.Iterator;

public class Intervals1 {

    public static int sumIntervals(int[][] intervals) {
        int[][] finalIntervals;

        if (intervals != null){
            finalIntervals = removeOverlapping(intervals);
        }else{
            finalIntervals = new int[0][2];
        }

        int finalLength = 0;

        for (int[] interval : finalIntervals) {
            finalLength+= (interval[1] - interval[0]);
        }

        return finalLength;
    }

    private static int[][] removeOverlapping(int[][] intervals){
        ArrayList<Integer[]> resultList = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval == null || interval[0] == interval[1]){ continue;}

            addInterval(resultList, interval);
        }

        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[]{ resultList.get(i)[0], resultList.get(i)[1]};
        }

        return result;
    }

    private static void addInterval(ArrayList<Integer[]> list, int[] interval){
        Iterator<Integer[]> iteranator = list.iterator();
        Integer[] intervalToAdd = new Integer[]{ interval[0], interval[1]};

        while(iteranator.hasNext()){
            Integer[] intervalMember = iteranator.next();

            if (EstaDentroDe(intervalToAdd, intervalMember)){ 
                return;
            }else if (EstaDentroDe(intervalMember, intervalToAdd)){
                iteranator.remove();
            }else if (intervalToAdd[0] <= intervalMember[0] && intervalToAdd[1] > intervalMember[0]){ 
                iteranator.remove();
                intervalToAdd = new Integer[]{intervalToAdd[0], intervalMember[1]};
            }else if (intervalToAdd[0] < intervalMember[1] && intervalToAdd[1] >= intervalMember[1]){
                iteranator.remove();
                intervalToAdd = new Integer[]{ intervalMember[0], intervalToAdd[1]};
            }
        }

        list.add(intervalToAdd);
    }

    private static boolean EstaDentroDe(Integer[] interval1, Integer[] interval2) {
        return interval2[0] <= interval1[0] && interval2[1] >= interval1[1];
    }

    public static void main(String[] args) {
        System.out.println(Intervals1.sumIntervals(new int[][]{
                        {1,4},{3,6},{2,8}
        }));

    }
}
