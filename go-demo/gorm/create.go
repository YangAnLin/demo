package main

import (
	"fmt"
	"time"

	"gorm.io/gorm"
)

type User struct {
	ID       int
	Name     string
	Age      int
	Birthday time.Time
}

// 包中，通过标识符首字母是否大写，来确定是否可以被导出
func Create(db gorm.DB) {

	//createOne(db)

	//createBySpecialFile(db)

	//createBatch(db)

	//createBatchByNumber(db)

	createMap(db)

}

// 用指定的字段创建记录
func createBySpecialFile(db gorm.DB) {

	user := User{
		Name:     "anthony",
		Age:      12,
		Birthday: time.Now(),
	}
	db.Select("Name", "Age", "Birthday").Create(&user)

}

// 创建一条记录
func createOne(db gorm.DB) {
	// 创建包
	_ = db.AutoMigrate(&User{})

	// 创建一条记录
	user := User{Name: "Jinzhu", Age: 18, Birthday: time.Now()}
	result := db.Create(&user) // 通过数据的指针来创建
	if result.Error != nil {
		panic("插入数据报错")
	}

	// 返回主键
	fmt.Println(user.ID)
	// 影响行数
	fmt.Println(result.RowsAffected)
}

// 批量插入
func createBatch(db gorm.DB) {
	var list = []User{
		{
			Name:     "anthony",
			Birthday: time.Now(),
		},
		{
			Name:     "anthony2",
			Birthday: time.Now(),
		},
	}

	db.Create(&list)

	for _, user := range list {
		fmt.Printf("批量插入,返回的主键ID: %v \n", user.ID)
	}

}

// 没看懂意思
// 批量插入,指定数量
func createBatchByNumber(db gorm.DB) {

	var users = []User{
		{
			Name:     "anthony01",
			Birthday: time.Now(),
		},
		{
			Name:     "anthony02",
			Birthday: time.Now(),
		},
		{
			Name:     "anthony03",
			Birthday: time.Now(),
		},
	}

	// 数量为 100
	db.CreateInBatches(users, 2)

	for _, user := range users {
		fmt.Printf("批量插入指定数量,返回主键Id:%v \n", user.ID)
	}

}

// 创建钩子
// User对象的钩子
func (user *User) BeforeCreate(db *gorm.DB) {
	fmt.Printf("User对象的钩子,创建记录前打印")
	//return nil, nil
}

// 用map创建
func createMap(db gorm.DB) {
	// 可以批量,也可以单条插入
	db.Model(&User{}).Create([]map[string]interface{}{
		{"Name": "anthonymap"},
		{"Name": "anthonymap2"},
	})
}

// 使用 SQL 表达式、Context Valuer 创建记录
// 不会,太难
func userSql(db gorm.DB) {

}

// 高级选项
// 关联创建
func advanceCrete(db gorm.DB) {

}
