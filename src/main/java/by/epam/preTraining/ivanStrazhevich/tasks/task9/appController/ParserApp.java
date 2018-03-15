package by.epam.preTraining.ivanStrazhevich.tasks.task9.appController;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.ParsingParameters;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.TextParserable;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.servise.TextParser;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.servise.TextConverter;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.servise.ParserResolver;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class ParserApp {
    public static void main(String[] args) {
        Viewer.print("Enter plain text, or file with plain text location: ");
        ParsingParameters parsingParameters = new ParsingParameters();
        TextParserable textParser = new TextParser();
        TextConverter textConverter = new TextConverter(parsingParameters);
        Scanner scanner = new Scanner(System.in);
        String textSource = scanner.nextLine();

        ParserResolver parserResolver = ParserResolver.getParserResolver();
        Parsable<Text> parsingUtility = parserResolver.deliverParser(textSource.toString());
        Text text = parsingUtility.parseText(textSource.toString());

        Viewer.print("Now we parse text to sentences and sort it by words quantity in each: ");
        text = (Text) textParser.parseTextToSentences(text);
        text = textConverter.sortTextBySentenceLength(text);
        Viewer.print("Check source " + "\n" + text.getSourceText());
        Viewer.print("Check result " + "\n" + text.getParsedText());

        Viewer.print("Enter letter to filter words in order this letter appears");
        String parserParam = scanner.next();
        parsingParameters.setLetterToFind(parserParam);

        Viewer.print("Now we parse text to words and sort it by number of your letter in each word: ");
        text = (Text) textParser.parseTextToWords(text);
        text = textConverter.sortWordsByQuantityOfSpecificLetter(text);
        Viewer.print("Check source " + "\n" + text.getSourceText());
        Viewer.print("Check result " + "\n" + text.getParsedText());
    }
}
