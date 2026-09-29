/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcya;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprsza;
import com.spire.presentation.packages.sprzya;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class sprhbb
extends sprhgb {
    private List<sprsza> cfr_renamed_3;
    private sprzya cfr_renamed_4;

    public void cfr_renamed_1309(OutputStream arg0) throws IOException {
        arg0.write(this.cfr_renamed_91());
    }

    public int hashCode() {
        Iterator<sprsza> iterator;
        int n = 1;
        n = 31 * n + (this.cfr_renamed_3 == null ? 0 : ((Object)this.cfr_renamed_3).hashCode());
        Iterator<sprsza> iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            sprsza sprsza2 = iterator.next();
            n += sprsza2.hashCode();
            iterator2 = iterator;
        }
        return n;
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
    public sprhbb(InputStream inputStream, sprcya sprcya2) throws IOException {
        super(true);
        void arg0;
        void arg1;
        int n;
        sprhbb sprhbb2 = this;
        sprhbb2.cfr_renamed_3 = new ArrayList<sprsza>();
        int n2 = n = 0;
        while (n2 <= arg1.cfr_renamed_132) {
            this.cfr_renamed_1311(new sprsza((InputStream)arg0, (sprcya)arg1, n != 0));
            n2 = ++n;
        }
        this.cfr_renamed_4 = new sprzya((InputStream)arg0, arg1.cfr_renamed_1312());
    }

    /*
     * WARNING - void declaration
     */
    public sprhbb(byte[] byArray, sprcya sprcya2) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0), (sprcya)arg1);
        void arg1;
        void arg0;
    }

    private /* synthetic */ void cfr_renamed_1311(sprsza arg0) {
        this.cfr_renamed_3.add(arg0);
    }

    public sprsza cfr_renamed_1313(int arg0) {
        return this.cfr_renamed_3.get(arg0);
    }

    public boolean equals(Object arg0) {
        int n;
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sprhbb sprhbb2 = (sprhbb)arg0;
        if (this.cfr_renamed_3 == null && sprhbb2.cfr_renamed_3 != null) {
            return false;
        }
        if (this.cfr_renamed_3.size() != sprhbb2.cfr_renamed_3.size()) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            sprsza sprsza2 = this.cfr_renamed_3.get(n);
            sprsza sprsza3 = sprhbb2.cfr_renamed_3.get(n);
            if (!sprsza2.cfr_renamed_3.equals(sprsza3.cfr_renamed_3)) {
                return false;
            }
            if (!sprsza2.cfr_renamed_4.equals(sprsza3.cfr_renamed_4)) {
                return false;
            }
            if (n != 0 && !sprsza2.cfr_renamed_1.equals(sprsza3.cfr_renamed_1)) {
                return false;
            }
            if (!sprsza2.cfr_renamed_2.equals(sprsza3.cfr_renamed_2)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprhbb(List<sprsza> list, sprzya sprzya2) {
        super(true);
        void arg0;
        sprhbb sprhbb2 = this;
        this.cfr_renamed_3 = new ArrayList<sprsza>((Collection<sprsza>)arg0);
        this.cfr_renamed_4 = sprzya2;
    }

    public sprzya cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }
}

