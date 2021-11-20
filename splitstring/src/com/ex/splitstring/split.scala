package com.ex.splitstring

object split {
  
 
  
    def  main(args: Array[String]): Unit = {
    
       def rmspace(x:String)   = {
      //I LOVE     u SaikriSH NA
    
    val sp = x.trim()
    println(sp)
    val spl = sp.split(" ")
    println(spl)
    val pik =spl.filter(x => x!=" ").map(_.toLowerCase()).mkString("")
    println(pik) 
    
       }
    
          rmspace("hello  Buddy              make me correct    ii")
 
    }
    
    
    
    
      
    
  
}