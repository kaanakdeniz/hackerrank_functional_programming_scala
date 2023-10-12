// https://www.hackerrank.com/challenges/eval-ex/problem

import scala.annotation.tailrec

def factorial(n: Int): Int = {
  if (n == 0)
    1
  else
    n * factorial(n - 1)
}

def power(x: Double, n: Int): Double = {
  if (n == 0)
    1
  else
    x * power(x, n - 1)
}

def exp(x: Double): Double = {
  def loop(x: Double, i: Int): Double = {
    if (i == 0) 1 else power(x, i) / factorial(i) + loop(x, i - 1)
  }

  loop(x, 9)
}

def exp2(x: Double): Double = {
  @tailrec
  def loop(x: Double, i: Int, acc: Double): Double = {
    if (i == 0) acc else loop(x, i - 1, acc + power(x, i) / factorial(i))
  }

  loop(x, 9, 1)
}


power(3, 2)
factorial(5)
exp(20)
exp2(20)
BigDecimal(exp(20)).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble
"%.4f".format(exp(20)).toDouble