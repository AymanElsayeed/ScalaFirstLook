object maps{

  var groceries = Map("milk" -> 2, "bread" -> 3)
  println(groceries)

  groceries += ("eggs" -> 1)
  println(groceries)

  println(s"eggs: ${groceries.get("eggs")}")

  groceries -= "eggs"
  println(groceries)

  groceries += "eggs" -> 1
  groceries.removed("eggs")
  println(groceries)

  groceries.+=("juice" -> 5)
  println(groceries)

  groceries.-=("juice")
  println(groceries)



}

maps