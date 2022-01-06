/**
 * класс Book - класс для объектов типа Книга
 * наследует все методы и параметры класса {@link PrintMedia}
 * @author Павлов В.А.
 */
public class Book extends PrintMedia {

    /**Поле для хранения автора книги*/
    private String author;

    /**Поле для хранения года выпуска книги*/
    private short yearOfPublication;

    /**Поле для хранения названия издательства*/
    private String publishingHouse;

    /**Поле для хранения информации о виде обложки*/
    private String coverView;

    /**Создает книгу с заданными значениями автора, года выпуска, названия издательства и вида обложки,
     *а также название и кол-во страниц, наследуемые из класса {@link PrintMedia}
     *@param name -  название печатного издания, параметр унаследован из {@link PrintMedia}
     *@param numberOfPages - значение кол-ва страниц в печатном издании параметр унаследован из {@link PrintMedia}
     *@param author - автор книги
     *@param yearOfPublication - год выпуска книги
     *@param publishingHouse - названия издательства
     *@param coverView - вид обложки*/
    public Book(String name, int numberOfPages, String author, short yearOfPublication, String publishingHouse, String coverView) {
        super(name, numberOfPages);
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publishingHouse = publishingHouse;
        this.coverView = coverView;
    }

    /**Возвращает значение поля {@link Book#autor}
     * @return автор книги*/
    public String getAuthor() {
        return author;
    }

    /**Устанавливает значения поля {@link Book#autor}
     * @param autor - автор книги*/
    public void setAuthor(String author) {
        this.author = author;
    }

    /**Возвращает значение поля {@link Book#yearOfPublication}
     * @return год выпуска книги */
    public short getYearOfPublication() {
        return yearOfPublication;
    }

    /**Устанавливает значения поля {@link Book#yearOfPublication}
     * @param yearOfPublication - год выпуска книги*/
    public void setYearOfPublication(short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**Возвращает значение поля {@link Book#publishingHouse}
     * @return название издательства*/
    public String getPublishingHouse() {
        return publishingHouse;
    }

    /**Устанавливает значения поля {@link Book#publishingHouse}
     * @param publishingHouse - название издательства*/
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    /**Возвращает значение поля {@link Book#coverView}
     * @return вид обложки */
    public String getCoverView() {
        return coverView;
    }

    /**Устанавливает значения поля {@link Book#coverView}
     * @param coverView - вид обложки*/
    public void setCoverView(String coverView) {
        this.coverView = coverView;
    }
}
