import java.util.*;

class Matrix {


    List<List<Integer>> matrix;
    Matrix(List<List<Integer>> values) {
        this.matrix = values;
    }    
	
	//find minimum element in column
    private Integer getColumnMin(int colIndex){
        List<Integer> columnValues;
        columnValues = new ArrayList<>();
        for(List<Integer> j : this.matrix)      
                columnValues.add(j.get(colIndex));
        return Collections.min(columnValues);
    }
    
    private List<Integer> getIndexList(List<Integer> row){
        int i;
        final List<Integer> indexList = new ArrayList<>();
        for (i = 0; i < row.size(); i++) {
            if(Objects.equals(row.get(i), Collections.max(row)))
                indexList.add(i);
        }
        return indexList;
    }
    Set<MatrixCoordinate> getSaddlePoints() {
        Integer colMin;
        int rowIndex = 0;
        Set<MatrixCoordinate> set = new HashSet<>();
        List<MatrixCoordinate> lst = new ArrayList<>();
        for(List<Integer> row  :this.matrix){
            rowIndex++;

            for(int j : getIndexList(row)){
                colMin = getColumnMin(j);                
                if(Objects.equals(colMin , Collections.max(row))){
                    lst.add(new MatrixCoordinate(rowIndex , j+1 ));
                    set = new HashSet<>(lst);
                }
            }        
        }
        return set;
    }

}
