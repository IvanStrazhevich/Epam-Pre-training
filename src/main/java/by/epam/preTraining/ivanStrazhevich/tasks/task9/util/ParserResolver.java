package by.epam.preTraining.ivanStrazhevich.tasks.task9.util;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;

public class ParserResolver {
    private static ParserResolver parserResolver;

    public static ParserResolver getParserResolver() {
        if (parserResolver == null) {
            parserResolver = new ParserResolver();
        }
        return parserResolver;
    }

    private ParserResolver() {
    }

    public Parsable deliverParser(String source) {
        Parsable parseTextFromFile = new ParsingUtilityForFile();
        Parsable parseTextFromString = new ParsingUtilityForText();
        if (source != null &&
                ( source.contains(".txt") || source.contains(".rtf") )) {
            System.out.println("for file");
            return parseTextFromFile;
        } else {
            System.out.println("for text");
            return parseTextFromString;
        }
    }
}
