open class Shape constructor() {
    var area = 0.0

    //fun getArea() = area // IMPLICIT

    open fun onAreaChange(shapeType: String) {
        println("Variables changed, thus so did the Area for shape: $shapeType" )
    }
}