open class Base{
    open val name:String = "Mama"
    open val price:String = "5000"
    init {
        println("I am in Base Class")
    }
    open fun displayName(){
        println(" Iam in " + this.name)
    }
    open fun displayPrice(){
        //
    }
}
open class Child:Base(){
    override fun displayName(){
        super.displayName()
        println("I am in Child class")
    }

    override fun displayPrice(){
        println("I am " + this.price)
    }
}

//class GrandChild:Child(){
//    init {
//        println("I am in Grand class")
//    }
//}