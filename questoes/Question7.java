class Question7 {

    public static void main(String[] args) {
        int[] intArr = {8, 16, 32, 64, 128};

        for (int i : intArr) {
            System.out.println(i + " ");
        }

        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " <- ");
        }
    }

}