package animal;

public class Animal {
    private String name; //昵称
    private int month; //年龄
    private String specices; //品种

    public Animal() {
    }

    public Animal(String name, int month, String specices) {
        this.setName(name);
        this.setMonth(month);
        this.setSpecices(specices);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecices() {
        return specices;
    }

    public void setSpecices(String specices) {
        this.specices = specices;
    }

    public void eat(){
        System.out.println(this.getName()+"正在吃东西");
    }

}
