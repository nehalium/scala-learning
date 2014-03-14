package nehal

/*
 * Exercise 1: Pascal's Triangle
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3  1
 * 1 4 6  4  1
 * 1 5 10 10 5  1
 * 1 6 15 20 15 6  1
 * 1 7 21 35 35 21 7 1
 *
 */
object Pascal extends App {
	assert(args.size == 2, "Usage: Pascal 1 2")
	
	// Read arguments into integer list
	val ints = args.map(_.toInt).toList

	// Print result
	println(pascal(ints(0), ints(1)))

	// Take column and row and return corresponding value in Pascal's Triangle
	def pascal(c: Int, r: Int): Int = {
		if (c > r) {
			-999999
		}
		else if (c == 0 || c == r) {
			1
		}
		else {
			pascal(c - 1, r - 1) + pascal(c, r - 1)
		}
	}
}
