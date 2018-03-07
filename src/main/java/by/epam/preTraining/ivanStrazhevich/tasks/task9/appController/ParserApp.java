package by.epam.preTraining.ivanStrazhevich.tasks.task9.appController;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.ParsingParameters;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.servise.SentenceParser;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.servise.TextConverter;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.util.ParserResolver;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class ParserApp {
    public static void main(String[] args) {
        Viewer.print("Enter plain text, or file with plain text location: ");
        ParsingParameters parsingParameters = new ParsingParameters();
        SentenceParser sentenceParser = new SentenceParser();
        TextConverter textConverter = new TextConverter(parsingParameters);
        Scanner scanner = new Scanner(System.in);
        String textSource = scanner.nextLine();

        ParserResolver parserResolver = ParserResolver.getParserResolver();
        Parsable<Text> parsingUtility = parserResolver.deliverParser(textSource.toString());
        Text text = parsingUtility.parseText(textSource.toString());
        text = sentenceParser.parseTextToSentences(text);

        Viewer.print("Now we parse text to sentences and sort it by words quantity in each: ");
        text = textConverter.sortTextBySentenceLength(text);
        Viewer.print("Check source " + "\n" + text.getSourceText());
        Viewer.print("Check result " + "\n" + text.getParsedText());

        Viewer.print("Enter letter to filter words in order this letter appears");
        parsingParameters.setLetterToFind(scanner.next());
        text = textConverter.sortWordsByQuantityOfSpecificLetter(text);
    }
}
