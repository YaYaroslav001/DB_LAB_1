import scala.util.Random

object Main extends App {

  val random = new Random()                           // Создание генератора списка чисел.
  val numbers = List.fill(20)(random.nextInt(20))     // Генерация списка чисел.
  val n = 10                                          // Количество суммируемых чисел.
  val sum = numbers.takeRight(n).sum                  // Вычисляем сумму последних 10 элементов списка
  println(s"Numbers list: $numbers")                  // Вывод списка чисел.
  println(s"Sum of last $n elements: $sum")           // Вывод суммы.
}