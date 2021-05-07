package lab7;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import static java.lang.System.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
   
    }
    public static void main(String[] args){
        

        //Zad4
        int personArrayLenght =20,i=0;
        String[] nameArray;
        nameArray= new String [personArrayLenght];
        String[] surnameArray;
        surnameArray= new String [personArrayLenght];
        String[] personArray;
        personArray= new String [personArrayLenght];

        try {
            File myObj = new File("D:\\java\\imiona.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                nameArray[i]=data;
                //System.out.println(data);
                i+=1;
            }
            myReader.close();
        } catch(IOException e){
            System.out.println("Error");
        }
        i=0;
        try {
            File myObj = new File("D:\\java\\nazwiska.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                surnameArray[i]=data;
                //System.out.println(data);
                i+=1;
            }
            myReader.close();
        } catch(IOException e){
            System.out.println("Error");
        }



        for(i=0;i<20;i++) {
            Random rand = new Random();
            int maxCount = 20;
            int randomName = rand.nextInt(maxCount);
            int randomSurname = rand.nextInt(maxCount);
            Osoba newPerson = new Osoba(nameArray[randomName], surnameArray[randomSurname]);
            personArray[i] = newPerson.getName() + " " + newPerson.getSurname();
            //System.out.println(personArray[i]);
        }
            try{
                FileWriter myWriter =new FileWriter("D:\\java\\osoby.txt");
                myWriter.write(personArray[0]+"\n");
                myWriter.write(personArray[1]+"\n");
                myWriter.write(personArray[2]+"\n");
                myWriter.write(personArray[3]+"\n");
                myWriter.write(personArray[4]+"\n");
                myWriter.write(personArray[5]+"\n");
                myWriter.write(personArray[6]+"\n");
                myWriter.write(personArray[7]+"\n");
                myWriter.write(personArray[8]+"\n");
                myWriter.write(personArray[9]+"\n");
                myWriter.write(personArray[10]+"\n");
                myWriter.write(personArray[11]+"\n");
                myWriter.write(personArray[12]+"\n");
                myWriter.write(personArray[13]+"\n");
                myWriter.write(personArray[14]+"\n");
                myWriter.write(personArray[15]+"\n");
                myWriter.write(personArray[16]+"\n");
                myWriter.write(personArray[17]+"\n");
                myWriter.write(personArray[18]+"\n");
                myWriter.write(personArray[19]);
                //System.out.println("Success");
                myWriter.close();
            } catch (IOException e){
                System.out.println("Error");
            }

        try {
            File myObj = new File("D:\\java\\osoby.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}
