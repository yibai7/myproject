package animal;

public class Cat extends Animal {
    private double weight; //体重

    public Cat() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 跑动的方法
     */
    public void run(){
        System.out.println(this.getSpecices()+"正在奔跑");
    }
}
