public class GameBoard {
  private Space[][] board;

  public int getPointsForRow(int targetRow) {
    int points = 0;
    for (int c = 0; c < board[].length(); c++) {
      points += board[targetRow][c].getPoints();
    }
    boolean check = true;
    for (int c = 0; c < board[].length() - 1; c++) {
      if !(board[targetRow][c].getColor().equals(board[targetRow][c + 1].getColor()) {
        check = false;
      }
    }
    if (check == true) {
      return points * 2;
    } else {
      return points;
    }
  }
}
