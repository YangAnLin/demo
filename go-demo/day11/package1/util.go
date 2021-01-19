package package1
/**
包中，通过标识符首字母是否大写，来确定是否可以被导出
 */
func Add(x,y int) int {
	return x+ y
}

func less(x,y int) int {
	res := x -y
	return res
}
