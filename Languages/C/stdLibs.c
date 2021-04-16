//
// Created by Zakir Hossain on 2/9/21.
//
#include <stdlib.h>
#include <stdio.h>

void randomNum();
int main(){

	randomNum();

	return 0;
}


void randomNum(){
    long num = random();
    printf("\n %li", num);
}


