/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprda;
import com.spire.presentation.packages.sprfab;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriya;
import com.spire.presentation.packages.sprjya;
import com.spire.presentation.packages.sprlva;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprygb;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

public class sprtfb
implements PrivateKey {
    private short[] cfr_renamed_119;
    private short[][] cfr_renamed_91;
    private short[][] cfr_renamed_0;
    private short[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private sprjya[] cfr_renamed_4;

    public short[] cfr_renamed_1138() {
        return this.cfr_renamed_119;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprtfb sprtfb2 = this;
        sprtfb sprtfb3 = this;
        sprtfb sprtfb4 = this;
        sprfab sprfab2 = new sprfab(sprtfb2.cfr_renamed_0, sprtfb2.cfr_renamed_1, sprtfb3.cfr_renamed_91, sprtfb3.cfr_renamed_119, sprtfb4.cfr_renamed_2, sprtfb4.cfr_renamed_4);
        try {
            sprije sprije2 = new sprije(sprda.cfr_renamed_107, sprume.cfr_renamed_3);
            sprmke sprmke2 = new sprmke(sprije2, sprfab2);
            return (sprije)sprmke2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprraja.cfr_renamed_9("\u0001e\u0012}r\u0016");
    }

    public sprjya[] cfr_renamed_1134() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtfb(short[][] sArray, short[] sArray2, short[][] sArray3, short[] sArray4, int[] nArray, sprjya[] sprjyaArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprtfb sprtfb2 = this;
        sprtfb sprtfb3 = this;
        sprtfb sprtfb4 = this;
        sprtfb4.cfr_renamed_0 = arg0;
        sprtfb4.cfr_renamed_1 = arg1;
        sprtfb3.cfr_renamed_91 = arg2;
        sprtfb3.cfr_renamed_119 = arg3;
        sprtfb2.cfr_renamed_2 = arg4;
        sprtfb2.cfr_renamed_4 = sprjyaArray;
    }

    @Override
    public final String getAlgorithm() {
        return sproyh.cfr_renamed_9("(w\u0013x\u0018y\r");
    }

    public int[] cfr_renamed_1139() {
        return this.cfr_renamed_2;
    }

    public int hashCode() {
        int n;
        int n2 = this.cfr_renamed_4.length;
        n2 = n2 * 37 + sprzra.cfr_renamed_517(this.cfr_renamed_0);
        n2 = n2 * 37 + sprzra.cfr_renamed_518(this.cfr_renamed_1);
        n2 = n2 * 37 + sprzra.cfr_renamed_517(this.cfr_renamed_91);
        n2 = n2 * 37 + sprzra.cfr_renamed_518(this.cfr_renamed_119);
        n2 = n2 * 37 + sprzra.cfr_renamed_552(this.cfr_renamed_2);
        int n3 = n = this.cfr_renamed_4.length - 1;
        while (n3 >= 0) {
            sprjya sprjya2 = this.cfr_renamed_4[n];
            n2 = n2 * 37 + sprjya2.hashCode();
            n3 = --n;
        }
        return n2;
    }

    public short[][] cfr_renamed_1135() {
        return this.cfr_renamed_0;
    }

    public boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof sprtfb)) {
            return false;
        }
        sprtfb sprtfb2 = (sprtfb)arg0;
        boolean bl = true;
        bl = true && spriya.cfr_renamed_1230(this.cfr_renamed_0, sprtfb2.cfr_renamed_1135());
        bl = bl && spriya.cfr_renamed_1230(this.cfr_renamed_91, sprtfb2.cfr_renamed_1137());
        bl = bl && spriya.cfr_renamed_1231(this.cfr_renamed_1, sprtfb2.cfr_renamed_1136());
        bl = bl && spriya.cfr_renamed_1231(this.cfr_renamed_119, sprtfb2.cfr_renamed_1138());
        boolean bl2 = bl = bl && Arrays.equals(this.cfr_renamed_2, sprtfb2.cfr_renamed_1139());
        if (this.cfr_renamed_4.length != sprtfb2.cfr_renamed_1134().length) {
            return false;
        }
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            sprjya sprjya2 = this.cfr_renamed_4[n];
            sprjya sprjya3 = sprtfb2.cfr_renamed_1134()[n];
            bl &= sprjya2.equals(sprjya3);
            n2 = --n;
        }
        return bl;
    }

    public short[][] cfr_renamed_1137() {
        return this.cfr_renamed_91;
    }

    public sprtfb(sprygb arg0) {
        this(arg0.cfr_renamed_1135(), arg0.cfr_renamed_1136(), arg0.cfr_renamed_1137(), arg0.cfr_renamed_1138(), arg0.cfr_renamed_1139(), arg0.cfr_renamed_1134());
    }

    public short[] cfr_renamed_1136() {
        return this.cfr_renamed_1;
    }

    public sprtfb(sprlva arg0) {
        this(arg0.cfr_renamed_1135(), arg0.cfr_renamed_1136(), arg0.cfr_renamed_1137(), arg0.cfr_renamed_1138(), arg0.cfr_renamed_1139(), arg0.cfr_renamed_1134());
    }
}

