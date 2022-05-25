class GenerateRandom {
    public static void main( String args[] ) {
        int min = 1;
        int max = 6;

        System.out.println("Random values from " +min+ " to " +max+ ":");
      double randomnum = Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(randomnum);
    }
}
