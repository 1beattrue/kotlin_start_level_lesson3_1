import java.util.Collections.reverse

fun main() {
    // функциональное программирование
    val sum = { a: Int, b: Int -> a + b } // анонимная функция/lambda выражение
    // если мы хотим явно указать параметры и тип возвращаемого значения, используем следующий синтаксис
    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(2, 10))

    val square: (Int) -> Int = { a -> a * a }
    val square2: (Int) -> Int = { it * it } // компилятор автоматически называет переменную-параметр it
    println(square(2))

    // задание
    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(4, 6))

    val hello: (String) -> Unit = { println("Hello, $it") }
    hello("Max")

    val bubbleSort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val tmp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = tmp
                }
            }
        }
        it
    }
    val sortedArray = bubbleSort(arrayOf(6, 5, 4, 3, 2, 1, 6, 3, 4, 5, 3, 1, 4, 7, 5, 4))
    for (i in sortedArray) {
        print("$i ")
    }


}