import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String plainText = "Hello Base64!";

        // 인코딩 (텍스트 → Base64)
        String encoded = Base64.getEncoder().encodeToString(plainText.getBytes());
        System.out.println("인코딩 결과: " + encoded);

        // 디코딩 (Base64 → 텍스트)
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("디코딩 결과: " + decoded);
    }
}
