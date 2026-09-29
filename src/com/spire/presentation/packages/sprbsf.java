/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreqf;
import com.spire.presentation.packages.sprgud;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprwqf;
import java.util.ArrayList;
import java.util.List;

public class sprbsf
implements sprnl {
    private final List<sprknf> cfr_renamed_2;
    private final spreqf cfr_renamed_3;
    private final sprlpf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_954() {
        int n;
        sprbsf sprbsf2 = this;
        int n2 = sprbsf2.cfr_renamed_4.cfr_renamed_5732();
        int n3 = sprbsf2.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_2110().cfr_renamed_5786() * n2;
        int n4 = sprbsf2.cfr_renamed_4.cfr_renamed_1452() * n2;
        byte[] byArray = new byte[n3 + n4];
        int n5 = 0;
        byte[][] byArray2 = sprbsf2.cfr_renamed_3.cfr_renamed_954();
        int n6 = n = 0;
        while (n6 < byArray2.length) {
            int n7 = n5;
            sprvof.cfr_renamed_5754(byArray, byArray2[n], n7);
            n5 = n7 + n2;
            n6 = ++n;
        }
        int n8 = n = 0;
        while (n8 < this.cfr_renamed_2.size()) {
            byte[] byArray3 = this.cfr_renamed_2.get(n).cfr_renamed_97();
            int n9 = n5;
            sprvof.cfr_renamed_5754(byArray, byArray3, n9);
            n5 = n9 + n2;
            n8 = ++n;
        }
        return byArray;
    }

    public sprlpf cfr_renamed_2110() {
        return this.cfr_renamed_4;
    }

    public spreqf cfr_renamed_5741() {
        return this.cfr_renamed_3;
    }

    public List<sprknf> cfr_renamed_1415() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbsf(sprwqf sprwqf2) {
        void v5;
        void arg0;
        sprbsf sprbsf2 = this;
        sprbsf2.cfr_renamed_4 = sprwqf.cfr_renamed_5789(sprwqf2);
        if (sprbsf2.cfr_renamed_4 == null) {
            throw new NullPointerException(sprvnd.cfr_renamed_9("\u001a\\\u0018\\\u0007NJ\u0000W\u001d\u0004H\u0006Q"));
        }
        sprbsf sprbsf3 = this;
        int n = sprbsf3.cfr_renamed_4.cfr_renamed_5732();
        int n2 = sprbsf3.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_2110().cfr_renamed_5786();
        int n3 = sprbsf3.cfr_renamed_4.cfr_renamed_1452();
        byte[] byArray = sprwqf.cfr_renamed_5790((sprwqf)arg0);
        if (byArray != null) {
            int n4;
            int n5;
            int n6 = n2 * n;
            int n7 = n3 * n;
            int n8 = n6 + n7;
            if (byArray.length != n8) {
                throw new IllegalArgumentException(sprgud.cfr_renamed_9("h\u000e|\tz\u0013n\u0015~Gs\u0006hGl\u0015t\t|Gh\u000ea\u0002"));
            }
            int n9 = 0;
            byte[][] byArrayArray = new byte[n2][];
            int n10 = n5 = 0;
            while (n10 < byArrayArray.length) {
                byArrayArray[n5] = sprvof.cfr_renamed_5759(byArray, n9, n);
                n9 += n;
                n10 = ++n5;
            }
            this.cfr_renamed_3 = new spreqf(this.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_2110(), byArrayArray);
            ArrayList<sprknf> arrayList = new ArrayList<sprknf>();
            int n11 = n4 = 0;
            while (n11 < n3) {
                arrayList.add(new sprknf(n4, sprvof.cfr_renamed_5759(byArray, n9, n)));
                n9 += n;
                n11 = ++n4;
            }
            this.cfr_renamed_2 = arrayList;
            return;
        }
        spreqf spreqf2 = sprwqf.cfr_renamed_5791((sprwqf)arg0);
        sprbsf sprbsf4 = this;
        if (spreqf2 != null) {
            sprbsf4.cfr_renamed_3 = spreqf2;
            v5 = arg0;
        } else {
            sprbsf4.cfr_renamed_3 = new spreqf(this.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_2110(), new byte[n2][n]);
            v5 = arg0;
        }
        List list = sprwqf.cfr_renamed_5792((sprwqf)v5);
        if (list != null) {
            if (list.size() != n3) {
                throw new IllegalArgumentException(sprvnd.cfr_renamed_9("\u0019T\u0010XJR\f\u001d\u000bH\u001eU:\\\u001eUJS\u000fX\u000eNJI\u0005\u001d\bXJX\u001bH\u000bQJI\u0005\u001d\u0002X\u0003Z\u0002IJR\f\u001d\u001eO\u000fX"));
            }
            this.cfr_renamed_2 = list;
            return;
        }
        this.cfr_renamed_2 = new ArrayList<sprknf>();
    }
}

