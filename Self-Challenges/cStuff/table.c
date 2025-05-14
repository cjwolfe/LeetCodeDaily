#include <stdio.h>

/* Prints Farenheit-celsius table
    for fahr = 0, 20, ... 300 */
int main()
{
    int fahr, celsius;
    int lower, upper, step;

    lower = 0;      /* lower limit of temperature table */
    upper = 300;    /* upper limit of temperature table */
    step = 20;      /* step size */

    fahr = lower;
        printf("Farenheit\tCelsius\t\n");


    while( fahr <= upper){
        celsius = 5*(fahr-32)/9;
        
        printf("%d\t%d\t\n", fahr, celsius);
        fahr = fahr + step;

    
    
    }

    float fahr2, celsius2;
    fahr2 = lower;

    printf("Farenheit\tCelsius\tFloating\n");

    /* updated for floating point*/
    while (fahr2 <= upper){
        celsius2 = 5.0 * (fahr2 - 32.0) / 9.0;
        printf("%3.0f\t%6.1f\t\n", fahr2, celsius2);    
        fahr2 = fahr2 + step;
    
    }


}