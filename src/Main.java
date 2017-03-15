public class Main {

    public static void main(String[] args) {
	// Работа со строками
        /* str1 - новый общепринятый стандарт, str2 - устаревший стандарт
        String str1 = "Это моя первая строка!!!";

        int lengthOfStr = str1.length();
        System.out.println(lengthOfStr);

        String str1 = "Это моя первая строка";
        System.out.println(str1);

        String str2 = new String("Это моя вторая строка");
        System.out.println(str2);
        */

        /* Проверка пустая строка или нет

        String str1 = "Это моя первая строка!!!";
        String emptyStr = "";
        boolean isStrEmpty = str1.isEmpty();
        System.out.println(isStrEmpty);
        boolean isEmptyStrEmpty = emptyStr.isEmpty();
        System.out.println(isEmptyStrEmpty);
        */

        /* Проверка равенства строк с учётом регистра

        String str1 = "Это моя первая строка!!!";
        String emptyStr = "";
        String str3 = "Это моя первая строка!!!";

        boolean areStringEquals = str1.equals(str3);
        System.out.println(areStringEquals);
        */

        /* Проверка равенства строк без учёта регистра

        String str1 = "Это моя первая строка!!!";
        String emptyStr = "";
        String str3 = "Это Моя Первая Строка!!!";

        boolean areStringEquals = str1.equals(str3);
        System.out.println(areStringEquals);
        boolean areStringEq = str1.equalsIgnoreCase(str3);
        System.out.println(areStringEq);
        */

        /* Проверка по началу и концу строки!!!

        String str1 = "Это моя первая строка!!!";
        String emptyStr = "";
        String str3 = "Это Моя Первая Строка!!!";

        boolean isStrStartsWithEto = str1.startsWith("Это");
        System.out.println(isStrStartsWithEto);
        boolean isStrEnd = str1.endsWith("!!!");
        System.out.println(isStrEnd);
        */

        /* Объединение строк!!!

        String str1 = "Это моя первая строка!!!";
        String emptyStr = " ";
        String str3 = "Это Моя Первая Строка!!!";
        String str4 = "Это добавочная строка";

        String sumOfStrings = str1 + " " + str3;
        System.out.println(sumOfStrings);

        String sum2OfStrings = str1.concat(emptyStr).concat(str3).concat(emptyStr).concat(str4);
        System.out.println(sum2OfStrings);
        */

        /* Замена определённых символов

        String str1 = "Это моя первая строка!!!";

        String str4 = str1.replace("!!!", "???");

        System.out.println(str1);
        System.out.println(str4);
        */

        /* Замена определённых символов на другие!!!

        String str1 = "Это моя первая строка!!!";

        String str4 = str1.replaceFirst("о", "@");
        System.out.println(str4);
        String str5 = str1.replaceAll("о", "@");
        System.out.println(str5);
        */

        /* Содержит ли строка определённые слова!!!

        String str1 = "Это моя первая строка!!!";

        boolean isStrContains = str1.contains("первая");
        System.out.println(isStrContains);
        */

        /* Удаление пробелов в начале и в конце строки!!!

        String str1 = " Это моя первая строка!!!  ";

        System.out.println(str1);
        String str4 = str1.trim();
        System.out.println(str4);
        */

        /* Разбиение строки на подстроки!!!
        String stringForSplit = "Эту строку нужно разбить на подстроки.";
        String[] arrayStr = stringForSplit.split(" ");

            for (int i = 0; i < arrayStr.length; i++) {
                System.out.println(arrayStr[i]);
             }
        */

        /*
        String stringForSplit = "Эту строку нужно разбить на подстроки";
        String[] arrayStr = stringForSplit.split(" ");

        for (int i = 0; i < arrayStr.length; i++) {
            String strWithDot = arrayStr[i].concat(".");
            System.out.println(strWithDot);
        }
        */

        // Разбиение строки на подстроки с заменой "о" на "О" (любой символ)
        String stringForSplit = "Эту строку нужно разбить на подстроки";
        String[] arrayStr = stringForSplit.split(" ");

        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].contains("о")) {
                arrayStr[i] = arrayStr[i].replace("о", "О");
            }
            String strWithDot = arrayStr[i].concat(".");
            System.out.println(strWithDot);
        }
    }
}


    //String str1 = " Это моя первая строка!!!  ";
    //String emptyStr = " ";
    //String str3 = "Это Моя Первая Строка!!!";