package Strategy;

import java.util.Locale;

public class uppercaseFormatter implements Strategy{

    @Override
    public String bookTitleFormatter(String bookTitle) {
        return bookTitle.toUpperCase(Locale.ROOT);
    }
}
