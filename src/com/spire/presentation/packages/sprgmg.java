/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprfqg;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryj;
import com.spire.presentation.packages.sprysm;
import java.io.IOException;

public class sprgmg {
    private sprysm cfr_renamed_4;

    public spruom[] cfr_renamed_1474() {
        int n;
        sprszm sprszm2 = sprszm.cfr_renamed_23(sproug.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1475().cfr_renamed_480()).cfr_renamed_186());
        spruom[] spruomArray = new spruom[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            int n3 = n++;
            spruomArray[n3] = spruom.cfr_renamed_23(sprszm2.cfr_renamed_85(n3));
            n2 = n;
        }
        return spruomArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7368(spryj arg0, char[] arg1) throws sprhng {
        if (!this.cfr_renamed_1469()) {
            throw new IllegalStateException(sprjdda.cfr_renamed_9("~\u001c0>Q00\u0003b\u0016c\u0016~\u00070\u001c~S@5H"));
        }
        sprcpm sprcpm2 = this.cfr_renamed_4.cfr_renamed_1470();
        sprfqg sprfqg2 = new sprfqg(arg0.cfr_renamed_5279(new sprddm(sprcpm2.cfr_renamed_1472().cfr_renamed_1473().cfr_renamed_593(), new sprqrm(sprcpm2.cfr_renamed_1477(), sprcpm2.cfr_renamed_1478().intValue()))));
        try {
            sprcpm sprcpm3 = sprfqg2.cfr_renamed_1464(arg1, sproug.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1475().cfr_renamed_480()).cfr_renamed_186());
            return sproze.cfr_renamed_559(sprcpm3.cfr_renamed_91(), this.cfr_renamed_4.cfr_renamed_1470().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new sprhng(new StringBuilder().insert(0, sprokp.cfr_renamed_9("a3u?x84){}d/{>q.g}U(`5G<r8.}")).append(iOException.getMessage()).toString());
        }
    }

    public sprgmg(sprysm sprysm2) {
        this.cfr_renamed_4 = sprysm2;
    }

    public boolean cfr_renamed_1469() {
        return this.cfr_renamed_4.cfr_renamed_1470() != null;
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        return this.cfr_renamed_568().cfr_renamed_104(arg0);
    }

    public sprysm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_568().cfr_renamed_91();
    }

    public sprgmg(byte[] arg0) throws IOException {
        this(sprgmg.cfr_renamed_1443(arg0));
    }

    public sprddm cfr_renamed_1471() {
        sprcpm sprcpm2 = this.cfr_renamed_4.cfr_renamed_1470();
        if (sprcpm2 != null) {
            return sprcpm2.cfr_renamed_1472().cfr_renamed_1473();
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 3 ^ 4;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprysm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprysm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprdkg(new StringBuilder().insert(0, sprokp.cfr_renamed_9("y<x;{/y8p}p<`<.}")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprdkg(new StringBuilder().insert(0, sprjdda.cfr_renamed_9("\u001eq\u001fv\u001cb\u001eu\u00170\u0017q\u0007qI0")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }
}

