package main

import "fmt"

/**
iota，特殊常量，可以认为是一个可以被编译器修改的常量
1. 如果中断iota自增，则必须显式恢复。且后续自增值按行序递增
2. 自增默认是int类型，可以自行进行显示指定类型
3. 数字常量不会分配存储空间，无须像变量那样通过内存寻址来取值，因此无法获取地址
*/
func demo() {

	// 报错
	//a = iota

	const (
		a = iota //0
		b        //1
		c        //2
		d = "ha" //独立值，iota += 1
		e        //"ha"   iota += 1
		f = 100  //iota +=1
		g        //100  iota +=1
		h = iota //7,恢复计数
		i        //8
	)
	fmt.Println(a, b, c, d, e, f, g, h, i)
}
