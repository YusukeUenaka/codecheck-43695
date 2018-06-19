package codecheck;

public class App {

    private static String ENCODE = "encode";
    private static String DECODE = "decode";
    private static String ALIGN = "align";
    private static int SHIN_10 = 10;
    private static int SHIN_9 = 9;

    public static void main(String[] args) {
        for (int i = 0, l = args.length; i < l; i++) {
            //String output = String.format("argv[%s]: %s", i, args[i]);
            String output = answer(args[i],args[i+1]);
            System.out.println(output);
        }
    }

    public static String answer(String args, String args2) {
        String str = null;
        String cmd = args.toString();
        String num = args2.toString();
        //引数二つ目の0判定
        if (!num.isEmpty()) {
            str = num;
        }

        //処理
        if (isNumber(str) && ENCODE.equals(cmd)) {
            return encode(num, SHIN_10);
        }

        if (DECODE.equals(cmd)) {
            Long numL = Long.parseLong(num);
            return decode(numL, SHIN_10);
        } else if (ALIGN.equals(cmd)) {
            return align(num);
        }

    }

    public static Long encode(String A, int B) {
        String str = A;
        int radix = B;
        Long result = Long.parseLong(str, radix);
        return result;
    }

    public static String decode(Long A, int B) {
        Long str = A;
        int radix = B;
        String result = Long.toString(str, radix);
        return result;
    }

    public static String align(String A) {
        String result = null;
        String str = A;
        int base = Integer.parseInt(str, SHIN_9);

        return result;
    }


    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
            } catch (NumberFormatException e) {
            return false;
        }
    }
}