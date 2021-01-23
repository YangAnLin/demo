package main

import (
	"bytes"
	"crypto/rand"
	"encoding/base64"
	"fmt"
	"io"
	"net"
	"os"
	"strings"
)

func main() {

	//test1()

	//test2()

	//test3()

	//test4()

	test5()

}

// io.copy
func test5() {

	proverbs := new(bytes.Buffer)
	proverbs.WriteString("Channels orchestrate mutexes serialize\n")
	proverbs.WriteString("Cgo is not Go\n")
	proverbs.WriteString("Errors are values\n")
	proverbs.WriteString("Don't panic\n")

	file, err := os.Create("./proverbs.txt")
	if err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
	defer file.Close()

	// io.Copy 完成了从 proverbs 读取数据并写入 file 的流程
	if _, err := io.Copy(file, proverbs); err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
	fmt.Println("file created")

}

func test4() {
	// 建立连接
	//conn, err := net.Dial("tcp", "rpcx.site:80")
	conn, err := net.Dial("tcp", "api.apiopen.top:80")
	if err != nil {
		fmt.Println("dial error:", err)
		return
	}
	defer conn.Close()
	// 发送请求, http 1.0 协议
	fmt.Fprintf(conn, "GET / HTTP/1.0\r\n\r\n")
	// 读取response
	var sb strings.Builder
	_, err = io.Copy(&sb, conn)
	if err != nil {
		fmt.Println("read error:", err)
	}
	// 显示结果
	fmt.Println("response:", sb.String())
	fmt.Println("total response size:", sb.Len())

}

// 读网络流
func test3() {

	// 建立连接
	conn, err := net.Dial("tcp", "rpcx.site:80")
	if err != nil {
		fmt.Println("dial error:", err)
		return
	}
	defer conn.Close()
	// 发送请求, http 1.0 协议
	fmt.Fprintf(conn, "GET / HTTP/1.0\r\n\r\n")
	// 读取response
	var sb strings.Builder
	buf := make([]byte, 256)
	for {
		n, err := conn.Read(buf)
		if err != nil {
			if err != io.EOF {
				fmt.Println("read error:", err)
			}
			break
		}
		sb.Write(buf[:n])
	}
	// 显示结果
	fmt.Println("response:", sb.String())
	fmt.Println("total response size:", sb.Len())

}

// 读文件
func test2() {

	file, err := os.Open("component/io/read.txt")
	defer file.Close()
	if err != nil {
		fmt.Println("打开文件read.txt 错误:", err)
	}

	data, err := ReadFrom(file, 1024)
	fmt.Printf("读取到的数据是：%s \n", data)

}

func ReadFrom(reader io.Reader, num int) ([]byte, error) {
	p := make([]byte, num)
	n, err := reader.Read(p)
	if n > 0 {
		return p[:n], nil
	}
	return p, err
}

func test1() {

	key := make([]byte, 123)
	io.ReadFull(rand.Reader, key)
	fmt.Println(base64.URLEncoding.EncodeToString(key))
}
