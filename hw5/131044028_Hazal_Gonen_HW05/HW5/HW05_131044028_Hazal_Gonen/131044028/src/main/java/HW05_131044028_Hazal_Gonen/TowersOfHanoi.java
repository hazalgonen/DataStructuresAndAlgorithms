package HW05_131044028_Hazal_Gonen;

/**
 * Towers of hanoi iterative olarak implement ettim.
 * http://www.geeksforgeeks.org/iterative-tower-of-hanoi/ adresinden yardim
 * aldim
 *
 * @author hazal
 */
import static java.lang.Math.pow;
import java.util.Stack;

public class TowersOfHanoi {

    /**
     * tower of hanoi iterative implement eder
     *
     * @param disksize disk boyutu
     * @param src ilk stack
     * @param aux ikinci stack
     * @param dest ucuncu stack
     */
    public void TowerOfHanoi(int disksize, Stack<Integer> src, Stack<Integer> dest, Stack<Integer> aux) {
        int i, totalMoves;
        char s = 'S', d = 'D', a = 'A';

        //eger 2nin katiysa D ve A yer degistirir
        if (disksize % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }

        //toplan yer degistirme 2 uzeri n -1 ile bulunur
        totalMoves = (int) (pow(2, disksize) - 1);

        //en buyuk disk eklenir stacke
        for (i = disksize; i >= 1; i--) {
            src.push(i);
        }

        //toplam yer degistirme kadar dongu doner
        //eger i%3 ise src ve dest arasinda
        //eger i%3 ise src ve aux arasinda
        //eger i%3 ise aux ve dest arasinda
        for (i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) {
                moveDisksBetweenTwoPoles(src, dest, s, d);
            } else if (i % 3 == 2) {
                moveDisksBetweenTwoPoles(src, aux, s, a);
            } else if (i % 3 == 0) {
                moveDisksBetweenTwoPoles(aux, dest, a, d);
            }
        }
    }

    /**
     * iki kule arasinda gecis
     *
     * @param src ilk kule
     * @param dest ikinci kule
     * @param s
     * @param d
     */
    private void moveDisksBetweenTwoPoles(Stack<Integer> src, Stack<Integer> dest, char s, char d) {

        int pole2TopDisk = 0;

        int pole1TopDisk = 0;

        //eger src bossa destin ilk elemani srcye eklenir ve ekrana basilir
        if (src.isEmpty()) {
            pole2TopDisk = dest.pop();
            src.push(pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        } //eger dest bossa srcnin ilk elemani deste eklenir ve ekrana basilir
        else if (dest.isEmpty()) {
            pole1TopDisk = src.pop();
            dest.push(pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        } else { //ilk elemanlar pop edilir ve hangisi buyukse diger kuleye o eklenir
            pole2TopDisk = dest.pop();
            pole1TopDisk = src.pop();
            if (pole1TopDisk > pole2TopDisk) {
                src.push(pole1TopDisk);
                src.push(pole2TopDisk);
                moveDisk(d, s, pole2TopDisk);
            } else if (pole1TopDisk < pole2TopDisk) {
                dest.push(pole2TopDisk);
                dest.push(pole1TopDisk);
                moveDisk(s, d, pole1TopDisk);
            }
        }

    }

    /**
     * Butun degisimleri ekrana basmak icin
     *
     * @param fromPeg bu kuleden
     * @param toPeg bu kuleye
     * @param disk bu disk
     */
    private void moveDisk(char fromPeg, char toPeg, int disk) {
        System.out.printf("%d. disk \'%c\' den \'%c\' ye tasindi\n",
                disk, fromPeg, toPeg);
    }

}
