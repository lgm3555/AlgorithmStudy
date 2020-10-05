package week9;

public class BlindPhoneNumber {
    public String solution(String phone_number) {
        String answer = "";

        String strPrefix = "";
        strPrefix = phone_number.substring(0, phone_number.length() - 4);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strPrefix.length(); i++) {
            sb.append("*");
        }

        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));

        return sb.toString();
    }
}
