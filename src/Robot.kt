class Robot(private val nombre: String) {

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.POSITIVEY




    init{
        if(nombre == "DAW1A"){
            this.posX = generarPosAleatoria()
            this.posY = 0
            this.direccion = Direccion.POSITIVEX
        }
        if(nombre == "DAW1B"){
            this.posX = 0
            this.posY = generarPosAleatoria()
            this.direccion = Direccion.dirAleatoria()
        }
        if (nombre == "1DAM"){
            this.posX = generarPosAleatoria()
            this.posY = generarPosAleatoria()
            this.direccion = Direccion.dirAleatoria()
        }
    }
    //PREGUNTAR


    fun mover(movimientos: IntArray){
        for(pasos in movimientos){
            if (pasos == 0) continue

                when(direccion){

                    Direccion.POSITIVEY -> {
                        if (nombre == "RD2D" || nombre == "DAW1A") {
                            posY += pasos
                            direccion = Direccion.NEGATIVEX
                        }
                        else if (nombre == "DAW1B"){
                            posY += pasos
                            direccion = Direccion.NEGATIVEX
                        }
                        else if (nombre == "DAM1"){
                            posY += pasos
                            var dirTemporal = Direccion.dirAleatoria()
                            if(direccion != dirTemporal){
                                direccion = dirTemporal
                            }

                        }
                    }

                    Direccion.NEGATIVEX -> {
                        if (nombre == "RD2D" || nombre == "DAW1B") {
                            posX -= pasos
                            direccion = Direccion.NEGATIVEY
                        }
                        if (nombre == "DAW1A") {
                            posX -= pasos
                            direccion = Direccion.POSITIVEY
                        }
                        else if (nombre == "DAM1"){
                            posY += pasos
                            var dirTemporal = Direccion.dirAleatoria()
                            if(direccion != dirTemporal){
                                direccion = dirTemporal
                            }

                        }
                    }

                    Direccion.NEGATIVEY ->{
                        if(nombre == "RD2D" || nombre == "DAW1A"){
                            posY += pasos
                            direccion = Direccion.POSITIVEX
                        }
                        else if (nombre == "DAW1B"){
                            posY += pasos
                            direccion = Direccion.NEGATIVEX
                        }
                        else if (nombre == "DAM1"){
                            posY += pasos
                            var dirTemporal = Direccion.dirAleatoria()
                            if(direccion != dirTemporal){
                                direccion = dirTemporal
                            }

                        }

                    }

                    Direccion.POSITIVEX ->{
                        if(nombre == "RD2D" || nombre == "DAW1B"){
                            posX += pasos
                            direccion = Direccion.POSITIVEY
                        }
                        else if (nombre == "DAW1A"){
                            posX += pasos
                            direccion = Direccion.NEGATIVEX

                    }
                        else if (nombre == "DAM1"){
                            posY += pasos
                            var dirTemporal = Direccion.dirAleatoria()
                            if(direccion != dirTemporal){
                                direccion = dirTemporal
                            }

                        }
                    }
                }

            //direccion = Direccion.nuevaDir(direccion.ordinal)
        }
    }

    fun obtenerPosicion(): String {

        return "($posX, $posY)"
    }

    fun obtenerDireccion(): String {
        return direccion.toString()
        /*
        val direccion = arrayOf("PositiveX", "NegativeX", "PositiveY", "NegativeY")
        val direccionTemporal = ""
        for (paso in direccion){
            direccion[+1]
            return direccionTemporal
        }

         */

    }

    fun generarPosAleatoria(): Int{
        var pos = 0
        if(nombre == "DAW1A" || nombre == "DAM1"){
            pos =  (-5..5).random()
        }
        if (nombre == "DAW1B"){
            pos = (-10..10).random()
        }
        return pos
    }


    override fun toString(): String {
        return "$nombre está en ${obtenerPosicion()} ${obtenerDireccion()}"
    }
}