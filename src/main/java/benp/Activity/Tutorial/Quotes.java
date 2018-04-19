package benp.Activity.Tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Quotes{
        private List<String> quotes = new ArrayList(3);

        private Quotes(){
            this.quotes.add("Ben Pearce is the best");
            this.quotes.add("Spring Framework is Brilliant");
            this.quotes.add("Ben Pearce has trained me to program to the Maven Repository");
        }

        public String getRandomQuote() {
            return this.quotes.get(ThreadLocalRandom.current().nextInt(1, this.quotes.size()));
        }
}
