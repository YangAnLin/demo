package main

import "fmt"

func main() {

	keyvale := make(map[string]string)

	keyvale["k1"] = "v1"
	keyvale["k2"] = "v2"
	keyvale["k3"] = "v3"
	keyvale["k4"] = "v4"

	// 循环遍历
	for key:=range keyvale {
		fmt.Println("循环遍历:",key,keyvale[key])
	}

	// 删除元素
	delete(keyvale,"k1")
	for key:=range keyvale {
		fmt.Println("删除值之后,循环遍历:",key,keyvale[key])
	}

	// 查看元素是否存在
	_,ok := keyvale["United States"]
	if ok {
		fmt.Printf("存在\n")
	}else {
		fmt.Printf("不存在\n")
	}

	// 但是当key如果不存在的时候，我们会得到该value值类型的默认值，比如string类型得到空字符串，int类型得到0。但是程序不会报错
	m := make(map[string]int)
	m["a"] = 1
	x, ok := m["b"]
	fmt.Println(x, ok)

	// map长度
	fmt.Println("map长度",len(m))

	// map是引用类型
	mymap := map[string]int{
		"steven":12000,
		"anthony":15000,
	}
	mymap["mike"] = 9000
	fmt.Printf("原来的数据:%v\n",mymap)

	newmymap := mymap
	newmymap["anthony"] = 50000
	fmt.Printf("改变后,原来的数据:%v\n",mymap)
	fmt.Printf("改变后,新的的数据:%v\n",newmymap)
}
