public class MyArraySizeException extends RuntimeException {

        int row, column;

        public MyArraySizeException(int row, int column) {
            super("Wrong values, array could be only 4x4. You've got': row " + row + ", column " + column);
            this.row = row;
            this.column = column;
        }
}
