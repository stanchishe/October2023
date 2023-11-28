import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        System.out.println("We are attempting to read a text file!");
        String fileOneOutput = readFileOne();

        if(fileOneOutput.equals("File now found!") || fileOneOutput.equals("File IO error!")) {
            System.out.println("The file could not be read correctly!");
        } else {
            System.out.println("The file One was read! Its contents are: \n" + fileOneOutput);
        }

        String fileTwoOutput = "";
        try {
            fileTwoOutput = readFileTwo();
        } catch (IOException e) {
            System.out.println("File IO error!");
            return;
        } finally {
            System.out.println("Finished reading File two!");
        }
        System.out.println("The file Two was read! Its contents are: \n" + fileTwoOutput);
    }

    public static String readFileOne() {
        String fileText = "";
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\stanc\\dev\\ProgressCOmmon\\October2023\\October2023\\Exceptions\\TextData\\NewFileOne.txt");
            while (fileInputStream.available()!=0) {
                fileText += (char)fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            return "File now found!";
        } catch (IOException e) {
            return "File IO error!";
        } finally {
            System.out.println("Finished reading File one!");
        }
        return fileText;
    }

    public static String readFileTwo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\stanc\\dev\\ProgressCOmmon\\October2023\\October2023\\Exceptions\\TextData\\NewFileTwo.txt");
        String fileText = "";
        while (fileInputStream.available()!=0) {
            // var += 1 == var = var + 1
            fileText += (char)fileInputStream.read();
        }
        return fileText;
    }

    // A wrapper method do handle possible Exceptions coming from readFileTwo() without re-implementing try-catch
     public static String readFileTwoWrapper() {
        String fileText = "";
        try {
           fileText = readFileTwo();
        } catch (IOException e) {
            return "File IO Error";
        }
        return fileText;
    }
}
