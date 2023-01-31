open class Base{
    open val name:String = "Mama"
    open val price:String = "$50000"
    //    init {
//        println("I am in Base Class, $name")
//    }
    open fun displayName(){
        println("I am " + this.name)
    }
    open fun displayPrice(){
//        println("I am " + this.price)
    }
}

open class Child:Base(){
    override fun displayName() {
        super.displayName()
        println("I am in Child class")
    }

    override fun displayPrice() {
        super.displayName()
        println("I have " + this.price)
    }
}

//class GrandChild:Child(){
//    init {
//        println("I am Grand Child class")
//    }
//}