package com.freepanda.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // donde esta el curso
        var curso = "https://www.youtube.com/watch?v=ebQphhLpJG0"

        // Leccion 1
        variablesYConstantes()

        // Leccion 2
        tipoDeDatos()

        //Leccion 3
        sentenciaIf()

        //Leccion 4
        sentenciaWhen()

        //Leccion 5
        misArrays()

        //Leccion 6
        misMapas()

        //Leccion 7
        misBucles()

        //Leccion 8
        misNullPointerExceptions()

        //Leccion 9
        misFunciones()

        //Leccion 10
        misClasses()
    }

    /*
    Primera funcion de Kotlin para comprender variables y constantes
     */
    private fun variablesYConstantes () {

        // Variables de prueba con var
        var myVariable = "Hello GusAnna!!"
        println(myVariable)

        // Constantes con val, una constante solamente tendrá el valor inicial,
        // no podrás cambiarlo o dará error.
        val myConstante = "val es una constante!"

        println(myConstante)
    }

    /*
    Primera prueba con los tipos de datos en Kotlin (data types)
     */
    private fun tipoDeDatos () {

        // después de los ':' se define el tipo de dato, aunque a veces no será
        // necesario porque el compilador es inteligente para detectar que es de tipo String
        val myString: String = "myString es de tipo string."
        val myString2 = "myString2 será declarada sin el tipo"
        val myString3 : String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt: Int = 11
        val myInt2 = 20
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        // la 'f' al final es para indicarle que es un float
        val myFloat: Float = 1.5f
        val myDouble: Double = 5.5
        val myDouble2 = 3.5
        val myDouble3 = myDouble - myDouble2
        println(myDouble3)

        // Boolean (Bool)

        // Solamente podrá tener el valor true or false
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
        println(myBool || myBool2)



    }

    /*
    Vamos a evaluar con los IFs
     */
    private fun sentenciaIf() {

        val myNumber = 10

        if (myNumber < 15) {
            println("$myNumber es menor de 10")
        }
    }

    /*
Vamos a evaluar con los IFs
 */
    private fun sentenciaWhen() {

        val myCountry = "Spain"

        when (myCountry) {
            "Australia" -> {
                println("El idioma es inglés ")
            } "Spain", "Mexico", "Venezuela" -> {
                println("El idioma es español")
            }
        }
    }

    /*
    Vamos a tratar un poco los arrays
     */
    private fun misArrays() {
        val myName = "Gustavo"
        val mySurname = "Lopez"
        val myCia = "Zurich"
        val myAge = "40"

        val myArray: ArrayList<String> = arrayListOf<String>()

        myArray.add(myName)
        println(myArray)

        myArray.addAll(listOf(mySurname, myCia, myAge))
        println(myArray[1])

        val whereIWork: String = myArray[2]
        println(whereIWork)

        println(myArray)
        myArray.removeAt(3)
        println(myArray)

        //Recorrer el array
        myArray.forEach{
            println(it)
        }

        //borrado
        myArray.clear()
        println(myArray)
    }

    /*
    Vamos a tratar los mapas. Se guardia por clave/valor. A diferencia de los
    Arrays, no importa el orden porque la clave/valor será única
     */
    fun misMapas() {

        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        // cada vez que usamos el mapOf se crea un mapa de 0.
        myMap = mapOf("Gustavo" to 1, "Anna" to 2, "Alisa" to 5)
        println(myMap)

        //para añadir un valor sin eliminar lo previo. Hay que usar la instrucción
        //mutableMapOf cuando se inicializa, porque sino lo creamos con valores fijos.
        //Ahora quedará inicializado pero editable con el mutableMapOf
        myMap = mutableMapOf("Gustavo" to 1, "Anna" to 2, "Alisa" to 5)

        //ahora podremos añadir valores de varias formas
        myMap["Jordi"] = 7
        myMap.put("Alberto",8)
        println(myMap)

        //Ahora veremos que pasa cuando intentamos añadir un valor que ya existía en
        //otra posicion. Veremos que la vieja la quita y se queda con la nueva.
        //Así pues Gustavo se ha movido a la posición 10
        myMap.put("Gustavo",10)
        println(myMap)

        //Por último, añadiremos en una misma posición existente, otro número, y veremos
        //que se quedará con los dos, porque la clave (nombre) no se repite
        myMap.put("Marc",10)
        println(myMap)

        //Acceso al dato
        println(myMap["Gustavo"])

        //Eliminar dato
        myMap.remove("Marc")
        println(myMap)
    }

    /*
    Vamos a recorrer los bucles con for y while
     */
    private fun misBucles() {

        var myMap: Map<String,Int> = mutableMapOf("Gustavo" to 1, "Anna" to 2, "Alisa" to 5)
        val myArray: List<String> = listOf("Spain", "Russia", "France", "Italy")

        //for
        for (myString : String in myArray) {
            println(myString)
        }

        // A la hora de printar, recuerda que los mapas no son una estructura ordenada
        // Así que a diferencia del array, no se printará ordenado
        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value} ")
        }

        // con los '..' hará referencia a todos los valores, incluído el último valor
        for (x in 0..10) {
            println(x)
        }

        // con el 'until' no tiene en cuenta el último valor
        for (x in 0 until 10) {
            println(x)
        }

        // con el 'step' modificaremos el incremeto para dar saltos
        for (x in 0 until 10 step 2) {
            println(x)
        }

        // con el 'downTo' irá reduciendo
        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        // con el IntRange también podremos crear rangos
        val myNumaricArray: IntRange = (0..20)
        for (x in myNumaricArray) {
            println(x)
        }


        //While servirá para hacer algo mientras se cumpla la condición

        var x = 0

        // Vamos a recorrer de 2 en 2
        while (x < 10) {
            println(x)
            x+=2
        }
    }

    /*
    Vamos a hablar de seguridad contra los nulls
     */
    private fun misNullPointerExceptions() {
        var myString = "test"
        println(myString)

        //Si le dieramos el valor null, nos daría error
        //myString = null
        //println(myString)

        // con el '?' lo que haremos es crear una variable null safety.
        // evitaremos petes de android con nulls inesperados
        var mySafetyString: String? = "Variable segura"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Vuelve a funcionar"
        println(mySafetyString)

        //sino siempre podremos controlarlo con un if
        if (mySafetyString != null) {
            println(mySafetyString!!)
        }

        // Con el '!!' obligaremos a que una variable no sea null
        // pero si lo es, entonces dará un nullPointerException
        /*
        mySafetyString = null
        if (mySafetyString != null) {
            println(mySafetyString!!)
        }
        */

        //Safe call. En el caso que sea null, con el '?' evitaremos que pete
        println(mySafetyString?.length)

        //Safe call 2. Usaremos 'let' para hacerlo de forma más elegante.
        //Entonces ese código solamente se ejecutará cuando mySafetyString
        //no sea null
        //por otro lado, para ejecutar algo en caso de que sea null, usar
        //'?: run' como si fuera un else en este caso
        mySafetyString?.let {
            println(mySafetyString!!)
            //también se puede usar la variable automática it
            println(it)
        } ?: run {
            println(mySafetyString)
        }

        //En resumen, si queremos evitar que tengamos variables null, es recomendable
        //usar el '?' cuando declaramos las variables.
    }

    /*
    Aqui vamos a hablar de funciones
     */
    fun misFunciones() {

        //es muy importante tener el código en funciones para tener nuestro
        //código localizable.
        funcionSimple()

        //funcion con parametro de entrada
        funcionConParametro("Gus")
        funcionConParametro("Anna")

        //funcion con varios parametros de entrada
        funcionConNombreYEdad("Gus", 40)
        funcionConNombreYEdad("Anna", 31)

        //funcion con retorno
        val x = sumTwoNumbers(5, 10)
        println(x)
        //printar directamente llamando a la funcion
        println(sumTwoNumbers(3, 4))
        //printar desde la funcion dentro de una funcion
        println(sumTwoNumbers(3, sumTwoNumbers(3, 4)))
    }

    fun funcionSimple() {
        println("Hola!")
    }

    fun funcionConParametro(myName: String) {
        println("Hola mi nombre es $myName!")
    }

    // Con los ':' entre ')' y '{' indicaremos que retorna la funcion.
    //En este caso un entero 'Int'
    fun funcionConNombreYEdad(myName: String, myAge: Int){
        println("Hola mi nombre es $myName y tengo $myAge años!")
    }

    fun sumTwoNumbers(num1: Int, num2: Int) : Int {
        val sum = num1 + num2
        return sum
    }

    /*
    AQui vamos a hablar de las clases
     */

    fun misClasses() {
        val gus = Programmer("Gustavo", 40, arrayOf(Programmer.Language.JAVA, Programmer.Language.COBOL), null)
        println(gus.name)

        //como declaramos en Programmer.age de tipo 'var', podremos cambiar su valor
        //las otras variables de tipo 'val' no lo permiten y daría error.
        println(gus.age)
        gus.age = 20
        println(gus.age)

        gus.code()

        val anna = Programmer("Anna", 31, arrayOf(Programmer.Language.JAVASCRIPT), arrayOf(gus))
        println("${anna.friends?.first()?.name} es amigo de ${anna.name}")
    }
}