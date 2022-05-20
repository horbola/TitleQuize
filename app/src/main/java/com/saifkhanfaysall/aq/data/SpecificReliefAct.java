package com.saif.android.data;

import java.io.Serializable;

public class SpecificReliefAct extends Act implements Serializable {

    public String[] title = {"Short title, extent and commencement  ", "Definitions  ", "Dismissal of suits, etc., instituted, etc., after period of limitation  ", "Where Court is closed when period expires  ", "Extension of period in certain cases  ", "Legal disability  ", "Disability of one of several plaintiffs or applicants  ", "Special exceptions  ", "Continuous running of time  ", "Suits against express trustees and their representatives  ", "Suits on foreign contracts  ", "Exclusion of time in legal proceedings  ", "Exclusion of time of defendant’s absence from Bangladesh and certain other territories  ", "Exclusion of time of proceeding bona fide in Court without jurisdiction  ", "Exclusion of time during which proceedings are suspended  ", "Exclusion of time during which proceedings to set aside execution-sale are pending  ", "Effect of death before right to sue accrues  ", "Effect of fraud  ", "Effect of acknowledgement in writing  ", "Effect of payment on account of debt as of interest on legacy  ", "Agent of persons under disability  ", "Effect of substituting or adding new plaintiff or defendant  ", "Continuing breaches and wrongs  ", "Suit for compensation for act not actionable without special damage  ", "Computation of time mentioned in instruments  ", "Acquisition of right to easements  ", "Exclusion in favour of reversioner of servient tenement.  ", "Extinguishment of right to property  ", "Savings  ", "Repealed"};
    public String[] opt1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "21A", "22", "23", "24", "25", "26", "27", "27A", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45-51", "52", "53", "54", "55", "56", "57"};
    public String[] opt2 = {"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45-51", "52", "53", "54", "55", "56", "57", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "21A", "22", "23", "24", "25", "26", "27", "27A", "28", "29", "30"};
    public String[] opt3 = {"45-51", "52", "53", "54", "55", "56", "57", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "21A", "22", "23", "24", "25", "26", "27", "27A", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44"};
    public String[] opt4 = {"16", "17", "18", "19", "20", "21", "21A", "22", "23", "24", "25", "26", "27", "27A", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45-51", "52", "53", "54", "55", "56", "57", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

            
    
    @Override
    public String[] getTitle() {
        return title;
    }

    @Override
    public String[] getOpt1() {
        return opt1;
    }

    @Override
    public String[] getOpt2() {
        return opt2;
    }

    @Override
    public String[] getOpt3() {
        return opt3;
    }

    @Override
    public String[] getOpt4() {
        return opt4;
    }
    
}
