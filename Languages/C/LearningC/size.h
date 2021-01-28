//
// Created by Zakir Hossain on 1/27/21.
//

#ifndef LEARNINGC_SIZE_H
#define LEARNINGC_SIZE_H

#endif //LEARNINGC_SIZE_H

int sizeInt(int a[]){
    return sizeof(a)/sizeof(a[0]);
}

int sizeChar(char a[]){
    return (int) sizeof(a)/sizeof(a[0]);
}

int sizeDouble(double a[]){
    return (int) sizeof(a)/sizeof(a[0]);
}

int sizeFloat(float a[]){
    return (int) sizeof(a)/sizeof(a[0]);
}