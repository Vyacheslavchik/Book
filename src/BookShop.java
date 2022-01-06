import java.util.ArrayList;
/**
 * класс BookShop - класс для объектов типа Книжный магазин
 * @author Павлов В.А.
 */
public class BookShop {

    /**Поле для хранения каталога печатных изданий*/
    private ArrayList <PrintMedia> katalog = new ArrayList <PrintMedia>();

    /**Возвращает значение поля {@link BookShop#katalog}
     * @return каталог печатных изданий*/
    public ArrayList <PrintMedia> getKatalog() {
        return katalog;
    }

    /**Добавляет в {@link BookShop#katalog} новый элемент типа {@link PrintMedia} и возвращает строку о результате исполнения метода типа String
     *@param printMedia - элемент, для добавления в каталог
     *@return String queryResult*/
    public String addInKatalog(PrintMedia printMedia) {
        String queryResult;
        if (katalog.size()<32767) {
            Integer sizeKatalog = katalog.size();//?почуму нельзя int?
            printMedia.setId(sizeKatalog.shortValue());
            katalog.add(printMedia);
            queryResult = "Печатное издание успешно добавлено в Кталог";
        }else {
            queryResult = "Ошибка! Каталог переполнен.";
        }
        return queryResult;
    }

    /**Удаляет из {@link BookShop#katalog} элемент по его ID и возвращает строку о результате исполнения метода типа String
     *@param id - ID эдемента, который нужно удалить
     *@return String queryResult*/
    public String deleteOfKatalog(short id) {
        String queryResult;
        if(katalog.size()==0) {
            queryResult = "Ошибка! В каталоге нет печатных изданий.";
        }else if(id>=katalog.size()) {
            queryResult = "Ошибка! Введен несуществующий ID";
        }else {
            katalog.remove(id);
            for(short counter=0;counter<katalog.size();counter++) {
                katalog.get(counter).setId(counter);
            }
            queryResult = "Печатное издание успешно удалено из каталога.";
        }
        return queryResult;
    }

    /**Возвращает кол-во объектов типа {@link Book}, которые находятся {@link BookShop#katalog}
     *@return short books*/
    public short howMuchBooks() {
        short books=0;
        for(short counter=0;counter<katalog.size();counter++) {
            if(katalog.get(counter) instanceof Book == true) {
                books++;
            }
        }
        return books;
    }

    /**Возвращает кол-во объектов типа {@link Journal}, которые находятся {@link BookShop#katalog}
     *@return short books*/
    public short howMuchJournals() {
        short journals=0;
        for(short counter=0;counter<katalog.size();counter++) {
            if(katalog.get(counter) instanceof Journal == true) {
                journals++;
            }
        }
        return journals;
    }

    /**Производит вывод в консоль всеъ элементов {@link BookShop#katalog}*/
    public void lookKatalog() {
        if(katalog.size()!=0) {
            for(short counter=0;counter<katalog.size();counter++) {
                if(katalog.get(counter) instanceof Journal == true) {
                    Journal elementKatalog = (Journal) katalog.get(counter);
                    System.out.println(elementKatalog.getId()+"\t"+"Название: "+elementKatalog.getName()+"\n\t"+"Кол-во страниц: "
                            +elementKatalog.getNumberOfPages()+"\n\t"+"Номер выпуска: "+elementKatalog.getIssueNumber()+"\n\t"+"Дата выпуска: "+elementKatalog.getDateRelease()
                            +"\n\t"+"Вид бумаги: "+elementKatalog.getKindOfPaper());
                    System.out.println();
                }else {
                    Book elementKatalog = (Book) katalog.get(counter);
                    System.out.println(elementKatalog.getId()+"\t"+"Название: "+elementKatalog.getName()+"\n\t"+"Кол-во страниц: "
                            +elementKatalog.getNumberOfPages()+"\n\t"+"Автор: "+elementKatalog.getAuthor()+"\n\t"+"Год публикации: "+elementKatalog.getYearOfPublication()
                            +"\n\t"+"Издательство: "+elementKatalog.getPublishingHouse()+"\n\t"+"Вид обложки: "+elementKatalog.getCoverView());
                    System.out.println();
                }
            }
        }else {
            System.out.println("В каталоге нет печатных изданий.");
        }
    }
}
