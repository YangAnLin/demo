package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {

	//method1()

	method2()
}

func method1() {
	var x int
	var y float64
	fmt.Println("请输入一个整数，一个浮点类型：")
	//读取键盘的输入，通过操作地址，赋值给x和y   阻塞式
	fmt.Scanln(&x, &y)
	fmt.Printf("x的数值：%d，y的数值：%f\n", x, y)

	// 需要多输入个逗号
	fmt.Scanf("%d,%f", &x, &y)
	fmt.Printf("x:%d,y:%f\n", x, y)

}

func method2() {

	fmt.Println("请输入一个字符串")

	reader := bufio.NewReader(os.Stdin)

	s1, nil := reader.ReadString('\n')
	fmt.Println(s1, nil)

}
