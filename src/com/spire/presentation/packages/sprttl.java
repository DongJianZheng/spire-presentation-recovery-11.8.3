/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.converter.equation.word.dls.collections.entityCollection.ObjectMethod;
import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprewl;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.sprzne;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

public class sprttl {
    private sprjj cfr_renamed_4;

    public sprzne cfr_renamed_10868(sprvhm arg0) {
        return new sprzne(this.cfr_renamed_10869(arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ 1;
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    public sprvim cfr_renamed_10870(sprvhm arg0) {
        return new sprvim(this.cfr_renamed_10869(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_10869(sprvhm arg0) {
        byte[] byArray = arg0.cfr_renamed_2314().cfr_renamed_81();
        OutputStream outputStream = this.cfr_renamed_4.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(byArray);
            outputStream2.close();
            return this.cfr_renamed_4.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw new sprewl(new StringBuilder().insert(0, ObjectMethod.cfr_renamed_9("6\u001b\"\u0017/\u0010c\u0001,U \u0014/\u00166\u0019\"\u0001&U*\u0011&\u001b7\u001c%\u001c&\u0007yU")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprvim cfr_renamed_10871(sprvhm arg0) {
        byte[] byArray = this.cfr_renamed_10869(arg0);
        byte[] byArray2 = new byte[8];
        System.arraycopy(byArray, byArray.length - 8, byArray2, 0, byArray2.length);
        byte[] byArray3 = byArray2;
        byte[] byArray4 = byArray2;
        byArray3[0] = (byte)(byArray3[0] & 0xF);
        byArray4[0] = (byte)(byArray4[0] | 0x40);
        return new sprvim(byArray2);
    }

    public sprzne cfr_renamed_10872(sprvhm arg0, spraem arg1, BigInteger arg2) {
        return new sprzne(this.cfr_renamed_10869(arg0), arg1, arg2);
    }

    public sprzne cfr_renamed_10873(sprtpl arg0) {
        sprigm sprigm2 = new sprigm(arg0.cfr_renamed_102());
        return new sprzne(this.cfr_renamed_10874(arg0), new spraem(sprigm2), arg0.cfr_renamed_114());
    }

    public sprttl(sprjj sprjj2) {
        this.cfr_renamed_4 = sprjj2;
    }

    private /* synthetic */ byte[] cfr_renamed_10874(sprtpl arg0) {
        if (arg0.cfr_renamed_569() != 3) {
            return this.cfr_renamed_10869(arg0.cfr_renamed_1489());
        }
        sprrdm sprrdm2 = arg0.cfr_renamed_5024(sprrdm.cfr_renamed_126);
        if (sprrdm2 != null) {
            return sproug.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_186();
        }
        return this.cfr_renamed_10869(arg0.cfr_renamed_1489());
    }
}

