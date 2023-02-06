package sem_06_cw;

import java.util.*;

public class Cat {
    private String name;
    private String sex;
    private String breed;
    private double weight;
    private String owner;

    public List<List<String>> getMedicalHistory() {

        return null;
    }

    public  double getWeight() {
        return this.weight;
    }

    public Map<String, String> getAllInfo() {
        Map<String, String> catInfo = new LinkedHashMap<>();
        catInfo.put("Name", this.name);
        catInfo.put("Sex", this.sex);
        catInfo.put("Breed", this.breed);
        catInfo.put("Weight", Double.toString(this.weight));
        return null;
    }

    public void answerOnName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.equals(this.name)) {
            System.out.println("Meow!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}