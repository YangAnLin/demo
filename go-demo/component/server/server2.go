package main

import (
	"bufio"
	"fmt"
	"net"
)

func main() {

	listener, _ := net.Listen("tcp", "localhost:8849")

	for {
		conn, _ := listener.Accept()

		fmt.Fprintf(conn, "GET / HTTP/1.0\r\n\r\n")
		status, _ := bufio.NewReader(conn).ReadString('\n')
		fmt.Println(status)

	}
}
