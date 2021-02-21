
class Rectangle constructor(): Shape() {
    var height = 0.0
    var width = 0.0

    fun setWidth(newWidth: Double) = this.apply {
        width = newWidth
        onAreaChange()
    }

    fun setHeight(newHeight: Double) = this.apply {
        onAreaChange()
        height = newHeight
    }

    override fun onAreaChange() {
        println("Variables changed, thus so did the Area (RECTANGLE)")
    }
}