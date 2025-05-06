public class StringUtils {
    
    public static String getNickName(String fullName) {
        if (fullName == null || fullName.isBlank()) {
            return "";
        }

        String[] words = fullName.trim().split("\\s+");

        if (words.length == 1) {
            return words[0];
        } else {
            return words[words.length -1];
        }
    }
}
