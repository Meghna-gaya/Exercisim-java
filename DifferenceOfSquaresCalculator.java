class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sumOfInput=(input*(input+1))/2;
        return sumOfInput*sumOfInput;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare=(input*(input+1)*(2*input+1))/6;
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}