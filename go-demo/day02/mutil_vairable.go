package main

/**
多变量声明
第一种，以逗号分隔，声明与赋值分开，若不赋值，存在默认值
第二种，直接赋值，下面的变量类型可以是不同的类型
第三种，集合类型
*/

func main() {
	method4()
	method5()
	method6()
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
