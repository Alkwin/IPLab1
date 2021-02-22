
class Triangle constructor(): Shape() {
    var base = 0.0
    var height = 0.0

    fun setBase(newBase: Double) = this.apply {
        base = newBase
        onAreaChange("TRIANGLE")
    }

    fun setHeight(newHeight: Double) = this.apply {
        height = newHeight
        onAreaChange("TRIANGLE")
    }

    override fun onAreaChange(shapeType: String) {
        super.onAreaChange(shapeType)
        area = base * height / 2
    }
}