
class Triangle constructor(): Shape() {
    var base = 0.0
    var height = 0.0

    fun setBase(newBase: Double) = this.apply {
        base = newBase
        onAreaChange()
    }

    fun setHeight(newHeight: Double) = this.apply {
        onAreaChange()
        height = newHeight
    }

    override fun onAreaChange() {
        println("Variables changed, thus so did the Area (TRIANGLE)")
    }
}