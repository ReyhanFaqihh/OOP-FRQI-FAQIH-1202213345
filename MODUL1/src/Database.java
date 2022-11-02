import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listmenu = new ArrayList<Menu>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu item) {
        listmenu.add(item);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        for (int i = 0; i < listmenu.size(); i++) {
            System.out.println((i + 1) + "." + listmenu.get(i).namaMenu + "." + listmenu.get(i).categoryMenu + "."
                    + listmenu.get(i).price);
        }
    }

    // TODO Create Method to Search Menu from Database
    public void searchMenu(String keywords) {
        for (int i = 0; i < listmenu.size(); i++) {
            if (keywords.toLowerCase() == listmenu.get(i).namaMenu.toLowerCase()) {
                System.out.println((i + 1) + "." + listmenu.get(i).namaMenu + "." + listmenu.get(i).categoryMenu + "."
                        + listmenu.get(i).price);
            }

        }
    }

}
