package main

/**
变量
第一种，指定变量类型，声明后若不赋值，使用默认值
var name type
name = value

第二种，根据值自行判定变量类型(类型推断Type inference)
var name = value

第三种，省略var
name := value

1. 侧的变量不应该是已经声明过的
2. 多个变量同时声明时，至少保证一个是新变量
3. 只能被用在函数体内，而不可以用于全局变量的声明与赋值

*/

// 只能被用在函数体内，而不可以用于全局变量的声明与赋值,报错
var a string = "anthony"

//b := 23

func main() {

	//method1()
	//method2()
	//method3()

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
