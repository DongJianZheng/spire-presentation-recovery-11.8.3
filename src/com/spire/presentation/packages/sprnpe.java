/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprztf;
import java.io.IOException;

public class sprnpe
extends sprvva {
    public static final sprnpe cfr_renamed_0;
    private static final byte[] cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    public static final sprnpe cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public int hashCode() {
        return this.cfr_renamed_4[0];
    }

    public sprnpe(boolean bl) {
        this.cfr_renamed_4 = bl ? cfr_renamed_1 : cfr_renamed_2;
    }

    static {
        byte[] byArray = new byte[1];
        byArray[0] = -1;
        cfr_renamed_1 = byArray;
        byte[] byArray2 = new byte[1];
        byArray2[0] = 0;
        cfr_renamed_2 = byArray2;
        cfr_renamed_3 = new sprnpe(false);
        cfr_renamed_0 = new sprnpe(true);
    }

    @Override
    public int cfr_renamed_4616() {
        return 3;
    }

    public static sprnpe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprnpe) {
            return sprnpe.cfr_renamed_23(sprvva2);
        }
        return sprnpe.cfr_renamed_4807(((sprxue)sprvva2).cfr_renamed_186());
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(1, this.cfr_renamed_4);
    }

    public static sprnpe cfr_renamed_655(boolean arg0) {
        if (arg0) {
            return cfr_renamed_0;
        }
        return cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprnpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprnpe) {
            return (sprnpe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprztf.cfr_renamed_9("\u000e\b\u000b\u0001\u0000\u0005\u000bD\b\u0006\r\u0001\u0004\u0010G\r\tD\u0000\u0001\u0013-\t\u0017\u0013\u0005\t\u0007\u0002^G")).append(arg0.getClass().getName()).toString());
        }
        byte[] byArray = (byte[])arg0;
        try {
            return (sprnpe)sprnpe.cfr_renamed_184(byArray);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprngk.cfr_renamed_9("\u0017C\u0018N\u0014FQV\u001e\u0002\u0012M\u001fQ\u0005P\u0004A\u0005\u0002\u0013M\u001eN\u0014C\u001f\u0002\u0017P\u001eOQ@\bV\u0014y,\u0018Q")).append(iOException.getMessage()).toString());
        }
    }

    public static sprnpe cfr_renamed_4944(int arg0) {
        if (arg0 != 0) {
            return cfr_renamed_0;
        }
        return cfr_renamed_3;
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprnpe(byte[] byArray) {
        void arg0;
        if (byArray.length != 1) {
            throw new IllegalArgumentException(sprngk.cfr_renamed_9("\u0013[\u0005GQT\u0010N\u0004GQQ\u0019M\u0004N\u0015\u0002\u0019C\u0007GQ\u0013Q@\bV\u0014\u0002\u0018LQK\u0005"));
        }
        if (arg0[0] == false) {
            this.cfr_renamed_4 = cfr_renamed_2;
            return;
        }
        if ((arg0[0] & 0xFF) == 255) {
            this.cfr_renamed_4 = cfr_renamed_1;
            return;
        }
        this.cfr_renamed_4 = sprzra.cfr_renamed_158((byte[])arg0);
    }

    public String toString() {
        if (this.cfr_renamed_4[0] != 0) {
            return sprztf.cfr_renamed_9("051\"");
        }
        return sprngk.cfr_renamed_9("7c=q4");
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (arg0 instanceof sprnpe) {
            return this.cfr_renamed_4[0] == ((sprnpe)arg0).cfr_renamed_4[0];
        }
        return false;
    }

    public static sprnpe cfr_renamed_4807(byte[] arg0) {
        if (arg0.length != 1) {
            throw new IllegalArgumentException(sprztf.cfr_renamed_9("&(++!&*G\u0012\u0006\b\u0012\u0001G\u0017\u000f\u000b\u0012\b\u0003D\u000f\u0005\u0011\u0001GUG\u0006\u001e\u0010\u0002D\u000e\nG\r\u0013"));
        }
        if (arg0[0] == 0) {
            return cfr_renamed_3;
        }
        if ((arg0[0] & 0xFF) == 255) {
            return cfr_renamed_0;
        }
        return new sprnpe(arg0);
    }

    public boolean cfr_renamed_587() {
        return this.cfr_renamed_4[0] != 0;
    }
}

