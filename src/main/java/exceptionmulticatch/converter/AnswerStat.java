package exceptionmulticatch.converter;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnswerStat {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerStat.class);

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String checkboxes) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(checkboxes);
        }catch(NullPointerException | IllegalArgumentException ex){
            LOGGER.error(ex.getMessage(), ex);
            throw new InvalidBinaryStringException(ex);
        }

    }

   public int answerTruePercent(String answers) {
        boolean[] boo =convert(answers);
        int numberOfTrue = 0;
        for (int i = 0; i < boo.length; i++) {
            if (boo[i]) {
                numberOfTrue++;
            }
        }
        return (int)Math.round((double)numberOfTrue / boo.length * 100);
   }
}
*/