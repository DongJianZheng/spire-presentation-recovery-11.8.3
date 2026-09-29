/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sproqa;
import com.spire.presentation.packages.sprpqa;
import com.spire.presentation.packages.sprpxa;
import com.spire.presentation.packages.sprwua;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class spryeb
extends sprpxa {
    public sprk cfr_renamed_2;
    public sprama cfr_renamed_3;
    public sprama cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1314() {
        if (((sprheb)((Object)this.cfr_renamed_4)).cfr_renamed_3) {
            this.cfr_renamed_3 = new sprama(((sprheb)((Object)this.cfr_renamed_4)).cfr_renamed_119);
            this.cfr_renamed_3.cfr_renamed_1[0] = 1;
            return;
        }
        this.cfr_renamed_3 = this.cfr_renamed_2.cfr_renamed_131().cfr_renamed_761();
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    public spryeb(InputStream arg0, sprheb arg1) throws IOException {
        spryeb spryeb2;
        sprheb sprheb2 = arg1;
        super(true, sprheb2);
        if (sprheb2.cfr_renamed_1 == 1) {
            sprheb sprheb3 = arg1;
            int n = sprheb3.cfr_renamed_119;
            int n2 = sprheb3.cfr_renamed_137;
            int n3 = sprheb3.cfr_renamed_132;
            int n4 = sprheb3.cfr_renamed_0;
            int n5 = sprheb3.cfr_renamed_3 ? arg1.cfr_renamed_0 : arg1.cfr_renamed_0 - 1;
            spryeb2 = this;
            sprheb sprheb4 = arg1;
            this.cfr_renamed_4 = sprama.cfr_renamed_777(arg0, sprheb4.cfr_renamed_119, sprheb4.cfr_renamed_272);
            this.cfr_renamed_2 = sprpqa.cfr_renamed_731(arg0, n, n2, n3, n4, n5);
        } else {
            InputStream inputStream = arg0;
            sprheb sprheb5 = arg1;
            this.cfr_renamed_4 = sprama.cfr_renamed_777(inputStream, sprheb5.cfr_renamed_119, sprheb5.cfr_renamed_272);
            sprama sprama2 = sprama.cfr_renamed_781(inputStream, arg1.cfr_renamed_119);
            this.cfr_renamed_2 = arg1.cfr_renamed_126 ? new sproqa(sprama2) : new sprwua(sprama2);
            spryeb2 = this;
        }
        spryeb2.cfr_renamed_1314();
    }

    /*
     * WARNING - void declaration
     */
    public spryeb(sprama sprama2, sprk sprk2, sprama sprama3, sprheb sprheb2) {
        void arg1;
        void arg0;
        void arg3;
        spryeb spryeb2 = this;
        super(true, (sprheb)arg3);
        this.cfr_renamed_4 = arg0;
        spryeb2.cfr_renamed_2 = arg1;
        spryeb2.cfr_renamed_3 = sprama3;
    }

    /*
     * WARNING - void declaration
     */
    public spryeb(byte[] byArray, sprheb sprheb2) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sprheb)arg1);
        void arg1;
        void arg0;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof spryeb)) {
            return false;
        }
        spryeb spryeb2 = (spryeb)arg0;
        if (this.cfr_renamed_4 == null ? spryeb2.cfr_renamed_4 != null : !((sprheb)((Object)this.cfr_renamed_4)).equals(spryeb2.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_2 == null ? spryeb2.cfr_renamed_2 != null : !this.cfr_renamed_2.equals(spryeb2.cfr_renamed_2)) {
            return false;
        }
        return this.cfr_renamed_4.equals(spryeb2.cfr_renamed_4);
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : ((sprheb)((Object)this.cfr_renamed_4)).hashCode());
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.hashCode());
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        return n;
    }

    public byte[] cfr_renamed_91() {
        byte[] byArray;
        byte[] byArray2;
        spryeb spryeb2 = this;
        byte[] byArray3 = this.cfr_renamed_4.cfr_renamed_783(((sprheb)((Object)spryeb2.cfr_renamed_4)).cfr_renamed_272);
        if (spryeb2.cfr_renamed_2 instanceof sprpqa) {
            byArray2 = ((sprpqa)this.cfr_renamed_2).cfr_renamed_726();
            byArray = byArray3;
        } else {
            byArray2 = this.cfr_renamed_2.cfr_renamed_131().cfr_renamed_755();
            byArray = byArray3;
        }
        byte[] byArray4 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        System.arraycopy(byArray2, 0, byArray4, byArray3.length, byArray2.length);
        return byArray4;
    }
}

