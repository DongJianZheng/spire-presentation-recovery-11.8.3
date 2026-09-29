/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgf;
import com.spire.presentation.packages.sprsxe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public class spreye
implements sprhm {
    private sprsxe cfr_renamed_2;
    private sprsxe cfr_renamed_3;
    private sprsxe cfr_renamed_4;

    public static spreye cfr_renamed_731(InputStream arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws IOException {
        InputStream inputStream = arg0;
        int n = arg2;
        sprsxe sprsxe2 = sprsxe.cfr_renamed_727(inputStream, arg1, n, n);
        int n2 = arg3;
        sprsxe sprsxe3 = sprsxe.cfr_renamed_727(inputStream, arg1, n2, n2);
        sprsxe sprsxe4 = sprsxe.cfr_renamed_727(inputStream, arg1, arg4, arg5);
        return new spreye(sprsxe2, sprsxe3, sprsxe4);
    }

    public static spreye cfr_renamed_732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) throws IOException {
        return spreye.cfr_renamed_731(new ByteArrayInputStream(arg0), arg1, arg2, arg3, arg4, arg5);
    }

    /*
     * WARNING - void declaration
     */
    public spreye(sprsxe sprsxe2, sprsxe sprsxe3, sprsxe sprsxe4) {
        void arg1;
        void arg0;
        spreye spreye2 = this;
        this.cfr_renamed_4 = arg0;
        spreye2.cfr_renamed_3 = arg1;
        spreye2.cfr_renamed_2 = sprsxe4;
    }

    @Override
    public sprhgf cfr_renamed_131() {
        spreye spreye2 = this;
        sprhgf sprhgf2 = spreye2.cfr_renamed_4.cfr_renamed_5442(spreye2.cfr_renamed_3.cfr_renamed_131());
        sprhgf2.cfr_renamed_5444(this.cfr_renamed_2.cfr_renamed_131());
        return sprhgf2;
    }

    @Override
    public sprsgf cfr_renamed_5443(sprsgf arg0) {
        spreye spreye2 = this;
        sprsgf sprsgf2 = spreye2.cfr_renamed_4.cfr_renamed_5443(arg0);
        sprsgf2 = spreye2.cfr_renamed_3.cfr_renamed_5443(sprsgf2);
        sprsgf2.cfr_renamed_5445(this.cfr_renamed_2.cfr_renamed_5443(arg0));
        return sprsgf2;
    }

    @Override
    public sprhgf cfr_renamed_3238(sprhgf arg0, int arg1) {
        sprhgf sprhgf2 = this.cfr_renamed_5442(arg0);
        sprhgf2.cfr_renamed_729(arg1);
        return sprhgf2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + (this.cfr_renamed_4 == null ? 0 : this.cfr_renamed_4.hashCode());
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : this.cfr_renamed_3.hashCode());
        n = 31 * n + (this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.hashCode());
        return n;
    }

    @Override
    public sprhgf cfr_renamed_5442(sprhgf arg0) {
        spreye spreye2 = this;
        sprhgf sprhgf2 = spreye2.cfr_renamed_4.cfr_renamed_5442(arg0);
        sprhgf2 = spreye2.cfr_renamed_3.cfr_renamed_5442(sprhgf2);
        sprhgf2.cfr_renamed_5444(this.cfr_renamed_2.cfr_renamed_5442(arg0));
        return sprhgf2;
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
        spreye spreye2 = (spreye)arg0;
        if (this.cfr_renamed_4 == null ? spreye2.cfr_renamed_4 != null : !this.cfr_renamed_4.equals(spreye2.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_3 == null ? spreye2.cfr_renamed_3 != null : !this.cfr_renamed_3.equals(spreye2.cfr_renamed_3)) {
            return false;
        }
        return !(this.cfr_renamed_2 == null ? spreye2.cfr_renamed_2 != null : !this.cfr_renamed_2.equals(spreye2.cfr_renamed_2));
    }

    public static spreye cfr_renamed_734(int arg0, int arg1, int arg2, int arg3, int arg4, SecureRandom arg5) {
        int n = arg1;
        sprsxe sprsxe2 = sprsxe.cfr_renamed_708(arg0, n, n, arg5);
        int n2 = arg2;
        sprsxe sprsxe3 = sprsxe.cfr_renamed_708(arg0, n2, n2, arg5);
        sprsxe sprsxe4 = sprsxe.cfr_renamed_708(arg0, arg3, arg4, arg5);
        return new spreye(sprsxe2, sprsxe3, sprsxe4);
    }

    public byte[] cfr_renamed_726() {
        spreye spreye2 = this;
        byte[] byArray = spreye2.cfr_renamed_4.cfr_renamed_726();
        byte[] byArray2 = spreye2.cfr_renamed_3.cfr_renamed_726();
        byte[] byArray3 = spreye2.cfr_renamed_2.cfr_renamed_726();
        byte[] byArray4 = sproze.cfr_renamed_523(byArray, byArray.length + byArray2.length + byArray3.length);
        System.arraycopy(byArray2, 0, byArray4, byArray.length, byArray2.length);
        System.arraycopy(byArray3, 0, byArray4, byArray.length + byArray2.length, byArray3.length);
        return byArray4;
    }
}

