
def add(a:Int, b:Int) = a + b

def sub(a:Int, b: Int)  { a-b }

def multi(a:Int, b:Int) = {a*b}

def dev(a:Int, b:Int) = {
  val results = a /b
  results
}


println(f"add: ${add(2,2)}")

println(f"sub: ${sub(5,1)}")

println(f"multi: ${multi(10, 10)}")

println(f"dev: ${dev(10, 2)}")