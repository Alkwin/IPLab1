
class Circle constructor(): Shape() {
    var radius = 0.0
    val PI = 3.14

    fun setRadius(newRadius: Double) = this.apply {
        radius = newRadius
        onAreaChange()
    }

    override fun onAreaChange() {
        println("Variables changed, thus so did the Area (CIRCLE)")
        area = PI*radius*radius
    }
}