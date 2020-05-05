package main

/*
Variables must be used in Go when declared, otherwise it will give error

// Default values for type:  int is 0 and string is an empty string
 */
import "fmt"
 func main() {
 	// This is how the data type is declared.
	 var name string = "John Heller"
	 fmt.Println(name)

	 var oceanName  string
	 oceanName = "Atlantic"
	 fmt.Println(oceanName)

	 // When the data type is not defined
	 grade := "A+" // This is mostly used when getting inputs and don't know which data type is coming
	 fmt.Println(grade)

	 GPA := 3.997

	 fmt.Printf(grade, GPA)


	 // Multiple variables in one line
	 var student, testName string = "Ethan Chedda", "SAT"
	 fmt.Println(student, testName)


	 var num int = 34
	 var num2 float64 = 45.67
	 fmt.Println(num, num2)

	 // Declaring multiple variables with ().
	 var(
		 criminalName = "Jose Buendia"
		 age = 36
		 reason = "Rape"
		 sentenceLength = 15
	 )
	 fmt.Println(criminalName, age, reason, sentenceLength)
 }
