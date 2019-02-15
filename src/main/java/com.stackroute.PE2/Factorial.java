package com.stackroute.PE2;

public class Factorial {

    public long longFactorial(int input) {
    if(input==0 || input==1)
        return 1;
    else if(input<0)
    return 0;
    else if(input<=12)
        return input*longFactorial((input)-1);
    else
        return 0;

    }

}
