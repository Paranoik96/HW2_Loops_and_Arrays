package com.cursor.arrays;

public class Application {

    public static void main(String[] args) {

        int[] simpleArray = new int[20];

        FirstTask.randNumbArr(simpleArray);
        FirstTask.minValArray(simpleArray);
        FirstTask.maxValArray(simpleArray);
        FirstTask.sortArrByAscending(simpleArray);
        FirstTask.sortArrByDescending(simpleArray);
        FirstTask.arraySum(simpleArray);
        FirstTask.squareArrVal(simpleArray);

        String[][] str =
                {{"Never", "Say", "Never"},
                        {"Im", "Gonna", "Be", "a Billionaire"},
                        {"Your", "Me", "Give", "Soul"},
                        {"Change", "Destiny", "Before", "You"},
                        {"Rise", "And", "Shine", "Mr.Freeman", "Up"}
                };
        SecondTask.stringDiagonal(str);

        int[] thirdTaskArr = {3, 2, 3, 1, 4, 2, 8, 3};
        ThirdTask.amendDuplicateArrVal(thirdTaskArr);
    }
}
