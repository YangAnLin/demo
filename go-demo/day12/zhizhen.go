package main

import "fmt"

func main() {

	// 声明变量
	var a int = 10

	// 声明指针
	var ip *int

	// 指针变量的存储地址
	ip = &a
	fmt.Printf("a变量的地址是:%x ,ip的值是:%x \n", &a, ip)

	// 访问指针的的值
	fmt.Printf("指针ip的访问值:%d \n", *ip)

	// 操作指针改变变量的值
	*ip = 11
	fmt.Printf("操作指针改变变量的值:%d ,%d \n", *ip, a)

	// 传递参数是指针
	change(ip)
	fmt.Printf("传递参数是指针:%d ,%d \n", *ip, a)

}

func change(val *int) int {
	*val = 14
	return 1
}
