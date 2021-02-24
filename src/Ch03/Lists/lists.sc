object lists {

  // how to creat list

  val empty: List[Nothing] = List()

  var a = List(3.0, "Hello")

  var x1 = List(1,2,3,4,5,6)

  var x2 = 1::2::3::4::5::6::Nil

  var x3 = List.range(10 , 20)

  var x4 = List.range(3 , 21, 3)

  // merge lists using :::

  var x5 = x1 ::: x3

  var x6 =  List.concat(x1, x3)

  var sum = 0
  x1.foreach(sum+=_)

  var colors = List("red", "orange", "blue")

  // list of tuples
  val pairs = List((1,4),(2,3),(0,5))
  for((a,b)<- pairs) yield a+b
  
}

lists.x1
lists.x2

lists.x5

lists.x5 == lists.x6

List.equals(lists.x5, lists.x6)

lists.x6.foreach(println)

lists.sum

assert(lists.sum == 21)

for(c<-lists.colors) println(c)

for(n<-lists.x1) println(n*2)