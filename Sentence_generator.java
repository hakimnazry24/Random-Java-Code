public class Sentence_generator {
    public static void main(String[] args){
        String[] wordlist1 = {"Food", "Drinks", "People", "Bread", "Computer", "Coffee"};
        String[] wordlist2 = {"taste", "sounds", "looks", "feels"};
        String[] wordlist3 = {"great", "delicious", "stale", "boring", "scrumptious"};

        int length1 = wordlist1.length;
        int length2 = wordlist2.length;
        int length3 = wordlist3.length;

        int rand1  = (int) (Math.random() * length1);
        int rand2  = (int) (Math.random() * length2);
        int rand3  = (int) (Math.random() * length3);

        String phrase = wordlist1[rand1] + " " + wordlist2[rand2] + " " + wordlist3[rand3];
        System.out.println(phrase);
    }
}
