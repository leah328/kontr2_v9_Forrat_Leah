
open class Student (override var name:String,override var otch:String,
                    override var fam:String,override var pol:String, override var gruppa:String,override var data:String,
                    override var rost: Double,override var ves:Double,override var vidsporta:Int):Pupil(){

    override fun Input()
    {
        try{
            println("введите имя")
            name=readLine().toString()
            println("введите отчество")
            otch=readLine().toString()
            println("введите фамилию")
            fam=readLine().toString()
            println("введите пол")
            pol=readLine().toString()
            println("введите группу")
            gruppa=readLine().toString()
            println("введите дату рождения (пример: 07.07.2007)")
            data=readLine().toString()
            println("введите рост")
            rost=readLine()!!.toDouble()
            if(rost>0){
                println("введите вес")
                ves=readLine()!!.toDouble()
                if(ves>0){
                    println("введите каким видом спорта он занимается:\n1-футбол\n2-хоккей\n3-шахматы")
                    vidsporta=readLine()!!.toInt()
                    if(vidsporta!=1&&vidsporta!=2&&vidsporta!=3) println("нет такого пункта")
                }else{println("вес должен быть больше нуля")}
            }else{println("рост должен быть больше нуля")}

        }catch(e:Exception){
            println("error")
        }
    }
    override fun Output(){
        println("ФИО: ${fam} ${name} ${otch}\nПол: ${pol}\nГруппа: ${gruppa}\nДата рождения: ${data}\nРост/вес: ${rost}/${ves}")
    }
    override fun Sport(){
        when(vidsporta)
        {
            1->println("Студент состоит в футбольной команде это +3000р. к стипендии")
            2->println("Студент состоит в хоккейной команде это +6000р. к стипендии")
            3->println("Студент состоит в шахматном клубе это +1000р. к стипендии")
        }
    }
    fun Studrost(){
      when{
          (rost<90)->println("студент неимоверно низкий")
          (rost>89&&rost<140)->println("студент низкий")
          (rost>139&&rost<180)->println("студент среднего роста")
          (rost>179)->println("студент очень высокий")
      }
    }
    fun Birthday(){
        if(data=="21.03.2024") println("у этого студента сегодня день рождения!")
        else println("у этого студента сегодня обычный день")
    }


}