package StackAndQueues.Medium;

public class Circular_tour {
    int tour(int p[], int d[])
    {
        int petrolneed =0;
        int diff =0;
        int s =0;
        for(int i=0;i<p.length;i++){
            diff = diff + p[i]-d[i];

            if(diff<0){
                s = i + 1;
                petrolneed += diff;
                diff =0;
            }
        }

        if(diff+petrolneed >=0) return s;

        return -1;


    }
}
