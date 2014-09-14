#include <stdio.h>

/* print Farenheit-Celsius table 
   for fahr = 0, 20, ..., 300; floating point version */

main()
{
    float fahr, celsius;
    int lower, upper, step;

    lower = 0;      /* lower limit of temprature table */
    upper = 90;   /* upper limit */
    step = 1;     /* step size */

    celsius = lower;
    
    printf("  Celcius   Fahr\n");
    while (celsius <= upper) {
        fahr = ((celsius * 9.0) / 5.0) + 32.0;
        printf("%6.0f %6.1f\n", celsius, fahr);
        celsius = celsius + step;
    }
}


