package main

import "fmt"

func main(){
	fmt.Println("Hello")

	var batman string = "I am batman"
	fmt.Println(batman)

	var superman  string
	superman = "I am superman"
	fmt.Println(superman)

	thor := "I am thor"

	thorRating := 3

	fmt.Printf("%v, %T", thorRating, thor)

	var Ironman, CatAmerica  string = "I am Ironman", " I am Captain America"
	fmt.Println(Ironman, CatAmerica)

	var defaultValue int 
	fmt.Println(defaultValue)

	var(
		spiderman = "I am spiderman"
		age = 18
		power = "Web slings"
		antman = "I am antman"
	)
	fmt.Println(spiderman, age, power, antman)
}