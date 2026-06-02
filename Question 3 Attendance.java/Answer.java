public class Attendance {
  private ArrayList<CourseRecord> historyList;
  private ArrayList<CourseRecord> mathList;

  public int moreHistoryThanMathAbsences() {
    int count = 0;
    for (int j = 0; j < historyList.size(); j++) {
      for (int k = 0; k < mathList.size(); k++) {
        if (historyList.get(j).getStudentID().equals(mathList.get(k).getStudentID()) {
          if (historyList.get(j).getAbsences() > mathList.get(k).getAbsences()) {
            count++;
          }
        }
      }
    }
    return count;
  }
