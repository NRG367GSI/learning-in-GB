import java.io.File;

public class workFile {
    static void file() {
        // определяем объект для каталога
        File dir = new File("C:\\Users\\Professional\\Desktop\\JAVA_projects\\Experimrnt");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }

}
