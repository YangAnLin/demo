package main

import "fmt"

func demo() {

	a := 200
	b := 100
	var res int

	// 返回最大值
	res = max(a, b)
	fmt.Println("打印最大值", res)

	// 可变参数
	range_param(1, 2, 3, 4)

	// 值传递
	num := 2
	fmt.Printf("值传递,原来的值:%d\n", num)
	value_translate(2)
	fmt.Printf("值传递,改变的值:%d\n", num)

	// 引用传递
	c := 3
	fmt.Printf("引用传递,原来的值:%d\n", c)
	c1 := add(&c)
	fmt.Printf("引用传递,调用了方法,现在的值:%d\n", c1)
	fmt.Printf("引用传递,调用了方法,原来的值:%d\n", c)

	// 返回值指定变量名
	x, y := sum_product(1, 2)
	fmt.Printf("多个返回值,%d,%d", x, y)

	// 返回参数没有指定变量名
	i, j := sum_product2(1, 2)
	fmt.Printf("多个返回值,%d,%d", i, j)

}

func max(a int, b int) int {

	if a > b {
		return a
	} else {
		return b
	}
}

func range_param(arg ...int) {

	for x, y := range arg {
		fmt.Printf("可变参数打印:%d,%d\n", x, y)
	}
}

func value_translate(num int) {
	num = 10
}

func add(c *int) int {
	*c = *c + 1
	return *c
}

func sum_product(A, B int) (add int, Multiplied int) {
	add = A + B
	Multiplied = A * B
	return
}

func sum_product2(A, B int) (int, int) {
	return A + B, A * B
}
