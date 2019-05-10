import com.google.gson.Gson;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import java.io.IOException;
        import java.util.*;
        //Полезные и интересные ссылки для ознакомления.
/*https://www.youtube.com/watch?v=-l8Ji17d65Y
 * https://www.youtube.com/watch?v=E1otpQO68JQ
 * http://java-online.ru/java-javadoc.xhtml
 * https://www.scalemates.com/kits/news.php
 * https://github.com/ksahin/introWebScraping
 * https://javarush.ru/groups/posts/433-chto-esli-bih-kompanii-sobesedovali-perevodchikov-tak-zhe-kak-programmistov*/

/**
 * @autor Alexander Govrov
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String url="https://www.scalemates.com/kits/news.php"; //url каталога который хотим распарсить
        Document document = Jsoup.connect(url).get();

        List<Article> results = new ArrayList<>();
        Map<String,List<Article>> result = new HashMap<>();
        result.put("results",results);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество товаров: ");
        int n = scan.nextInt();

        for(int i=0;i<Math.ceil(n/100.0) ;i++) {//i-стр , n-товары. на 1 стр 100 товаров.
            results.addAll(ParserLogic.parsing(document, n-i*100));
        }
        //конвертировать объект созданного класса в JSON при помощи метода toJson().
        Gson gson = new Gson();
        String string = gson.toJson(results);
        WriteJSONFile json= new WriteJSONFile();
        json.writeParser(document);
        json.writeToJson(string);
        System.out.println(string.replace("},{","},\n{").replace("\",\"","\",\n\""));
        //т.о преобразовали объект в строку (удобно при передаче данных, например, из приложения на сервер)
    }
}

