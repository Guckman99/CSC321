//Eduardo Guzman

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
        int myNumbers [10];
        myNumbers [0] = 1;
        myNumbers [1] = 2;
        myNumbers [2] = 3;
        myNumbers [3] = 4;
        myNumbers [4] = 5;
        myNumbers [5] = 6;
        myNumbers [6] = 7;
        myNumbers [7] = 8;
        myNumbers [8] = 9;
        myNumbers [9] = 10;
        int j = 3;
        char myInitial = 'A';
        float myFloatNum = 3.33;
        double myDub = 33.3;

        printf("%d \n", myNumbers[5]);
        if(j > 1)
        {
                printf("Hello World \n");
        }
        else
        {
                puts("olleH dlroW");
        }
        if(myInitial == 'A')
        {
                printf("Hola Mundo \n");
        }
        else
        {
                puts("aloH odnuM");
        }
        if(myFloatNum == 3.33)
        {
                printf("Seahawks win the superbowl \n");
        }
        else
        {
                puts("Seattle are superbowl champs");
        }
        if(myDub == 33.3)
        {
                printf("Patriots lose the superbowl \n");
        }
        else
        {
                puts("Patriots got blew out");
        }

        return EXIT_SUCCESS;
}



