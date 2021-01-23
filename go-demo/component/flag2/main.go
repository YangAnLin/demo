package main

import (
	"flag"
	"fmt"
	"log"
	"os"
	"os/signal"
	"syscall"
)

func main() {

	var student struct {
		name string
	}

	flag.StringVar(&student.name, "name", "没有名字", "测试名字")

	flag.Parse()

	fmt.Println("输入的名字是", student.name)

	log.Fatal("123")

	sigCh := make(chan os.Signal, 1)
	signal.Notify(sigCh, syscall.SIGINT, syscall.SIGTERM)
	<-sigCh

}
