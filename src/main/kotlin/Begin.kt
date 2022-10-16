import java.nio.file.attribute.UserDefinedFileAttributeView

fun main(){
    val F1 = Franction(4,8)
    val F2 = Franction(12,24)
    println(F1.toString())
    println(F1 == F2)
    println(F1.Retrench())
    println(F2.Retrench())
    println(F1.sum(F2))
    println(F2.Dispart(F2))
}


open class Franction (numerator: Int,  denominator: Int) {
    protected var numerator: Int = numerator
    protected var denominator: Int = denominator

    override fun toString(): String {
        return "$numerator / $denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Franction) {
            if (denominator * other.numerator == numerator * other.denominator) {
                return true
            }
        }
        return false
    }
    fun Retrench():String{
        var USJ: Int = 1
        var x = 1
        while ( x <= numerator && x <= denominator) {
            if (numerator % x == 0 && denominator % x == 0) {
                USJ = x
            }
            ++x
        }
            val Retrench_numerator = numerator / USJ
            val Retrench_denominator = denominator / USJ

        return "შეკვეცილი წილადია: $Retrench_numerator/ $Retrench_denominator"

    }
    fun sum (other: Any?): String{
        if (other is Franction){
            var sum_denominator = denominator * other.denominator
            var sum_numerator = numerator * other.denominator + denominator* other.numerator
            return "sum is: $sum_numerator / $sum_denominator"
            // აქ უდიდესი სართო ჯერადის კოდი ვერადა ვერ დავწერე :დ
        }
        return " "
    }
    fun Dispart(other: Any?): String{
        if (other is Franction){
            var Dispart_numerator= numerator * other.denominator
            var Dispart_denominator = denominator* other.numerator
            return "გაყოდის შედეგად მიიღება: $Dispart_numerator / $Dispart_denominator"
        }
        return ""
    }
}

