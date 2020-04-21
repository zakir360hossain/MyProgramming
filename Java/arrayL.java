
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


// Question 2)

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
