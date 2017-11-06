/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

/**
 * Kendim exception firlatmak icin bu classi kullaniyorum
 *
 * @author hazal
 */
public class myException extends Exception {

    private String message = null;

    /**
     * Eger parametresiz cagirilirse Exception sinifinin hatasini kullansin
     */
    public myException() {
        super();
    }

    /**
     * Girilen mesaji yollasin
     *
     * @param message gonderilecek ileti
     */
    public myException(String message) {
        super(message);
        this.message = message;
    }

    public static class MyArithmeticException extends myException {

        public MyArithmeticException() {
            super();
        }

        public MyArithmeticException(String message) {
            super(message);
        }

    }

    /**
     * MyArrayList'in size sorunu olursa bu exception firlatilir
     */
    public static class MyArrayIndexOutOfBoundsException extends myException {

        public MyArrayIndexOutOfBoundsException() {
            super();
        }

        public MyArrayIndexOutOfBoundsException(String message) {
            super(message);
        }
    }

    /**
     * hatali cast yapilirsa bu exception firlatilir
     */
    public static class MyClassCastException extends myException {

        public MyClassCastException() {
            super();
        }

        public MyClassCastException(String message) {
            super(message);
        }
    }

    public static class MyNullPointerException extends myException {

        public MyNullPointerException() {
            super();
        }

        public MyNullPointerException(String message) {
            super(message);
        }
    }

    public static class MyFileNameException extends myException {

        public MyFileNameException() {
            super();
        }

        public MyFileNameException(String message) {
            super(message);
        }
    }

    /**
     * operator + - * / olabilir
     */
    public static class MyInvalidOperator extends myException {

        public MyInvalidOperator() {
            super();
        }

        public MyInvalidOperator(String message) {
            super(message);
        }
    }

    /**
     * Dosya read yapilirken hata cikarsa bu exception firlatilir
     */
    public static class MyIOException extends myException {

        public MyIOException() {
            super();
        }

        public MyIOException(String message) {
            super(message);
        }
    }

    public static class MyInvalidClass extends myException {

        public MyInvalidClass() {
            super();
        }

        public MyInvalidClass(String message) {
            super(message);
        }
    }

}
