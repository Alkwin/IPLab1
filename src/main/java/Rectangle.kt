
class Rectangle constructor(): Shape() {
    var height = 0.0
    var width = 0.0

    fun setWidth(newWidth: Double) = this.apply {
        width = newWidth
        onAreaChange("RECTANGLE")
    }

    fun setHeight(newHeight: Double) = this.apply {
        height = newHeight
        onAreaChange("RECTANGLE")
    }

    override fun onAreaChange(shapeType: String) {
        super.onAreaChange(shapeType)
        area = height * width
    }
}