import org.jsoup.nodes.Document;
import java.io.*;

public class WriteJSONFile {
   private File json;

    public WriteJSONFile(){
        json = new File("JSONFile.txt");
    }
    public void writeToJson(String str){
        try {
            if(json.exists()){
                json.delete();
            }
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(json, true)));
            writer.println(str);
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
         }
    }

    public void writeParser(Document document){
        try(FileWriter writer = new FileWriter("parser.txt", false)) //запись в файл распарсеной страницы
        {
            writer.write(String.valueOf(document));
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


