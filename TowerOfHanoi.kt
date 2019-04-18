import java.util.*

open class TowerOfHanoi constructor(size: Int) {
    private val size: Int = size
    private var peg1: Stack<Int> = Stack()
    private var peg2: Stack<Int> = Stack()
    private var peg3: Stack<Int> = Stack()

    init {
        for (i in size downTo 1 )
            peg1.push(i)
        display()
    }
    fun solve(size: Int = this.size, from: Stack<Int> = this.peg1, to: Stack<Int> = this.peg3, using: Stack<Int> = this.peg2) {
        if (size > 1) {
            solve(size - 1, from, using, to)
            val d: Int = from.pop()
            to.push(d)
            display()
            solve(size - 1, using, to, from)
        } else {
            val d: Int = from.pop()
            to.push(d)
            display()
        }

    }
    fun display() {
        println("")
        println("---->  $peg1")
        println("---->  $peg2")
        println("---->  $peg3")
    }
}


fun main(args: Array<String>) {
    TowerOfHanoi(6).solve()
}
