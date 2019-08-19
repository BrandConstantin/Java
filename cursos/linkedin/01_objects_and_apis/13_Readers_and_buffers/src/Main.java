import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter writer = new FileWriter(targetFile);
                ){

            while (true){
                String line = bufferedReader.readLine();

                if(line == null){
                    break;
                }

                writer.write(line + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
