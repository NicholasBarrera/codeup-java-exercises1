package groceries;
import java.util.ArrayList;

public class GroceryItems {
        private String category;

        private ArrayList<String> items;

        public GroceryItems(String category){
                this.category = category;
                this.items = new ArrayList<>();
        }

        public String getCategory() {
                return this.category;
        }

        public ArrayList<String> getItem(){
                return this.items;
        }
        public void addItems (String item){
                this.items.add(item);
        }

}
