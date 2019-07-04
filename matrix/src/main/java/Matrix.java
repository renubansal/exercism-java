import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {


    List<List<Integer>> matrix;
    Matrix(String matrixAsString) {
        matrix = new ArrayList<>();
        List<Integer> intList;
        for(String l: matrixAsString.split("\n")){
            // stream to convert string list to an int list
            intList = Arrays.asList(l.split(" ")).stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
            matrix.add(intList);
        }
    }
    int[] getRow(int rowNumber) {
        List<Integer> row = this.matrix.get(rowNumber-1);
		//Here stream convert List<Integer> into an int array
        return row.stream().mapToInt(i->i).toArray();
    }

    int[] getColumn(int columnNumber) {
        ArrayList<Integer> column = new ArrayList<>();
        for(List<Integer> lst:matrix){
            column.add(lst.get(columnNumber-1));
        }
        return column.stream().mapToInt(i->i).toArray();
    }
}
