#include <stdio.h>
#include<string.h>
#include<ctype.h>

// imports standard libraries for io, string, and character type

int lengthOfLastWord(const char* s){
    int length = 0;
    int i = strlen(s) -1;
    //This gets the total number of characters in the string
    //compare to s.length() in Java

    // 1. Skip Trailing spaces from the end
    //compare to trim() in java
    while (i >= 0 && s[i] == ' '){
        i--;
    }

    // 2. Count the length of the last word, moving
    // backwards until we find a space or the beginning of the string,
    // summing characters of the last word.
    while (i >= 0 && s[i] != ' '){
        length++;
        i--;
    }

    // return the count of characters found in the last word
    return length;
}

int main(){
    char input[] = "   fly me   to   the moon  ";
    printf("Length of last word: %d\n", lengthOfLastWord(input)); //output: 4
    return 0;

}