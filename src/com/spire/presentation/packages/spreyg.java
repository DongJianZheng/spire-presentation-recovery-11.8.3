/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprdzg;
import com.spire.presentation.packages.sprebh;
import com.spire.presentation.packages.sprgxha;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprsxg;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.spruofa;
import com.spire.presentation.packages.sprvyg;
import com.spire.presentation.packages.sprysg;
import com.spire.presentation.packages.spryyg;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.Date;
import javax.crypto.spec.DHParameterSpec;

public class spreyg {
    private static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 10;
    private static final int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    private static /* synthetic */ KeyPair cfr_renamed_8074() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(sprgxha.cfr_renamed_9("Y0[=Q=P"), "BC");
        BigInteger bigInteger = new BigInteger(spruofa.cfr_renamed_9("#"), 16);
        BigInteger bigInteger2 = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF", 16);
        DHParameterSpec dHParameterSpec = new DHParameterSpec(bigInteger2, bigInteger);
        KeyPairGenerator keyPairGenerator2 = keyPairGenerator;
        keyPairGenerator2.initialize(dHParameterSpec);
        return keyPairGenerator2.generateKeyPair();
    }

    private static /* synthetic */ void cfr_renamed_8075(OutputStream arg0, OutputStream arg1, KeyPair arg2, KeyPair arg3, String arg4, char[] arg5, boolean arg6) throws IOException, sprtqg {
        if (arg6) {
            arg0 = new sprczl(arg0);
        }
        sprvyg sprvyg2 = new sprvyg(17, arg2, new Date());
        sprvyg sprvyg3 = new sprvyg(16, arg3, new Date());
        sprsm sprsm2 = new sprmrg().cfr_renamed_1451().cfr_renamed_576(2);
        sprebh sprebh2 = new sprebh(sprvyg2.cfr_renamed_1157().cfr_renamed_593(), 10);
        sprysg sprysg2 = new sprdzg(9, sprsm2).cfr_renamed_1499("BC").cfr_renamed_1480(arg5);
        sprsxg sprsxg2 = spreyg.cfr_renamed_8076();
        sprsxg2.cfr_renamed_7643(false, sprvyg2.cfr_renamed_1157());
        spryyg spryyg2 = new spryyg(19, sprvyg2, arg4, sprsm2, sprsxg2.cfr_renamed_31(), null, sprebh2, sprysg2);
        sprsxg sprsxg3 = spreyg.cfr_renamed_8077();
        spryyg spryyg3 = spryyg2;
        sprsxg3.cfr_renamed_7643(false, sprvyg2.cfr_renamed_1157());
        spryyg3.cfr_renamed_7835(sprvyg3, sprsxg3.cfr_renamed_31(), null);
        OutputStream outputStream = arg0;
        spryyg3.cfr_renamed_7839().cfr_renamed_2623(outputStream);
        outputStream.close();
        if (arg6) {
            arg1 = new sprczl(arg1);
        }
        spryyg2.cfr_renamed_7838().cfr_renamed_2623(arg1);
        arg1.close();
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 10;
        nArray[1] = 9;
        nArray[2] = 8;
        nArray[3] = 11;
        cfr_renamed_3 = nArray;
        int[] nArray2 = new int[3];
        nArray2[0] = 9;
        nArray2[1] = 8;
        nArray2[2] = 7;
        cfr_renamed_4 = nArray2;
        int[] nArray3 = new int[4];
        nArray3[0] = 2;
        nArray3[1] = 3;
        nArray3[2] = 2;
        nArray3[3] = 0;
        cfr_renamed_1 = nArray3;
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0.length < 2) {
            System.out.println(sprgxha.cfr_renamed_9("X/]9p;}\u0011}\u0010W\u0019e.u\u0012{;y\u0012y\u000e}\bs\u000e<'1\u001dA\\u\u0018y\u0012h\u0015h\u0005<\f}\u000fo,t\u000e}\u000fy"));
            System.exit(0);
        }
        KeyPair keyPair = spreyg.cfr_renamed_8078();
        KeyPair keyPair2 = spreyg.cfr_renamed_8074();
        if (arg0[0].equals(spruofa.cfr_renamed_9("Fp"))) {
            if (arg0.length < 3) {
                System.out.println(sprgxha.cfr_renamed_9("X/]9p;}\u0011}\u0010W\u0019e.u\u0012{;y\u0012y\u000e}\bs\u000e<'1\u001dA\\u\u0018y\u0012h\u0015h\u0005<\f}\u000fo,t\u000e}\u000fy"));
                System.exit(0);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(spruofa.cfr_renamed_9("\u0018t\bc\u000eeEp\u0018r"));
            FileOutputStream fileOutputStream2 = new FileOutputStream(sprgxha.cfr_renamed_9("l\t~R}\u000f\u007f"));
            spreyg.cfr_renamed_8075(fileOutputStream, fileOutputStream2, keyPair, keyPair2, arg0[1], arg0[2].toCharArray(), true);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(spruofa.cfr_renamed_9("\u0018t\bc\u000eeEs\u001bv"));
        FileOutputStream fileOutputStream3 = new FileOutputStream(sprgxha.cfr_renamed_9("l\t~R~\f{"));
        spreyg.cfr_renamed_8075(fileOutputStream, fileOutputStream3, keyPair, keyPair2, arg0[0], arg0[1].toCharArray(), false);
    }

    private static /* synthetic */ sprsxg cfr_renamed_8076() {
        sprsxg sprsxg2;
        sprsxg sprsxg3 = sprsxg2 = new sprsxg();
        sprsxg sprsxg4 = sprsxg2;
        sprsxg2.cfr_renamed_7657(false, cfr_renamed_3);
        sprsxg4.cfr_renamed_7628(false, cfr_renamed_4);
        sprsxg4.cfr_renamed_7635(false, cfr_renamed_1);
        sprsxg3.cfr_renamed_7651(false, (byte)1);
        sprsxg3.cfr_renamed_7629(true, 3);
        return sprsxg3;
    }

    private static /* synthetic */ KeyPair cfr_renamed_8078() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA", "BC");
        keyPairGenerator.initialize(3072);
        return keyPairGenerator.generateKeyPair();
    }

    private static /* synthetic */ sprsxg cfr_renamed_8077() {
        sprsxg sprsxg2 = new sprsxg();
        sprsxg2.cfr_renamed_7629(true, 12);
        return sprsxg2;
    }
}

