package variables

fun main() {

    /*
    There are 2 keywords through which we can declare variables in Kotlin.
    1- [val] - val means that the variable is immutable,
    which means it can only be assigned once and then can't be changed.
    It's same as final in Java.
    Syntax:
    val <variable_name> = <variable_value>
                     OR
    val <variable_name> : <variable_type> = <variable_value>
    */

    val num = 10                //Explicitly consider it Integer
    println("num - $num")

    val num2 = 20     //Implicitly mentioning type
    println("num2 - $num2")

    /*
    2- [var] - The syntax is pretty much same, but
    It's considered best practice to annotate which data type you want to use with that variable.
    */

    var num3 = 0
    num3 = 20
    println("num3 - $num3")


    /*
    [Type Conversion]
    Type Cast functions - toInt(), toLong(), toShort(), toDouble(), toFloat() etc...
    */
    val f2 = 3.4f
    println("f2 - $f2")

    val d3 : Double = f2.toDouble()
    println("d3 - $d3")


    /*
    [Nullable Variables] - null basically means a missing reference.
    Kotlin aims to completely remove Null pointer exceptions, that is called null safety.
    We can't create a variable with Null value in Kotlin.
    For Eg:
    val str : String = null  //Will throw an exception
    But we do need null reference in Kotlin for cases.
    For example just to be able to interact with java libraries which can return a null value.
    In that case nullable variable comes in handy.
    */

    val str : String? = null        //Now, here str can hold either string value or null value
    print("str - $str")
}