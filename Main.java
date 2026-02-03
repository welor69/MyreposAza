import java.util.*;

public class Main{
    public final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();


    }
    public static void task1(){
        ArrayList<String> firstList = new ArrayList<>(Arrays.asList("финансист","титан","стоик","цветы для элджернона"));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList("облако чингизхана","титан","отцы и дети"));
        ArrayList<String> result = new ArrayList<>(firstList);
        result.addAll(secondList);
        result.remove(5);
        System.out.println(result);
    }
    public static void task2(){
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("gentlemen","spider-man","avengers","sherlock holmes"));
        int size = 0;
        String bigMovie = "";
        for(String movie : movies){
            if(movie.length()>size) {
                size = movie.length();
                bigMovie = movie;
            }
        }
        System.out.println("The biggest title is " + bigMovie + "with " + size + " symbols");
    }
    public static void task3(){
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Pizza","Shawarma","Hamburger","Pizza","Plov","Samsa","Pizza"));
        int counter = 0;
        for(String food : foods){
            if(food.equals("Pizza")) counter++;
        }
        System.out.println(counter + " times");
    }
    public static void task4(){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana","Apple","Watermelon","Banana","Peach","Pineapple","Banana"));
        ArrayList<String> result = new ArrayList<>();
        for(String fruit : fruits){
            if(!fruit.equals("Banana")){
                result.add(fruit);
            }
        }
        System.out.println(result);
    }
    public static void task5(){
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Красный","Оранжевый","Желтый","Зеленый","Голубой","Синий","Фиолетовый"));
        colors.replaceAll(n -> "Black");
        System.out.println(colors);
    }
    public static void task6(){
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Basketball", "Football", "Tennis", "Baseball", "Soccer"));
        ArrayList<String> subSports = new ArrayList<>(Arrays.asList("Football","Tennis"));
        int c = 0;
        for(String i : sports){
            for(String y : subSports)
                if(i.equals(y)) c++;
        }
        if(c == 2) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void task7(){
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Lily", "Tulip", "Rose", "Orchid", "Rose"));
        String need = "Rose";
        int first = flowers.indexOf(need);
        int last = flowers.lastIndexOf(need);
        System.out.println("first is " + first);
        System.out.println("last is " + last);
    }
    public static void task8(){
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Dog","Cat","Hamster","Dog","Rabbit","Dog"));
        ArrayList<String> result = new ArrayList<>();
        for(String i : animals){
            if(!(result.contains(i))){
                result.add(i);
            }
        }
        System.out.println(result);
    }
    public static void task9(){
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Bishkek","Osh","Almaty","Astana"));
        String[] citiesArray = cities.toArray(new String[0]);

        System.out.println("ArrayList: " + cities);
        System.out.println("Array: " + Arrays.toString(citiesArray));
    }
    public static void task10(){
        Integer[] numbersArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));

        System.out.println("Array: " + Arrays.toString(numbersArray));
        System.out.println("ArrayList: " + numbersList);
    }
    public static void task11(){
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("USA", "India", "China", "Brazil"));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("India", "China", "France", "Germany"));

        countries1.retainAll(countries2);

        System.out.println("Common elements: " + countries1);
    }
    public static void task12(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Азамат","Эльдар","Атай","Абдулла","Даудбек","Эрен"));

        names.removeIf(name -> name.length() % 2 == 0);

        System.out.println("Odd length names: " + names);
    }
    public static void task13(){
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Учат в школе","Локоны","В белом платье","Твоя нежная походка"));
        int i = songs.get(0).length();
        String songg = "";
        for (String song : songs){
            if(song.length()<i) {
                i = song.length();
                songg = song;

            }
        }
        System.out.println(songg);
    }
    public static void task14(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("chocolate", "flat", "christmas", "mama", "привет", "мир"));
        String vowelPattern = "[aeiouyAEIOUаеёиоуыэюя]";

        for (int i = 0; i < words.size(); i++) {
            String originalWord = words.get(i);
            String replacedWord = originalWord.replaceAll(vowelPattern, "*");
            words.set(i, replacedWord);
        }

        System.out.println(words);


    }
    public static void task15(){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Enter your " + (i+1) + " number:");
            int num = sc.nextInt();
            nums.add(num);
        }
        System.out.println(nums);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int check : nums){
            if(check % 2 == 0) even.add(check);
            else odd.add(check);
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
    public static void task16(){
        ArrayList<String> week = new ArrayList<>(Arrays.asList("Sunday","Saturday","Friday","Thursday", "Wednesday", "Tuesday", "Monday"));
        Collections.reverse(week);
        String today = "";
        for(int i = 0; i < 7; i++){
            today = week.get(0);
            System.out.println(today);
            week.remove(0);
            week.add(today);
            System.out.println(week);
        }
    }
    public static void task17(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Азамат",null,"Эрен","Абдулла",null,"Эльдар"));
        ArrayList<String> newList = new ArrayList<>();
        for (String name : names){
            if(name != null) newList.add(name);
        }
        System.out.println(newList);
    }
    public static void task18(){
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Ironman","Spiderman","Jaws","Venom","Avengers","Snydercut"));
        movies.sort(Comparator.comparingInt(String::length));
        System.out.println(movies.get(movies.size()-2));
    }
    public static void task19(){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("melon","watermelon","apple","pineapple"));
        System.out.println(fruits);
        ArrayList<String> fr2 = new ArrayList<>();
        for(String iter : fruits){
            String str = Integer.toString(iter.length());
            fr2.add(str);
        }
        fruits = fr2;
        System.out.println(fruits);
    }
    public static void task20(){
        ArrayList<ArrayList> familyMembers= new ArrayList<>();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Алтынай","Данияр","Ильяз","Азамат"));
        ArrayList<Integer> age = new ArrayList<>(Arrays.asList(53,57,29,19));
        familyMembers.add(names);
        familyMembers.add(age);
        System.out.println(familyMembers);


    }

}

