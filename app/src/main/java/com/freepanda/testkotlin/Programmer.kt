package com.freepanda.testkotlin

//con 'val' le diremos que los datos que nos pasen sean constantes y no modificables
//con 'var' podrían ser modificables
//recuerda que con '?' se le está indicando que puede ser null
//con el '= null' estamos diciendole que ese parametro se inicializa como null, y asi
//cuando creamos al programador, no es necesario ponerle null o amigos
class Programmer (val name: String,
                  var age: Int,
                  val languages: Array<Language>,
                  val friends: Array<Programmer>? = null) {

    enum class Language {
        KOTLIN,
        COBOL,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language: Language in languages) {
            println("$name esta programando en $language")
        }
    }

}