package _0224_object_modeling_revisited;

import java.util.Arrays;

public class Round {
    private MMColor[] guess = new MMColor[4];
    private int[] response = new int[2];
    private boolean[] guessMatched = new boolean[4];
    private boolean[] codeMatched = new boolean[4];

    public Round(MMColor guess[], MMColor code[]) {
        this.guess = guess;
        
        // in place
        for(int i=0; i<guess.length; i++) {
            if(guess[i] == code[i]) {
                response[0]++;
                guessMatched[i] = true;
                codeMatched[i] = true;
            }
        }

        // correct but not in place
        for(int i=0; i<guess.length; i++) {
            if(guessMatched[i]) continue;
            for(int j=0; j<guess.length; j++) {
                if(codeMatched[j]) continue;
                if(guess[i] == code[j]) {
                    response[1]++;
                    codeMatched[j] = true;
                    break;
                }
            }
        }
    }

    public MMColor[] getGuess() {
        return guess;
    }

    public int[] getResponse() {
        return response;
    }

    public static void main(String[] args) {
        // MMColor[] guess1 = new MMColor[]{MMColor.r, MMColor.Green, MMColor.Green, MMColor.Blue};
        // MMColor[] guess2 = new MMColor[]{MMColor.Red, MMColor.Red, MMColor.Red, MMColor.Red};
        // MMColor[] guess3 = new MMColor[]{MMColor.Green, MMColor.Green, MMColor.Green, MMColor.Green};
        // MMColor[]  code1 = new MMColor[]{MMColor.Green, MMColor.Green, MMColor.Purple, MMColor.Blue};
        MMColor[] guess4 = new MMColor[]{MMColor.g, MMColor.g, MMColor.b,  MMColor.r};
        MMColor[]  code2 = new MMColor[]{MMColor.r,   MMColor.g, MMColor.g, MMColor.b};
        Round round = new Round(guess4, code2);
        int[] response = round.getResponse();
        System.out.println(Arrays.toString(response));
    }
}
