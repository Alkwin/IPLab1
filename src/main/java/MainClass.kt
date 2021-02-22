class MainClass {
    fun enterProgram() {
        startProgram()
    }

    private fun startProgram() {
        val dummyCircle = Circle()
        dummyCircle.setRadius(7.0)
        println(dummyCircle.area)

        val dummyRectangle = Rectangle()
        dummyRectangle.setHeight(15.0)
        dummyRectangle.setWidth(15.0)
        println(dummyRectangle.area)

        val dummyTriangle = Triangle()
        dummyTriangle.setBase(10.0)
        dummyTriangle.setHeight(28.0)
        println(dummyTriangle.area)
    }
}