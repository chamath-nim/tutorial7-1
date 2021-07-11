package com.company;
public class menu {
    private String[] name={"Dawid Malan","Aaron Finch","Babar Azam","Devon Conway","Virat Kohli","Lokesh Rahul","Glenn Maxwell","Rassie van der Dussen","Evin Lewis","Martin Guptill",};
    private int[] age = {33,34,26,31,32,28,31,32,27,34};
    private double[] statistics = {900,2200,2550,700,3100,1990,980,843,745,1875};
    private int[] bestperformance = {90,175,99,52,95,88,70,52,78,101};
    private int nn;
    public menu(int nn){
        this.nn = nn;
    }

    public void viewplayerdetails(){
        System.out.println(name[nn-1]);
        System.out.println(age[nn-1]);
        System.out.println(statistics[nn-1]);
    }

    public void getbattingaverage(){
        double average;
        average = statistics[nn-1]/15;
        System.out.println(average);
    }

    public  void getbestperformance(){
        System.out.println(bestperformance[nn-1]);
    }
}
