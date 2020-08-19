//
// Created by Zakir Hossain on 8/17/20.
//

#ifndef LEARNINGC_FUNCTIONS_H
#define LEARNINGC_FUNCTIONS_H

int max(int a, int b, int c){
    if (a>b && b>c){
        return a;
    }
    else if(b>a && a>c){
        return b;
    } else{
        return c;
    }
}


#endif //LEARNINGC_FUNCTIONS_H
