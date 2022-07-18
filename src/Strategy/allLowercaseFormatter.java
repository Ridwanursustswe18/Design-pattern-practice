package Strategy;

import java.util.Locale;

public class allLowercaseFormatter implements Strategy{
    @Override
    public String bookTitleFormatter(String bookTitle) {
        return bookTitle.toLowerCase(Locale.ROOT);
    }
}
