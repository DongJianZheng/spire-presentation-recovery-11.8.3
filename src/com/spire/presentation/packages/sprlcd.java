/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryrh;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprlcd
extends AlgorithmParametersSpi {
    public DSAParameterSpec cfr_renamed_4;

    @Override
    public String engineToString() {
        return spryrh.cfr_renamed_9("4%1V \u0017\u0002\u0017\u001d\u0013\u0004\u0013\u0002\u0005");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprabl.cfr_renamed_9("J.L)F9E(\u000b(D|L9_\fJ.J1N(N.x,N?\u000b1^/_|E3_|I9\u000b2^0G"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprzde sprzde2 = sprzde.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
            sprlcd sprlcd2 = this;
            sprlcd2.cfr_renamed_4 = new DSAParameterSpec(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(spryrh.cfr_renamed_9("8\u001f\u0002P\u0017P\u0000\u0011\u001a\u0019\u0012P2#7P&\u0011\u0004\u0011\u001b\u0015\u0002\u0015\u0004P\u0013\u001e\u0015\u001f\u0012\u0019\u0018\u0017X"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprabl.cfr_renamed_9("e3_|J|]=G5O|o\u000fj|{=Y=F9_9Y|N2H3O5E;\u0005"));
        }
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0)) {
            return this.engineGetEncoded();
        }
        return null;
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sprzde sprzde2 = new sprzde(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getQ(), this.cfr_renamed_4.getG());
        try {
            return sprzde2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(spryrh.cfr_renamed_9("5\u0004\u0002\u0019\u0002V\u0015\u0018\u0013\u0019\u0014\u001f\u001e\u0011P2#7 \u0017\u0002\u0017\u001d\u0013\u0004\u0013\u0002\u0005"));
        }
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof DSAParameterSpec)) {
            throw new InvalidParameterSpecException(sprabl.cfr_renamed_9("o\u000fj\fJ.J1N(N.x,N?\u000b.N-^5Y9O|_3\u000b5E5_5J0B/N|J|o\u000fj|J0L3Y5_4F|[=Y=F9_9Y/\u000b3I6N?_"));
        }
        this.cfr_renamed_4 = (DSAParameterSpec)arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
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

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == DSAParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(spryrh.cfr_renamed_9("\u0003\u001e\u001d\u001e\u0019\u0007\u0018P\u0006\u0011\u0004\u0011\u001b\u0015\u0002\u0015\u0004P\u0005\u0000\u0013\u0013V\u0000\u0017\u0003\u0005\u0015\u0012P\u0002\u001fV4%1V\u0000\u0017\u0002\u0017\u001d\u0013\u0004\u0013\u0002\u0005P\u0019\u0012\u001c\u0015\u0015\u0004X"));
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprabl.cfr_renamed_9("sr\u001el\u0012"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, spryrh.cfr_renamed_9("#\u001e\u001d\u001e\u0019\u0007\u0018P\u0006\u0011\u0004\u0011\u001b\u0015\u0002\u0015\u0004P\u0010\u001f\u0004\u001d\u0017\u0004V")).append(arg1).toString());
    }
}

