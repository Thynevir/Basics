package basics;

public class Math {

	public static void main(String[] args) {
	/*	
		Methods of Math Class in Java

		Math class consists of methods that can perform mathematical operations and can make long calculations a bit easy. Let us check the method provided in the Math class.
		Method	Description
		sin	Returns the trigonometric value of the sine of an angle.
		cos	Returns the trigonometric value of the cosine of an angle.
		tan	Returns the trigonometric value of the tangent of an angle.
		asin	Returns the trigonometric value of the arc sine of an angle.
		acos	Returns the trigonometric value of the arc cosine of an angle.
		atan	Returns the trigonometric value of the arc tangent of an angle.
		toRadians	Convert value in degrees to value in radians
		toDegrees	Convert value in degrees to value in degrees
		exp	Returns Euler’s number e raised to the power of a double value
		log	Returns the natural logarithm (base e) of a double value
		log10	Returns the base 10 logarithms of a double value
		sqrt	Returns the correct rounded positive square root of a double value
		cbrt	Returns the cube root of a double value
		IEEEremainder	Computes the remainder operation on two arguments as instructed by the IEEE 754 standard.
		ceil	Returns the smallest double value that is greater than or equal to the argument. It is a fixed mathematical integer
		floor	Returns the smallest double value that is less than or equal to the argument. It is a fixed mathematical integer.
		rint	Returns the double value that is closest in value to the argument and is equal to a mathematical integer
		atan2	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta)
		pow	Returns(pow(a,b)) the value of ab.
		round	Returns the closest int to the argument, with ties rounding to positive infinity
		random	Returns a double value with a positive sign, in the range [0.0, 1.0].
		addExact	Returns the sum of its arguments, throwing an exception if the result overflows a value.
		subtractExact	Returns the difference of its arguments, throwing an exception if the result overflows a value.
		multiplyExact	Returns the product of the arguments, throwing an exception if the result overflows a value.
		incrementExact	Returns the argument value incremented by 1 and throws an exception if the value overflows.
		decrementExact	Returns the argument value decremented by 1 and throws an exception if the value overflows.
		negateExact	Returns the negation of the argument and throws an exception if the value overflows.
		toIntExact	Returns the value of the long argument and throws an exception if the int overflows.
		floorDiv	Returns the largest (closest to positive infinity) long value that is less than or equal to the algebraic quotient
		floorMod	Returns the floor modulus of the arguments
		abs	Return the absolute value
		max	Returns the maximum out of the two arguments
		min	Returns the minimum out of the two arguments
		ulp	Returns the size of an ulp of the argument.
		signum	Returns value 0,1 and -1 depending upon if the argument is equal, greater, or less than zero respectively.
		sinh	Returns the hyperbolic sine of the value.
		cosh	Returns the hyperbolic cosine of the value.
		tanh	Returns the hyperbolic sine of the value.
		hypot	Returns the hyperbolic tangent of the value.
		expm1	Returns ex-1
		log1p	Returns the natural logarithm of the sum of the argument and 1
		copySign	Returns the first value argument with the sign of the second value argument
		getExponent	Returns the unbiased exponent used in the representation of a value
		nextAfter	Returns the floating-point number adjacent to the first argument in the direction of the second argument.
		nextUp	Returns the floating-point value adjacent to d in the direction of positive infinity.
		nextDown	Returns the floating-point value adjacent to d in the direction of negative infinity.
		scalb	Returns f × 2scaleFactor rounded as if performed by a single correctly rounded floating-point multiplied to a member of the value set.
		
		EXAMPLE
*/
		 int i = 7;
	        int j = -9;
	        double x = 72.3;
	        double y = 0.34;
	  
	        System.out.println("i is " + i);
	        System.out.println("j is " + j);
	  
	        // The absolute value of a number is equal to the
	        // number if the number is positive or zero and
	        // equal to the negative of the number if the number
	        // is negative.
	  
	        System.out.println("|" + i + "| is " + Math.abs(i));
	        System.out.println("|" + y + "| is " + Math.abs(y));
	  
	        // Truncating and Rounding functions
	        // You can round off a floating point number  to the
	        // nearest integer with round()
	        System.out.println(x + " is approximately "
	                           + Math.round(x));
	        System.out.println(y + " is approximately "
	                           + Math.round(y));
	  
	        // The "ceiling" of a number is the smallest integer
	        // greater than or equal to the number. Every
	        // integer is its own //ceiling.
	        System.out.println("The ceiling of " + x + " is "
	                           + Math.ceil(x));
	        System.out.println("The ceiling of " + y + " is "
	                           + Math.ceil(y));
	  
	        // The "floor" of a number is the largest integer
	        // less than or equal to the number. Every integer
	        // is its own floor.
	        System.out.println("The floor of " + x + " is "
	                           + Math.floor(x));
	        System.out.println("The floor of " + y + " is "
	                           + Math.floor(y));
	  
	        // Comparison operators
	  
	        // min() returns the smaller of the two arguments
	        // you pass it
	        System.out.println("min(" + i + "," + j + ") is "
	                           + Math.min(i, j));
	        System.out.println("min(" + x + "," + y + ") is "
	                           + Math.min(x, y));
	  
	        // There's a corresponding max() method
	        // that returns the larger of two numbers
	        System.out.println("max(" + i + "," + j + ") is "
	                           + Math.max(i, j));
	        System.out.println("max(" + x + "," + y + ") is "
	                           + Math.max(x, y));
	  
	        // The Math library defines a couple of useful
	        // constants:
	        System.out.println("Pi is " + Math.PI);
	        System.out.println("e is " + Math.E);
	  
	        // Trigonometric methods. All arguments are given in
	        // radians
	        // Convert a 45 degree angle to radians
	        double angle = 45.0 * 2.0 * Math.PI / 360.0;
	        System.out.println("cos(" + angle + ") is "
	                           + Math.cos(angle));
	        System.out.println("sin(" + angle + ") is "
	                           + Math.sin(angle));
	  
	        // Inverse Trigonometric methods. All values are
	        // returned as radians
	  
	        double value = 0.707;
	  
	        System.out.println("acos(" + value + ") is "
	                           + Math.acos(value));
	        System.out.println("asin(" + value + ") is "
	                           + Math.asin(value));
	        System.out.println("atan(" + value + ") is "
	                           + Math.atan(value));
	  
	        // Exponential and Logarithmic Methods
	  
	        // exp(a) returns e (2.71828...) raised
	        // to the power of a.
	        System.out.println("exp(1.0) is " + Math.exp(1.0));
	        System.out.println("exp(10.0) is "
	                           + Math.exp(10.0));
	        System.out.println("exp(0.0) is " + Math.exp(0.0));
	  
	        // log(a) returns  the natural
	        // logarithm (base e) of a.
	        System.out.println("log(1.0) is " + Math.log(1.0));
	        System.out.println("log(10.0) is "
	                           + Math.log(10.0));
	        System.out.println("log(Math.E) is "
	                           + Math.log(Math.E));
	  
	        // pow(x, y) returns the x raised
	        // to the yth power.
	        System.out.println("pow(2.0, 2.0) is "
	                           + Math.pow(2.0, 2.0));
	        System.out.println("pow(10.0, 3.5) is "
	                           + Math.pow(10.0, 3.5));
	        System.out.println("pow(8, -1) is "
	                           + Math.pow(8, -1));
	  
	        // sqrt(x) returns the square root of x.
	        for (i = 0; i < 10; i++) {
	            System.out.println("The square root of " + i
	                               + " is " + Math.sqrt(i));
	        }
	  
	        // Finally there's one Random method
	        // that returns a pseudo-random number
	        // between 0.0 and 1.0;
	  
	        System.out.println("Here's one random number: "
	                           + Math.random());
	}

}
