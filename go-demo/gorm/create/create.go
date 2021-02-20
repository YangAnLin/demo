package create

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
func CreateOne(db gorm.DB) {

	// 迁移 schema
	db.AutoMigrate(&User{})

	user := User{Name: "Jinzhu", Age: 18, Birthday: time.Now()}

	result := db.Create(&user) // 通过数据的指针来创建
	// 返回逐渐
	fmt.Println(user.ID)
	fmt.Println(result.Error)
	// 影响行数
	fmt.Println(result.RowsAffected)

}
