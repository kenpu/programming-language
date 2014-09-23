class ChristmasTree(w: Int, h: Int) {
    val width = w
    val height = h
    private final val screenWidth = 60
    
    def display {
        def show(c:String, repeat:Int) {
            for(i <- 0 to repeat) print(c)
        }

        for(i <- 0 to this.height) {
            val w = Math.round(i.toFloat/this.height*this.width)
            val blankWidth = (this.screenWidth - w)/2
            show(" ", blankWidth)
            show("*", w)
            println
        }
    }
}

val tree = new ChristmasTree(50, 10)

tree.display
