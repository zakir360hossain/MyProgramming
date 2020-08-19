//
// Created by Zakir Hossain on 8/18/20.
//
#ifndef LEARNINGC_TYPES_AND_FORMAT_SPECIFIERS_H
#define LEARNINGC_TYPES_AND_FORMAT_SPECIFIERS_H

#include <stdio.h>

int types_and_specifiers(){
    //Data types
    int a = 58;
    const int B = 67;
    double c = 34.5;
    float d = 34.5f;
    char e = 'A';
    char aString[] = "A piece of string";

    printf("%d %d %g %f %c %s", a, B, c, d, e, aString);
    return 0;
}
#endif //LEARNINGC_TYPES_AND_FORMAT_SPECIFIERS_H
