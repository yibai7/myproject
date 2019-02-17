package animal;

public class Dog extends Animal {
    private String sex;//性别

    public Dog() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 狗狗睡觉的方法
     */
    public void sleep(){
        System.out.println(this.getMonth()+"的狗狗正在睡觉。");
    }
}
