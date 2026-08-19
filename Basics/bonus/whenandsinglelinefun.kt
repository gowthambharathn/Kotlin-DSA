
fun grade(a:Int):String =

	when(a){
		in 0..40 -> "fail"
		in 41..60 -> "c grade"
		in 61..80 -> "b grade"
		in 81..100 -> "a grade"
		else -> "invalid input"
	}



fun greeding(a:String):String = "Hello $a"


fun main(){
	val a = readLine()!!
	println(greeding(a))	
}


	

