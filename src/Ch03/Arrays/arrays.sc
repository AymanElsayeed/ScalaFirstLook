object arrays {

  var names:Array[String] =  new Array[String](3)

  names(0) = "Ayman "
  names(1) = "like "
  names(2) = "scala "

  var items:Array[Any] =  new Array[Any](5)
  items(0) = "string"
  items(1) = 'c'
  items(2) = 1
  items(3) = 2.4
  items(4) = 2.4F
  for(item<-items){
    println(s"item: $item, item class: ${item.getClass}")
  }

  names.foreach(print)

  var even = Array(2, 4, 6, 8)

  even.foreach(print)
  println()

  var numbers = new Array[Int] (4)
  numbers(0) = 0
  numbers(1) = 1
  numbers(2) = 2
  numbers(3) = 3
  var results = for(num <- numbers if num >0 ) yield num*2
  results.foreach(println)


}

arrays