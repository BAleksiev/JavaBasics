
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.Writer;

public class OrderOfProducts {

    public static void main(String[] args) {

        try {
            LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("Products.txt")));
            lnr.skip(Long.MAX_VALUE);
            int productsRows = lnr.getLineNumber();
            lnr.close();
            
            BufferedReader reader = new BufferedReader(new FileReader("Products.txt"));
            Products[] product = new Products[productsRows + 1];
            String row = null;
            int counter = 0;
            
            while ((row = reader.readLine()) != null) {
                String[] rowParams = row.split(" ");
                product[counter] = new Products(rowParams[0], Double.parseDouble(rowParams[1]));
                counter++;
            }
            
            row = null;
            reader = new BufferedReader(new FileReader("Order.txt"));
            
            while ((row = reader.readLine()) != null) {
                String[] rowParams = row.split(" ");
                
                for (int i = 0; i < product.length; i++) {
                    if(product[i].name.equals(rowParams[1])) {
                        product[i].quantity += Double.parseDouble(rowParams[0]);
                    }
                }
            }
            reader.close();
            
            double totalPrice = 0;
            
            for (int i = 0; i < product.length; i++) {
                totalPrice += product[i].quantity * product[i].price;
            }
            
            System.out.printf("%.1f%n", totalPrice);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}

class Products {

    public String name;
    public double price;
    public double quantity = 0;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
