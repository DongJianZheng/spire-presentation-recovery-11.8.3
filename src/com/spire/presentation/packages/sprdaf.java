/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprngf;
import com.spire.presentation.packages.sprnze;
import com.spire.presentation.packages.sproaf;
import com.spire.presentation.packages.spryye;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class sprdaf
extends spryye {
    private List<sprnze> cfr_renamed_3;
    private sprngf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdaf(byte[] byArray, sproaf sproaf2) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sproaf)arg1);
        void arg1;
        void arg0;
    }

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    public byte[] cfr_renamed_91() throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            this.cfr_renamed_3.get(n).cfr_renamed_1310(byteArrayOutputStream, n != 0);
            n2 = ++n;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        byteArrayOutputStream2.write(this.cfr_renamed_4.cfr_renamed_91());
        return byteArrayOutputStream2.toByteArray();
    }

    /*
     * WARNING - void declaration
     */
    public sprdaf(List<sprnze> list, sprngf sprngf2) {
        super(true);
        void arg0;
        sprdaf sprdaf2 = this;
        this.cfr_renamed_3 = new ArrayList<sprnze>((Collection<sprnze>)arg0);
        this.cfr_renamed_4 = sprngf2;
    }

    public sprnze cfr_renamed_1313(int arg0) {
        return this.cfr_renamed_3.get(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprdaf(InputStream inputStream, sproaf sproaf2) throws IOException {
        super(true);
        void arg0;
        void arg1;
        int n;
        sprdaf sprdaf2 = this;
        sprdaf2.cfr_renamed_3 = new ArrayList<sprnze>();
        int n2 = n = 0;
        while (n2 <= arg1.cfr_renamed_119) {
            this.cfr_renamed_5608(new sprnze((InputStream)arg0, (sproaf)arg1, n != 0));
            n2 = ++n;
        }
        this.cfr_renamed_4 = new sprngf((InputStream)arg0, arg1.cfr_renamed_1312());
    }

    public boolean equals(Object arg0) {
        int n;
        sprdaf sprdaf2;
        boolean bl;
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprdaf sprdaf3 = (sprdaf)arg0;
        if (this.cfr_renamed_3 == null) {
            bl = true;
            sprdaf2 = sprdaf3;
        } else {
            bl = false;
            sprdaf2 = sprdaf3;
        }
        if (bl != (sprdaf2.cfr_renamed_3 == null)) {
            return false;
        }
        if (this.cfr_renamed_3 == null) {
            return true;
        }
        if (this.cfr_renamed_3.size() != sprdaf3.cfr_renamed_3.size()) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            sprnze sprnze2 = this.cfr_renamed_3.get(n);
            sprnze sprnze3 = sprdaf3.cfr_renamed_3.get(n);
            if (!sprnze2.cfr_renamed_4.equals(sprnze3.cfr_renamed_4)) {
                return false;
            }
            if (!sprnze2.cfr_renamed_3.equals(sprnze3.cfr_renamed_3)) {
                return false;
            }
            if (n != 0 && !sprnze2.cfr_renamed_1.equals(sprnze3.cfr_renamed_1)) {
                return false;
            }
            if (!sprnze2.cfr_renamed_2.equals(sprnze3.cfr_renamed_2)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public sprngf cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_5608(sprnze arg0) {
        this.cfr_renamed_3.add(arg0);
    }

    public int hashCode() {
        Iterator<sprnze> iterator;
        int n = 1;
        n = 31 * n;
        if (this.cfr_renamed_3 == null) {
            return n;
        }
        n += ((Object)this.cfr_renamed_3).hashCode();
        Iterator<sprnze> iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            sprnze sprnze2 = iterator.next();
            n += sprnze2.hashCode();
            iterator2 = iterator;
        }
        return n;
    }
}

