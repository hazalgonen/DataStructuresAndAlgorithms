/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

////////////////////////exception
import java.util.*;


/**
 * Butun islemleri bir arada tutan bir yapi Dosyadan okuma burada yapilir
 *
 * @author hazal
 */
public class Expression extends myException {

    private static final String OPERATORS = "+-*/=";

    /**
     * Sadece 1 satirdaki expressionlari tutuyor
     */
    private MyArrayList<Expression> expression;

    /**
     * constructor
     */
    private String currentLine;

    public Expression() {
        expression = new MyArrayList<>();

    }

    /**
     * String olarak gelen satiri expresiona cevirir ve Expression tipindeki
     * expression MyArrayList'e atar Expression tipi: TemporaryVariable,
     * Variable,Operator olabilir
     *
     * @param satir gelen expression stringi
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidOperator
     */
    protected void convertExpression(String satir) throws MyInvalidOperator, MyArrayIndexOutOfBoundsException {

        //gelen stringi parcalamak icin
        StringTokenizer dosyaTokens = new StringTokenizer(satir);

        //hala parcalanabiliyor mu?
        while (dosyaTokens.hasMoreTokens()) {

            //nextToken stringine bir sonraki eleman atanir
            String nextToken = dosyaTokens.nextToken();

            //ilk karakter kontrolu
            char firstChar = nextToken.charAt(0);

            //print fonksiyonu varsa eger buraya girer
            if (nextToken.equals("print")) {
                Expression print = new printClass();
                expression.add(print);
            } else {
                //eger operator degilse
                if (OPERATORS.indexOf(firstChar) == -1) {
                    //eger digitse gecicidir ve TemporaryVariable olusur
                    if (Character.isDigit(firstChar)) {
                        Expression temp = new TemporaryVariable(Integer.parseInt(nextToken));
                        expression.add(temp);
                    } else { //digit degilse Variable olusur
                        Expression temp = new Variable(nextToken);
                        expression.add(temp);
                    }

                } else if (OPERATORS.indexOf(firstChar) != -1) { //operatorse Operator olusur
                    if (nextToken.length() != 1 || OPERATORS.indexOf(firstChar) == -1) {
                        throw new MyInvalidOperator("Hatali operator girildi");
                    }

                    Expression temp = new Operator(nextToken);
                    expression.add(temp);
                }
            }
        }
    }

    /**
     * expression MyArrayinin i.elemanini return eder
     *
     * @param i index getirilecek olan index
     * @return i.indexin expressionu
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public Expression getExpression(int i) throws MyArrayIndexOutOfBoundsException {
        return expression.get(i);
    }

    /**
     * expression MyArrayine eleman ekler
     *
     * @param ex eklenecek expression
     */
    public void add(Expression ex) {
        expression.add(ex);
    }

    /**
     * expression MyArrayinin size'ini dondurur
     *
     * @return expression'in size'i
     */
    public int size() {
        return expression.size();
    }

    @Override
    public String toString() {
        String strI = "";
        for (int i = 0; i < expression.size(); ++i) {
            try {
                strI = strI + expression.get(i) + " ";
            } catch (MyArrayIndexOutOfBoundsException ex) {
                ex.getMessage();
            }
        }
        return strI;
    }

}
