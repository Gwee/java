/**
 * Created by guy on 11/04/2016.
 */
public class DrawingBoard {
    Shape[] shapesInBoardArr;
    public DrawingBoard(){
        shapesInBoardArr = new Shape[10];
    }
    public void add(Shape... s){
        int nullCount=0;

        //count number of spaces left in array
        for (int i = 0; i <shapesInBoardArr.length ; i++) {
            if (shapesInBoardArr[i] == null){
                nullCount++;
            }
        }
        //if there is not enough room in our Shape array, create a new tmp Array with the size of 1.5 times the original and copy existing into new array and override the existing one
        if (s.length > nullCount){
            double tmp = shapesInBoardArr.length*1.5;
            int newSize = (int)tmp;
            Shape[] tmpShapeArr = new Shape[newSize];
            //now copy the originals to the new tmp array
            int temp =0;
            for (int i = 0; i <shapesInBoardArr.length ; i++) {
                tmpShapeArr[i] = shapesInBoardArr[i];
                temp = i;
            }
            //now copy the new to the tmp array
            for (int i = 0; i < s.length ; i++) {
                tmpShapeArr[temp] = s[i];
                temp++;
            }
            shapesInBoardArr = tmpShapeArr;
        }
        else {
            //if we have enough room, enter the shapes into the Shape array as is
            for (int i = 0; i < s.length ; i++) {
                for (int j = 0; j < shapesInBoardArr.length; j++) {

                    if (shapesInBoardArr[j] != null) {
                        continue;
                    } else {
                        shapesInBoardArr[j] = s[i];
                        break;
                    }
                }
            }
        }
    }
    public Shape getMax(){
        Shape maxShape = null;
        for (int i = 0; i < shapesInBoardArr.length ; i++) {
            if (maxShape==null){
                maxShape = shapesInBoardArr[i];
                continue;
            }
            if (shapesInBoardArr[i] != null && shapesInBoardArr[i].Compare(maxShape) == 1) {
                maxShape = shapesInBoardArr[i];
            }
        }
        return maxShape;
    }
    public Shape getMax3DV1(){
        ThreeDimensionalShape maxShape = null;
        for (int i = 0; i < shapesInBoardArr.length; i++) {
            if(shapesInBoardArr[i]!=null&&shapesInBoardArr[i].getShapeType().equals("3D")){
                ThreeDimensionalShape currentShape = (ThreeDimensionalShape)shapesInBoardArr[i];
                if (maxShape==null){
                    maxShape = currentShape;
                    continue;
                }
                if (currentShape.Compare3D(maxShape) == 1){
                    maxShape = currentShape;
                }
            }
        }
        return maxShape;
    }

    public Shape getMax3DV2(){
        ThreeDimensionalShape maxShape = null;
        for (int i = 0; i < shapesInBoardArr.length; i++) {
            if(shapesInBoardArr[i]!=null&&shapesInBoardArr[i] instanceof ThreeDimensionalShape){
                ThreeDimensionalShape currentShape = (ThreeDimensionalShape)shapesInBoardArr[i];
                if (maxShape==null){
                    maxShape = currentShape;
                    continue;
                }
                if (currentShape.Compare3D(maxShape) == 1){
                    maxShape = currentShape;
                }
            }
        }
        return maxShape;
    }

    public void showAll(){
        for (int i = 0; i < shapesInBoardArr.length; i++) {
            if (shapesInBoardArr[i]!=null) {
                shapesInBoardArr[i].whoAmI();
            }
        }
    }
    public Class[] getTypes(){
        Class[] retClass = new Class[shapesInBoardArr.length];
        for (int i = 0; i < shapesInBoardArr.length ; i++) {
            if (shapesInBoardArr[i]!=null)
            retClass[i] = shapesInBoardArr[i].getClass();
        }
        return retClass;
    }
}
