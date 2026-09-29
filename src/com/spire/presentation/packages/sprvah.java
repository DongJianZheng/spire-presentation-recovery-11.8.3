/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprbsg;
import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprdxg;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprwqc;
import com.spire.presentation.packages.sprycm;
import com.spire.presentation.packages.spryzha;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class sprvah {
    private final sprcyg cfr_renamed_4;

    public static byte[][] cfr_renamed_7865(int arg0, int arg1, byte[] arg2, byte[] arg3, byte[] arg4) throws sprtqg {
        sprjzk sprjzk2;
        sprivk sprivk2 = new sprivk(arg2, arg3, arg4);
        sprjzk sprjzk3 = sprjzk2 = new sprjzk(new sprohl());
        sprjzk3.cfr_renamed_5671(sprivk2);
        int n = sprycm.cfr_renamed_7909(arg1);
        int n2 = sprsgm.cfr_renamed_7910(arg0);
        byte[] byArray = new byte[n + n2 - 8];
        sprjzk3.cfr_renamed_2341(byArray, 0, byArray.length);
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = sproze.cfr_renamed_533(byArray, 0, n);
        int n3 = n;
        byArrayArray[1] = sproze.cfr_renamed_533(byArray, n3, n3 + n2);
        return byArrayArray;
    }

    public static long cfr_renamed_7952(int arg0) {
        return 1L << arg0 + 6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cipher cfr_renamed_7911(int arg0, int arg1) throws sprtqg {
        String string;
        if (arg0 != 7 && arg0 != 8 && arg0 != 9) {
            throw new sprtqg(spryzha.cfr_renamed_9("^)^(?\u0003q\u0000fLl\u0019o\u001cp\u001ek\t{Ly\u0003mL^)LL}\rl\t{L~\u0000x\u0003m\u0005k\u0004r\u001f"));
        }
        switch (arg1) {
            case 1: {
                string = sprwqc.cfr_renamed_9("Ch^");
                break;
            }
            case 2: {
                string = spryzha.cfr_renamed_9("#\\.");
                break;
            }
            case 3: {
                string = sprwqc.cfr_renamed_9("AjK");
                break;
            }
            default: {
                throw new sprtqg(new StringBuilder().insert(0, spryzha.cfr_renamed_9("z\u0002|\u0003j\u0002k\tm\t{Lj\u0002t\u0002p\u001bqL^)^(?\rs\u000bp\u001ev\u0018w\u0001%L")).append(arg1).toString());
            }
        }
        String string2 = new StringBuilder().insert(0, sprmxg.cfr_renamed_7548(arg0)).append("/").append(string).append(sprwqc.cfr_renamed_9("\u0006HFVHbMoGa")).toString();
        return this.cfr_renamed_4.cfr_renamed_1496(string2);
    }

    public sprvah(sprcyg sprcyg2) {
        this.cfr_renamed_4 = sprcyg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbg cfr_renamed_7953(sprojm arg0, spraxg arg1) throws sprtqg {
        sprojm sprojm2 = arg0;
        byte by = sprojm2.cfr_renamed_7866();
        byte[] byArray = sprojm2.cfr_renamed_1205();
        int n = sprojm2.cfr_renamed_7864();
        spraxg spraxg2 = arg1;
        int n2 = spraxg2.cfr_renamed_593();
        byte[] byArray2 = spraxg2.cfr_renamed_1521();
        byte[] byArray3 = sprojm2.cfr_renamed_7954();
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray2, sprmxg.cfr_renamed_7548(n2));
            Cipher cipher = this.cfr_renamed_7911(n2, by);
            return new sprbsg(this, cipher, secretKeySpec, byArray, n2, by, n, byArray3);
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(spryzha.cfr_renamed_9(")g\u000fz\u001ck\u0005p\u0002?\u000fm\t~\u0018v\u0002xL|\u0005o\u0004z\u001e"), exception);
        }
    }

    public static void cfr_renamed_7955(byte[] arg0, long arg1) {
        int n = arg0.length - 8;
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        int n2 = n++;
        byArray[n2] = (byte)(byArray[n2] ^ (byte)(arg1 >> 56));
        int n3 = n++;
        byArray2[n3] = (byte)(byArray2[n3] ^ (byte)(arg1 >> 48));
        int n4 = n++;
        byArray[n4] = (byte)(byArray[n4] ^ (byte)(arg1 >> 40));
        int n5 = n++;
        byArray2[n5] = (byte)(byArray2[n5] ^ (byte)(arg1 >> 32));
        int n6 = n++;
        byArray[n6] = (byte)(byArray[n6] ^ (byte)(arg1 >> 24));
        int n7 = n++;
        byArray2[n7] = (byte)(byArray2[n7] ^ (byte)(arg1 >> 16));
        int n8 = n++;
        byArray[n8] = (byte)(byArray[n8] ^ (byte)(arg1 >> 8));
        int n9 = n;
        byArray2[n9] = (byte)(byArray2[n9] ^ (byte)arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbg cfr_renamed_7956(sproam arg0, spraxg arg1) throws sprtqg {
        sproam sproam2 = arg0;
        int n = sproam2.cfr_renamed_7783();
        int n2 = sproam2.cfr_renamed_7855();
        int n3 = sproam2.cfr_renamed_7864();
        byte[] byArray = sproam2.cfr_renamed_1477();
        byte[] byArray2 = sproam2.cfr_renamed_7954();
        byte[][] byArray3 = sprvah.cfr_renamed_7865(n2, n, arg1.cfr_renamed_1521(), byArray, byArray2);
        byte[] byArray4 = byArray3[0];
        byte[] byArray5 = byArray3[1];
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray4, sprmxg.cfr_renamed_7548(n));
            Cipher cipher = this.cfr_renamed_7911(n, n2);
            return new sprdxg(this, cipher, secretKeySpec, byArray5, n, n2, n3, byArray2);
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprwqc.cfr_renamed_9("CQeLv]oFh\te[cHr@hN&JoYnLt"), exception);
        }
    }

    public static byte[] cfr_renamed_7957(byte[] arg0, long arg1) {
        byte[] byArray = sproze.cfr_renamed_158(arg0);
        sprvah.cfr_renamed_7955(byArray, arg1);
        return byArray;
    }
}

