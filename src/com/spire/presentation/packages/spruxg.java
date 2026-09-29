/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprdzg;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.sprgpr;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvyg;
import com.spire.presentation.packages.sprwvh;
import com.spire.presentation.packages.sprysg;
import com.spire.presentation.packages.spryyg;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class spruxg {
    private static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 10;
    private static final int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0.length < 2) {
            System.out.println(sprjaaa.cfr_renamed_9("\n\r#\b?\u0015&\u0002\f\u0014=\u0017***\u0018\u001f\u0000&\u0013\b\u0004!\u0004=\u0000;\u000e=A\u0014L.<o\b+\u0004!\u0015&\u00156A?\u0000<\u0012\u001f\t=\u0000<\u0004"));
            System.exit(0);
        }
        if (arg0[0].equals(sprgpr.cfr_renamed_9("!\u0006"))) {
            if (arg0.length < 3) {
                System.out.println(sprjaaa.cfr_renamed_9("\n\r#\b?\u0015&\u0002\f\u0014=\u0017***\u0018\u001f\u0000&\u0013\b\u0004!\u0004=\u0000;\u000e=A\u0014L.<o\b+\u0004!\u0015&\u00156A?\u0000<\u0012\u001f\t=\u0000<\u0004"));
                System.exit(0);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(sprgpr.cfr_renamed_9("\u007f\u0002o\u0015i\u0013\"\u0006\u007f\u0004"));
            FileOutputStream fileOutputStream2 = new FileOutputStream(sprjaaa.cfr_renamed_9("\u0011:\u0003a\u0000<\u0002"));
            spruxg.cfr_renamed_8059(fileOutputStream, fileOutputStream2, arg0[1], arg0[2].toCharArray(), true);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(sprgpr.cfr_renamed_9("\u007f\u0002o\u0015i\u0013\"\u0005|\u0000"));
        FileOutputStream fileOutputStream3 = new FileOutputStream(sprjaaa.cfr_renamed_9("\u0011:\u0003a\u0003?\u0006"));
        spruxg.cfr_renamed_8059(fileOutputStream, fileOutputStream3, arg0[0], arg0[1].toCharArray(), false);
    }

    private static /* synthetic */ void cfr_renamed_8059(OutputStream arg0, OutputStream arg1, String arg2, char[] arg3, boolean arg4) throws IOException, NoSuchProviderException, sprtqg, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        Iterator<sprvbh> iterator;
        spryyg spryyg2;
        sprsxg sprsxg2;
        sprsxg sprsxg3;
        if (arg4) {
            arg0 = new sprczl(arg0);
        }
        sprsm sprsm2 = new sprmrg().cfr_renamed_1451().cfr_renamed_576(2);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(sprgpr.cfr_renamed_9("\"h#_&"), "BC");
        KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance(sprjaaa.cfr_renamed_9("9\u000b)"), "BC");
        sprebh sprebh2 = new sprebh(22, 10);
        sprysg sprysg2 = new sprdzg(9, sprsm2).cfr_renamed_1480(arg3);
        Date date = new Date();
        KeyPairGenerator keyPairGenerator3 = keyPairGenerator;
        keyPairGenerator3.initialize(new sprwvh(sprgpr.cfr_renamed_9("\u0002hU9R=^")));
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        sprvyg sprvyg2 = new sprvyg(22, keyPair, date);
        sprsxg sprsxg4 = sprsxg3 = new sprsxg();
        sprsxg sprsxg5 = sprsxg3;
        sprsxg sprsxg6 = sprsxg3;
        sprsxg6.cfr_renamed_7629(1 != 0, 1);
        sprsxg6.cfr_renamed_7657(false, cfr_renamed_4);
        sprsxg5.cfr_renamed_7628(false, cfr_renamed_1);
        sprsxg5.cfr_renamed_7635(false, cfr_renamed_3);
        sprsxg4.cfr_renamed_7651(false, (byte)1);
        sprsxg4.cfr_renamed_7643(false, sprvyg2.cfr_renamed_1157());
        keyPairGenerator3.initialize(new sprwvh(sprjaaa.cfr_renamed_9("\u0004+SzT~X")));
        KeyPair keyPair2 = keyPairGenerator3.generateKeyPair();
        sprvyg sprvyg3 = new sprvyg(22, keyPair2, date);
        sprsxg sprsxg7 = new sprsxg();
        KeyPairGenerator keyPairGenerator4 = keyPairGenerator2;
        sprsxg sprsxg8 = sprsxg7;
        sprsxg8.cfr_renamed_7629(true, 2);
        sprsxg8.cfr_renamed_7643(false, sprvyg2.cfr_renamed_1157());
        keyPairGenerator4.initialize(new sprwvh("X25519"));
        KeyPair keyPair3 = keyPairGenerator4.generateKeyPair();
        sprvyg sprvyg4 = new sprvyg(18, keyPair3, date);
        sprsxg sprsxg9 = sprsxg2 = new sprsxg();
        sprsxg9.cfr_renamed_7629(true, 12);
        sprsxg9.cfr_renamed_7643(false, sprvyg2.cfr_renamed_1157());
        spryyg spryyg3 = spryyg2 = new spryyg(19, sprvyg2, arg2, sprsm2, sprsxg3.cfr_renamed_31(), null, sprebh2, sprysg2);
        spryyg3.cfr_renamed_7837(sprvyg3, sprsxg7.cfr_renamed_31(), null, sprebh2);
        spryyg3.cfr_renamed_7835(sprvyg4, sprsxg2.cfr_renamed_31(), null);
        sprbrg sprbrg2 = spryyg3.cfr_renamed_7839();
        OutputStream outputStream = arg0;
        sprbrg2.cfr_renamed_2623(outputStream);
        outputStream.close();
        if (arg4) {
            arg1 = new sprczl(arg1);
        }
        ArrayList<sprvbh> arrayList = new ArrayList<sprvbh>();
        Iterator<sprvbh> iterator2 = iterator = sprbrg2.cfr_renamed_7458();
        while (iterator2.hasNext()) {
            Iterator<sprvbh> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(iterator3.next());
        }
        new sprtbh(arrayList).cfr_renamed_2623(arg1);
        arg1.close();
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 10;
        nArray[1] = 9;
        nArray[2] = 8;
        nArray[3] = 11;
        cfr_renamed_4 = nArray;
        int[] nArray2 = new int[3];
        nArray2[0] = 9;
        nArray2[1] = 8;
        nArray2[2] = 7;
        cfr_renamed_1 = nArray2;
        int[] nArray3 = new int[4];
        nArray3[0] = 2;
        nArray3[1] = 3;
        nArray3[2] = 2;
        nArray3[3] = 0;
        cfr_renamed_3 = nArray3;
    }
}

