package Model;
//Will have list of items that are supposed to be in the recycler view
public class LibraryList {
    private String name;
    private String region;
    public LibraryList(String name,String reg){
        this.name=name;
        this.region=reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
