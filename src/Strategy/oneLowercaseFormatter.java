package Strategy;

import java.util.Locale;

public class oneLowercaseFormatter implements Strategy{
    @Override
    public String bookTitleFormatter(String bookTitle) {
        if(bookTitle == null || bookTitle.length() == 0){
            return "";
        }
        if(bookTitle.length() == 1){
            return bookTitle.toLowerCase(Locale.ROOT);
        }
        return Character.toLowerCase(bookTitle.charAt(0))+bookTitle.substring(1);
    }
}
