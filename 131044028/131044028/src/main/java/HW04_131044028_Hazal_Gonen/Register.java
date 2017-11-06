/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_131044028_Hazal_Gonen;

/**
 * Registerlar icin kullanilan class
 *
 * @author hazal
 */
public class Register {

    /**
     * registerlarin alabilecekleri degerleri tuttugum String
     */
    private MyArrayList<String> REGISTERS;

    /**
     * Registerlarin bos mu dolu mu oldugunu bu array ile cözdüm
     */
    private static int[] USED = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private String register;

    int size;

    static int index = 0;

    public Register() throws myException.MyArrayIndexOutOfBoundsException {

        this.REGISTERS = new MyArrayList<>();
        setRegister();
        if (index > 8) {
            System.out.println("HATAA");
        }
        for (int i = 0; i < USED.length; ++i) {
            if (USED[i] == 0) {
                register = REGISTERS.get(i);
                USED[i] = 1;
                i = USED.length + 1;
            }
        }

        //  System.out.println("index: "+ index);
        //  ++index;
    }

    public String getRegister() {
        return register;
    }

    public int getIndexRegister() throws myException.MyArrayIndexOutOfBoundsException {

        if (register != null) {
            for (int i = 0; i < REGISTERS.size(); ++i) {
                if (REGISTERS.get(i).equals(register)) {
                    return i;
                }
            }
        }

        return 0;
    }

    public int getUnUsedRegister() {
        for (int i = 0; i < USED.length; ++i) {
            if (USED[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public void deleted(int in) {
        USED[in] = 0;
    }

    public void setRegister() {
        for (int i = 0; i < 9; ++i) {
            String str = "t" + i;
            REGISTERS.add(str);
        }
        REGISTERS.add("a0");
        REGISTERS.add("v1");
    }
}
