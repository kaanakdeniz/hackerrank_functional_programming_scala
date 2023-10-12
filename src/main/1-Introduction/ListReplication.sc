// https://www.hackerrank.com/challenges/fp-list-replication/problem

import scala.collection.mutable.ListBuffer

def f(num_of_replication: Int, list: List[Int]): List[Int] = {
  val result = new ListBuffer[Int]
  list.foreach(i => result ++= List.fill(num_of_replication)(i))
  result.toList
}

def f2(num_of_replication: Int, list: List[Int]): List[Int] = {
  list.flatMap(i => List.fill(num_of_replication)(i))
}

def f3(num_of_replication: Int, list: List[Int]): List[Int] = {
  list.flatMap(List.fill(num_of_replication)(_))
}

def f4(num_of_replication: Int, list: List[Int]) = {
  val replicatedLists = list.map(i => List.fill(num_of_replication)(i))
  List.concat(replicatedLists).flatten
}

f(5, List(1, 2, 3))
f2(5, List(1, 2, 3))
f3(5, List(1, 2, 3))
f4(5, List(1, 2, 3))


