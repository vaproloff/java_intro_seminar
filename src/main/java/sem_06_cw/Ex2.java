package sem_06_cw;

public class Ex2 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Шарик");
        myCat.setWeight(3.86);
        System.out.println(myCat.getWeight());

        myCat.answerOnName();
    }
}
