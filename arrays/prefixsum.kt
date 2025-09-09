fun main(){

	val a = intArrayOf(5,10,15,20,25)

	var ans = mutableListOf<Int>()

	var b = 0

	for(i in a){
		b += i
		ans.add(b)	
	}

 	println(ans)
}