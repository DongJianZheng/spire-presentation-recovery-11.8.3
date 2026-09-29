/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlhf;
import com.spire.presentation.packages.sprohf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprri;
import java.util.ArrayList;
import java.util.List;

public class sprtxe
implements sprri {
    private List<List<byte[]>> cfr_renamed_4;

    @Override
    public sprqgf[] cfr_renamed_5327(sprjj arg0, sprqgf arg1, int arg2) {
        ArrayList<sprqgf> arrayList = new ArrayList<sprqgf>();
        byte[] byArray = sprohf.cfr_renamed_5317(arg0, arg1);
        arrayList.add(arg1);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_4.size() - 1) {
            ArrayList<sprqgf> arrayList2;
            int n3;
            Object object;
            block6: {
                if (arg2 == this.cfr_renamed_4.get(n).size() - 1) {
                    sprtxe sprtxe2 = this;
                    while (true) {
                        object = sprtxe2.cfr_renamed_4.get(n + 1);
                        List<byte[]> list = object;
                        if (!sproze.cfr_renamed_92(byArray, list.get(list.size() - 1))) {
                            n3 = arg2;
                            break block6;
                        }
                        arg2 = this.cfr_renamed_4.get(++n).size() - 1;
                        sprtxe2 = this;
                    }
                }
                n3 = arg2;
            }
            sprtxe sprtxe3 = this;
            if ((n3 & 1) == 0) {
                object = sprtxe3.cfr_renamed_4.get(n).get(arg2 + 1);
                arrayList2 = arrayList;
            } else {
                object = sprtxe3.cfr_renamed_4.get(n).get(arg2 - 1);
                arrayList2 = arrayList;
            }
            arrayList2.add(new sprqgf((byte[])object));
            byArray = sprohf.cfr_renamed_5324(arg0, byArray, (byte[])object);
            arg2 /= 2;
            n2 = ++n;
        }
        return arrayList.toArray(new sprqgf[0]);
    }

    @Override
    public byte[] cfr_renamed_3217(sprjj arg0, sprqgf[] arg1) {
        Object object;
        int n;
        sprlhf sprlhf2 = new sprlhf();
        int n2 = n = 0;
        while (n2 < arg1.length) {
            object = sprohf.cfr_renamed_5317(arg0, arg1[n]);
            sprlhf2.cfr_renamed_5314((byte[])object);
            n2 = ++n;
        }
        Object object2 = sprlhf2.cfr_renamed_5312();
        this.cfr_renamed_4 = new ArrayList<List<byte[]>>();
        List<byte[]> list = object2;
        this.cfr_renamed_4.add(list);
        if (list.size() > 1) {
            do {
                int n3;
                object = new ArrayList(object2.size() / 2 + 1);
                int n4 = n3 = 0;
                while (n4 <= object2.size() - 2) {
                    object.add(sprohf.cfr_renamed_5324(arg0, object2.get(n3 += 2), object2.get(n3 + 1)));
                    n4 = n3;
                }
                if (object2.size() % 2 == 1) {
                    List<byte[]> list2 = object2;
                    object.add(list2.get(list2.size() - 1));
                }
                this.cfr_renamed_4.add((List<byte[]>)object);
                object2 = object;
            } while (object2.size() > 1);
        }
        return object2.get(0);
    }

    @Override
    public byte[] cfr_renamed_3235(sprjj arg0, sprqgf[] arg1) {
        int n;
        byte[] byArray = sprohf.cfr_renamed_5317(arg0, arg1[0]);
        int n2 = n = 1;
        while (n2 < arg1.length) {
            sprjj sprjj2 = arg0;
            sprqgf sprqgf2 = arg1[n];
            byArray = sprohf.cfr_renamed_5324(sprjj2, byArray, sprohf.cfr_renamed_5317(sprjj2, sprqgf2));
            n2 = ++n;
        }
        return byArray;
    }
}

