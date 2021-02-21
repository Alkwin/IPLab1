class MainClass {
    fun enterProgram() {
        startProgram()
    }

    private fun startProgram() {
        val dummyCircle = Circle()
        dummyCircle.setRadius(7.0)
        println(dummyCircle.area)
    }
}