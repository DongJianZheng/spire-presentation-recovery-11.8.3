/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreqf;
import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprlkf;
import com.spire.presentation.packages.sprojf;
import com.spire.presentation.packages.spropf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprrun;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprtza;
import com.spire.presentation.packages.sprvof;
import java.util.ArrayList;
import java.util.List;

public final class spraof {
    private byte[] cfr_renamed_1;
    private final sprirf cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final spropf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraof(sprirf sprirf2) {
        void arg0;
        if (sprirf2 == null) {
            throw new NullPointerException(sprrun.cfr_renamed_9("MSOSPA\u001d\u000f\u0000\u0012SGQ^"));
        }
        spraof spraof2 = this;
        spraof spraof3 = this;
        spraof3.cfr_renamed_2 = arg0;
        int n = arg0.cfr_renamed_5732();
        spraof spraof4 = this;
        spraof2.cfr_renamed_4 = new spropf(arg0.cfr_renamed_3234(), n);
        spraof3.cfr_renamed_3 = new byte[n];
        spraof2.cfr_renamed_1 = new byte[n];
    }

    public sprojf cfr_renamed_5740(byte[] arg0, spreqf arg1, sprrqf arg2) {
        int n;
        int n2;
        if (arg0 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9(";u%c7w3T?w3c\"0k-v~#|:"));
        }
        if (arg0.length != this.cfr_renamed_2.cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("ATHX\u0012RT\u001d_XANSZWy[ZWNF\u001d\\XWYA\u001dFR\u0012_W\u001dWLG\\^\u001dFR\u0012N[GW\u001d][\u0012Y[ZWNF"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("%y1~7d#b30k-v~#|:"));
        }
        if (arg2 == null) {
            throw new NullPointerException(sprrun.cfr_renamed_9("RFNz\\AUsYVOWNA\u001d\u000f\u0000\u0012SGQ^"));
        }
        List<Integer> list = this.cfr_renamed_5872(arg0, this.cfr_renamed_2.cfr_renamed_1250(), this.cfr_renamed_2.cfr_renamed_5869());
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_2.cfr_renamed_5869()) {
            int n5 = list.get(n2);
            n3 += this.cfr_renamed_2.cfr_renamed_1250() - 1 - n5;
            n4 = ++n2;
        }
        spraof spraof2 = this;
        spraof spraof3 = this;
        n2 = (int)Math.ceil((double)(spraof2.cfr_renamed_2.cfr_renamed_5868() * sprvof.cfr_renamed_1340(spraof3.cfr_renamed_2.cfr_renamed_1250())) / 8.0);
        List<Integer> list2 = spraof2.cfr_renamed_5872(sprvof.cfr_renamed_5755(n3 <<= 8 - this.cfr_renamed_2.cfr_renamed_5868() * sprvof.cfr_renamed_1340(this.cfr_renamed_2.cfr_renamed_1250()) % 8, n2), this.cfr_renamed_2.cfr_renamed_1250(), this.cfr_renamed_2.cfr_renamed_5868());
        list.addAll(list2);
        byte[][] byArrayArray = new byte[spraof3.cfr_renamed_2.cfr_renamed_5786()][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2.cfr_renamed_5786()) {
            arg2 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5776(arg2.cfr_renamed_5738()).cfr_renamed_5873(n).cfr_renamed_5874(arg2.cfr_renamed_5875()).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
            int n7 = n;
            byte[] byArray = this.cfr_renamed_5876(arg1.cfr_renamed_954()[n7], list.get(n), this.cfr_renamed_2.cfr_renamed_1250() - 1 - list.get(n), arg2);
            byArrayArray[n7] = byArray;
            n6 = ++n;
        }
        return new sprojf(this.cfr_renamed_2, byArrayArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_5876(byte[] byArray, int n, int n2, sprrqf sprrqf2) {
        int n3;
        void arg2;
        void arg1;
        sprrqf arg3;
        void arg0;
        int n4 = this.cfr_renamed_2.cfr_renamed_5732();
        if (byArray == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("%d7b\"X7c>0k-v~#|:"));
        }
        if (((void)arg0).length != n4) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrun.cfr_renamed_9("NF\\@Iz\\AU\u0012SWXVN\u0012I]\u001dPX\u0012")).append(n4).append(sprtza.cfr_renamed_9("4i\"u%")).toString());
        }
        if (arg3 == null) {
            throw new NullPointerException(sprrun.cfr_renamed_9("RFNz\\AUsYVOWNA\u001d\u000f\u0000\u0012SGQ^"));
        }
        if (arg3.cfr_renamed_954() == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("9d%X7c>Q2t$u%cvr/d307b$q/0k-v~#|:"));
        }
        if (arg1 + arg2 > this.cfr_renamed_2.cfr_renamed_1250() - 1) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("_\\J\u001dQUST\\\u001d^X\\ZFU\u0012PGNF\u001d\\RF\u001dPX\u0012Z@XSIWO\u0012IZ\\\\\u001dE"));
        }
        if (arg2 == false) {
            return arg0;
        }
        byte[] byArray2 = this.cfr_renamed_5876((byte[])arg0, (int)arg1, (int)(arg2 - true), arg3);
        arg3 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg3.cfr_renamed_5734())).cfr_renamed_5735(arg3.cfr_renamed_5736())).cfr_renamed_5776(arg3.cfr_renamed_5738()).cfr_renamed_5873(arg3.cfr_renamed_5877()).cfr_renamed_5874((int)(arg1 + arg2 - true)).cfr_renamed_5745(0)).cfr_renamed_1451();
        spraof spraof2 = this;
        byte[] byArray3 = spraof2.cfr_renamed_4.cfr_renamed_5773(spraof2.cfr_renamed_1, arg3.cfr_renamed_954());
        arg3 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg3.cfr_renamed_5734())).cfr_renamed_5735(arg3.cfr_renamed_5736())).cfr_renamed_5776(arg3.cfr_renamed_5738()).cfr_renamed_5873(arg3.cfr_renamed_5877()).cfr_renamed_5874(arg3.cfr_renamed_5875()).cfr_renamed_5745(1)).cfr_renamed_1451();
        spraof spraof3 = this;
        byte[] byArray4 = spraof3.cfr_renamed_4.cfr_renamed_5773(spraof3.cfr_renamed_1, arg3.cfr_renamed_954());
        byte[] byArray5 = new byte[n4];
        int n5 = n3 = 0;
        while (n5 < n4) {
            int n6 = n3;
            byte by = (byte)(byArray2[n3] ^ byArray4[n6]);
            byArray5[n6] = by;
            n5 = ++n3;
        }
        byArray2 = this.cfr_renamed_4.cfr_renamed_5878(byArray3, byArray5);
        return byArray2;
    }

    public spreqf cfr_renamed_5770(byte[] arg0, sprrqf arg1) {
        int n;
        int n2;
        if (arg0 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9(";u%c7w3T?w3c\"0k-v~#|:"));
        }
        if (arg0.length != this.cfr_renamed_2.cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("ATHX\u0012RT\u001d_XANSZWy[ZWNF\u001d\\XWYA\u001dFR\u0012_W\u001dWLG\\^\u001dFR\u0012N[GW\u001d][\u0012Y[ZWNF"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("\u007f\"c\u001eq%x\u0017t2b3c%0k-v~#|:"));
        }
        List<Integer> list = this.cfr_renamed_5872(arg0, this.cfr_renamed_2.cfr_renamed_1250(), this.cfr_renamed_2.cfr_renamed_5869());
        int n3 = 0;
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_2.cfr_renamed_5869()) {
            int n5 = list.get(n2);
            n3 += this.cfr_renamed_2.cfr_renamed_1250() - 1 - n5;
            n4 = ++n2;
        }
        spraof spraof2 = this;
        spraof spraof3 = this;
        n2 = (int)Math.ceil((double)(spraof2.cfr_renamed_2.cfr_renamed_5868() * sprvof.cfr_renamed_1340(spraof3.cfr_renamed_2.cfr_renamed_1250())) / 8.0);
        List<Integer> list2 = spraof2.cfr_renamed_5872(sprvof.cfr_renamed_5755(n3 <<= 8 - this.cfr_renamed_2.cfr_renamed_5868() * sprvof.cfr_renamed_1340(this.cfr_renamed_2.cfr_renamed_1250()) % 8, n2), this.cfr_renamed_2.cfr_renamed_1250(), this.cfr_renamed_2.cfr_renamed_5868());
        list.addAll(list2);
        byte[][] byArrayArray = new byte[spraof3.cfr_renamed_2.cfr_renamed_5786()][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2.cfr_renamed_5786()) {
            arg1 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg1.cfr_renamed_5734())).cfr_renamed_5735(arg1.cfr_renamed_5736())).cfr_renamed_5776(arg1.cfr_renamed_5738()).cfr_renamed_5873(n).cfr_renamed_5874(arg1.cfr_renamed_5875()).cfr_renamed_5745(arg1.cfr_renamed_5746())).cfr_renamed_1451();
            spraof spraof4 = this;
            int n7 = n;
            byte[] byArray = spraof4.cfr_renamed_5876(spraof4.cfr_renamed_5879(n7), 0, list.get(n), arg1);
            byArrayArray[n7] = byArray;
            n6 = ++n;
        }
        return new spreqf(this.cfr_renamed_2, byArrayArray);
    }

    private /* synthetic */ List<Integer> cfr_renamed_5872(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprrun.cfr_renamed_9("_NU\u001d\u000f\u0000\u0012SGQ^"));
        }
        if (arg1 != 4 && arg1 != 16) {
            throw new IllegalArgumentException(sprtza.cfr_renamed_9("!08u3t%0\"\u007fvr30b09bv!`"));
        }
        int n2 = sprvof.cfr_renamed_1340(arg1);
        if (arg2 > 8 * arg0.length / n2) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("]HFqWSUIZ\u001dFR]\u001dPTU"));
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4 = 8 - n2;
            while (n4 >= 0) {
                int n5;
                ArrayList<Integer> arrayList2 = arrayList;
                arrayList2.add(arg0[n] >> n5 & arg1 - 1);
                if (arrayList2.size() == arg2) {
                    return arrayList;
                }
                n4 = n5 - n2;
            }
            n3 = ++n;
        }
        return arrayList;
    }

    private /* synthetic */ byte[] cfr_renamed_5879(int arg0) {
        if (arg0 < 0 || arg0 >= this.cfr_renamed_2.cfr_renamed_5786()) {
            throw new IllegalArgumentException(sprtza.cfr_renamed_9("?~2u.09e\"09vvr9e8t%"));
        }
        spraof spraof2 = this;
        return spraof2.cfr_renamed_4.cfr_renamed_5773(spraof2.cfr_renamed_3, sprvof.cfr_renamed_5755(arg0, 32));
    }

    public byte[] cfr_renamed_5769() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public spropf cfr_renamed_5784() {
        return this.cfr_renamed_4;
    }

    public sprojf cfr_renamed_5880(sprrqf arg0) {
        int n;
        if (arg0 == null) {
            throw new NullPointerException(sprrun.cfr_renamed_9("RFNz\\AUsYVOWNA\u001d\u000f\u0000\u0012SGQ^"));
        }
        byte[][] byArrayArray = new byte[this.cfr_renamed_2.cfr_renamed_5786()][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.cfr_renamed_5786()) {
            arg0 = (sprrqf)((sprtsf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg0.cfr_renamed_5734())).cfr_renamed_5735(arg0.cfr_renamed_5736())).cfr_renamed_5776(arg0.cfr_renamed_5738()).cfr_renamed_5873(n).cfr_renamed_5874(arg0.cfr_renamed_5875()).cfr_renamed_5745(arg0.cfr_renamed_5746())).cfr_renamed_1451();
            spraof spraof2 = this;
            int n3 = n++;
            byArrayArray[n3] = spraof2.cfr_renamed_5876(spraof2.cfr_renamed_5879(n3), 0, this.cfr_renamed_2.cfr_renamed_1250() - 1, arg0);
            n2 = n;
        }
        return new sprojf(this.cfr_renamed_2, byArrayArray);
    }

    public sprlkf cfr_renamed_1369() {
        int n;
        byte[][] byArrayArray = new byte[this.cfr_renamed_2.cfr_renamed_5786()][];
        int n2 = n = 0;
        while (n2 < byArrayArray.length) {
            int n3 = n++;
            byArrayArray[n3] = this.cfr_renamed_5879(n3);
            n2 = n;
        }
        return new sprlkf(this.cfr_renamed_2, byArrayArray);
    }

    public sprirf cfr_renamed_2110() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_5767(byte[] arg0, sprrqf arg1) {
        arg1 = (sprrqf)((sprtsf)((sprtsf)new sprtsf().cfr_renamed_5733(arg1.cfr_renamed_5734())).cfr_renamed_5735(arg1.cfr_renamed_5736())).cfr_renamed_5776(arg1.cfr_renamed_5738()).cfr_renamed_1451();
        return this.cfr_renamed_4.cfr_renamed_5773(arg0, arg1.cfr_renamed_954());
    }

    public void cfr_renamed_5766(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("%u5b3d\u001du/C3u20k-v~#|:"));
        }
        if (arg0.length != this.cfr_renamed_2.cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("ATHX\u0012RT\u001dAXQOWIyXKnWXV\u001d\\XWYA\u001dFR\u0012_W\u001dWLG\\^\u001dFR\u0012N[GW\u001d][\u0012Y[ZWNF"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprtza.cfr_renamed_9("`#r:y5C3u20k-v~#|:"));
        }
        if (arg1.length != this.cfr_renamed_2.cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprrun.cfr_renamed_9("N[GW\u001d][\u0012MG_^TQnWXV\u001d\\XWYA\u001dFR\u0012_W\u001dWLG\\^\u001dFR\u0012N[GW\u001d][\u0012Y[ZWNF"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_1 = arg1;
    }

    public byte[] cfr_renamed_5768() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }
}

