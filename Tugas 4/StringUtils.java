public class StringUtils {
    public static String generateNickName(String fullName) {
        String[] parts = fullName.trim().split(" ");
        return parts[parts.length - 1];
    }
}
