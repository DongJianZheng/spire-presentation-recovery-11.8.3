/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprag;
import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprkwf;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprniaa;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.spruag;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.sprvcg;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprldg
extends sprodg
implements sprag {
    private final int cfr_renamed_3;
    private final sprbxf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvcg cfr_renamed_5710(byte[] arg0) {
        sprkwf sprkwf2;
        try {
            sprkwf2 = sprkwf.cfr_renamed_6501(arg0, this.cfr_renamed_2331());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprlhca.cfr_renamed_9("\u0001>\f1\r+B/\u0003-\u0011:B,\u000b8\f>\u0016*\u0010:X\u007f")).append(iOException.getMessage()).toString());
        }
        spruag[] spruagArray = sprkwf2.cfr_renamed_6502();
        return spruagArray[spruagArray.length - 1].cfr_renamed_1157().cfr_renamed_6473(sprkwf2.cfr_renamed_79()).cfr_renamed_6494(spruagArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static sprldg cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprldg) {
            return (sprldg)arg0;
        }
        if (arg0 instanceof DataInputStream) {
            int n = ((DataInputStream)arg0).readInt();
            sprbxf sprbxf2 = sprbxf.cfr_renamed_23(arg0);
            return new sprldg(n, sprbxf2);
        }
        if (arg0 instanceof byte[]) {
            InputStream inputStream = null;
            try {
                inputStream = new DataInputStream(new ByteArrayInputStream((byte[])arg0));
                sprldg sprldg2 = sprldg.cfr_renamed_23(inputStream);
                return sprldg2;
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        if (arg0 instanceof InputStream) {
            return sprldg.cfr_renamed_23(sprkqe.cfr_renamed_471((InputStream)arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprniaa.cfr_renamed_9("~JsEr_=[|YnN=")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprldg(int n, sprbxf sprbxf2) {
        void arg0;
        sprldg sprldg2 = this;
        super(false);
        sprldg2.cfr_renamed_3 = arg0;
        sprldg2.cfr_renamed_4 = sprbxf2;
    }

    @Override
    public boolean cfr_renamed_5711(sprvcg arg0) {
        sprbxf sprbxf2;
        boolean bl;
        int n;
        boolean bl2 = false;
        spruag[] spruagArray = arg0.cfr_renamed_6495();
        if (spruagArray.length != this.cfr_renamed_2331() - 1) {
            return false;
        }
        sprbxf sprbxf3 = this.cfr_renamed_5942();
        int n2 = n = 0;
        while (n2 < spruagArray.length) {
            byte[] byArray;
            sprlyf sprlyf2 = spruagArray[n].cfr_renamed_79();
            if (!spruzf.cfr_renamed_6468(sprbxf3, sprlyf2, byArray = spruagArray[n].cfr_renamed_1157().cfr_renamed_954())) {
                bl2 = true;
            }
            sprbxf3 = spruagArray[n++].cfr_renamed_1157();
            n2 = n;
        }
        if (!bl2) {
            bl = true;
            sprbxf2 = sprbxf3;
        } else {
            bl = false;
            sprbxf2 = sprbxf3;
        }
        return bl & sprbxf2.cfr_renamed_5711(arg0);
    }

    public int hashCode() {
        int n = this.cfr_renamed_3;
        n = 31 * n + this.cfr_renamed_4.hashCode();
        return n;
    }

    public sprbxf cfr_renamed_5942() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprldg sprldg2 = (sprldg)arg0;
        if (this.cfr_renamed_3 != sprldg2.cfr_renamed_3) {
            return false;
        }
        return this.cfr_renamed_4.equals(sprldg2.cfr_renamed_4);
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_5940(this.cfr_renamed_3).cfr_renamed_6450(this.cfr_renamed_4.cfr_renamed_91()).cfr_renamed_1451();
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_3;
    }
}

