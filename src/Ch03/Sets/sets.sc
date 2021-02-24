object sets {

  val fruit = Set("apple", "orange", "banana")
  var more_fruit = Set("kiwi", "pineapple")

  var nums = Set(2,4,6,8,3)
  var more_nums = Set(1,3,5,7, 2)

  println(nums(4))
  println(nums(1))
  println(nums.contains(4))

  var mixed = fruit ++ nums

  nums += 7
  nums -= 3
  println(nums.intersect(more_nums))
  println(nums.diff(more_nums))
  println(nums.isEmpty)


}

sets