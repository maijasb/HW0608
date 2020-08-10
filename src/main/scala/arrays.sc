var myArr = Array(1,2,3,5,6)
println(myArr.length)
myArr.getClass
myArr(0)
myArr(1)
myArr.last
myArr.drop(1) //drops first
myArr.drop(2) //drops first two
myArr(3) = 9000
myArr :+ 555 //adds new item to array

myArr = myArr :+555 //overwrites array, adds new item
//myArr = Array("Valdis", "Peteris", "Zigis") //does not work, type mismatch

myArr :++ Array(5,7,8) //adds to array

val insertedArr = myArr.slice(0,3) :++ Array(10,20,30) :++ myArr.slice(3,5)
insertedArr.contains(10)
insertedArr.indexOf(10)
insertedArr.foreach(println)

