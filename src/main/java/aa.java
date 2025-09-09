public class aa {
    public static void main(String[] args) {
        int x = 5; // 기본 타입 → 값 5가 그대로 저장됨
        Integer y = 5; // 참조 타입 → Integer 객체를 가리킴

        System.out.println(x + 10); // 15 (그냥 계산)
        System.out.println(y + 10); // 15 (오토언박싱 덕분에 계산 가능)
        System.out.println(y.toString()); // "5" (객체니까 메서드 사용 가능)

    }

}
