// https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem
// https://www.youtube.com/watch?v=JdT7kYMk4s4 - Diskler metodu

val step = 0.001

def f(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  coefficients.zip(powers).map { case (c, p) => c * math.pow(x, p) }.sum
}


def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  val r = f(coefficients, powers, x)
  r * r * math.Pi
}


def summation(func: (List[Int], List[Int], Double) => Double,
              upperLimit: Int, lowerLimit: Int,
              coefficients: List[Int], powers: List[Int]): Double = {
  (BigDecimal(lowerLimit) to upperLimit by step).map(x => func(coefficients, powers, x.toDouble)).sum * step
}

summation(area, 4, 1, List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10))