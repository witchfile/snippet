package snippet_002

// 클래스 상속과 다형성(polymorphism)을 이용한 위임 구현
fun main(args: Array<String>) {
    val r = Rectangle()
    val c = Circle()
    Window(r).drawFigure()
    Window(r).fillFigure()
    Window(c).drawFigure()
    Window(c).fillFigure()
}

open class Figure() {
    open fun draw(){}
    open fun fill(){}
}

class Rectangle() : Figure() {
    override fun draw() {
        println("Draw rectangle")
    }

    override fun fill() {
        println("Fill rectangle")
    }
}

class Circle() : Figure() {
    override fun draw() {
        println("Draw circle")
    }

    override fun fill() {
        println("Fill Circle")
    }
}

class Window(val figure: Figure) {
    fun drawFigure() {
        figure.draw()
    }

    fun fillFigure() {
        figure.fill()
    }
}