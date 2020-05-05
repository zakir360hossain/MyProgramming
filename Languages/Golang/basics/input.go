package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	// If it's just a simple one word or an integer input, then this works:
	var favoriteColor string
	fmt.Scanln(&favoriteColor)
	fmt.Println("Your name is "+ favoriteColor)


	var name string = "Zakir"
	var a, _ = fmt.Println(name) // the underscore is used to circumvent error
	fmt.Println(a)


	reader := bufio.NewReader(os.Stdin) // Standard input
	fmt.Println("Enter your full name")
	my_name, _ := reader.ReadString('\n')
	fmt.Println(my_name)

	fmt.Println("Enter your rating")
	rating, _ := reader.ReadString('\n')
	myRating, _ := strconv.ParseFloat(strings.TrimSpace(rating), 64) // Needed to do this because of adding 2.
	fmt.Println(myRating+2)

}
