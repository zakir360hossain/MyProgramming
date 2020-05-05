#include <iostream>
#include <string>
#include <vector>
using namespace std;
//
// Created by Zakir Hossain on 4/23/20.
//
// #ifndef CLASSES_ANIMAL_H
// #define CLASSES_ANIMAL_H

class Animal {

private:
string name;
double height;
double weight;
public:
// Default constructor
Animal(){
        name = "";
        height = 0;
        weight = 0;
}
// Parameter constructor
Animal(string name, double height, double weight){
        this->name = name;
        this->height = height;
        this->weight = weight;
}
// Deconstructor
// ~Animal(){
//   cout << "Animal "<< name <<" is destroyed!" << '\n';
// }

string getName(){
        return name;
}
void setName(string name){
        this->name = name;
}

double getHeight(){
        return height;
}
void setHeight(double height){
        this->height = height;
}

double getWeight(){
        return weight;
}
void setWeight(double weight){
        this->weight = weight;
}

void setAll(string name, double height, double weight){
        this->name = name;
        this->height = height;
        this->weight = weight;
}

void toString(){
        cout << "Name = " << name <<"\nHeight = "<< height <<"\nWeight = "<<weight;
}
};


int main() {
        Animal cat ("Tiger", 56, 5687);
        Animal cat2 ("Puma", 67, 456);
        cat.toString();
        cout <<"\n";
        cat2.toString();
        return 0;

}


// #endif //CLASSES_ANIMAL_H
