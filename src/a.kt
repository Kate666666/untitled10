class Date{
    var g = 2020
    var m = 2
    var d = 3
}
class Account {
    var f = "a"
    var n = 0
    var p = 10.00
    var s = 100.00
    var date = Date()
    fun sf() {
        f = "b"
    }
    fun ss() {
        s = s - 1
    }
    fun ps(){
        s = s + 1
    }
    fun np() {
        s = s + s/100*p
    }
    fun sd(){
        s = s/64
    }
    fun se(){
        s = s/70
    }
    fun sp() {
        println(s)
    }
}
fun main() {
    var date2 = Date()
    var 
}