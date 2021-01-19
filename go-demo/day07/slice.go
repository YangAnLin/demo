package main

import "fmt"

/**
切片:
Go 语言切片是对数组的抽象。 Go 数组的长度不可改变，在特定场景中这样的集合就不太适用，Go中提供了一种灵活，功能强悍的内置类型切片("动态数组"),与数组相比切片的长度是不固定的，可以追加元素，在追加时可能使切片的容量增大
 */
func main() {


	define()
}

func define() {

	var identifier []int
	fmt.Println("空数组",identifier)

	var slice1 []int = make([]int, 10)
	fmt.Println("切片",slice1)

	i0 := slice1[0]
	i1 := slice1[1]
	i2 := slice1[2]
	i3 := slice1[3]
	fmt.Println("通过索引,获取值",i0,i1,i2,i3)

	// 修改切片
	for i := 0 ;i< len(slice1);i++ {
		slice1[i] = i
	}
	fmt.Println("修改完切片::",slice1)

	fmt.Println("获取切片区间1:",slice1[0:2])
	fmt.Println("获取切片区间2:",slice1[5:])
	fmt.Println("获取切片区间3:",slice1[:5])

	slice1 = append(slice1, 10,11,12)
	fmt.Println("追加完切片::",slice1)

	slice2 := make([]int,len(slice1),cap(slice1)*2)
	fmt.Println("创建个容量是原来容量两位的数组:",slice2)

	number := copy(slice2,slice1)
	fmt.Printf("slice:%v\n,slice2:%v\n,number:%v\n:",slice1,slice2,number)



}

