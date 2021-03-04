package chapter5.SyntaxForLambdaExpressions

fun main(args: Array<String>) {
    val sum = {x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))
}

