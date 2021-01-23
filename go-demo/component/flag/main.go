package main

/**
第一参数指定参数名叫什么；第二个参数是启动程序是没有指定参数时设置成这个值；第三个参数是描述这个参数的，运行-help时显示出来；返回值是一个指向参数内容的指针（获取内容时记得带上*）。

要在执行完flag.Parse()这个函数，命令参数才能解析出来，不然访问变量只会得到默认值。

除了flag.Int()这个函数，还有其他与基本类型对于的函数，如与string对应的flag.String()、与uint64对应的flag.Uint64()等等。参数和上面的flag.Int()是一样的，只不过是类型不同罢了。

*/
import (
	"flag"
	"fmt"
)

// 定义命令行参数对应的变量，这三个变量都是指针类型
var cliName = flag.String("name", "jorden", "Input Your Name")
var cliAge = flag.Int("age", 28, "Input Your Age")
var cliGender = flag.String("gender", "male", "Input Your Gender")

// 定义一个值类型的命令行参数变量，在 Init() 函数中对其初始化
// 因此，命令行参数对应变量的定义和初始化是可以分开的
var cliFlag int

func Init() {
	flag.IntVar(&cliFlag, "flagname", 1234, "Just for demo")
}

func main() {
	// 初始化变量 cliFlag
	Init()
	// 把用户传递的命令行参数解析为对应变量的值
	flag.Parse()

	// flag.Args() 函数返回没有被解析的命令行参数
	// func NArg() 函数返回没有被解析的命令行参数的个数
	fmt.Printf("args=%s, num=%d\n", flag.Args(), flag.NArg())
	for i := 0; i != flag.NArg(); i++ {
		fmt.Printf("arg[%d]=%s\n", i, flag.Arg(i))
	}

	// 输出命令行参数
	fmt.Println("name=", *cliName)
	fmt.Println("age=", *cliAge)
	fmt.Println("gender=", *cliGender)
	fmt.Println("flagname=", cliFlag)
}
