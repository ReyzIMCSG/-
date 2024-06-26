// Animal
public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

// Dog
public class Dog extends Animal {
    public static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }
}

// Cat
public class Cat extends Animal {
    private boolean satiety;

    public static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.satiety = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт.");
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}

// Bowl.java
public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public int getFood() {
        return food;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");

        // Проверка бега и плавания
        dogBobik.run(150);
        dogBobik.swim(5);

        catBarsik.run(150);
        catBarsik.swim(5);

        // Проверка кормления котов
        Bowl bowl = new Bowl(20);

        Cat[] cats = {catBarsik, catMurzik};
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        // Вывод информации о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Добавление еды в миску и повторная попытка накормить котов
        bowl.addFood(15);
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(bowl, 10);
            }
        }

        // Вывод окончательной информации о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Вывод количества животных
        System.out.println("Количество животных: " + Animal.animalCount);
        System.out.println("Количество собак: " + Dog.dogCount);
        System.out.println("Количество котов: " + Cat.catCount);
    }
}
