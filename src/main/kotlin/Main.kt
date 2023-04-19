fun main() {
//    Create a function that prints out all the odd numbers between 1 and 100
OddNumber()
    println(ArrayNum(arrayOf("hopperlab","code","cynthia",)))
    println(NamesArray(arrayOf("HobberLab", "wee", "ve", "Hey", "Ishimwe")))
   calculateSum(1..100)
}
fun OddNumber() {
    for (n in 1..100) {
        if (n % 2 != 0) {
            println(n)
        }
    }
}
//Create a function that takes in an array of names and returns a list of
//names longer than 5 characters
 fun ArrayNum(names: Array<String>): Int{
  var count = 0
    for (characters in names){
if (characters.length>5){
    count ++
}

    }
    return count

 }
//Create a function that takes in an array of names and returns a list of  strings with
//names longer than 5 characters
fun NamesArray(students: Array<String>) :List<String>{
    var newNames = mutableListOf<String>()
    for (n in students){
        if (n.length > 5){
            newNames.add(n)
        }
    }
 return newNames
}
//Write a program in Kotlin to calculate the sum of all even numbers between 1 and 100 using a for loop
fun calculateSum(names: IntRange){
    var sum = 0

    for (names in 1..100) {
        if (names % 2 == 0) {
            sum += names
        }

    }
   println(sum)
}