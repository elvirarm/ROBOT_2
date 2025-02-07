fun main() {
    val rd2d = Robot("RD2D")

    val listaMov = listOf(
        intArrayOf(10,5,-2),
        intArrayOf(0,0,0),
        intArrayOf(),
        intArrayOf(-10,-5,-2),
        intArrayOf(-10,-5,2,4,8)

    )
    for (mov in listaMov) {
        rd2d.mover(mov)
    }
    println(rd2d)

    val robot2 = Robot("DAW1A")

}