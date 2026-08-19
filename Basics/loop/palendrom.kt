fun main(){

	var userinput = readLine() ?: ""

	var ans = ""

	for(i in userinput.length - 1 downTo 0){
		ans+=userinput[i]
	}

	if(userinput == ans){

		println("It is palendrom")

	}else{
		println("It is not palendrom")

	}

}