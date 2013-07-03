object exercises1 {
  // Sincle line comments start with two slashes
  
  /*
   * Multi-line comments
   * start with /* and end with */
   */
  
  // Values in Scala are created with the `val` keyword:
  val x = 5                                       //> x  : Int = 5
  
  // Values can only be assigned once, so the following line wouldn't compile:
  // val x = 6
  
  /*
   * Values are usually all you need in Scala, because it supports functional programming well.
   * But Scala also supports variables, that you create with the `var` keyword. Using variables
   * is generally frowned upon, but sometimes they are needed.
   */
  var y = "foo"                                   //> y  : String = foo
  
  // variables can be re-assigned:
  y = "bar"
  
  /*
   * But they are type safe, the 'y' variable has type String, so you can't assign an integer to it:
   * So the following won't compile:
   */
  // y = 4
  
  // In the above examples, the type is inferred. But you can specify it as well:
  val myString: String = "foo"                    //> myString  : String = foo
  val myInt: Int = 42                             //> myInt  : Int = 42
  
  // Everything in Scala is typed, so for a list the type of the element is also specified:
  val intList: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
                                                  //> intList  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  
  /*
   * Scala is a functional language, so functions are values as well. Functions can also accept other functions
   * as a parameter, or return a function. Such a function is called a higher-order function.
   */
  
  // The syntax for a function is the parameter list, then a fat arrow (=>) and then the body.
  // Like so:
  (i: Int) => i * i                               //> res0: Int => Int = <function1>
  
  // Here, we created a function with a single parameter, called 'i' and of type 'Int'. It returns an Int as well,
  // but that's inferred by the compiler, we didn't specify it. It returns the square of the parameter.
  
  // Of course, we can store this function in a value:
  val square = (i: Int) => i * i                  //> square  : Int => Int = <function1>
  
  // We can also specify the type of square:
  val square2: Int => Int = (i: Int) => i * i     //> square2  : Int => Int = <function1>
  
  // Now let's try one of the higher order functions on the intList value we've defined earlier:
  intList.map(square)                             //> res1: List[Int] = List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
  
  // Scala also supports invoking methods that have a single parameter without the dot:
  intList map (square)                            //> res2: List[Int] = List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
  
  // .. and without the parenthesis:
  intList map square                              //> res3: List[Int] = List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
  
  // Of course, we can store the result of this computation in a value:
  val squares = intList map square                //> squares  : List[Int] = List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
  
  
  /*
   * EXERCISE: Create a copy of `intList` that contains only the even values.
   * You can do this by implementing the following 'even' function, by removing the
   * '???' and creating a function body.
   
   * Then, use the 'filter' method that's defined on List.
   */
  val even: Int => Boolean = (i: Int) => ???      //> even  : Int => Boolean = <function1>
  
  
  /*
   * Exercise 2: Play around with other useful higher order functions on List, like:
   * - take
   * - drop
   * - filterNot
   * - exists
   * - apply
   * - forall
   * - find
   * You can check Scala documentation what they do: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List
   */




  /*
   * You might have noticed that the 'find' method returns an Option[Int].
   *
   * An object of type `Option` is either an instance of `Some`, or a `None`. It is similar to Haskell's 'Maybe'.
   * If the object is a Some, it contains a value, if it's a None, there is no value.
   *
   * The 'headOption' of a list returns an Option, which is a None if the list is empty and a Some if the list is not empty: */
  List().headOption                               //> res4: Option[Nothing] = None
  List(1,2,3).headOption                          //> res5: Option[Int] = Some(1)
  
  // Options are extremely useful as an alternative to `null` in code, because the type checker forces you to deal
  // with the possibility that there is no value.
  
  val intOption: Option[Int] = Some(4)            //> intOption  : Option[Int] = Some(4)
  
  // You can't directly work with this value, because it's wrapped in an Option. So this won't work:
  // intOption + 5
  
  // You can use pattern matching to extract the value:
  intOption match {
    case Some(value) => println("The value is " + value)
    case None => println("There is no value...")
  }                                               //> The value is 4
  
  // Or, if you have a default value, you can use 'getOrElse'
  val int = intOption getOrElse 0                 //> int  : Int = 4
  
  // Or, if you want to perform an operation only if the option is a Some, you can use 'foreach':
  intOption foreach { value =>
    println("Houston, we have a value and it's " + value)
                                                  //> Houston, we have a value and it's 4
  }  
}
