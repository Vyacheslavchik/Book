/**
 * класс PrintMedia - базовый класс для объектов печатных изданий
 * @author Павлов В.А.
 */
public class PrintMedia {

    /**Поле для хранения названия печатного издания*/
    private String name;

    /**Поле для хранения кол-ва страниц в печатном издании*/
    private int numberOfPages;

    /**Поле для хранения id печатного издания*/
    private short id;

    /**Создаёт печатное издание с заданными значениями имени и кол-ва страниц
     * @param name -  название печатного издания
     * @param numberOfPages - значение кол-ва страниц в печатном издании*/
    public PrintMedia (String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    /**Возвращает значение поля {@link PruntMedia#name}
     * @return название печатного издания*/
    public String getName() {
        return name;
    }

    /**Устанавливает значения поля {@link PruntMedia#name}
     * @param name -  название печатного издания*/
    public void setName(String name) {
        this.name = name;
    }

    /**Возвращает значение поля {@link PruntMedia#numberOfPages}
     * @return значение кол-ва страниц в печатном издании*/
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**Устанавливает значения поля {@link PruntMedia#numberOfPages}
     * @param numberOfPages - значение кол-ва страниц в печатном издании*/
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**Возвращает значение поля {@link PruntMedia#id}
     * @return id печатного издания*/
    public short getId() {
        return id;
    }

    /**Устанавливает значения поля {@link PruntMedia#id}
     * @param id - ID печатного издания*/
    public void setId(short id) {
        this.id = id;
    }
}
