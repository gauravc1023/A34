
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class BankDetails1 implements java.io.Serializable {
    String accountHolderName ;
    String address ;
    Long accountNumber ;
    transient String upiPin ;
    transient Long debitCardNumber ;
    transient int cvv;
    transient Long adharNumber ;
    transient String panCardNumber ;
    transient Long contact ;

    BankDetails1(String accountHolderName , String address , Long accountNumber , String upiPin , 
                        Long debitCardNumber , int cvv , Long adharNumber , String panCardNumber , Long contact)

    {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.accountNumber = accountNumber ; 
        this.upiPin = upiPin ;
        this.debitCardNumber = debitCardNumber ;
        this.cvv = cvv;
        this.adharNumber = adharNumber ;
        this.panCardNumber = panCardNumber ;
        this.contact = contact ;
    }

    public void displayBankDetails(){
        System.out.println("accountHolderName : " + accountHolderName);
        System.out.println("Address : " + address);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("UPI Pin : "+ upiPin);
        System.out.println("Debit Card Number : " + debitCardNumber);
        System.out.println("CVV Num : " + cvv);
        System.out.println("Adhar Card Number : " + adharNumber);
        System.out.println("Pan Card Number : " + panCardNumber);
        System.out.println("Contact : " + contact);
    }
}

public class DriverExampleTransient{
    public static void main(String [] args){
        BankDetails1 bankDetails = new BankDetails1(
                                                "Gaurav Kumar", 
                                                          "Gujrat Colony, Kothrud, Pune", 
                                                    9875_7845_6512_7542L, 
                                                           "1234" , 
                                                  1245_4578_8956_5623L, 
                                                              455 , 
                                                      9685_8574_6352L, 
                                                    "CQIPC3227M" , 
                                                          876701109L);

        System.out.println("\n Before serialization object data");

        bankDetails.displayBankDetails();
        //Serialization Process
        try {
            FileOutputStream fos = new FileOutputStream("bankdetails.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bankDetails);
            System.out.println("Serialization process complete");
        } catch (Exception e) {
            System.out.println("Something went wrong while serialization");
        }

        //De-Serialization Process
        try {
            FileInputStream fis = new FileInputStream("bankdetails.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BankDetails1 afterSer = (BankDetails1)ois.readObject();
            System.out.println("De-Serialization process complete");
            System.out.println("\n After serialization object data ");
            afterSer.displayBankDetails();
        } catch (Exception e) {
            System.out.println("Something went wrong while De-serialization");
        }
    }
}
