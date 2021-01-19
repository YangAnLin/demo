package main

import "fmt"

func main() {

	name := "Hello World"

	for index := range  name {
		fmt.Println("遍历字符串:%s,%s",index,name[index])
	}

}
