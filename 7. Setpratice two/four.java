public class four {
  public static void main(String[] args){
    int x = 9, y = 12;
    int a = 2, b = 4, c = 6;
    int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
    System.out.println(exp);
    }
    
}

/*
 * Operator Precedence in Java

Highest Precedence:

* () (Parentheses) - Expressions within parentheses are evaluated first.
*, /, % (Multiplication, Division, Modulus) - These operators have the same precedence and are evaluated from left to right.
+, - (Addition, Subtraction) - These operators have the same precedence and are evaluated from left to right.
Lower Precedence:

+=, -=, *=, /= (Shorthand assignment operators)
Explanation of the Code

Variable Initialization:

int x = 9, y = 12;: Initializes integer variables x and y with values 9 and 12, respectively.
int a = 2, b = 4, c = 6;: Initializes integer variables a, b, and c with values 2, 4, and 6, respectively.
Expression Evaluation:

exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

Step 1: Parentheses

(x + 34): 9 + 34 = 43
(a + b * c): 2 + (4 * 6) = 2 + 24 = 26
(2 + a): 2 + 2 = 4
(a + b*y): 2 + (4 * 12) = 2 + 48 = 50
Step 2: Multiplication and Division (from left to right)

4/3: 1 (Integer division, 4 divided by 3 in integer context results in 1)
1 * 43: 43
9 * 26: 234
y * 4: 12 * 4 = 48
3 + 48: 51
51 / 50: 1 (Integer division, 51 divided by 50 in integer context results in 1)
Step 3: Addition

43 + 234 + 1: 278
Final Result:

exp is assigned the value 278.
 */
