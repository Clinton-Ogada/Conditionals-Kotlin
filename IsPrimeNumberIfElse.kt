fun main() {
    /*This is a program that determines whether a number between 1 and 10 is a prime numbe*/
    val number = 7 // Replace 7 with the number you want to check for primality
    
    // Check if the number is divisible by any integer between 2 and the number itself (excluding 1 and the number itself)
    val isPrime = (2 until number).none { number % it == 0 }
    
    // Output the result
    if (isPrime && number > 1) {
        println("$number is a prime number")
    } else {
        println("$number is not a prime number")
    }
}
