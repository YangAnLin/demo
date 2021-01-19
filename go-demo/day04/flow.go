package main

import (
	"bufio"
	"fmt"
	"os"
)

/**
if和switch
*/
func main() {

	//method_if()

	//method_if2()

	method_switch()

}

func method_if() {

	reader := bufio.NewReader(os.Stdin)
	str, _ := reader.ReadString('\n')

	if str == "" {
		fmt.Println("空的")
	}

	fmt.Printf("输入的值是:%s\n", str)

}

func method_if2() {

	if num := 10; num%2 == 0 { //checks if number is even
		fmt.Println(num, "is even")
	} else {
		fmt.Println(num, "is odd")
	}

}

func method_switch() {

	num := 1
	result := -1

	switch num {
	case 1:
		result = 1
	case 2, 3, 4:
		result = 2
	default:
		result = -2

	}

	fmt.Println(result)

}
