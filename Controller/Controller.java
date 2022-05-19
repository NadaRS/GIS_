package Controller;

import Model.InvoiceHeader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Controller implements ActionListener {

    private ActionEvent actionEvent;
    private InvoiceHeader iH = new InvoiceHeader();
    private String[][] a;

    public Controller() {
    }
    public Controller(ActionEvent actionEvent) {
        this.actionEvent = actionEvent;
        this.a = (String[][]) iH.getInvHeaderArray();
    }


    public String[][] getHeader(){
        return a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
       switch (actionEvent.getActionCommand()){
            case "createNewInvoiceBtn" :
                break;
           case "loadFile" :

               break;
           case "saveFile" :
               break;


        }
    }
}
