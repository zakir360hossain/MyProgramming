//
// Created by Zakir Hossain on 1/27/21.
//

#ifndef LEARNINGC_LOOPS_H
#define LEARNINGC_LOOPS_H
#include "size.h"
#endif //LEARNINGC_LOOPS_H

int maxIndex(int a [], n){
    if(n <= 0) return -1;
    int i, max_i = 0;
    float max = a[0];
    for(i = 1; i < n; ++i){
        if(a[i] > max){
            max = a[i];
            max_i = i;
        }
    }
    return max_i;
}