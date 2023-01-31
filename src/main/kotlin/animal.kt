open class Animal{
    open val count: Int = 0
    open fun gotoSleep(){
        println("Zzzzzzzz")
    }
    open fun makeNoise(){
        println("Durrrrrr")
    }
}

class Cat(override val count:Int = 10):Animal(){
    //    override val count:Int = 100
    override fun makeNoise(){
        println("Meowwwwww,$count")
    }
}

class Dog:Animal(){
    override val count:Int = 5
    override fun makeNoise() {
        println("Woooooof,$count")
    }
}
