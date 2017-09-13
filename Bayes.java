/*
In the Bayesian (or epistemological) interpretation, probability measures a “degree of belief.” Bayes’ theorem then links the degree of belief in a proposition before and after accounting for evidence. For example, suppose it is believed with 50% certainty that a coin is twice as likely to land heads than tails. If the coin is flipped a number of times and the outcomes observed, that degree of belief may rise, fall or remain the same depending on the results.

For proposition A and evidence B,

        P (A ), the prior, is the initial degree of belief in A.
        P (A | B ), the “posterior,” is the degree of belief having accounted for B.
        the quotient P(B |A )/P(B) represents the support B provides for A.
 */
package bayestheorem;

/**
 *
 * @author olivato
 */
public class Bayes {
    private double faithInH1;
    private double faithInH2;
    private double faithInH1givenVisTrue;
    private double faithInH2givenVisFalse;
    private double probOfV;

    public Bayes(double faithInH1, double faithInH2, double faithInH1givenVisTrue, double faithInH2givenVisFalse) {
        this.faithInH1 = faithInH1;
        this.faithInH2 = faithInH2;
        this.faithInH1givenVisTrue = faithInH1givenVisTrue;
        this.faithInH2givenVisFalse = faithInH2givenVisFalse;
        this.probOfV=this.faithInH1givenVisTrue*this.faithInH1+this.faithInH2givenVisFalse*this.faithInH2;
    }
    private void adjustProbOfV()
    {
        this.probOfV=this.faithInH1givenVisTrue*this.faithInH1+this.faithInH2givenVisFalse*this.faithInH2;
    }
    public void setFaithInH1(double faithInH1) {
        this.faithInH1 = faithInH1;
        adjustProbOfV();
    }

    public void setFaithInH2(double faithInH2) {
        this.faithInH2 = faithInH2;
        adjustProbOfV();
    }

    public void setFaithInH1givenVisTrue(double faithInH1givenVisTrue) {
        this.faithInH1givenVisTrue = faithInH1givenVisTrue;
        adjustProbOfV();
    }

    public void setFaithInH2givenVisFalse(double faithInH2givenVisFalse) {
        this.faithInH2givenVisFalse = faithInH2givenVisFalse;
        adjustProbOfV();
    }
    public double getRealChance()
    {
        return (this.faithInH1givenVisTrue*this.faithInH1)/this.probOfV;
    }
    @Override
    public String toString() {
        return Math.round(getRealChance()*100)+"%";
    }
    
    
}
