// https://www.hackerrank.com/challenges/fp-reverse-a-list/problem

def f(arr: List[Int]): List[Int] = arr.reverse

def f1(arr: List[Int]): List[Int] = {
  var result: List[Int] = Nil
  var these = arr
  while (these.nonEmpty) {
    result = these.head :: result
    these = these.tail
  }
  result
}

def f2(arr: List[Int]): List[Int] = {
  var result: List[Int] = Nil
  var these = arr
  while (these.nonEmpty) {
    result = these.take(1).concat(result)
    these = these.tail
  }
  result
}

f(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
f1(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
f2(List(1, 2, 3, 4, 5, 6, 7, 8, 9))