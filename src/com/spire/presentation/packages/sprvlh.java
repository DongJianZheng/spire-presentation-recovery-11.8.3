/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraj;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprevc;
import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sproih;
import com.spire.presentation.packages.sprvhh;
import com.spire.presentation.packages.sprzl;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprvlh {
    private List<sprvlh> cfr_renamed_145;
    private final BigInteger cfr_renamed_114;
    private final sprco cfr_renamed_96;
    private final int cfr_renamed_105;
    private final BigInteger cfr_renamed_137;
    private final BigInteger cfr_renamed_79;
    private final List<sprvlh> cfr_renamed_107;
    private final sprzl cfr_renamed_132;
    private final boolean cfr_renamed_102;
    private sprvlh cfr_renamed_93;
    private final boolean cfr_renamed_86;
    private final Map<String, sprzl> cfr_renamed_152;
    private final boolean cfr_renamed_112;
    private final sprvhh cfr_renamed_119;
    private List<sprco> cfr_renamed_91;
    private final String cfr_renamed_0;
    private final spraj cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private final String cfr_renamed_3;
    private final int cfr_renamed_4;

    public spraj cfr_renamed_8115() {
        return this.cfr_renamed_1;
    }

    public List<sprco> cfr_renamed_8473() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_8474() {
        return this.cfr_renamed_105;
    }

    /*
     * WARNING - void declaration
     */
    public sprvlh(sprvhh sprvhh2, List<sprvlh> list, boolean bl, String string, BigInteger bigInteger, BigInteger bigInteger2, boolean bl2, BigInteger bigInteger3, sprco sprco2, spraj spraj2, List<sprco> list2, sprzl sprzl2, boolean bl3, String string2, Map<String, sprzl> map, int n, int n2, boolean bl4) {
        Iterator iterator;
        void v8;
        void arg14;
        void arg17;
        void arg16;
        void arg15;
        void arg13;
        void arg12;
        void arg11;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvlh sprvlh2 = this;
        sprvlh sprvlh3 = this;
        sprvlh sprvlh4 = this;
        sprvlh sprvlh5 = this;
        sprvlh sprvlh6 = this;
        this.cfr_renamed_119 = arg0;
        sprvlh6.cfr_renamed_107 = arg1;
        sprvlh6.cfr_renamed_112 = arg2;
        sprvlh5.cfr_renamed_3 = arg3;
        sprvlh5.cfr_renamed_137 = arg4;
        sprvlh4.cfr_renamed_114 = arg5;
        sprvlh4.cfr_renamed_86 = arg6;
        sprvlh3.cfr_renamed_79 = arg7;
        sprvlh3.cfr_renamed_96 = arg8;
        sprvlh2.cfr_renamed_1 = arg9;
        sprvlh2.cfr_renamed_91 = list2 != null ? Collections.unmodifiableList(arg10) : null;
        sprvlh sprvlh7 = this;
        sprvlh sprvlh8 = this;
        sprvlh sprvlh9 = this;
        sprvlh9.cfr_renamed_132 = arg11;
        sprvlh9.cfr_renamed_102 = arg12;
        sprvlh8.cfr_renamed_0 = arg13;
        sprvlh8.cfr_renamed_4 = arg15;
        sprvlh7.cfr_renamed_105 = arg16;
        sprvlh7.cfr_renamed_2 = arg17;
        if (arg14 == null) {
            v8 = arg1;
            this.cfr_renamed_152 = Collections.emptyMap();
        } else {
            this.cfr_renamed_152 = arg14;
            v8 = arg1;
        }
        Iterator iterator2 = iterator = v8.iterator();
        while (iterator2.hasNext()) {
            ((sprvlh)iterator.next()).cfr_renamed_93 = this;
            iterator2 = iterator;
        }
    }

    public String cfr_renamed_8475() {
        if (this.cfr_renamed_0 != null) {
            return this.cfr_renamed_0;
        }
        return this.cfr_renamed_119.name();
    }

    public static sprvlh cfr_renamed_8114(sprvlh arg0, sprvlh arg1) {
        if (arg0.cfr_renamed_132 != null && (arg0 = arg0.cfr_renamed_132.cfr_renamed_1451()).cfr_renamed_8155() != arg1) {
            arg0 = new sprvlh(arg0, arg1);
        }
        return arg0;
    }

    public sprzl cfr_renamed_8110() {
        return this.cfr_renamed_132;
    }

    public int cfr_renamed_8113() {
        return this.cfr_renamed_4;
    }

    public sprco cfr_renamed_8116() {
        return this.cfr_renamed_96;
    }

    public BigInteger cfr_renamed_8126() {
        return this.cfr_renamed_79;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = 3 << 3 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public boolean cfr_renamed_8476() {
        return this.cfr_renamed_86;
    }

    public boolean cfr_renamed_8130() {
        return this.cfr_renamed_8163() != null && this.cfr_renamed_8163().equals(this.cfr_renamed_8131());
    }

    public String cfr_renamed_8132() {
        return this.cfr_renamed_3;
    }

    public sprvlh cfr_renamed_8155() {
        return this.cfr_renamed_93;
    }

    public boolean cfr_renamed_8477() {
        return this.cfr_renamed_8129() && this.cfr_renamed_8131() != null && BigInteger.ZERO.compareTo(this.cfr_renamed_8131()) < 0;
    }

    public int cfr_renamed_8128() {
        block6: {
            if (this.cfr_renamed_8163() == null || this.cfr_renamed_8131() == null) break block6;
            if (BigInteger.ZERO.equals(this.cfr_renamed_8163())) {
                int n = 0;
                int n2 = 1;
                int n3 = n;
                while (n3 < sproih.cfr_renamed_3.length) {
                    if (this.cfr_renamed_8131().compareTo(sproih.cfr_renamed_3[n]) < 0) {
                        return n2;
                    }
                    n2 *= 2;
                    n3 = ++n;
                }
            } else {
                int n = 0;
                int n4 = 1;
                int n5 = n;
                while (n5 < sproih.cfr_renamed_4.length) {
                    if (this.cfr_renamed_8163().compareTo(sproih.cfr_renamed_4[n][0]) >= 0 && this.cfr_renamed_8131().compareTo(sproih.cfr_renamed_4[n][1]) < 0) {
                        return -n4;
                    }
                    n4 *= 2;
                    n5 = ++n;
                }
            }
        }
        return 0;
    }

    public boolean cfr_renamed_8478() {
        return this.cfr_renamed_102;
    }

    public BigInteger cfr_renamed_8163() {
        return this.cfr_renamed_137;
    }

    public String cfr_renamed_8479() {
        return this.cfr_renamed_0;
    }

    public String toString() {
        return new StringBuilder().insert(0, "[").append(this.cfr_renamed_0).append(" ").append(this.cfr_renamed_119.name()).append(sprnhl.cfr_renamed_9("y?")).append(this.cfr_renamed_8132()).append(sprevc.cfr_renamed_9("/7")).toString();
    }

    public boolean cfr_renamed_4567() {
        return this.cfr_renamed_112;
    }

    public List<sprvlh> cfr_renamed_8480() {
        return this.cfr_renamed_145;
    }

    public boolean cfr_renamed_8481() {
        return this.cfr_renamed_8131() == null && this.cfr_renamed_8163() == null;
    }

    public sprvhh cfr_renamed_8109() {
        return this.cfr_renamed_119;
    }

    public String cfr_renamed_8127() {
        return new StringBuilder().insert(0, "(").append(this.cfr_renamed_8163() != null ? this.cfr_renamed_8163().toString() : sprnhl.cfr_renamed_9("U\u0010V")).append(sprevc.cfr_renamed_9("J&D&J")).append(this.cfr_renamed_8131() != null ? this.cfr_renamed_8131().toString() : sprnhl.cfr_renamed_9("U\u0018@")).append(")").toString();
    }

    public boolean cfr_renamed_8482() {
        return this.cfr_renamed_8163() != null && BigInteger.ZERO.compareTo(this.cfr_renamed_8163()) > 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<sprvlh> cfr_renamed_8483() {
        sprvlh sprvlh2 = this;
        synchronized (sprvlh2) {
            if (this.cfr_renamed_8480() == null) {
                ArrayList<sprvlh> arrayList = new ArrayList<sprvlh>();
                for (sprvlh sprvlh3 : this.cfr_renamed_8112()) {
                    if (sprvlh3.cfr_renamed_4567() && sprvlh3.cfr_renamed_8116() == null) continue;
                    arrayList.add(sprvlh3);
                }
                this.cfr_renamed_145 = Collections.unmodifiableList(arrayList);
            }
            return this.cfr_renamed_8480();
        }
    }

    public boolean cfr_renamed_8129() {
        return BigInteger.ZERO.equals(this.cfr_renamed_8163());
    }

    public boolean cfr_renamed_8111() {
        return this.cfr_renamed_86;
    }

    public boolean cfr_renamed_8484() {
        return this.cfr_renamed_2;
    }

    public List<sprvlh> cfr_renamed_8112() {
        return this.cfr_renamed_107;
    }

    public BigInteger cfr_renamed_8131() {
        return this.cfr_renamed_114;
    }

    public String cfr_renamed_8118(String arg0) {
        return new StringBuilder().insert(0, "[").append(this.cfr_renamed_8132() == null ? "" : this.cfr_renamed_8132()).append(this.cfr_renamed_4567() ? sprevc.cfr_renamed_9("(BMC") : "").append(sprnhl.cfr_renamed_9("\u00048")).append(arg0).toString();
    }

    public sprvlh cfr_renamed_8119() {
        return this.cfr_renamed_8112().get(0);
    }

    public sprzl cfr_renamed_8154() {
        sprvlh sprvlh2 = this;
        if (sprvlh2.cfr_renamed_152.containsKey(sprvlh2.cfr_renamed_3)) {
            sprvlh sprvlh3 = this;
            return sprvlh3.cfr_renamed_152.get(sprvlh3.cfr_renamed_3);
        }
        if (this.cfr_renamed_93 != null) {
            sprvlh sprvlh4 = this;
            return sprvlh4.cfr_renamed_93.cfr_renamed_8485(sprvlh4.cfr_renamed_3);
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprevc.cfr_renamed_9("\u001ff\u000bj\u0006mJ|\u0005(\u0018m\u0019g\u0006~\u000f2J")).append(this.cfr_renamed_3).toString());
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprvlh sprvlh2 = (sprvlh)arg0;
        if (this.cfr_renamed_112 != sprvlh2.cfr_renamed_112) {
            return false;
        }
        if (this.cfr_renamed_86 != sprvlh2.cfr_renamed_86) {
            return false;
        }
        if (this.cfr_renamed_2 != sprvlh2.cfr_renamed_2) {
            return false;
        }
        if (this.cfr_renamed_102 != sprvlh2.cfr_renamed_102) {
            return false;
        }
        if (this.cfr_renamed_105 != sprvlh2.cfr_renamed_105) {
            return false;
        }
        if (this.cfr_renamed_4 != sprvlh2.cfr_renamed_4) {
            return false;
        }
        if (this.cfr_renamed_119 != sprvlh2.cfr_renamed_119) {
            return false;
        }
        if (this.cfr_renamed_107 != null ? !((Object)this.cfr_renamed_107).equals(sprvlh2.cfr_renamed_107) : sprvlh2.cfr_renamed_107 != null) {
            return false;
        }
        if (this.cfr_renamed_3 != null ? !this.cfr_renamed_3.equals(sprvlh2.cfr_renamed_3) : sprvlh2.cfr_renamed_3 != null) {
            return false;
        }
        if (this.cfr_renamed_137 != null ? !this.cfr_renamed_137.equals(sprvlh2.cfr_renamed_137) : sprvlh2.cfr_renamed_137 != null) {
            return false;
        }
        if (this.cfr_renamed_114 != null ? !this.cfr_renamed_114.equals(sprvlh2.cfr_renamed_114) : sprvlh2.cfr_renamed_114 != null) {
            return false;
        }
        if (this.cfr_renamed_79 != null ? !this.cfr_renamed_79.equals(sprvlh2.cfr_renamed_79) : sprvlh2.cfr_renamed_79 != null) {
            return false;
        }
        if (this.cfr_renamed_96 != null ? !this.cfr_renamed_96.equals(sprvlh2.cfr_renamed_96) : sprvlh2.cfr_renamed_96 != null) {
            return false;
        }
        if (this.cfr_renamed_1 != null ? !this.cfr_renamed_1.equals(sprvlh2.cfr_renamed_1) : sprvlh2.cfr_renamed_1 != null) {
            return false;
        }
        if (this.cfr_renamed_145 != null ? !((Object)this.cfr_renamed_145).equals(sprvlh2.cfr_renamed_145) : sprvlh2.cfr_renamed_145 != null) {
            return false;
        }
        if (this.cfr_renamed_91 != null ? !((Object)this.cfr_renamed_91).equals(sprvlh2.cfr_renamed_91) : sprvlh2.cfr_renamed_91 != null) {
            return false;
        }
        if (this.cfr_renamed_132 != null ? !this.cfr_renamed_132.equals(sprvlh2.cfr_renamed_132) : sprvlh2.cfr_renamed_132 != null) {
            return false;
        }
        if (this.cfr_renamed_0 != null ? !this.cfr_renamed_0.equals(sprvlh2.cfr_renamed_0) : sprvlh2.cfr_renamed_0 != null) {
            return false;
        }
        if (this.cfr_renamed_152 != null) {
            return !((Object)this.cfr_renamed_152).equals(sprvlh2.cfr_renamed_152);
        }
        return sprvlh2.cfr_renamed_152 != null;
    }

    public sprzl cfr_renamed_8485(String arg0) {
        arg0 = new StringBuilder().insert(0, this.cfr_renamed_3).append(".").append(arg0).toString();
        if (this.cfr_renamed_152.containsKey(arg0)) {
            return this.cfr_renamed_152.get(arg0);
        }
        if (this.cfr_renamed_93 != null) {
            return this.cfr_renamed_93.cfr_renamed_8485(arg0);
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprnhl.cfr_renamed_9("m7y;t<8-wyj<k6t/}c8")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprvlh(sprvlh sprvlh2, sprvlh sprvlh3) {
        Iterator<sprvlh> iterator;
        void arg1;
        void arg0;
        void v0 = arg0;
        sprvlh sprvlh4 = this;
        void v2 = arg0;
        sprvlh sprvlh5 = this;
        void v4 = arg0;
        sprvlh sprvlh6 = this;
        void v6 = arg0;
        sprvlh sprvlh7 = this;
        void v8 = arg0;
        sprvlh sprvlh8 = this;
        sprvlh sprvlh9 = this;
        void v11 = arg0;
        sprvlh9.cfr_renamed_119 = v11.cfr_renamed_119;
        sprvlh sprvlh10 = this;
        sprvlh9.cfr_renamed_107 = new ArrayList<sprvlh>(arg0.cfr_renamed_107);
        sprvlh8.cfr_renamed_112 = v11.cfr_renamed_112;
        sprvlh8.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_137 = v8.cfr_renamed_137;
        sprvlh7.cfr_renamed_114 = v8.cfr_renamed_114;
        sprvlh7.cfr_renamed_86 = arg0.cfr_renamed_86;
        this.cfr_renamed_79 = v6.cfr_renamed_79;
        sprvlh6.cfr_renamed_96 = v6.cfr_renamed_96;
        sprvlh6.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_91 = v4.cfr_renamed_91;
        sprvlh5.cfr_renamed_132 = v4.cfr_renamed_132;
        sprvlh5.cfr_renamed_102 = arg0.cfr_renamed_102;
        this.cfr_renamed_0 = v2.cfr_renamed_0;
        sprvlh4.cfr_renamed_152 = v2.cfr_renamed_152;
        sprvlh4.cfr_renamed_93 = arg1;
        this.cfr_renamed_4 = v0.cfr_renamed_4;
        this.cfr_renamed_105 = v0.cfr_renamed_105;
        this.cfr_renamed_2 = sprvlh2.cfr_renamed_2;
        Iterator<sprvlh> iterator2 = iterator = this.cfr_renamed_107.iterator();
        while (iterator2.hasNext()) {
            iterator.next().cfr_renamed_93 = this;
            iterator2 = iterator;
        }
    }

    public int hashCode() {
        int n = this.cfr_renamed_119 != null ? this.cfr_renamed_119.hashCode() : 0;
        n = 31 * n + (this.cfr_renamed_107 != null ? ((Object)this.cfr_renamed_107).hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_112 ? 1 : 0);
        n = 31 * n + (this.cfr_renamed_3 != null ? this.cfr_renamed_3.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_137 != null ? this.cfr_renamed_137.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_114 != null ? this.cfr_renamed_114.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_86 ? 1 : 0);
        n = 31 * n + (this.cfr_renamed_79 != null ? this.cfr_renamed_79.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_96 != null ? this.cfr_renamed_96.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_1 != null ? this.cfr_renamed_1.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_2 ? 1 : 0);
        n = 31 * n + (this.cfr_renamed_145 != null ? ((Object)this.cfr_renamed_145).hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_91 != null ? ((Object)this.cfr_renamed_91).hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_132 != null ? this.cfr_renamed_132.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_102 ? 1 : 0);
        n = 31 * n + (this.cfr_renamed_0 != null ? this.cfr_renamed_0.hashCode() : 0);
        n = 31 * n + (this.cfr_renamed_152 != null ? ((Object)this.cfr_renamed_152).hashCode() : 0);
        n = 31 * n + this.cfr_renamed_105;
        n = 31 * n + this.cfr_renamed_4;
        return n;
    }
}

