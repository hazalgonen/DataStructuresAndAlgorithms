/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesHW;

import TreesHW.HuffmanTree.HuffData;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hazal
 */
public class HuffmanTreeTest {

    /**
     *
     */
    @Before
    public void setUpClass() {
        System.out.println("\n\n*********************************************");
        System.out.println("Test metodu çağrılacak.");
    }

    /**
     *
     */
    @After
    public void tearDownClass() {
        System.out.println("\nTest metodu bitti.");
        System.out.println("*********************************************");
    }

    /**
     * encode yapar
     */
    @Test
    public void testEncode() {
        System.out.println("encode");

        HuffmanTree Htree = new HuffmanTree();

        // Create symbol array
        HuffData[] symbols = {
            new HuffData(186, '_'),
            new HuffData(103, 'e'),
            new HuffData(80, 't'),
            new HuffData(64, 'a'),
            new HuffData(63, 'o'),
            new HuffData(57, 'i'),
            new HuffData(57, 'n'),
            new HuffData(51, 's'),
            new HuffData(48, 'r'),
            new HuffData(47, 'h'),
            new HuffData(32, 'd'),
            new HuffData(32, 'l'),
            new HuffData(23, 'u'),
            new HuffData(22, 'c'),
            new HuffData(21, 'f'),
            new HuffData(20, 'm'),
            new HuffData(18, 'w'),
            new HuffData(16, 'y'),
            new HuffData(15, 'g'),
            new HuffData(15, 'p'),
            new HuffData(13, 'b'),
            new HuffData(8, 'v'),
            new HuffData(5, 'k'),
            new HuffData(1, 'j'),
            new HuffData(1, 'q'),
            new HuffData(1, 'x'),
            new HuffData(1, 'z')
        };

        // Build hufffman tree 
        Htree.buildTree(symbols);
        String message = "q__rg";

        BinaryTree<HuffData> tree = new BinaryTree();
        String encodedCode = Htree.encode(message, tree);

        System.out.println("message:  " + message + "   code:" + encodedCode);

        System.out.println("message:  " + "b" + "   code:" + Htree.encode("b", tree));
        System.out.println("message:  " + "j" + "   code:" + Htree.encode("j", tree));

    }

    /**
     * build eder
     */
    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        HuffmanTree Htree = new HuffmanTree();

        HuffData[] symbols = {
            new HuffData(186, '_'),
            new HuffData(103, 'e'),
            new HuffData(80, 't'),
            new HuffData(64, 'a'),
            new HuffData(63, 'o'),
            new HuffData(57, 'i'),
            new HuffData(57, 'n'),
            new HuffData(51, 's'),
            new HuffData(48, 'r'),
            new HuffData(47, 'h'),
            new HuffData(32, 'd'),
            new HuffData(32, 'l'),
            new HuffData(23, 'u'),
            new HuffData(22, 'c'),
            new HuffData(21, 'f'),
            new HuffData(20, 'm'),
            new HuffData(18, 'w'),
            new HuffData(16, 'y'),
            new HuffData(15, 'g'),
            new HuffData(15, 'p'),
            new HuffData(13, 'b'),
            new HuffData(8, 'v'),
            new HuffData(5, 'k'),
            new HuffData(1, 'j'),
            new HuffData(1, 'q'),
            new HuffData(1, 'x'),
            new HuffData(1, 'z')
        };

        System.out.println("Huffman tree build edildi");
        Htree.buildTree(symbols);
    }

    /**
     * printcode
     */
    @Test
    public void testPrintCode() {
        System.out.println("printCode");
        HuffmanTree Htree = new HuffmanTree();

        // Create symbol array
        HuffData[] symbols = {
            new HuffData(186, '_'),
            new HuffData(103, 'e'),
            new HuffData(80, 't'),
            new HuffData(64, 'a'),
            new HuffData(63, 'o'),
            new HuffData(57, 'i'),
            new HuffData(57, 'n'),
            new HuffData(51, 's'),
            new HuffData(48, 'r'),
            new HuffData(47, 'h'),
            new HuffData(32, 'd'),
            new HuffData(32, 'l'),
            new HuffData(23, 'u'),
            new HuffData(22, 'c'),
            new HuffData(21, 'f'),
            new HuffData(20, 'm'),
            new HuffData(18, 'w'),
            new HuffData(16, 'y'),
            new HuffData(15, 'g'),
            new HuffData(15, 'p'),
            new HuffData(13, 'b'),
            new HuffData(8, 'v'),
            new HuffData(5, 'k'),
            new HuffData(1, 'j'),
            new HuffData(1, 'q'),
            new HuffData(1, 'x'),
            new HuffData(1, 'z')
        };

        Htree.buildTree(symbols);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        Htree.printCode(ps);
    }

    /**
     * decode yapar
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        HuffmanTree Htree = new HuffmanTree();

        HuffData[] symbols = {
            new HuffData(186, '_'),
            new HuffData(103, 'e'),
            new HuffData(80, 't'),
            new HuffData(64, 'a'),
            new HuffData(63, 'o'),
            new HuffData(57, 'i'),
            new HuffData(57, 'n'),
            new HuffData(51, 's'),
            new HuffData(48, 'r'),
            new HuffData(47, 'h'),
            new HuffData(32, 'd'),
            new HuffData(32, 'l'),
            new HuffData(23, 'u'),
            new HuffData(22, 'c'),
            new HuffData(21, 'f'),
            new HuffData(20, 'm'),
            new HuffData(18, 'w'),
            new HuffData(16, 'y'),
            new HuffData(15, 'g'),
            new HuffData(15, 'p'),
            new HuffData(13, 'b'),
            new HuffData(8, 'v'),
            new HuffData(5, 'k'),
            new HuffData(1, 'j'),
            new HuffData(1, 'q'),
            new HuffData(1, 'x'),
            new HuffData(1, 'z')
        };

        Htree.buildTree(symbols);
        String code = "110000100111111100101000011";
        String decodedCode = Htree.decode(code);
        System.out.println("code:  " + code + "   message:" + decodedCode);

        System.out.println("code:  " + "100000" + "   message:" + Htree.decode("100000"));
        System.out.println("code:  " + "1100001000" + "   message:" + Htree.decode("1100001000"));

    }

    /**
     * kodlari ekrana basar
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HuffmanTree Htree = new HuffmanTree();

        HuffData[] symbols = {
            new HuffData(186, '_'),
            new HuffData(103, 'e'),
            new HuffData(80, 't'),
            new HuffData(64, 'a'),
            new HuffData(63, 'o'),
            new HuffData(57, 'i'),
            new HuffData(57, 'n'),
            new HuffData(51, 's'),
            new HuffData(48, 'r'),
            new HuffData(47, 'h'),
            new HuffData(32, 'd'),
            new HuffData(32, 'l'),
            new HuffData(23, 'u'),
            new HuffData(22, 'c'),
            new HuffData(21, 'f'),
            new HuffData(20, 'm'),
            new HuffData(18, 'w'),
            new HuffData(16, 'y'),
            new HuffData(15, 'g'),
            new HuffData(15, 'p'),
            new HuffData(13, 'b'),
            new HuffData(8, 'v'),
            new HuffData(5, 'k'),
            new HuffData(1, 'j'),
            new HuffData(1, 'q'),
            new HuffData(1, 'x'),
            new HuffData(1, 'z')
        };

        Htree.buildTree(symbols);
        Htree.toString();

    }

}
