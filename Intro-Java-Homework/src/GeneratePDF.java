
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class GeneratePDF {

    public static void main(String[] args) {

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Deck-of-Cards.pdf"));

            document.open();

            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.getDefaultCell().setFixedHeight(180);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);

            BaseFont font = BaseFont.createFont("Arial.ttf", BaseFont.IDENTITY_H, true);
            Font black = new Font(font, 50, Font.NORMAL, BaseColor.BLACK);
            Font red = new Font(font, 50, Font.NORMAL, BaseColor.RED);

            String card = "";
            //               spades    hearths   clubs    diamonds
            char[] suits = {'\u2660', '\u2665', '\u2663', '\u2666'};

            for (int i = 2; i <= 14; i++) {
                switch (i) {
                    case 11:
                        card = "J";
                        break;
                    case 12:
                        card = "Q";
                        break;
                    case 13:
                        card = "K";
                        break;
                    case 14:
                        card = "A";
                        break;
                    default:
                        card = Integer.toString(i);
                        break;
                }

                table.addCell(new Paragraph(card + " " + suits[0] + " ", black));
                table.addCell(new Paragraph(card + " " + suits[1] + " ", red));
                table.addCell(new Paragraph(card + " " + suits[2] + " ", black));
                table.addCell(new Paragraph(card + " " + suits[3] + " ", red));
            }
            
            document.add(table);
            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
