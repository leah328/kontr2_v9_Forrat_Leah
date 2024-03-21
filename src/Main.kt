import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
suspend fun main()=runBlocking{
        try{
            println("количество повторов:")
            var k=readLine()!!.toInt()
            if(k>0){
                while(k>0){
                    k=k-1
                    var st=Student("","","","","","",0.0,0.0,0)
                    try{
                        launch{
                            st.Input()
                            st.Output()
                            st.Sport()
                            st.Studrost()
                            st.Birthday()
                        }
                        delay(3000L)
                    }catch(e:Exception){println("error")}
                }
            }else {println("не может быть 0 повторов")}
        }catch(e:Exception){println("error")}
}