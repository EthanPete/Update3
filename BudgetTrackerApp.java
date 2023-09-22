import java.util.ArrayList;
import java.util.Date;

public class BudgetTrackerApp {

    public static class User {
        private ArrayList<String> incomeSources;
        private ArrayList<Transaction> expenses;

        public User(String username, String password, String email, double budgetGoal) {
            this.incomeSources = new ArrayList<>();
            this.expenses = new ArrayList<>();
        }

        public void addIncomeSource(String description, double amount) {
            incomeSources.add(description);
            // You can add the amount to a list or perform other actions as needed
        }

        public void addExpense(String description, double amount, String category) {
            Transaction expense = new Transaction(description, amount, category);
            expenses.add(expense);
        }

        public void removeIncomeSource(String description) {
            incomeSources.remove(description);
            // Handle removal of the income source
        }

        public void removeExpense(String description) {
            for (Transaction expense : expenses) {
                if (expense.getDescription().equals(description)) {
                    expenses.remove(expense);
                    break;
                }
            }
            // Handle removal of the expense
        }

        public double calculateTotalIncome() {
            // Calculate and return the total income from incomeSources
            // You need to implement this logic based on your data structure
            return 0;
        }

        public double calculateTotalExpenses() {
            // Calculate and return the total expenses from expenses
            // You need to implement this logic based on your data structure
            return 0;
        }

        public double calculateRemainingBudget() {
            // Calculate and return the remaining budget
            return calculateTotalIncome() - calculateTotalExpenses();
        }

        // Other getters and setters as needed for the fields
    }

    public static class Transaction {
        private String description;
        private double amount;
        private Date date;
        private String category;

        public Transaction(String description, double amount, String category) {
            this.description = description;
            this.amount = amount;
            this.date = new Date(); // Automatically set the current date
            this.category = category;
        }

        // Getters for fields
        public String getDescription() {
            return description;
        }

        public double getAmount() {
            return amount;
        }

        public Date getDate() {
            return date;
        }

        public String getCategory() {
            return category;
        }
    }

    public static void main(String[] args) {
        // Example usage and testing can be done here

        // Create a user
        User user1 = new User("user1", "password123", "user1@email.com", 2000.0);

        // Add income and expenses
        user1.addIncomeSource("Salary", 2500.0);
        user1.addExpense("Rent", 1000.0, "Housing");
        user1.addExpense("Groceries", 200.0, "Food");

        // Calculate and display the remaining budget
        double remainingBudget = user1.calculateRemainingBudget();
        System.out.println("Remaining Budget: $" + remainingBudget);
    }
}