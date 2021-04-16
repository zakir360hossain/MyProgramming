#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct studentT {
    char  name[64];
    int   age;
    float gpa;
    int   grad_yr;
};

struct personT {
    char *name;     // for a dynamically allocated string field
    int  age;
};



//LinkedList with structs
struct node {
    int data;           // used to store a list element's data value
    struct node *next;  // used to point to the next node in the list
};

/* function prototypes */
int checkID(struct studentT s1, int min_age);
void changeName(char *old, char *new);
void updateAges(struct studentT *classroom, int size);


int main(){
	int can_vote;
    // declare variables of struct type:
    struct studentT student1, student2;

    // access field values using .
    strcpy(student1.name, "Ruth");
    student1.age = 17;
    student1.gpa = 3.5;
    student1.grad_yr = 2021;

    // structs are lvalues
    student2 = student1;
    strcpy(student2.name, "Frances");
    student2.age = student1.age + 4;

    // passing a struct
    can_vote = checkID(student1, 18);
    printf("%s %d\n", student1.name, can_vote);

    can_vote = checkID(student2, 18);
    printf("%s %d\n", student2.name, can_vote);

    // passing a struct field value
    changeName(student2.name, "Kwame");
    printf("student 2's name is now %s\n", student2.name);




    struct studentT s;
	struct studentT *sptr;
        // malloc space for a struct student for sptr to point to:
    sptr = malloc(sizeof(struct studentT));
    if (sptr == NULL) {
        printf("Error: malloc failed\n");
        exit(1);
    }
	// the gpa field of what sptr points to gets 3.5:
	sptr->gpa = 3.5;

	// the name field of what sptr points to is a char *
	// (can use strcpy to init its value):
	strcpy(sptr->name, "Lars");

    // think very carefully about the type of each field when
    // accessing it (name is an array of char, age is an int ...)
    strcpy(s.name, "Freya");
    s.age = 18;
    s.gpa = 4.0;
    s.grad_yr = 2020;




    struct personT p1, *p2;
    // need to malloc space for the name field:
    p1.name = malloc(sizeof(char) * 8);
    strcpy(p1.name, "Zhichen");
    p1.age = 22;
    // first malloc space for the struct:
    p2 = malloc(sizeof(struct personT));
    // then malloc space for the name field:
    p2->name = malloc(sizeof(char) * 4);
    strcpy(p2->name, "Vic");
    p2->age = 19;



    struct studentT classroom1[40];   // an array of 40 struct studentT
    struct studentT *classroom2;      // a pointer to a struct studentT
    struct studentT *classroom3[40];  // an array of 40 struct studentT * (each element stores a (struct studentT *)
	
    classroom1[3].age = 21;
    classroom2 = malloc(sizeof(struct studentT) * 15);
    classroom2[3].grad_yr = 2013;
    classroom3[5] = malloc(sizeof(struct studentT));
    classroom3[5]->age = 21;

    updateAges(classroom1, 40);
    updateAges(classroom2, 15);



    

    //LinkedList with structs
    struct node *head, *temp;
    int i;

    head = NULL;  // an empty linked list

    head = malloc(sizeof(struct node));  // allocate a node
    if (head == NULL) {
        printf("Error malloc\n");
        exit(1);
    }
    head->data = 10;    // set the data field
    head->next = NULL;  // set next to NULL (there is no next element)

    // add 2 more nodes to the head of the list:
    for (i = 0; i < 2; i++) {
        temp = malloc(sizeof(struct node));  // allocate a node
        if (temp == NULL) {
            printf("Error malloc\n");
            exit(1);
        }
        temp->data = i;     // set data field
        temp->next = head;  // set next to point to current first node
        head = temp;   
    }
    
    return 0;
}

int checkID(struct studentT s, int min_age) {
    int ret = 1;

    if (s.age < min_age) {
        ret = 0;
        // changes age field IN PARAMETER COPY ONLY
        s.age = min_age + 1;
    }
    return ret;
}

void changeName(char *old, char *new) {
    if ((old == NULL) || (new == NULL)) {
        return;
    }
    strcpy(old,new);
}

void updateAges(struct studentT *classroom, int size) {
    int i;

    for (i = 0; i < size; i++) {
        classroom[i].age += 1;
    }
}