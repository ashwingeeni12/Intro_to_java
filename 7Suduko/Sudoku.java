// import java.util.Arrays;
// class Sudoku{
//   private int[][] board;

//   Sudoku(String in){
//     this.board = new int[9][9];
//     int k = 0;
//     for(int i = 0; i < board.length; i++){
//       for(int j = 0; j < board[i].length; j++){
//         char c = in.charAt(k++);
//         String str_c = Character.toString(c);
//         this.board[i][j] = Integer.parseInt(str_c);
//       }
//     }
//   }
//   public void print_board(){
//     for(int i = 0; i < board.length; i++){
//       System.out.println(Arrays.toString(this.board[i]));
//     }
//   }
//   public String get_row(int input_r){
//     return Arrays.toString(this.board[input_r]);
//   }
//   public String get_col(int input_c){
//     String output = "";
//     int[] array1 = new int[9];
//     for(int i = 0; i < 9; i++){
//       int col = this.board[i][input_c];
//       array1[i] = col;
//     }
//     return Arrays.toString(array1);
//   }
//   public String get_square(int r, int c){
//     String out = "";
//     switch(r){
//       case 0: 
//       case 1:
//       case 2:
//         r = 1;
//         break;
//       case 3:
//       case 4:
//       case 5:
//         r = 4;
//         break;
//       case 6:
//       case 7:
//       case 8:
//         r = 7;
//         break;
//     }
//     switch(c){
//       case 0: 
//       case 1:
//       case 2:
//         c = 1;
//         break;
//       case 3:
//       case 4:
//       case 5:
//         c = 4;
//         break;
//       case 6:
//       case 7:
//       case 8:
//         c = 7;
//         break;
//     }
//     int[] output_a = new int[9];
//     output_a[0] = this.board[r - 1][c - 1];
//     output_a[1] = this.board[r - 1][c];
//     output_a[2] = this.board[r - 1][c + 1];
//     output_a[3] = this.board[r][c - 1];
//     output_a[4] = this.board[r][c];
//     output_a[5] = this.board[r][c + 1];
//     output_a[6] = this.board[r + 1][c - 1];
//     output_a[7] = this.board[r + 1][c];
//     output_a[8] = this.board[r + 1][c + 1];
//     return Arrays.toString(output_a);
//   }
//   public String get_square(int r){
//     int row = 0;
//     int c = 0;
//     int[] output_a = new int[9];
//     if(r == 0 || r == 1 || r == 2){
//       row = 1;
//       c = 1 + (3 * r);
//     }
//     if(r == 3 || r == 4 || r == 5){
//       row = 4;
//       c = 1 + (3 * (r - 3));
//     }
//     if(r == 6 || r == 7 || r == 8){
//       row = 7;
//       c = 1 + (3 * (r - 6));
//     }
//     output_a[0] = this.board[row - 1][c - 1];
//     output_a[1] = this.board[row - 1][c];
//     output_a[2] = this.board[row - 1][c + 1];
//     output_a[3] = this.board[row][c - 1];
//     output_a[4] = this.board[row][c];
//     output_a[5] = this.board[row][c + 1];
//     output_a[6] = this.board[row + 1][c - 1];
//     output_a[7] = this.board[row + 1][c];
//     output_a[8] = this.board[row + 1][c + 1];
//     return Arrays.toString(output_a);
//   }
// }