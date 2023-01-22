import java.util.Scanner;
import java.text.DecimalFormat;

public class AdvancedSavingsCalculator {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        // Input validation variables
        boolean validIncome = false;
        boolean validExpenses = false;
        boolean validSavingsGoal = false;
        boolean validYears = false;
        boolean validInterestRate = false;

        double income = 0;
        double expenses = 0;
        double savingsGoal = 0;
        int years = 0;
        double interestRate = 0;

        // Get user input
        while (!validIncome) {
            System.out.print("Enter your monthly income: ");
            if (scanner.hasNextDouble()) {
                income = scanner.nextDouble();
                if (income > 0) {
                    validIncome = true;
                } else {
                    System.out.println("Invalid input. Income must be greater than 0.");
                }
                } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
                }
                }
                while (!validExpenses) {
                    System.out.print("Enter your monthly expenses: ");
                    if (scanner.hasNextDouble()) {
                        expenses = scanner.nextDouble();
                        if (expenses > 0) {
                            validExpenses = true;
                        } else {
                            System.out.println("Invalid input. Expenses must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numerical value.");
                        scanner.next();
                    }
                }
                
                while (!validSavingsGoal) {
                    System.out.print("Enter the amount you want to save: ");
                    if (scanner.hasNextDouble()) {
                        savingsGoal = scanner.nextDouble();
                        if (savingsGoal > 0) {
                            validSavingsGoal = true;
                        } else {
                            System.out.println("Invalid input. Savings goal must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numerical value.");
                        scanner.next();
                    }
                }
                
                while (!validYears) {
                    System.out.print("Enter the number of years you want to save for: ");
                    if (scanner.hasNextInt()) {
                        years = scanner.nextInt();
                        if (years > 0) {
                            validYears = true;
                        } else {
                            System.out.println("Invalid input. Years must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter an integer value.");
                        scanner.next();
                    }
                }
                
                while (!validInterestRate) {
                    System.out.print("Enter the annual interest rate: ");
                    if (scanner.hasNextDouble()) {
                        interestRate = scanner.nextDouble();
                        if (interestRate >= 0) {
                            validInterestRate = true;
                        } else {
                            System.out.println("Invalid input. Interest rate must be greater than or equal to 0.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numerical value.");
                        scanner.next();
                    }
                }
            
                // Calculate the monthly savings needed
                double monthlySavings = (income - expenses) * (savingsGoal / (years * 12));
            
                // Calculate the daily savings needed
                double dailySavings = monthlySavings / 30;
            
                // Calculate the annual savings needed
                double annualSavings = monthlySavings * 12;
            
                // Calculate the total savings needed
                double totalSavings = monthlySavings * 12 * years;
            
                // Calculate the interest earned
                double interestEarned = totalSavings * (interestRate / 100);
            
                System.out.println("To save " + savingsGoal + " in " + years + " years, you need to save:");
                System.out.println("- " + df.format(monthlySavings) + " per month");
                System.out.println("- " + df.format(dailySavings) + " per day");
                System.out.println("- " + df.format(annualSavings) + " per year");
                System.out.println("- " + df.format(totalSavings) + " in total");
                System.out.println("You will earn an interest of " + df.format(interestEarned) + " over the period.");
            }
        }
            