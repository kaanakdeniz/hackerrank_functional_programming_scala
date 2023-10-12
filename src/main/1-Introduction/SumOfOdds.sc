// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem

def f(list: List[Int]): Int = {
  list.filter(_ % 2 != 0).sum
}

def f2(list: List[Int]): Int = {
  list.foldLeft(0)((acc, x) => if (x % 2 != 0) acc + x else acc)
}


f(List(1, 2, 3, 4, 5))
f2(List(1, 2, 3, 4, 5))

