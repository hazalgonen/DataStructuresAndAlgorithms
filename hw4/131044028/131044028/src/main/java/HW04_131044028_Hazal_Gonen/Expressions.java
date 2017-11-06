/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hazal gonen Expressions classi butun dosyada ki expressionlari tutar
 * sinif
 */
public class Expressions extends myException {

    /**
     * Dosyadan butun yazanlari tutar
     */
    private MyArrayList<String> context;

    /**
     * Butun dosyanin infix halini tutar
     */
    private MyArrayList<Expression> infixExpressions = new MyArrayList<>();

    /**
     * Butun dosyanin postfix halini tutar
     */
    private MyArrayList<Expression> postfixExpressions = new MyArrayList<>();

    /**
     * Constructor direk okuma islemini yapar ve infix hale cevirir
     *
     * @param path okunacak dosyanin pathi
     *
     */
    public Expressions(String path) {
        try {
            context = new MyArrayList<>();
            readTxt(path);
        } catch (myException.MyIOException ex) {
            ex.getMessage();
        }
    }

    /**
     * constructor
     */
    public Expressions() {
        context = new MyArrayList<>();
    }

    /**
     * satir ekler
     *
     * @param satir
     */
    public void addLine(String satir) {
        context.add(satir);
    }

    public void execute() throws MyInvalidOperator, MyArrayIndexOutOfBoundsException {

        for (int i = 0; i < context.size(); ++i) {
            Expression expression_ = new Expression();

            expression_.convertExpression(context.get(i));

            infixExpressions.add(expression_);
        }
    }

    /**
     * Dosyayi okuma fonksiyonu
     *
     * @param path okunacak dosya pathi
     * @throws IOException
     */
    private void readTxt(String path) throws MyIOException {
        try {
            //dosya okuma
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            //ilk satir okundu
            String satir = reader.readLine();

            while (satir != null) {
                //her satir context'e eklendi
                context.add(satir);
                satir = reader.readLine();
            }
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw new MyIOException("Dosya okunamadi");

            }

        }
    }

    /**
     * infix halden postfixe cevirir
     *
     * @throws HW04_131044028_Hazal_Gonen.myException.MyInvalidClass
     * @throws HW04_131044028_Hazal_Gonen.myException.MyClassCastException
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    public void convertInfixToPostfix() throws MyInvalidClass, MyClassCastException, MyArrayIndexOutOfBoundsException {

        for (int i = 0; i < infixExpressions.size(); ++i) {
            InfixToPostfix infixToPostfix = new InfixToPostfix();
            postfixExpressions.add(infixToPostfix.convert(infixExpressions.get(i)));

        }
        printInfixToPostfix();
    }

    /**
     * postfixi print yapar
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     */
    private void printInfixToPostfix() throws MyArrayIndexOutOfBoundsException {

        System.out.println("**************************************");
        System.out.println("POSTFIX HALI");
        for (int i = 0; i < postfixExpressions.size(); ++i) {
            for (int j = 0; j < postfixExpressions.get(i).size(); ++j) {
                System.out.printf("%s ", postfixExpressions.get(i).getExpression(j));
            }
            System.out.println("");
        }
        System.out.println("**************************************");
    }

    /**
     * postfix halden assemblye cevirir
     *
     * @throws
     * HW04_131044028_Hazal_Gonen.myException.MyArrayIndexOutOfBoundsException
     * @throws java.io.IOException
     */
    public void convertPostfixToAssembly() throws MyArrayIndexOutOfBoundsException, IOException {
        //postfixden assemblye ceviren class
        String filename = "output.asm";

        PrintWriter writer = new PrintWriter(filename);
        writer.print("");
        writer.close();
        PostfixToAsm postfixToAsm_ = new PostfixToAsm();

        //direk assembly'e cevirir ve print yapar
        for (int i = 0; i < postfixExpressions.size(); ++i) {
            System.out.println("");
            postfixToAsm_.convert(postfixExpressions.get(i));

        }
    }

}
