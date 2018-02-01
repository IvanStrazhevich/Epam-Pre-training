package task2.spellNumber;

public class SpellNumber {
    public static String parseLessThen10(Integer digits) {
        String result = null;
        switch (digits) {
            case 1:
                result = "один";
                break;
            case 2:
                result = "два";
                break;
            case 3:
                result = "три";
                break;
            case 4:
                result = "четыре";
                break;
            case 5:
                result = "пять";
                break;
            case 6:
                result = "шесть";
                break;
            case 7:
                result = "семь";
                break;
            case 8:
                result = "восемь";
                break;
            case 9:
                result = "девять";
                break;
            case 0:
                result = "";
        }
        return result;
    }

    public static String parseLessThen20(Integer digits, Integer dozens) {
        String result = null;

        if (dozens == 1 && digits == 0) {
            result = "десять";
        } else {
            switch (digits) {
                case 1:
                    result = "одиннадцaть";
                    break;
                case 2:
                    result = "двенадцать";
                    break;
                case 3:
                    result = "тринадцать";
                    break;
                case 4:
                    result = "четырнадцать";
                    break;
                case 5:
                    result = "пятнадцать";
                    break;
                case 6:
                    result = "шестнадцать";
                    break;
                case 7:
                    result = "семнадцать";
                    break;
                case 8:
                    result = "восемнадцать";
                    break;
                case 9:
                    result = "девятнадцать";
                    break;
                case 0:
                    result = "";
            }
        }
        return result;
    }

    public static String parseLessThen100(Integer dozens) {
        String result = null;
        switch (dozens) {
            case 2:
                result = "двадцать";
                break;
            case 3:
                result = "тридцать";
                break;
            case 4:
                result = "сорок";
                break;
            case 5:
                result = "пятьдесят";
                break;
            case 6:
                result = "шестьдесят";
                break;
            case 7:
                result = "семьдесят";
                break;
            case 8:
                result = "восемьдесят";
                break;
            case 9:
                result = "девяносто";
                break;
            case 0:
                result = "";
        }
        return result;
    }

    public static String parseLessThen1000(Integer hundreds) {
        String result = null;
        switch (hundreds) {
            case 1:
                result = "сто";
                break;
            case 2:
                result = "двести";
                break;
            case 3:
                result = "триста";
                break;
            case 4:
                result = "четыреста";
                break;
            case 5:
                result = "пятьсот";
                break;
            case 6:
                result = "шестьсот";
                break;
            case 7:
                result = "семьсот";
                break;
            case 8:
                result = "восемьсот";
                break;
            case 9:
                result = "девятьсот";
                break;
        }
        return result;
    }

    public static StringBuffer spellNumber(Integer number) {
        StringBuffer result = new StringBuffer();
        if (number >= 0 && number < 1000) {
            int hundreds = number / 100;
            int dozens = number % 100 / 10;
            int digits = number % 10;

            result.append("Число в виде строки: ");
            if (number == 0) {
                result.append("ноль");
            } else if (number < 10) {
                result.append(parseLessThen10(digits));
            } else if (number < 20) {
                result.append(parseLessThen20(digits, dozens));
            } else if (number < 100) {
                result.append(parseLessThen100(dozens) + " " + parseLessThen10(digits));
            } else if (number < 1000) {
                if (dozens == 0) {
                    result.append(parseLessThen1000(hundreds) + " " + parseLessThen10(digits));
                } else if (dozens != 1) {
                    result.append(parseLessThen1000(hundreds) + " " + parseLessThen100(dozens) +
                            " " + parseLessThen10(digits));
                } else {
                    result.append(parseLessThen1000(hundreds) +
                            " " + parseLessThen20(digits, dozens));
                }
            }
            return result;
        } else {
            return result.append("Введите число в диапазоне от 0 до 999 включительно");
        }
    }
}
