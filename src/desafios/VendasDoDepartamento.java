package desafios;

import java.util.List;

public class VendasDoDepartamento {
    public static void main(String[] args) {

        String[] sales = {
                "8349,14/09/2024,899.9,ESPORTE",
                "4837,17/09/2024,530.0,VESTUARIO",
                "15281,21/09/2024,1253.99,ESPORTE",
                "15344,27/09/2024,1000.9,VESTUARIO",
                "18317,04/10/2024,250.4,VESTUARIO",
                "18972,11/10/2024,385.5,JARDINAGEM"
        };
        String department = "VESTUARIO";

        double[] result = totalSales(List.of(sales), department);
        System.out.printf(String.format(String.format("%.0f", result[0])) + " VENDAS"
                    + "\nTotal = $ " + String.format("%.2f", result[1]));

    }

    public static double[] totalSales(List<String> sales, String department) {
        return totalSalesTailRecursive(sales, department,0, 0, 0);
    }

    public static double[] totalSalesTailRecursive(List<String> sales, String department, int index, double countSales, double totalPrice) {
        if (sales.size() == index) {
            return new double[]{countSales, totalPrice};
        }

        String[] sale = sales.get(index).split(",");

        if (sale[3].equals(department)) {
            countSales++;
            totalPrice += Double.parseDouble(sale[2]);
        }
        return totalSalesTailRecursive(sales, department, index + 1, countSales, totalPrice);
    }
    }
