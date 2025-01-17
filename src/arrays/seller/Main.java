package arrays.seller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String json = Files.readString(Paths.get("src/arrays/seller/sellers.json"), StandardCharsets.UTF_8);
        Gson gson = new Gson();

        Type listType = new TypeToken<ArrayList<Seller>>() {}.getType();

        List<Seller> sellers = gson.fromJson(json, listType);

        System.out.println(findMaxSellerAmount(sellers).toString());

    }

    public static Seller findMaxSellerAmount(List<Seller> sellers) {
        double maxSellerAmount = 0;
        int indexSellerAmount = 0;

        for (Seller seller: sellers) {
            if (seller.getAmount() > maxSellerAmount) {
                maxSellerAmount = seller.getAmount();
                indexSellerAmount = sellers.indexOf(seller);
            }
        }

        return sellers.get(indexSellerAmount);
    }
}

class Seller {
    private String name;
    private double amount;

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Name: " + name +  "\nAmount: " + amount;
    }
}


