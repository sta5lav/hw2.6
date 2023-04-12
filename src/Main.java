import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        String[] words = new String[]{"Hello", "World", "Привет", "Мир", "Мир", "Мир"};
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);
    }


    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> numberSort = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numberSort.add(num);
            }
        }
        System.out.println(numberSort);
    }

    public static void task3(String[] words) {
        Set<String> wordsList = new HashSet<>();
        Collections.addAll(wordsList, words);
        System.out.println(wordsList);
    }

    public static void task4(List<String> strings) {
        int howMuchUni = -1;
        Set<String> wordsList = new HashSet<>(strings);
        for (String st : wordsList) {
            for (String string : strings) {
                if (st.equals(string)) {
                    howMuchUni += 1;
                }
            }
            System.out.println("Количество дублей со словом " + '"' + st + '"' + " = " + howMuchUni);
            //В задаче неправильно указан вывод в консоль, поэтому добавил уточнение :)
            howMuchUni = -1;
        }
    }
}