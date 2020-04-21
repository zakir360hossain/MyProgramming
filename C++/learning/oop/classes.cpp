#include <iostream>
#include <string>
#include <vector>
#include <ctime>
#include <numeric>
#include <math.h>

using namespace std;

class Animal{
private:
  string name;
  double height;
  double weight;

  static int numOfAnimals;

public:
  // Default constructor
  Animal(){
    name = "";
    height = 0;
    weight = 0;
    numOfAnimals++;
  }
  // Parameter constructor
  Animal(string name, double height, double weight){
    this-> name = name;
    this-> height = height;
    this-> weight = weight;
    Animal::numOfAnimals++;
  }
  // Deconstructor
  ~Animal(){
    cout << "Animal "<< name <<" is destroyed!" << '\n';
  }

  string getName(){return name;}
  void setName(string name){this-> name = name;}

  double getHeight(){return height;}
  void setHeight(double height){this-> height = height;}

  double getWeight(){return weight;}
  void setWeight(double weight){this-> weight = weight;}

  void setAll(string name, double height, double weight){
    this-> name = name;
    this-> height = height;
    this-> weight = weight;
    Animal::numOfAnimals++;
    }

  static int getNumOfAnimals(){return numOfAnimals;}

  void toString(){
    cout << name <<height<<weight<< '\n';
  }
};



int main() {
 Animal tiger("Sprinter", 56, 5687);
  tiger.toString();
  return 0;
}
