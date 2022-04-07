import java.util.ArrayList;
import java.util.List;

public class ParseSearchTerms {
    /**
     * This method parses a combined string of search terms into the individual
     * terms. A search term is either a single word or a series of words enclosed
     * in double-quotes. For example,
     * <p>
     * Ping "interview questions"
     * <p>
     * returns a List that contains these two items:
     * <p>
     * Ping
     * interview questions
     *
     * @param query A non-null String of query terms separated by spaces.
     *              Multi-word search terms must be included in double-quotes.
     * @return A List of Strings that represent the individual search terms
     * specified in the query string.
     */
    public static List<String> parseSearchTerms(String query) {
        // check validity of query: non-null

        List<String> output = new ArrayList<String>();
        StringBuilder buffer = new StringBuilder();
        boolean oddNumQuotes = false;

        for (int i = 0; i < query.length(); i++) {
            char c = query.charAt(i);

            // check character should be added to buffer or term should be added to list
            if (c == '"') {
                oddNumQuotes = !oddNumQuotes;
                if (!oddNumQuotes && buffer.length() != 0) {
                    output.add(buffer.toString());
                    buffer = new StringBuilder();
                }
            } else if (c == ' ') {
                if (oddNumQuotes) {
                    buffer.append(c);
                } else if (buffer.length() != 0){
                    output.add(buffer.toString());
                    buffer = new StringBuilder();
                }
            } else {
                buffer.append(c);
            }
        }

        if (buffer.length() != 0) {
            output.add(buffer.toString());
            buffer = new StringBuilder();
        }

        return output;
    }

    public static void main(String[] args) {
        String query = "sex \"Ping slut\" \"titties and ass\"";

        List<String> terms = parseSearchTerms(query);

        for (String term : terms) {
            System.out.println(term);
        }
    }
}
