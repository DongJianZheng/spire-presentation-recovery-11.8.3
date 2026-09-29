/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchf;
import com.spire.presentation.packages.spreye;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.sprjgf;
import com.spire.presentation.packages.sprsxe;
import com.spire.presentation.packages.sprugf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprnff
extends sprjgf {
    public sprhgf cfr_renamed_2;
    public sprhm cfr_renamed_3;
    public sprhgf cfr_renamed_4;

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : ((sprugf)((Object)this.cfr_renamed_4)).hashCode());
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.hashCode());
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.hashCode());
        return n;
    }

    public sprnff(InputStream arg0, sprugf arg1) throws IOException {
        sprnff sprnff2;
        sprugf sprugf2 = arg1;
        super(true, sprugf2);
        if (sprugf2.cfr_renamed_185 == 1) {
            sprugf sprugf3 = arg1;
            int n = sprugf3.cfr_renamed_119;
            int n2 = sprugf3.cfr_renamed_132;
            int n3 = sprugf3.cfr_renamed_82;
            int n4 = sprugf3.cfr_renamed_112;
            int n5 = sprugf3.cfr_renamed_3 ? arg1.cfr_renamed_112 : arg1.cfr_renamed_112 - 1;
            sprnff2 = this;
            sprugf sprugf4 = arg1;
            this.cfr_renamed_2 = sprhgf.cfr_renamed_777(arg0, sprugf4.cfr_renamed_119, sprugf4.cfr_renamed_93);
            this.cfr_renamed_3 = spreye.cfr_renamed_731(arg0, n, n2, n3, n4, n5);
        } else {
            InputStream inputStream = arg0;
            sprugf sprugf5 = arg1;
            this.cfr_renamed_2 = sprhgf.cfr_renamed_777(inputStream, sprugf5.cfr_renamed_119, sprugf5.cfr_renamed_93);
            sprhgf sprhgf2 = sprhgf.cfr_renamed_781(inputStream, arg1.cfr_renamed_119);
            this.cfr_renamed_3 = arg1.cfr_renamed_0 ? new sprsxe(sprhgf2) : new sprchf(sprhgf2);
            sprnff2 = this;
        }
        sprnff2.cfr_renamed_1314();
    }

    private /* synthetic */ void cfr_renamed_1314() {
        if (((sprugf)((Object)this.cfr_renamed_4)).cfr_renamed_3) {
            this.cfr_renamed_4 = new sprhgf(((sprugf)((Object)this.cfr_renamed_4)).cfr_renamed_119);
            this.cfr_renamed_4.cfr_renamed_3[0] = 1;
            return;
        }
        this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_131().cfr_renamed_761();
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public sprnff(sprhgf sprhgf2, sprhm sprhm2, sprhgf sprhgf3, sprugf sprugf2) {
        void arg1;
        void arg0;
        void arg3;
        sprnff sprnff2 = this;
        super(true, (sprugf)arg3);
        this.cfr_renamed_2 = arg0;
        sprnff2.cfr_renamed_3 = arg1;
        sprnff2.cfr_renamed_4 = sprhgf3;
    }

    /*
     * WARNING - void declaration
     */
    public sprnff(byte[] byArray, sprugf sprugf2) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sprugf)arg1);
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
        if (!(arg0 instanceof sprnff)) {
            return false;
        }
        sprnff sprnff2 = (sprnff)arg0;
        if (this.cfr_renamed_4 == null ? sprnff2.cfr_renamed_4 != null : !((sprugf)((Object)this.cfr_renamed_4)).equals(sprnff2.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_3 == null ? sprnff2.cfr_renamed_3 != null : !this.cfr_renamed_3.equals(sprnff2.cfr_renamed_3)) {
            return false;
        }
        return this.cfr_renamed_2.equals(sprnff2.cfr_renamed_2);
    }

    public byte[] cfr_renamed_91() {
        byte[] byArray;
        byte[] byArray2;
        sprnff sprnff2 = this;
        byte[] byArray3 = this.cfr_renamed_2.cfr_renamed_783(((sprugf)((Object)sprnff2.cfr_renamed_4)).cfr_renamed_93);
        if (sprnff2.cfr_renamed_3 instanceof spreye) {
            byArray2 = ((spreye)this.cfr_renamed_3).cfr_renamed_726();
            byArray = byArray3;
        } else {
            byArray2 = this.cfr_renamed_3.cfr_renamed_131().cfr_renamed_755();
            byArray = byArray3;
        }
        byte[] byArray4 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        System.arraycopy(byArray2, 0, byArray4, byArray3.length, byArray2.length);
        return byArray4;
    }
}

