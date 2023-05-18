package dataStructure.matrix


fun main(){
    var matrix = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    for (row in matrix){
        print(row.contentToString())
    }
}