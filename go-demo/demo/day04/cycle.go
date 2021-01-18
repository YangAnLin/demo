package main

import "fmt"

/**
没有while
*/
func main() {

	//demo()

	demo_break()

}

func demo_break() {

	for i := 0; i < 50; i++ {
		if i > 5 {
			break
		}
		fmt.Println(i)
	}

	fmt.Println("结束")
}

func demo() {
	for i := 0; i <= 10; i++ {
		fmt.Println(i)
	}
}
