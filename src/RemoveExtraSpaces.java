public class RemoveExtraSpaces {

    public static void main(String[] args) {
        String str = "  Too       many    spaces    to    remove   from this     string.   ";
        while(str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str.strip());
    }
}