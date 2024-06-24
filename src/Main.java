import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Egor Alla Alexander";
        Pattern pattern = Pattern.compile("A.+a");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
        String s = "The root directory is \nWindows";
        String s2 = "The root directory is \u00A7Windows";
        System.out.println(s2);

        System.out.println();
        String text2 = "Egor Alla Anna";
        Pattern pattern2 = Pattern.compile("\\s");
        String[] strings = pattern2.split(text2,2);
        for (String s3 : strings) {
            System.out.println(s3);
        }

        System.out.println("---------");
        String[] strings1 = pattern2.split(text2);
        for (String s4 : strings1) {
            System.out.println(s4);
        }

        // 3
        System.out.println();
        String textM = "Egor Alla Anna";
        Pattern patternM = Pattern.compile("A.+?a");

        Matcher matcherM = patternM.matcher(textM);
        while (matcherM.find()) {
            int start=matcherM.start();
            int end=matcherM.end();
            System.out.println("Match found " + textM.substring(start,end) + " с "+ start + " By " + (end-1) + " position");
        }
        System.out.println(matcherM.replaceFirst("Ira"));
        System.out.println(matcherM.replaceAll("Olga"));
        System.out.println(textM);
    }
}
