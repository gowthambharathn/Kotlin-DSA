fun main(){

	var a = "asdfg"

	var reverse = a.reversed()

	if(a == reverse){
		println("It is palindrome")
	}else{
		println("It is not palindrome")
	}

	val vowels = "aeiouAEIOU"

	val string = "hasvscdkjbcsabui"

	var count = 0

	for(ab in string){

		if(ab in vowels){

			count ++
		}
	}

	println(count)
}