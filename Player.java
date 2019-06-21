public class Player {
    private String name;
    private int age;
    private String gender;
    private int level;
    private int[] inventory = new int[10];

    /******************************************/
    
    public String getName() {
        return this.name;
    } //getName

    public int getAge() {
        return this.age;
    } //getAge

    public String getGender() {
        return this.gender;
    } //getGender

    public int getLevel() {
        return this.level;
    } //getLevel
    
    /******************************************/

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }
} //Player