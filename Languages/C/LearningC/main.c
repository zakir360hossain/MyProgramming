#include <stdio.h>

#include "variablesAndSpecifers.h"
#include "loops.h"

int main() {
    printf("Hello, World!\n");

    variablesAndSpecifiers();

    int a[] = {1, 3, 4, 5};
    printf("\n%d", sizeInt(a));
    int max = maxIndex(a, sizeInt(a));
    printf("\n%d", max);
    return 0;       
}
