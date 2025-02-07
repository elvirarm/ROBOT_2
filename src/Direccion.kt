enum class Direccion(private val desc: String) {
    POSITIVEX("Eje X positivo"),
    NEGATIVEX("Eje X negativo"),
    POSITIVEY("Eje Y positivo"),
    NEGATIVEY("Eje Y negativo");

    companion object {
        fun nuevaDir(pos: Int): Direccion {
            if (pos >= Direccion.entries.size - 1) {
                return Direccion.entries[0]
            } else {
                return Direccion.entries[pos + 1]
            }
        }

        fun dirAleatoria():Direccion{

            return Direccion.entries.random()
        }
    }

}