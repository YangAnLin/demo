package main

import (
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

func initDb() gorm.DB {
	dsn := "root:123456@tcp(192.168.0.131:3306)/gorm?charset=utf8mb4&parseTime=True&loc=Local"
	db, err := gorm.Open(mysql.Open(dsn), &gorm.Config{})

	if err != nil {
		panic("failed to connect database")
	}

	return *db
}

func main() {
	db := initDb()

	// demo
	// quickStart(db)

	// 创建一条记录
	Create(db)
}
