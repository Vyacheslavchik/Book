/**
 * класс Journal - класс для объектов типа Книга
 * наследует все методы и параметры класса {@link PrintMedia}
 * @author Павлов В.А.
 */
public class Journal extends PrintMedia {

    /**Поле для хранения номера выпуска*/
    private short issueNumber;

    /**Поле для хранения даты выпуска*/
    private String dateRelease;

    /**Поле для хранения вида бумаги*/
    private String kindOfPaper;

    /**Создает журнал с заданными значениями номер выпуска, дата выпуска, вид бумаги,
     *а также название и кол-во страниц, наследуемые из класса {@link PrintMedia}
     *@param name -  название печатного издания, параметр унаследован из {@link PrintMedia}
     *@param numberOfPages - значение кол-ва страниц в печатном издании параметр унаследован из {@link PrintMedia}
     *@param issueNumber - номер выпуска
     *@param dateRelease - дата выпуска
     *@param kindOfPaper - вид бумаги*/
    public Journal(String name, int numberOfPages, short issueNumber, String dateRelease, String kindOfPaper) {
        super(name, numberOfPages);
        this.issueNumber = issueNumber;
        this.dateRelease = dateRelease;
        this.kindOfPaper = kindOfPaper;
    }

    /**Возвращает значение поля {@link Journal#issueNumber}
     * @return номер выпуска*/
    public short getIssueNumber() {
        return issueNumber;
    }

    /**Устанавливает значения поля {@link Journal#issueNumber}
     * @param issueNumber - номер выпуска*/
    public void setIssueNumber(short issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**Возвращает значение поля {@link Journal#dateRelease}
     * @return дата выпуска*/
    public String getDateRelease() {
        return dateRelease;
    }

    /**Устанавливает значения поля {@link Journal#dateRelease}
     * @param dateRelease - дата выпуска*/
    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    /**Возвращает значение поля {@link Journal#kindOfPaper}
     * @return вид бумаги*/
    public String getKindOfPaper() {
        return kindOfPaper;
    }

    /**Устанавливает значения поля {@link Journal#kindOfPaper}
     * @param kindOfPaper - вид бумаги*/
    public void setKindOfPaper(String kindOfPaper) {
        this.kindOfPaper = kindOfPaper;
    }
}
