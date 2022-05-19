package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {


    static ArrayList<String> readFile() {
        Scanner s = null;
        ArrayList<String> aL = null;
        try {
            s = new Scanner(new File("InvoiceHeader.csv"));
             aL = new ArrayList<String>();
            while (s.hasNext()) {
                aL.add(s.next());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            s.close();   
        }
        return aL;
    }
    void writeFile(ArrayList<InvoiceHeader> a) {

    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arrayList = readFile();
        System.out.println(arrayList);
    }
}
