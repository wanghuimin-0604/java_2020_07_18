package com.company;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-18
 * Time:19:39
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] strx=str.split(";");
            Point start=new Point();
            for(int i=0;i<strx.length;i++){
                if(strx[i].length()<=3&&strx[i].length()>1){
                    if (strx[i].charAt(0) == 'A' || strx[i].charAt(0) == 'W' || strx[i].charAt(0) == 'S' || strx[i].charAt(0) == 'D') {
                        String num=strx[i].substring(1);
                        int len=num.length();
                        if(len-num.replaceAll("[^0-9]","").length()==0){
                            start=Direction(strx[i],start);
                        }
                    }
                }
            }

            System.out.println(start.x+","+start.y);
        }
    }
    public static Point Direction(String str,Point start){
        if(str.charAt(0)=='A'){
            start.x=start.x-Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='W'){
            start.y=start.y+Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='S'){
            start.y=start.y-Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='D'){
            start.x=start.x+Integer.parseInt(str.substring(1));
        }
        return start;
    }
}
class Point {
    int x;
    int y;

}