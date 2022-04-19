public class Menu {

    //DECLARE VARIABLES

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    private Data lastUpdated;



//CONSTRUCTORS

    public Menu() {

        this.lastUpdated = new Date();



//METHODS GET AND SET

        public ArrayList<MenuItem>  getMenuItems() {return this.menuItems;}

        public void setMenuItems(ArrayList<MenuItem> menuItems) {this.menuItems = ismenuItems;}



        public Date getlastUpdated() {return this.lastUpdated;}

        public void setLastUpdated(Date lastUpdated) {this.lastUpdated = islastUpdated;}

    } MenuItem {



//DECLARE CLASS VARIABLES

        private String name;

        private String description;

        private Double price;



        private String category;

        private Boolean isNew;



//BUILD CONSTRUCTORS AND INITIALIZE THE VARIABLES



//A CONSTRUCTOR THAT TAKES ON MOST IMPORTANT FACTORS OF NAME, DESCRIPTION AND PRICE

public  MenuItem(String name, String description, Double price) {

            this.name = name;

            this.description = description;

            this.price = price;

        }



//SECOND CONSTRUCTOR that PROVIDES ALL OF THE CATEGORIES

public  MenuItem(String name, String description, Double price, String category, Boolean isNew) {

            this.name = name;

            this.description = description;

            this.price = price;

            this.category = “not categorized”;

            this.isNew = false;

        }





//METHODS  GETTER AND SETTERS

        public String getName() {return this.name;}

        public void setName(String name) {this.name = name;}



        public String getDescription() {return this.description;}

        public void setDescription(String name) {this.description = description;}



        public Double getPrice() {return this.price;}

        public void setPrice(Double price) {this.price = price;}



        public String getCategory() {return this.category;}

        public void setCategory(String category) {this.category = category;}



        public Boolean getisNew() {return this.isNew;}

        public void setIsNew(Boolean isNew) {this.isNew = isNew;}
}
