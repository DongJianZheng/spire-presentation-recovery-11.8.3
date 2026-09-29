/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.spruna;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

public class sprywj
extends AlgorithmParametersSpi {
    public DHParameterSpec cfr_renamed_4;

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == DHParameterSpec.class || arg0 == AlgorithmParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprrbaa.cfr_renamed_9(" Z>Z:C;\u0014%U'U8Q!Q'\u0014&D0WuD4G&Q1\u0014![up\u001d\u0014%U'U8Q!Q'Gu[7^0W!\u001a"));
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1)) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, spruna.cfr_renamed_9(":h\u0004h\u0000q\u0001&\u001fg\u001dg\u0002c\u001bc\u001d&\ti\u001dk\u000erO")).append(arg1).toString());
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0)) {
            return this.engineGetEncoded();
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 4;
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(sprrbaa.cfr_renamed_9("p\u001dd4F4Y0@0F\u0006D0WuF0E ]'Q1\u0014![u];]!]4X<G0\u00144\u0014\u0011]3R<Qx|0X9Y4ZuU9S:F<@=YuD4F4Y0@0F&\u0014:V?Q6@"));
        }
        this.cfr_renamed_4 = (DHParameterSpec)arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sproom sproom2 = sproom.cfr_renamed_23(arg0);
            if (sproom2.cfr_renamed_2331() != null) {
                sprywj sprywj2 = this;
                sprywj2.cfr_renamed_4 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), sproom2.cfr_renamed_2331().intValue());
                return;
            }
            this.cfr_renamed_4 = new DHParameterSpec(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(spruna.cfr_renamed_9("H\u0000rOgOp\u000ej\u0006bOB'&?g\u001dg\u0002c\u001bc\u001d&\nh\fi\u000bo\u0001aA"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprrbaa.cfr_renamed_9("\u001b[!\u00144\u0014#U9]1\u0014\u0011|ud4F4Y0@0FuQ;W:P<Z2\u001a"));
        }
    }

    @Override
    public String engineToString() {
        return spruna.cfr_renamed_9("+o\t`\u0006cBN\nj\u0003k\u000ehOV\u000et\u000ek\nr\nt\u001c");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sproom sproom2 = new sproom(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getG(), this.cfr_renamed_4.getL());
        try {
            return sproom2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprrbaa.cfr_renamed_9("q'F:FuQ;W:P<Z2\u0014\u0011|\u0005U'U8Q!Q'G"));
        }
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(spruna.cfr_renamed_9("\u000et\bs\u0002c\u0001rOr\u0000&\bc\u001bV\u000et\u000ek\nr\nt<v\neOk\u001au\u001b&\u0001i\u001b&\rcOh\u001aj\u0003"));
        }
        return this.cfr_renamed_2397(arg0);
    }
}

