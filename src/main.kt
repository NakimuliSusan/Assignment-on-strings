fun main () {
    printCharacters()
    getBiodata("Nakimuli Susan",22)


}
fun printCharacters () {
    var school = "AkiraChix"

    var result = (school[0].toString() +school[2]+school[3])
    println(result)

}
fun getBiodata (x:String,y:Int):String{
    var output = "Hey, my name is $x and I am $y years old"
    println(output)
    getLength()
    return output
}
fun getLength () {
    var myName = "Nakimuli"
    var length = myName.length
    println(length)
    myIdentity("Susan")
}
fun myIdentity (name:String):String {
    var myname = "Susan"
    var max = if (name == myname) {
        println("Thats me!!")

    } else {
        println("I dont know who that is")

    }
    return myname

}