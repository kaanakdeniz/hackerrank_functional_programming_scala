// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

import scala.collection.mutable.ListBuffer

def f(arr: List[Int]): List[Int] = {
  val list = new ListBuffer[Int]
  val indices = arr.indices.filter(x => x % 2 != 0)
  indices.foreach(x => list.append(arr(x)))
  list.toList
}

def f1(list: List[Int]): List[Int] = {
  list.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
}

// f1 without shorthands
def f2(list: List[Int]): List[Int] = {
  val indexedList = list.zipWithIndex
  val filteredList = indexedList.filter { case (element, index) => index % 2 != 0 }
  filteredList.map { case (element, index) => element }
}

f(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
f1(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
f2(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
