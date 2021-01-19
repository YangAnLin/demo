package main

import "fmt"

/**
常量
*/
func main() {

	method7()
	method8()
	//method9()

}

func method7() {
	const LENGTH int = 10
	const WIDTH int = 5
	var area int

	area = LENGTH * WIDTH
	fmt.Println("面积是:", area)

}

/**
常量可以作为枚举，常量组
*/
func method8() {

	const (
		RED   = 1
		BLACK = 2
		WHITE = 3
	)

	const (
		x int = 16
		y
		s = "abc"
		z
	)

	fmt.Println(RED, BLACK, WHITE)
	fmt.Println("常量组中如不指定类型和初始化值，则与上一行非空常量右值相同:", x, y, s, z)

}
