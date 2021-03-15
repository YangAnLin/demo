package main

import "fmt"

/**
数组
 */

type fb func(x int) int

func main() {

	//create()

	//get()
}


func get() {

	list := [5]int{1,2,3,4,5}

	for i:=0;i< len(list);i++ {
		fmt.Println(i, "==", list[i])
	}

}

func create(){

	var numbers []int
	fmt.Println("新建个空数组:",numbers)

	var defaultcount [4]int
	fmt.Println("新建个指定大小的数组:",defaultcount)

	var balance =  []int{1,2,3,4,5}
	fmt.Println("新建个空数组:",balance)

	// 根据元素的个数，设置数组的大小
	d := [...] int{1,2,3,4,5}
	fmt.Println(d)

	// 指定位置
	e := [5] int{4: 100} // [0 0 0 0 100]
	fmt.Println(e)

	// 指定位置
	f := [...] int{0: 1, 4: 1, 9: 1} // [1 0 0 0 1 0 0 0 0 1]
	fmt.Println(f)

}