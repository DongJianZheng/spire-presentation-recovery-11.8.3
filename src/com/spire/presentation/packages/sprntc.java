/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkae;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprntc {
    public sprszd cfr_renamed_3;
    public Vector cfr_renamed_4;

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        Object object;
        sprntc sprntc2;
        if (this.cfr_renamed_4 == null || this.cfr_renamed_4.isEmpty()) {
            sprzsc.cfr_renamed_2648(0, arg0);
            sprntc2 = this;
        } else {
            int n;
            object = new ByteArrayOutputStream();
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4.size()) {
                sprkae sprkae2 = (sprkae)this.cfr_renamed_4.elementAt(n);
                sprzsc.cfr_renamed_2624(sprkae2.cfr_renamed_104("DER"), (OutputStream)object);
                n2 = ++n;
            }
            Object object2 = object;
            sprzsc.cfr_renamed_2647(((ByteArrayOutputStream)object2).size());
            OutputStream outputStream = arg0;
            sprzsc.cfr_renamed_2648(((ByteArrayOutputStream)object2).size(), outputStream);
            ((ByteArrayOutputStream)object2).writeTo(outputStream);
            sprntc2 = this;
        }
        if (sprntc2.cfr_renamed_3 == null) {
            sprzsc.cfr_renamed_2648(0, arg0);
            return;
        }
        byte[] byArray = this.cfr_renamed_3.cfr_renamed_104("DER");
        object = byArray;
        sprzsc.cfr_renamed_2647(byArray.length);
        sprzsc.cfr_renamed_2648(((Object)object).length, arg0);
        arg0.write((byte[])object);
    }

    public static sprntc cfr_renamed_2661(InputStream arg0) throws IOException {
        Object object;
        Vector<sprkae> vector = new Vector<sprkae>();
        int n = sprzsc.cfr_renamed_2660(arg0);
        if (n > 0) {
            ByteArrayInputStream byteArrayInputStream;
            byte[] byArray = sprzsc.cfr_renamed_2632(n, arg0);
            object = new ByteArrayInputStream(byArray);
            do {
                byteArrayInputStream = object;
                sprkae sprkae2 = sprkae.cfr_renamed_23(sprzsc.cfr_renamed_2768(sprzsc.cfr_renamed_2629(byteArrayInputStream)));
                vector.addElement(sprkae2);
            } while (byteArrayInputStream.available() > 0);
        }
        sprszd sprszd2 = null;
        int n2 = sprzsc.cfr_renamed_2660(arg0);
        if (n2 > 0) {
            byte[] byArray = sprzsc.cfr_renamed_2632(n2, arg0);
            object = byArray;
            sprszd2 = sprszd.cfr_renamed_23(sprzsc.cfr_renamed_2768(byArray));
        }
        return new sprntc(vector, sprszd2);
    }

    public Vector cfr_renamed_3090() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprntc(Vector vector, sprszd sprszd2) {
        void arg0;
        sprntc sprntc2 = this;
        sprntc2.cfr_renamed_4 = arg0;
        sprntc2.cfr_renamed_3 = sprszd2;
    }

    public sprszd cfr_renamed_3091() {
        return this.cfr_renamed_3;
    }
}

