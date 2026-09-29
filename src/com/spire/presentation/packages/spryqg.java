/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprmim;
import com.spire.presentation.packages.sprpdp;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.spryvg;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;
import java.math.BigInteger;

public abstract class spryqg
extends spryvg {
    public static final String cfr_renamed_0 = "com.spire.psmodel.security.openpgp.session_key_obfuscation";
    public boolean cfr_renamed_1;
    public boolean cfr_renamed_2;
    public static final long cfr_renamed_3 = 0L;
    private sprvbh cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_7881(byte[] arg0) throws sprtqg {
        try {
            return new sprghm(new BigInteger(1, arg0)).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("S=l2v:~sW\u0003Ss\u007f=y<~:t4 s")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    @Override
    public sprzcm cfr_renamed_7850(int arg0, int arg1, byte[] arg2) throws sprtqg {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryqg(sprvbh sprvbh2) {
        void arg0;
        switch (sprvbh2.cfr_renamed_593()) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                throw new IllegalArgumentException(sprpdp.cfr_renamed_9("\fg!!;&:u*&.hoT\u001cG\u0010U\u0006A\u0001&$c6&)i=&*h,t6v;o ha"));
            }
            case 16: 
            case 20: {
                break;
            }
            case 18: {
                break;
            }
            case 17: {
                throw new IllegalArgumentException(sprdfj.cfr_renamed_9("\u0010{==':&i6:\u0017I\u0012:5u!:6t0h*j's<t}"));
            }
            case 19: {
                throw new IllegalArgumentException(sprpdp.cfr_renamed_9("\fg!!;&:u*&\nE\u000bU\u000e&)i=&*h,t6v;o ha"));
            }
            default: {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdfj.cfr_renamed_9("o=q=u$ts{ c>w6n!s0:2v4u!s'r> s")).append(arg0.cfr_renamed_593()).toString());
            }
        }
        spryqg spryqg2 = this;
        spryqg2.cfr_renamed_4 = arg0;
        spryqg2.cfr_renamed_2 = spryqg.cfr_renamed_7882();
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[][] cfr_renamed_7883(byte[] arg0) throws sprtqg {
        switch (this.cfr_renamed_4.cfr_renamed_593()) {
            case 1: 
            case 2: {
                byte[][] byArrayArray = new byte[1][];
                byte[][] byArrayArray2 = byArrayArray;
                byArrayArray[0] = this.cfr_renamed_7881(arg0);
                return byArrayArray;
            }
            case 16: 
            case 20: {
                byte[][] byArrayArray;
                byte[] byArray = new byte[arg0.length / 2];
                byte[] byArray2 = new byte[arg0.length / 2];
                System.arraycopy(arg0, 0, byArray, 0, byArray.length);
                System.arraycopy(arg0, byArray.length, byArray2, 0, byArray2.length);
                byte[][] byArrayArray3 = byArrayArray = new byte[2][];
                byArrayArray3[0] = this.cfr_renamed_7881(byArray);
                byArrayArray[1] = this.cfr_renamed_7881(byArray2);
                return byArrayArray3;
            }
            case 18: {
                byte[][] byArrayArray = new byte[1][];
                byte[][] byArrayArray4 = byArrayArray;
                byArrayArray[0] = arg0;
                return byArrayArray;
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprpdp.cfr_renamed_9("s!m!i8hog<\u007f\"k*r=o,&.j(i=o;n\"<o")).append(this.cfr_renamed_4.cfr_renamed_593()).toString());
    }

    public abstract byte[] cfr_renamed_7884(sprvbh var1, byte[] var2) throws sprtqg;

    public spryqg cfr_renamed_7885(boolean arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    @Override
    public sprzcm cfr_renamed_7852(int arg0, byte[] arg1) throws sprtqg {
        long l;
        long l2;
        spryqg spryqg2 = this;
        return sprmim.cfr_renamed_7886(this.cfr_renamed_1 ? (l2 = 0L) : (l = this.cfr_renamed_4.cfr_renamed_7541()), this.cfr_renamed_4.cfr_renamed_593(), spryqg2.cfr_renamed_7883(spryqg2.cfr_renamed_7884(spryqg2.cfr_renamed_4, arg1)));
    }

    @Override
    public sprzcm cfr_renamed_7854(int arg0, int arg1, byte[] arg2) throws sprtqg {
        return null;
    }

    private static /* synthetic */ boolean cfr_renamed_7882() {
        return !sprjcf.cfr_renamed_5155(cfr_renamed_0, false);
    }

    public spryqg cfr_renamed_7887(boolean arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }
}

