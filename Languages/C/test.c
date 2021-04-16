#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/time.h>
#include <time.h>
#include <pthread.h>

// void systemClear(){
// 	// System clear
// 	for(int i = 1; i<100; i++){
//     	system("clear");
//     	printf("%d : %d\n", i, i*i);
//     	printf("%d : %d\n", i, i*i);
//     	printf("%d : %d", i, i*i);
//     	usleep(100000);
//     }
// }


// int main(){

//     // systemClear();

// 	//Random integer of 0 or 1
// 	int a;
// 	for (size_t i = 0; i < 10; i++)
// 	{
// 		a = (int)(((double)rand() / (double)RAND_MAX)*2);
// 		printf("%d\n", a);
// 	}

// 	int* matrix = malloc(sizeof(int) *10 *100);

// 	for (size_t i = 0; i < 10; i++)
// 	{
// 		for (int j = 0; j<10; j++){
// 			printf("%d\n", matrix[i*10+j]);
// 		}
// 	}

// 	printf("%d\n", -1%10);

// 	return 0;
// }

void foo(int *p, int *q, int r);

int main() {

   int array[5], *p_arr, i, x;

   p_arr = malloc(sizeof(int)*5);
   // assume malloc succeeds

   for(i=0; i < 5; i++) {
      p_arr[i] = i;
      array[i] = p_arr[i] + 1;
   }

   x = array[0];

   foo(p_arr, &x, array[1]);

   printf("x = %d\n", x);

   for(i=0; i < 5; i++) {
     printf("%d: %d\n", i, p_arr[i]);
   }

   return 0;
}
/*******************************/

void foo(int *p, int *q, int r) {          

   int temp;

   temp = p[3];
   p[3] = p[r] + 3;
   *q = *q + temp;

   return;  // TRACE TO HERE
}