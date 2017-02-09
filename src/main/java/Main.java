import datasource.util.ComponistDAO;
import datasource.util.util.DatabaseProperties;

/**
 * Created by Arthur on 31-1-2017.
 */
public class Main {
    public static void main(String[] args) {

        ComponistDAO Dao = new ComponistDAO(new DatabaseProperties());
        Dao.tryFindAll();

    }
}