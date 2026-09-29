/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprfrc {
    public short[] cfr_renamed_2;
    public Vector cfr_renamed_3;
    public Vector cfr_renamed_4;

    public Vector spr\u2102\ufe34() {
        return this.cfr_renamed_4;
    }

    public static sprfrc cfr_renamed_2628(sprsc arg0, InputStream arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        int n;
        int n2 = sprzsc.cfr_renamed_2630(arg1);
        short[] sArray = new short[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            sArray[n++] = sprzsc.cfr_renamed_2630(arg1);
            n3 = n;
        }
        Vector vector = null;
        if (sprzsc.cfr_renamed_2631(arg0)) {
            vector = sprzsc.cfr_renamed_2659(false, arg1);
        }
        Vector<spruhe> vector2 = new Vector<spruhe>();
        byte[] byArray = sprzsc.cfr_renamed_2629(arg1);
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(byArray);
        while (byteArrayInputStream2.available() > 0) {
            ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
            byteArrayInputStream2 = byteArrayInputStream3;
            sprvva sprvva2 = sprzsc.cfr_renamed_2768(sprzsc.cfr_renamed_2629(byteArrayInputStream3));
            vector2.addElement(spruhe.cfr_renamed_23(sprvva2));
        }
        return new sprfrc(sArray, vector, vector2);
    }

    public Vector cfr_renamed_2882() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfrc(short[] sArray, Vector vector, Vector vector2) {
        void arg1;
        void arg0;
        sprfrc sprfrc2 = this;
        this.cfr_renamed_2 = arg0;
        sprfrc2.cfr_renamed_3 = arg1;
        sprfrc2.cfr_renamed_4 = vector2;
    }

    public short[] cfr_renamed_2896() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        Object object;
        int n;
        sprfrc sprfrc2;
        if (this.cfr_renamed_2 == null || this.cfr_renamed_2.length == 0) {
            sprzsc.cfr_renamed_2625(0, arg0);
            sprfrc2 = this;
        } else {
            sprfrc sprfrc3 = this;
            sprfrc2 = sprfrc3;
            sprzsc.cfr_renamed_2706(sprfrc3.cfr_renamed_2, arg0);
        }
        if (sprfrc2.cfr_renamed_3 != null) {
            sprzsc.cfr_renamed_2646(this.cfr_renamed_3, false, arg0);
        }
        if (this.cfr_renamed_4 == null || this.cfr_renamed_4.isEmpty()) {
            sprzsc.cfr_renamed_2648(0, arg0);
            return;
        }
        Vector<byte[]> vector = new Vector<byte[]>(this.cfr_renamed_4.size());
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.size()) {
            object = (spruhe)this.cfr_renamed_4.elementAt(n);
            byte[] byArray = ((sprkra)object).cfr_renamed_104("DER");
            vector.addElement(byArray);
            n2 += byArray.length + 2;
            n3 = ++n;
        }
        sprzsc.cfr_renamed_2647(n2);
        sprzsc.cfr_renamed_2648(n2, arg0);
        int n4 = n = 0;
        while (n4 < vector.size()) {
            byte[] byArray = (byte[])vector.elementAt(n);
            object = byArray;
            sprzsc.cfr_renamed_2624(byArray, arg0);
            n4 = ++n;
        }
    }
}

