package main

import "fmt"

// 只能被用在函数体内，而不可以用于全局变量的声明与赋值,报错
var a string = "anthony"

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

func method4() {
	// 不赋值,存在默认值
	var age, age2, age3 int
	println("不赋值,就打印默认值:", age, age2, age3)
}

func method5() {
	var age, name = 10, "anthony"
	println("可以声明不同类型,只能自动推导,不能定义类型:", age, name)

	// 报错,多变量赋值值,不能声明类型
	//var age2 int,name2 string = 10, "anthony"
	//println(age2,name2)
}

func method6() {

	var (
		age  int    = 23
		name string = "anthony"
		sex  bool
	)

	println("使用集合的方式声明变量,可以声明不同类型,并且可以赋值", age, name, sex)

}

func method1() {
	var age int
	age = 1
	println("指定数组类型:", age)
}

func method2() {
	var name = "anthony"
	print("类型推导:", name)
}

func method3() {
	var name string = "anthony"

	// 报错,前面已经声明过了
	//name := "anthony2"

	// 正确的,前面没有声明过
	name2 := "anthony2"

	// 多个变量同时声明时，至少保证一个是新变量
	x, y := 1, 2
	// 正确的
	x, z := 3, 4
	// 报错了
	//x,z := 3,4

	println("简短声明:", name)
	println("简短声明,只能声明前面没有声明过的变量:", name2)
	println("多个变量声明时候,至少有一个是新变量:", x, y, z)

}
