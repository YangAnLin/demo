package main

import "fmt"

type PersonMethod interface {
	show()
}

func show2(person PersonMethod) {
	person.show()
}

type Person struct {
	name string
	age  int
}

// 对象成员方法
func (person *Person) setAge(age int) {
	person.age = age
}

func (person Person) show() {
	fmt.Printf("Person类打印SHOW:%v\n", person)
}

type Student struct {
	// 匿名,相当于继承
	Person
	level string
}

func (student Student) show() {
	fmt.Printf("Student类打印SHOW:%v\n", student)
}

type Teacher struct {
	Person
	price int
}

func (teacher Teacher) show() {
	fmt.Printf("Student类打印SHOW:%v\n", teacher)
}

func main() {
	anthony := Person{"anthony", 25}
	fmt.Printf("anthony信息:%v\n", anthony)

	// 调用成员方法
	anthony.setAge(12)
	fmt.Printf("anthony信息:%v\n", anthony)

	anthony2 := Person{}
	fmt.Printf("anthony2信息:%v\n", anthony2)

	anthony2.age = 26
	anthony2.name = "anthony2"
	fmt.Printf("anthony2信息:%v\n", anthony2)

	// 学生,继承
	student := Student{}
	student.level = "小学生"
	student.name = "anthony"
	student.age = 23
	fmt.Printf("学生继承类:%v\n", student)

	// 老师,继承
	teacher := Teacher{price: 12, Person: Person{name: "li teacher", age: 56}}
	fmt.Printf("老师继承类:%v\n", teacher)

	show2(student)
	show2(teacher)
	show2(anthony)

}
