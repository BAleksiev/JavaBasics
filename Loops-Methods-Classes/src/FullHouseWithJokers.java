public class FullHouseWithJokers {

    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "Jo"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        int fullHouseCount = 0;
        
        for (int firstPair = 0; firstPair < cards.length; firstPair++) {
            for (int secondPair = 0; secondPair < cards.length; secondPair++) {
                if(firstPair != secondPair) {
                    for (int firstSuit = 0; firstSuit < 4; firstSuit++) {
                        for (int secondSuit = firstSuit + 1; secondSuit < 4; secondSuit++) {
                            for (int thirdSuit = secondSuit + 1; thirdSuit < 4; thirdSuit++) {
                                for (int fourthSuit = 0; fourthSuit < 4; fourthSuit++) {
                                    for (int fifthSuit = fourthSuit + 1; fifthSuit < 4; fifthSuit++) {
                                        
                                        fullHouseCount++;
                                        System.out.printf("%s%s %s%s %s%s %s%s %s%s%n", 
                                                cards[firstPair], suits[firstSuit],
                                                cards[firstPair], suits[secondSuit],
                                                cards[firstPair], suits[thirdSuit],
                                                cards[secondPair], suits[fourthSuit],
                                                cards[secondPair], suits[fifthSuit]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(fullHouseCount);
    }
}
