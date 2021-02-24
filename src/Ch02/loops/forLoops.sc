object fLoops{

  for(i<-0 to 10){
    println(i)
  }

  var a = 15 to 29
  println(a.getClass)
  a.foreach(println)

  var items = Array(2,3,4,5,6)

  var i=0
  for(i <-0 to items.length){
    println(i)
  }
}
fLoops