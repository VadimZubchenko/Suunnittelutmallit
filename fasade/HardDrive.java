/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasade;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *
 * @author vadimzubchenko
 */
public class HardDrive {

    public byte[] read(long lba, int size) {

        byte[] bytes = ByteBuffer.allocate(size).putLong(lba).array();
        System.out.println("Reading HDD: " + Arrays.toString(bytes));
        return bytes;

    }
}
