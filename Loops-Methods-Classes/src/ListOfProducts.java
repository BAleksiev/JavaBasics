
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts {

    public static void main(String[] args) {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            
            ArrayList<Product> products = new ArrayList<Product>();
            String row = null;
            
            while((row = reader.readLine()) != null) {
                String[] rowParams = row.split(" ");
                products.add(new Product(rowParams[0], Double.parseDouble(rowParams[1])));
            }
            reader.close();
            Collections.sort(products);
            
            Writer writer = new BufferedWriter(new FileWriter("Output.txt"));
            for (Product product : products) {
                writer.write(product.getPrice() + " " + product.getName() + "\r\n");
            }
            writer.close();
            
        } catch(Exception e) {
            System.out.println("Error");
        }
        
    }
}

class Product implements Comparable<Product> {
    
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int compareTo(Product compareFruit) {
        
        double otherPrice = ((Product) compareFruit).getPrice();
        
        if(this.price > otherPrice) {
            return 1;
        } else {
            return 0;
        }
    }
}