package main

import "fmt"

type Books struct {
	title string
	author string
	subject string
	book_id int
}

type Library struct {
	// 匿名字段，那么默认Student就包含了Human的所有字段
	Books

	address string
}

func main() {

	var book Books

	/* book 1 描述 */
	book.title = "Go 语言"
	book.author = "www.runoob.com"
	book.subject = "Go 语言教程"
	book.book_id = 6495407

	/* 打印 Book1 信息 */
	fmt.Printf( "Book 1 title : %s\n", book.title)
	fmt.Printf( "Book 1 author : %s\n", book.author)
	fmt.Printf( "Book 1 subject : %s\n", book.subject)
	fmt.Printf( "Book 1 book_id : %d\n", book.book_id)
	fmt.Println( "=========================================")

	// 结构体指针
	var struct_pointer *Books
	struct_pointer = &book
	printBook(struct_pointer)

	// 初始化一个图书馆
	mark := Library{Books{"Go 语言","www.runoob.com","Go 语言教程",6495407},"广东"}
	// 我们访问相应的字段
	fmt.Println("His name is ", mark.title)
	fmt.Println("His age is ", mark.author)
	fmt.Println("His weight is ", mark.subject)
	fmt.Println("His speciality is ", mark.address)
	// 修改对应的备注信息
	mark.title = "AI"
	fmt.Println("Mark changed his speciality")
	fmt.Println("His speciality is ", mark.title)
}

func printBook(book *Books) {
	fmt.Printf( "Book title : %s\n", book.title);
	fmt.Printf( "Book author : %s\n", book.author);
	fmt.Printf( "Book subject : %s\n", book.subject);
	fmt.Printf( "Book book_id : %d\n", book.book_id);
}
