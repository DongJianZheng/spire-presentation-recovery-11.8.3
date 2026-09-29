/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sproqa;
import com.spire.presentation.packages.sprwna;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public class sprpqa
implements sprk {
    private sproqa cfr_renamed_2;
    private sproqa cfr_renamed_3;
    private sproqa cfr_renamed_4;

    @Override
    public sprama cfr_renamed_131() {
        sprpqa sprpqa2 = this;
        sprama sprama2 = sprpqa2.cfr_renamed_2.cfr_renamed_723(sprpqa2.cfr_renamed_3.cfr_renamed_131());
        sprama2.cfr_renamed_730(this.cfr_renamed_4.cfr_renamed_131());
        return sprama2;
    }

    @Override
    public sprama cfr_renamed_728(sprama arg0, int arg1) {
        sprama sprama2 = this.cfr_renamed_723(arg0);
        sprama2.cfr_renamed_729(arg1);
        return sprama2;
    }

    public static sprpqa cfr_renamed_731(InputStream arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws IOException {
        InputStream inputStream = arg0;
        int n = arg2;
        sproqa sproqa2 = sproqa.cfr_renamed_727(inputStream, arg1, n, n);
        int n2 = arg3;
        sproqa sproqa3 = sproqa.cfr_renamed_727(inputStream, arg1, n2, n2);
        sproqa sproqa4 = sproqa.cfr_renamed_727(inputStream, arg1, arg4, arg5);
        return new sprpqa(sproqa2, sproqa3, sproqa4);
    }

    public static sprpqa cfr_renamed_732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws IOException {
        return sprpqa.cfr_renamed_731(new ByteArrayInputStream(arg0), arg1, arg2, arg3, arg4, arg5);
    }

    @Override
    public sprwna cfr_renamed_725(sprwna arg0) {
        sprpqa sprpqa2 = this;
        sprwna sprwna2 = sprpqa2.cfr_renamed_2.cfr_renamed_725(arg0);
        sprwna2 = sprpqa2.cfr_renamed_3.cfr_renamed_725(sprwna2);
        sprwna2.cfr_renamed_733(this.cfr_renamed_4.cfr_renamed_725(arg0));
        return sprwna2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprpqa sprpqa2 = (sprpqa)arg0;
        if (this.cfr_renamed_2 == null ? sprpqa2.cfr_renamed_2 != null : !this.cfr_renamed_2.equals(sprpqa2.cfr_renamed_2)) {
            return false;
        }
        if (this.cfr_renamed_3 == null ? sprpqa2.cfr_renamed_3 != null : !this.cfr_renamed_3.equals(sprpqa2.cfr_renamed_3)) {
            return false;
        }
        return !(this.cfr_renamed_4 == null ? sprpqa2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(sprpqa2.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprpqa(sproqa sproqa2, sproqa sproqa3, sproqa sproqa4) {
        void arg1;
        void arg0;
        sprpqa sprpqa2 = this;
        this.cfr_renamed_2 = arg0;
        sprpqa2.cfr_renamed_3 = arg1;
        sprpqa2.cfr_renamed_4 = sproqa4;
    }

    public static sprpqa cfr_renamed_734(int arg0, int arg1, int arg2, int arg3, int arg4, SecureRandom arg5) {
        int n = arg1;
        sproqa sproqa2 = sproqa.cfr_renamed_708(arg0, n, n, arg5);
        int n2 = arg2;
        sproqa sproqa3 = sproqa.cfr_renamed_708(arg0, n2, n2, arg5);
        sproqa sproqa4 = sproqa.cfr_renamed_708(arg0, arg3, arg4, arg5);
        return new sprpqa(sproqa2, sproqa3, sproqa4);
    }

    public byte[] cfr_renamed_726() {
        sprpqa sprpqa2 = this;
        byte[] byArray = sprpqa2.cfr_renamed_2.cfr_renamed_726();
        byte[] byArray2 = sprpqa2.cfr_renamed_3.cfr_renamed_726();
        byte[] byArray3 = sprpqa2.cfr_renamed_4.cfr_renamed_726();
        byte[] byArray4 = sprzra.cfr_renamed_523(byArray, byArray.length + byArray2.length + byArray3.length);
        System.arraycopy(byArray2, 0, byArray4, byArray.length, byArray2.length);
        System.arraycopy(byArray3, 0, byArray4, byArray.length + byArray2.length, byArray3.length);
        return byArray4;
    }

    @Override
    public sprama cfr_renamed_723(sprama arg0) {
        sprpqa sprpqa2 = this;
        sprama sprama2 = sprpqa2.cfr_renamed_2.cfr_renamed_723(arg0);
        sprama2 = sprpqa2.cfr_renamed_3.cfr_renamed_723(sprama2);
        sprama2.cfr_renamed_730(this.cfr_renamed_4.cfr_renamed_723(arg0));
        return sprama2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.hashCode());
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.hashCode());
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        return n;
    }
}

