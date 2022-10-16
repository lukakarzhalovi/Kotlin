
import kotlin.math.sqrt

fun main(){
var P1 = point(2,4)
var P2 = point(1,3)
    println(P1.toString())
    println(P2.toString())
    println(P1.equals(P2))
    println(P1.Symetry())
    println(P2.Symetry())
    println(P1.Module(P2))



}

class point(var x : Int, var y: Int ){
    override fun toString(): String {
        return " ($x; $y)"
    }

    override fun equals(other: Any?): Boolean {
        if(other is point){
            if(x == other.x && y == other.y){
                return true
            }

        }
        return false
    }
    fun Symetry():String{
        var x1 = -x
        var y1 = -y
        return "სათავის მიმართ სიმეტრიული წერტილის კორდინატებია ($x1;$y1)"
    }

    fun Module(other: Any?): String{
        if(other is point){
            var x0 = other.x - x
            var y0 = other.y - y
            var R = x0*x0 + y0*y0.toFloat()// აქ სხვანაირად ვერ გადავაქცევთ float=ად?
            var lenght = sqrt(R)
            return "lenght = $lenght"

            }

        return ""
        }

}
