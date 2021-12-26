public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
/*
 * keywords - specific meaning for the language (public, class)
 * public - access modifier, allows us to define the scope or how other parts of your code or some one else's code can access this code
 * class - used to define a class followed by the name of the class
 * {} - define the body of the class
 * static - keyword, we need to have main method static for java to find the starting point of our code
 * void - the method will not be returning anything
 * (parameters)
 * {} - code block, mandatory in a method declaration
 *  int - data type
 *  myFirstNumber - name of the variable
 *  = - assignment, initialisation
 *  Expression - This is a construct that evaluates to a single value
 *  "stringLiteral" - Any sequence of characters  surrounded by double quotes is a String literal in Java. It's value cannot be changed unlike a variable
 *  operators - +,* are the operators in Java
 *  `int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;` - this is an expression. Java expressions consist of variables, operators, literals and, method calls
 * */