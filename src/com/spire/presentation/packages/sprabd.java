/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuc;
import com.spire.presentation.packages.sprnrj;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprabd {
    public Vector cfr_renamed_4;

    public Vector cfr_renamed_3073() {
        return this.cfr_renamed_4;
    }

    public static sprabd cfr_renamed_2661(InputStream arg0) throws IOException {
        int n = sprzsc.cfr_renamed_2660(arg0);
        if (n < 1) {
            throw new spryad(50);
        }
        byte[] byArray = sprzsc.cfr_renamed_2632(n, arg0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        Vector<spreuc> vector = new Vector<spreuc>();
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        while (byteArrayInputStream2.available() > 0) {
            ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
            byteArrayInputStream2 = byteArrayInputStream3;
            spreuc spreuc2 = spreuc.cfr_renamed_2661(byteArrayInputStream3);
            vector.addElement(spreuc2);
        }
        return new sprabd(vector);
    }

    /*
     * WARNING - void declaration
     */
    public sprabd(Vector vector) {
        void arg0;
        if (vector == null || arg0.isEmpty()) {
            throw new IllegalArgumentException(sprnrj.cfr_renamed_9("\r\u0001O\u0000\\\u0017X<K\u001fO>C\u0001^U\n\u001f_\u0001^RD\u001d^RH\u0017\n\u001c_\u001eFRE\u0000\n\u0017G\u0002^\u000b"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            Object e = this.cfr_renamed_4.elementAt(n);
            ((spreuc)e).cfr_renamed_2623(byteArrayOutputStream);
            n2 = ++n;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        sprzsc.cfr_renamed_2647(byteArrayOutputStream2.size());
        OutputStream outputStream = arg0;
        sprzsc.cfr_renamed_2648(byteArrayOutputStream2.size(), outputStream);
        byteArrayOutputStream2.writeTo(outputStream);
    }
}

