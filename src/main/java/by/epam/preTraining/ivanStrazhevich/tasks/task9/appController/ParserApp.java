package by.epam.preTraining.ivanStrazhevich.tasks.task9.appController;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.util.ParserResolver;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class ParserApp {
    public static void main(String[] args) {
        Viewer.print("Enter text, or file with plain text location: ");
        Scanner scanner = new Scanner(System.in);
        String textSource = scanner.nextLine();
        ParserResolver parserResolver = ParserResolver.getParserResolver();
        Parsable<Text> parsingUtility = parserResolver.deliverParser(textSource);
        String address = textSource;
        Text text = parsingUtility.parseText(address);
        Viewer.print("from file:  \n" + text.getSourceText());

    }
}
