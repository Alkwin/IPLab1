
class Circle constructor(): Shape() {
    var radius = 0.0
    final val PI = 3.14

    fun setRadius(newRadius: Double) = this.apply {
        radius = newRadius
        onAreaChange("CIRCLE")
    }

    override fun onAreaChange(shapeType: String) {
        area = PI*radius*radius
        super.onAreaChange("CIRCLE")
    }
}