// https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem

def f(n: Int): List[Int] = {
  List.fill(n)(1)
}

def f2(n: Int): List[Int] = {
  List.range(1, n + 1)
}

def f3(n: Int): List[Int] = {
  (0 until n).toList
}

def printList(list: List[Int]): Unit = {
  println(list.mkString("[", ", ", "]"))
}

f(4)
f2(4)
f3(4)
printList(f(4))