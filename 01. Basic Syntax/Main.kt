fun main(args: Array<String>) {
	val a: Int = 1
	val b = 2
	val c: Int
	c = 3

	//c += 1
	// val은 변할 수 없는 값

	//val d
	//d = 3
	// 변수가 선언될 때 초기화하지 않으면 타입 추론을 하지 않음

	var x = 5
	x += 1

	increment()


	val s = "$a is not $b, ${a + 1} is $b"
	println(s)


	var ls = listOf("a", "b", "c")
	for(l in ls) println(l)


	when (a) {
		1 -> println("a is 1")
		in 2..10 -> println("2 <= a <= 10")
		!in 15..20 -> println("not in 15 ~ 20")
		else -> {
			println("Na~")
		}
	}


	for(x in 1..9) print(x)
	println()

	for(x in 1..9 step 2) print(x)
	println()

	for(x in 9 downTo 0 step 2) print(x)
	println()


	val favorite = listOf("kotlin", "go", "rust")
	favorite
	.sortedBy { it }
	.map { it.capitalize() }
	.forEach(::println)
}

var global = 0
fun increment() = global++
