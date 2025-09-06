fun main(){
	val arr = intArrayOf(55,76,24,34)

	var max = 0
	var min = 0
	var per = 0

	for(i in arr){
		if(max<=i){
			max = i	
		}
		if(per<=i){
			min = per	
		}
		per = i
	}

	println(max)
	println(min)
}