/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprbbd {
    public sprcge[] cfr_renamed_3;
    public static final sprbbd cfr_renamed_4 = new sprbbd(new sprcge[0]);

    public int cfr_renamed_806() {
        return this.cfr_renamed_3.length;
    }

    public sprcge[] cfr_renamed_626() {
        return this.cfr_renamed_3095();
    }

    public sprcge[] cfr_renamed_3263() {
        sprcge[] sprcgeArray = new sprcge[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, sprcgeArray, 0, sprcgeArray.length);
        return sprcgeArray;
    }

    public sprcge cfr_renamed_2720(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        byte[] byArray;
        int n;
        Vector<byte[]> vector = new Vector<byte[]>(this.cfr_renamed_3.length);
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            byArray = this.cfr_renamed_3[n].cfr_renamed_104("DER");
            vector.addElement(byArray);
            n2 += byArray.length + 3;
            n3 = ++n;
        }
        sprzsc.cfr_renamed_2662(n2);
        sprzsc.cfr_renamed_2713(n2, arg0);
        int n4 = n = 0;
        while (n4 < vector.size()) {
            byte[] byArray2 = (byte[])vector.elementAt(n);
            byArray = byArray2;
            sprzsc.cfr_renamed_2712(byArray2, arg0);
            n4 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprbbd(sprcge[] sprcgeArray) {
        void arg0;
        if (sprcgeArray == null) {
            throw new IllegalArgumentException(DataColumn.cfr_renamed_9("V\u0011\u0014\u0000\u0005\u001b\u0017\u001b\u0012\u0013\u0005\u0017=\u001b\u0002\u0006VR\u0012\u0013\u001f\u001c\u001e\u0006Q\u0010\u0014R\u001f\u0007\u001d\u001e"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public sprcge[] cfr_renamed_3095() {
        return this.cfr_renamed_3263();
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.length == 0;
    }

    public static sprbbd cfr_renamed_2661(InputStream arg0) throws IOException {
        int n;
        Object[] objectArray;
        int n2 = sprzsc.cfr_renamed_2645(arg0);
        if (n2 == 0) {
            return cfr_renamed_4;
        }
        byte[] byArray = sprzsc.cfr_renamed_2632(n2, arg0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        Vector<sprcge> vector = new Vector<sprcge>();
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        while (byteArrayInputStream2.available() > 0) {
            ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
            byteArrayInputStream2 = byteArrayInputStream3;
            objectArray = sprzsc.cfr_renamed_2700(byteArrayInputStream3);
            sprvva sprvva2 = sprzsc.cfr_renamed_2768(objectArray);
            vector.addElement(sprcge.cfr_renamed_23(sprvva2));
        }
        objectArray = new sprcge[vector.size()];
        int n3 = n = 0;
        while (n3 < vector.size()) {
            int n4 = n++;
            objectArray[n4] = (byte)((sprcge)vector.elementAt(n4));
            n3 = n;
        }
        return new sprbbd((sprcge[])objectArray);
    }
}

