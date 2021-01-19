fun main (args: Array<String>) {
    fizzBuzz()
}
fun fizzBuzz() {
    print("Enter a number: ")
    val stringInput: String = readLine()!!
    var callNumber: Int = stringInput.toInt()
    if (callNumber % 3 == 0 && callNumber % 5 == 0) {
        println("FizzBuzz")
    } else if (callNumber % 3 == 0) {
        println("Fizz")
    } else if (callNumber % 5 == 0) {
        println("Buzz")
    } else {
        println("It's just a number $callNumber")
    }

}
