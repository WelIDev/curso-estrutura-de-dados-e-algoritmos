package strings;

import java.util.ArrayList;
import java.util.List;

public class Transacoes {

    public static void main(String[] args) {

        String[] transactions = {"alice,20,800,mtv", "alice,50,100,beijing"};
        String[] transactions2 = {"alice,20,800,mtv","alice,50,1200,mtv"};
        String[] transactions3 = {"alice,20,800,mtv","bob,50,1200,mtv"};

        System.out.println(invalidTransactions(transactions));
        System.out.println(invalidTransactions(transactions2));
        System.out.println(invalidTransactions(transactions3));
    }

    public static List<String> invalidTransactions(String[] transactions) {

        List<Transaction> transactionList = new ArrayList<>();

        for (String transaction : transactions) {
            transactionList.add(new Transaction(transaction));
        }

        List<String> invalidTransactionsList = new ArrayList<>();

        for (int i = 0; i < transactionList.size(); i++) {
            if (transactionList.get(i).getAmount() > 1000) {
                invalidTransactionsList.add(transactionList.get(i).toString());
            }

            for (Transaction transaction : transactionList) {
                if (transactionList.get(i).getName().equals(transaction.getName())) {

                    if (transactionList.get(i).getCity().equals(transaction.getCity())) {
                        int max = Math.max(transactionList.get(i).getTime(), transaction.getTime());
                        int min = Math.min(transactionList.get(i).getTime(), transaction.getTime());

                        if (max - min >= 60) {
                            invalidTransactionsList.add(transactionList.get(i).toString());
                        }
                    } else {
                        invalidTransactionsList.add(transactionList.get(i).toString());
                    }
                }
            }
        }

        return invalidTransactionsList;
    }
}

class Transaction {
    private final String name;
    private final int time;
    private final int amount;
    private final String city;

    public Transaction(String transaction) {
        transaction.split(",");
        name = transaction.split(",")[0];
        time = Integer.parseInt(transaction.split(",")[1]);
        amount = Integer.parseInt(transaction.split(",")[2]);
        city = transaction.split(",")[3];
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public int getAmount() {
        return amount;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return "\"" + name + "," + time + "," + amount + "," + city + "\"";
    }
}