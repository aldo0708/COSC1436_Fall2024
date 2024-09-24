import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Aldo's Calculator");
        String operation;
        double num1, num2, result;

        while (true) {
            System.out.println("Choose an operation (+, -, *, /, exit): ");
            operation = kb.nextLine();

            if (operation.equalsIgnoreCase("exit"))
             {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"))
            {
                System.out.println("Invalid operation! Please try again.");
                continue;
            }

            System.out.print("Enter the first number: ");
            num1 = getValidNumber(kb);

            System.out.print("Enter the second number: ");
            num2 = getValidNumber(kb);

            switch (operation)
             {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case "/":
                    if (num2 == 0) 
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                     else 
                    {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
            }

            System.out.println(); 
        }

        kb.close();
    }

    private static double getValidNumber(Scanner scanner)
     {
        while (true) 
        {
            try 
            {
                double num = Double.parseDouble(scanner.nextLine());
                if (num < -1000 || num > 1000)
                 {
                    System.out.println("Error: Number out of range (-1000 to 1000). Try again:");
                } else {
                    return num;
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a valid number:");
            }
        }
    }
}
