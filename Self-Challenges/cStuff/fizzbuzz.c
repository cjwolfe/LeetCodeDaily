#include <stdio.h>
#include <stdbool.h>

/* int setValue(n){
    //input value, returns value to variable;

}
 */
int main(){
    char fizz[] = "fizz";
    char buzz[] = "buzz";
    char zizz[] = "zizz";
    int f = 3;
    int b = 5;
    int z = 7;
    bool skipNumber = false;

    printf("Please enter your value for fizz\n");
    // f = setValue(stdin);
    // implement capture of input to f

    printf("Please enter your value for buzz\n");
    // b = setValue(stdin);
    // same capture of input to b


    for(int i = 1; i < 101; i++){


        if(i%f == 0){
            printf("%s",fizz);
            skipNumber = true;
        }
        if(i%b == 0){
            printf("%s",buzz);
            skipNumber = true;
        }
        if(i%z == 0){
            printf("%s",zizz);
            skipNumber = true;
        }
        if(skipNumber == false){
            printf("%d",i);
        }
        skipNumber = false;


        printf("\n");


    }
    return 0;

}