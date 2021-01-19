package main

import "fmt"

/**
没有while
*/
func main() {

	//demo()

	//demo_break()

	//demo_continue()

	demo_goto()

}

func demo_goto() {

	/* 定义局部变量 */
	var a int = 10

	/* 循环 */
LOOP:
	for a < 20 {
		if a == 15 {
			/* 跳过迭代 */
			a = a + 1
			goto LOOP
		}
		fmt.Printf("a的值为 : %d\n", a)
		a++
	}

}

func demo_continue() {

	for i := 1; i <= 10; i++ {
		if i%2 == 0 {
			continue
		}
		fmt.Printf("%d ", i)
	}
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
