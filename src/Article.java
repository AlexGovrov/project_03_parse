public class Article {
    /** Поля параметров */
    private String scalematesUrl;
    private String brand;
    private String brandCatno;
    private String name;
    private String scale;
    private String description;
    private String boxartUrl;
    private String year;
    /**
     * Конструктор - создание нового объекта
     */
    public Article(String scalematesUrl, String brand, String brandCatno, String name, String scale, String description, String boxartUrl, String year) {
        this.scalematesUrl = scalematesUrl;
        this.brand = brand;
        this.brandCatno = brandCatno;
        this.name = name;
        this.scale = scale;
        this.description = description;
        this.boxartUrl = boxartUrl;
        this.year = year;
    }
    /**
     * Геттеры и Сеттеры
     */
    public void setScalematesUrl(String scalematesUrl) {
        this.scalematesUrl = scalematesUrl;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrandCatno(String brandCatno) {
        this.brandCatno = brandCatno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBoxartUrl(String boxartUrl) {
        this.boxartUrl = boxartUrl;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getScalematesUrl() {
        return scalematesUrl;
    }

    public String getBrand() {
        return brand;
    }

    public String getBrandCatno() {
        return brandCatno;
    }

    public String getName() {
        return name;
    }

    public String getScale() {
        return scale;
    }

    public String getDescription() {
        return description;
    }

    public String getBoxartUrl() {
        return boxartUrl;
    }

    public String getYear() {
        return year;
    }
}
