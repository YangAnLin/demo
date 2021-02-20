package main

import (
	"bufio"
	"fmt"
	"net"
	"net/http"
)

type helloHandler struct{}

func (h *helloHandler) ServeHTTP(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte("Hello, world!"))
}

func demo() {
	http.Handle("/", &helloHandler{})
	http.ListenAndServe(":12345", nil)
}

func demo2() {
	listener, _ := net.Listen("tcp", "localhost:8849")

	for {
		conn, _ := listener.Accept()

		fmt.Fprintf(conn, "GET / HTTP/1.0\r\n\r\n")
		status, _ := bufio.NewReader(conn).ReadString('\n')
		fmt.Println(status)

	}
}

func main() {

	demo()
	demo2()

}
