public class Main {

    public static void main(String[] args) {
        ModArrayList<Character> list = new ModArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        System.out.println("List[0]: " + list.get(0));
        System.out.println("List[-4]: " + list.getUsingMod(-4));
    }
}
