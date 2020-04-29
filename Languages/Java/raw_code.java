



//A
public void addReview(ProductReview prodReview)
{

    reviewList.add(prodReview);

    for (pName : productList)
    {
        if(!pName.equals(reviewList.getName()))
        {
            productList.add(prodReview.getName());
        }
    }

}


//B
public int getNumGoodReviews(string prodName)
{

    int counter = 0;

    for (review : reviewList)
    {

        if(review.getName().equals(prodName))
        {
            counter += 1;
        }
    }

    return counter;
}


class Marble implements Circular, Collidable
{
    private int x;
    private int y;
    private int radius

    public Marble(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius
    }

    @Override
    public int getX()
    {
        return x;
    }

    @Override
    public int getY()
    {
        return y;
    }

    @Override
    public int getRadius()
    {
        return radius;
    }


    @Override
    public boolean isCollidableWith(Marble c)
    {
        double d = Math.sqrt(Math.pow((x - c.getX()), 2) + Math.pow((y - c.getY()), 2));
        int radii = radius + c.getRadius();

        if (d < radii)
        {
            return true;
        }

        return false;
    }

}

// b)
public ArrayList<Marble> checkForHit( Marble shooter)
{

    ArrayList<Marble> hitMarble = new ArrayList();

    for (m : marbles;)
    {
        if (m.isCollidableWith(shooter))
        {
            hitMarble.add(m);
        }
    }

    return hitMarble;
}





//A)
public static List<Measurement> createSamples(Measurement[] inputs, int interval)
{

    ArrayList<Measurement> sample;
    int counter = 0;

    for (int i = 0; i < inputs.length;)
    {
        double tempAverage = 0;

        for (int time = 0; time < inputs[i].getElapsed() + interval;)
        {
            tempAverage += inputs[counter].getTemp();
            time += inputs[counter].getElapsed();
            counter++;
        }

        sample.add(new Measurement(inputs[counter].getElapsed(), tempAverage));

        i += counter;

    }
}

//B)
public static double[] findFenceBounds(List<Measurement> samples)
{
    int midIndex = (int)(samples.length / 2);
    int q1Index = (int)(samples.length / 4)
                  int q3Index = midIndex + q1;

    double m = samples[midIndex].getTemp();
    double q1 = samples[q1Index].getTemp();
    double q3 = samples[q3Index].getTemp();
    double iqr = q3 - q1;

    // This is the way to calculate fences, the algorithm in the question is wrong.
    // I will write the way they described if it was actual test.
    double lf = q1 - 1.5 * (iqr);
    double uf = q3 + 1.5 * (iqr);

    double [] fences = {lf, uf};
    return fences;
}

//C)

public static List<Measurement> filterOutliers(List<Measurement> samples)
{
    List<Measurement> noOutlierSample;

    double [] fences = findFenceBounds(samples)
                       lf = fences[0];
    uf = fences[1];

    for (int i = 0; i < samples.length; i++ )
    {
        if (samples[i].getTemp() < lf || samples[i].getTemp() > uf)
        {
            samples.remove(i);

            i--;
        }
    }
}





// Question 1)

public boolean record(int score){

  boolean isPresent = false;

  for (ScoreInfo obj: scoreList) {

    if (obj.getScore()==score) {

      obj.increment();

      return isPresent;

    }else {

      scoreList.add(new ScoreInfo(score));

      isPresent = true;
    }
  }
  return isPresent;
}

public void recordScores(int[] studScores){

  for (int score : studScores) {

    record(score);
  }
}


// Question 2) SeatingChart

public SeatingSchart(List<Student> studentList, int rows, int cols){

  for (int i = 0; i<rows ; i++ ) {

    for (int j = 0; j<cols ;j++ ) {

      seats[i][j] = studentList[i][j].getName();
    }
  }
}

public int removeAbsentStudents(int allowedAbsences){

  int removedStudents=0;

  for (int row = 0; row<seats.size(); row++ ) {

    for (int col = 0; col<seats[0].length(); col++ ) {

      if (seats[row][col].getAbscentCount() > allowedAbsences) {

        seats[row][col] = null;

        removedStudents+=1;
      }
    }
  }
  return removedStudents;
  // It tooks me 34 minutes to complete both questions. I could have done much
  // quicker if I did not have to scroll back and forth to recall the name of
  // the methods.
  // Please comment if I got any part wrong.
}


//A)
public static List<Measurement> createSamples(Measurement[] inputs, int interval)
{

    ArrayList<Measurement> sample;
    int counter = 0;

    for (int i = 0; i < inputs.length;)
    {
        double tempAverage = 0;

        for (int time = 0; time < inputs[i].getElapsed() + interval;)
        {
            tempAverage += inputs[counter].getTemp();
            time += inputs[counter].getElapsed();
            counter++;
        }

        sample.add(new Measurement(inputs[counter].getElapsed(), tempAverage));

        i += counter;

    }
}

//B)
public static double[] findFenceBounds(List<Measurement> samples)
{
    int midIndex = (int)(samples.length / 2);
    int q1Index = (int)(samples.length / 4)
                  int q3Index = midIndex + q1;

    double m = samples[midIndex].getTemp();
    double q1 = samples[q1Index].getTemp();
    double q3 = samples[q3Index].getTemp();
    double iqr = q3 - q1;

    // This is the way to calculate fences, the algorithm in the question is wrong.
    // I will write the way they described if it was actual test.
    double lf = q1 - 1.5 * (iqr);
    double uf = q3 + 1.5 * (iqr);

    double [] fences = {lf, uf};
    return fences;
}

//C)

public static List<Measurement> filterOutliers(List<Measurement> samples)
{
    List<Measurement> noOutlierSample;

    double [] fences = findFenceBounds(samples)
                       lf = fences[0];
    uf = fences[1];

    for (int i = 0; i < samples.length; i++ )
    {
        if (samples[i].getTemp() < lf || samples[i].getTemp() > uf)
        {
            samples.remove(i);

            i--;
        }
    }
}
