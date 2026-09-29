/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprhcb;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprrsq;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrb;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sprkmb {
    private Set cfr_renamed_86;
    private Set cfr_renamed_152;
    private Set cfr_renamed_112;
    private Set cfr_renamed_119;
    private Set cfr_renamed_91;
    private Set cfr_renamed_0;
    private Set cfr_renamed_1;
    private Set cfr_renamed_2;
    private Set cfr_renamed_3;
    private Set cfr_renamed_4;

    private /* synthetic */ byte[][] cfr_renamed_2224(byte[] arg0, byte[] arg1) {
        int n = arg0.length / 2;
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        int n2 = n;
        System.arraycopy(arg0, 0, byArray, 0, n);
        System.arraycopy(arg0, n2, byArray2, 0, n);
        byte[] byArray3 = new byte[n2];
        byte[] byArray4 = new byte[n];
        System.arraycopy(arg1, 0, byArray3, 0, n);
        System.arraycopy(arg1, n, byArray4, 0, n);
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        byArrayArray[2] = byArray3;
        byArrayArray[3] = byArray4;
        return byArrayArray;
    }

    private /* synthetic */ void cfr_renamed_2225(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(string2, arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (string2.equalsIgnoreCase(arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                if (this.cfr_renamed_2226(string, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (this.cfr_renamed_2226(arg1, arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.indexOf(64) != -1) {
            String string = arg1;
            String string3 = string.substring(string.indexOf(64) + 1);
            if (string3.equalsIgnoreCase(arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.startsWith(".")) {
            if (this.cfr_renamed_2226(arg0, arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.equalsIgnoreCase(arg1)) {
            arg2.add(arg0);
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_2227(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if ((arg0[n] & 0xFFFF) > (arg1[n] & 0xFFFF)) {
                return arg0;
            }
            n2 = ++n;
        }
        return arg1;
    }

    public int hashCode() {
        sprkmb sprkmb2 = this;
        sprkmb sprkmb3 = this;
        sprkmb sprkmb4 = this;
        sprkmb sprkmb5 = this;
        sprkmb sprkmb6 = this;
        sprkmb sprkmb7 = this;
        sprkmb sprkmb8 = this;
        sprkmb sprkmb9 = this;
        sprkmb sprkmb10 = this;
        sprkmb sprkmb11 = this;
        return sprkmb2.cfr_renamed_2228(sprkmb2.cfr_renamed_1) + sprkmb3.cfr_renamed_2228(sprkmb3.cfr_renamed_2) + sprkmb4.cfr_renamed_2228(sprkmb4.cfr_renamed_119) + sprkmb5.cfr_renamed_2228(sprkmb5.cfr_renamed_86) + sprkmb6.cfr_renamed_2228(sprkmb6.cfr_renamed_112) + sprkmb7.cfr_renamed_2228(sprkmb7.cfr_renamed_4) + sprkmb8.cfr_renamed_2228(sprkmb8.cfr_renamed_91) + sprkmb9.cfr_renamed_2228(sprkmb9.cfr_renamed_3) + sprkmb10.cfr_renamed_2228(sprkmb10.cfr_renamed_152) + sprkmb11.cfr_renamed_2228(sprkmb11.cfr_renamed_0);
    }

    public void cfr_renamed_349(sprbfe[] arg0) {
        int n;
        HashMap hashMap = new HashMap();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprbfe object = arg0[n];
            Integer n3 = spriwa.cfr_renamed_279(object.cfr_renamed_2229().cfr_renamed_312());
            if (hashMap.get(n3) == null) {
                hashMap.put(n3, new HashSet());
            }
            ((Set)hashMap.get(n3)).add(object);
            n2 = ++n;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            switch ((Integer)entry.getKey()) {
                case 1: {
                    sprkmb sprkmb2 = this;
                    while (false) {
                    }
                    sprkmb2.cfr_renamed_3 = sprkmb2.cfr_renamed_2230(sprkmb2.cfr_renamed_3, (Set)entry.getValue());
                    break;
                }
                case 2: {
                    sprkmb sprkmb3 = this;
                    sprkmb3.cfr_renamed_91 = sprkmb3.cfr_renamed_2231(sprkmb3.cfr_renamed_91, (Set)entry.getValue());
                    break;
                }
                case 4: {
                    sprkmb sprkmb4 = this;
                    sprkmb4.cfr_renamed_4 = sprkmb4.cfr_renamed_2232(sprkmb4.cfr_renamed_4, (Set)entry.getValue());
                    break;
                }
                case 6: {
                    sprkmb sprkmb5 = this;
                    sprkmb5.cfr_renamed_0 = sprkmb5.cfr_renamed_2233(sprkmb5.cfr_renamed_0, (Set)entry.getValue());
                    break;
                }
                case 7: {
                    sprkmb sprkmb6 = this;
                    sprkmb6.cfr_renamed_152 = sprkmb6.cfr_renamed_2234(sprkmb6.cfr_renamed_152, (Set)entry.getValue());
                }
            }
        }
    }

    private static /* synthetic */ boolean cfr_renamed_2235(sprbne arg0, sprbne arg1) {
        int n;
        if (arg1.cfr_renamed_84() < 1) {
            return false;
        }
        if (arg1.cfr_renamed_84() > arg0.cfr_renamed_84()) {
            return false;
        }
        int n2 = n = arg1.cfr_renamed_84() - 1;
        while (n2 >= 0) {
            if (!arg1.cfr_renamed_85(n).equals(arg0.cfr_renamed_85(n))) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    private /* synthetic */ String cfr_renamed_2236(byte[] arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length / 2) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(Integer.toString(arg0[n] & 0xFF));
            string = stringBuilder.append(".").toString();
            n2 = ++n;
        }
        string = string.substring(0, string.length() - 1);
        string = new StringBuilder().insert(0, string).append("/").toString();
        int n3 = n = arg0.length / 2;
        while (n3 < arg0.length) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(Integer.toString(arg0[n] & 0xFF));
            string = stringBuilder.append(".").toString();
            n3 = ++n;
        }
        string = string.substring(0, string.length() - 1);
        return string;
    }

    private /* synthetic */ Set cfr_renamed_2234(Set arg0, Set arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            byte[] byArray = sprxue.cfr_renamed_23(((sprbfe)iterator.next()).cfr_renamed_2229().cfr_renamed_313()).cfr_renamed_186();
            if (arg0 == null) {
                if (byArray == null) continue;
                hashSet.add(byArray);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                byte[] byArray2 = (byte[])iterator3.next();
                iterator2 = iterator3;
                hashSet.addAll(this.cfr_renamed_2237(byArray2, byArray));
            }
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2238(int arg0) {
        switch (arg0) {
            case 1: {
                this.cfr_renamed_3 = new HashSet();
                return;
            }
            case 2: {
                this.cfr_renamed_91 = new HashSet();
                return;
            }
            case 4: {
                this.cfr_renamed_4 = new HashSet();
                return;
            }
            case 6: {
                this.cfr_renamed_0 = new HashSet();
                return;
            }
            case 7: {
                this.cfr_renamed_152 = new HashSet();
                return;
            }
        }
    }

    private /* synthetic */ Set cfr_renamed_2239(Set arg0, String arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_2240(string, arg1, hashSet);
        }
        return hashSet;
    }

    public void cfr_renamed_345(sprbne arg0) throws sprzrb {
        sprkmb sprkmb2 = this;
        sprkmb2.cfr_renamed_2241(sprkmb2.cfr_renamed_1, arg0);
    }

    private /* synthetic */ Set cfr_renamed_2231(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_2242(((sprbfe)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            for (String string2 : arg0) {
                if (this.cfr_renamed_2226(string2, string)) {
                    hashSet.add(string2);
                    continue;
                }
                if (!this.cfr_renamed_2226(string, string2)) continue;
                hashSet.add(string);
            }
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2243(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(string2, arg1)) {
                    arg2.add(arg0);
                    return;
                }
            } else if (string2.equalsIgnoreCase(arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                if (this.cfr_renamed_2226(string, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    arg2.add(arg1);
                    return;
                }
            } else if (this.cfr_renamed_2226(arg1, arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.indexOf(64) != -1) {
            String string = arg1;
            String string3 = string.substring(string.indexOf(64) + 1);
            if (string3.equalsIgnoreCase(arg0)) {
                arg2.add(arg1);
                return;
            }
        } else if (arg1.startsWith(".")) {
            if (this.cfr_renamed_2226(arg0, arg1)) {
                arg2.add(arg0);
                return;
            }
        } else if (arg0.equalsIgnoreCase(arg1)) {
            arg2.add(arg0);
        }
    }

    private /* synthetic */ boolean cfr_renamed_2244(String arg0, String arg1) {
        String string = sprkmb.cfr_renamed_2245(arg0);
        return !arg1.startsWith(".") ? string.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string, arg1);
    }

    private /* synthetic */ byte[][] cfr_renamed_2246(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n;
        int n2 = arg0.length;
        byte[] byArray = new byte[n2];
        byte[] byArray2 = new byte[n2];
        byte[] byArray3 = new byte[n2];
        byte[] byArray4 = new byte[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            byArray[n4] = (byte)(arg0[n] & arg1[n4]);
            int n5 = n;
            byArray2[n5] = (byte)(arg0[n] & arg1[n5] | ~arg1[n]);
            int n6 = n;
            byArray3[n6] = (byte)(arg2[n] & arg3[n6]);
            int n7 = n;
            byte by = (byte)(arg2[n] & arg3[n7] | ~arg3[n]);
            byArray4[n7] = by;
            n3 = ++n;
        }
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        byArrayArray[2] = byArray3;
        byArrayArray[3] = byArray4;
        return byArrayArray;
    }

    private /* synthetic */ String cfr_renamed_2242(sprmee arg0) {
        return sprcae.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314();
    }

    public sprkmb() {
        sprkmb sprkmb2 = this;
        this.cfr_renamed_1 = new HashSet();
        sprkmb2.cfr_renamed_2 = new HashSet();
        this.cfr_renamed_119 = new HashSet();
        this.cfr_renamed_112 = new HashSet();
        this.cfr_renamed_86 = new HashSet();
    }

    private /* synthetic */ void cfr_renamed_2247(Set arg0, String arg1) throws sprzrb {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2226(arg1, string) && !arg1.equalsIgnoreCase(string)) continue;
            throw new sprzrb(sprrsq.cfr_renamed_9("P\u0019Gw}$41f8ywu942l4x\"p2pwg\"v#f2qy"));
        }
    }

    private /* synthetic */ Set cfr_renamed_2232(Set arg0, Set arg1) {
        HashSet<sprbne> hashSet = new HashSet<sprbne>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            sprbne sprbne2 = sprbne.cfr_renamed_23(((sprbfe)iterator.next()).cfr_renamed_2229().cfr_renamed_313().cfr_renamed_119());
            if (arg0 == null) {
                if (sprbne2 == null) continue;
                hashSet.add(sprbne2);
                continue;
            }
            for (sprbne sprbne3 : arg0) {
                if (sprkmb.cfr_renamed_2235(sprbne2, sprbne3)) {
                    hashSet.add(sprbne2);
                    continue;
                }
                if (!sprkmb.cfr_renamed_2235(sprbne3, sprbne2)) continue;
                hashSet.add(sprbne3);
            }
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2240(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                arg2.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                Set set = arg2;
                if (this.cfr_renamed_2226(string2, arg1)) {
                    set.add(arg1);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (string2.equalsIgnoreCase(arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                Set set = arg2;
                if (this.cfr_renamed_2226(string, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg1);
                    return;
                }
                Set set = arg2;
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (this.cfr_renamed_2226(arg1, arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.indexOf(64) != -1) {
            String string = arg1.substring(arg0.indexOf(64) + 1);
            Set set = arg2;
            if (string.equalsIgnoreCase(arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.startsWith(".")) {
            Set set = arg2;
            if (this.cfr_renamed_2226(arg0, arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        Set set = arg2;
        if (arg0.equalsIgnoreCase(arg1)) {
            set.add(arg0);
            return;
        }
        set.add(arg0);
        arg2.add(arg1);
    }

    public void cfr_renamed_2248(sprbfe arg0) {
        sprbfe[] sprbfeArray = new sprbfe[1];
        sprbfeArray[0] = arg0;
        this.cfr_renamed_349(sprbfeArray);
    }

    private /* synthetic */ boolean cfr_renamed_2249(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = arg0.length;
        if (n2 != arg1.length / 2) {
            return false;
        }
        byte[] byArray = new byte[n2];
        int n3 = n2;
        System.arraycopy(arg1, n3, byArray, 0, n2);
        byte[] byArray2 = new byte[n3];
        byte[] byArray3 = new byte[n2];
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n;
            byArray2[n5] = (byte)(arg1[n] & byArray[n5]);
            int n6 = n;
            byte by = (byte)(arg0[n] & byArray[n6]);
            byArray3[n6] = by;
            n4 = ++n;
        }
        return sprzra.cfr_renamed_92(byArray2, byArray3);
    }

    private static /* synthetic */ byte[] cfr_renamed_2250(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if ((arg0[n] & 0xFFFF) < (arg1[n] & 0xFFFF)) {
                return arg0;
            }
            n2 = ++n;
        }
        return arg1;
    }

    private /* synthetic */ boolean cfr_renamed_2226(String arg0, String arg1) {
        int n;
        String string = arg1;
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        String[] stringArray = sprywa.cfr_renamed_434(string, '.');
        String[] stringArray2 = sprywa.cfr_renamed_434(arg0, '.');
        if (stringArray2.length <= stringArray.length) {
            return false;
        }
        int n2 = stringArray2.length - stringArray.length;
        int n3 = n = -1;
        while (n3 < stringArray.length) {
            if (n == -1 ? stringArray2[n + n2].equals("") : !stringArray[n].equalsIgnoreCase(stringArray2[n + n2])) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    private /* synthetic */ Set cfr_renamed_2251(byte[] arg0, byte[] arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        if (sprzra.cfr_renamed_92(arg0, arg1)) {
            HashSet<byte[]> hashSet2 = hashSet;
            hashSet2.add(arg0);
            return hashSet2;
        }
        HashSet<byte[]> hashSet3 = hashSet;
        hashSet3.add(arg0);
        hashSet.add(arg1);
        return hashSet3;
    }

    private /* synthetic */ Set cfr_renamed_2252(Set arg0, byte[] arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            byte[] byArray = (byte[])iterator.next();
            iterator2 = iterator;
            hashSet.addAll(this.cfr_renamed_2251(byArray, arg1));
        }
        return hashSet;
    }

    private /* synthetic */ boolean cfr_renamed_2253(Object arg0, Object arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0 instanceof byte[] && arg1 instanceof byte[]) {
            return sprzra.cfr_renamed_92((byte[])arg0, (byte[])arg1);
        }
        return arg0.equals(arg1);
    }

    private static /* synthetic */ int cfr_renamed_2254(byte[] arg0, byte[] arg1) {
        if (sprzra.cfr_renamed_92(arg0, arg1)) {
            return 0;
        }
        if (sprzra.cfr_renamed_92(sprkmb.cfr_renamed_2227(arg0, arg1), arg0)) {
            return 1;
        }
        return -1;
    }

    private /* synthetic */ Set cfr_renamed_2255(Set arg0, String arg1) {
        Iterator iterator;
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            this.cfr_renamed_2256(string, arg1, hashSet);
        }
        return hashSet;
    }

    public void cfr_renamed_347(sprmee arg0) throws sprzrb {
        switch (arg0.cfr_renamed_312()) {
            case 1: {
                sprkmb sprkmb2 = this;
                while (false) {
                }
                sprkmb2.cfr_renamed_2257(sprkmb2.cfr_renamed_119, this.cfr_renamed_2242(arg0));
                return;
            }
            case 2: {
                sprkmb sprkmb3 = this;
                sprkmb3.cfr_renamed_2247(sprkmb3.cfr_renamed_2, sprcae.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 4: {
                this.cfr_renamed_345(sprbne.cfr_renamed_23(arg0.cfr_renamed_313().cfr_renamed_119()));
                return;
            }
            case 6: {
                sprkmb sprkmb4 = this;
                sprkmb4.cfr_renamed_2258(sprkmb4.cfr_renamed_112, sprcae.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 7: {
                byte[] byArray = sprxue.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186();
                sprkmb sprkmb5 = this;
                sprkmb5.cfr_renamed_2259(sprkmb5.cfr_renamed_86, byArray);
            }
        }
    }

    private static /* synthetic */ String cfr_renamed_2245(String arg0) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(58) + 1);
        if (string2.indexOf(sprhcb.cfr_renamed_9("<x")) != -1) {
            String string3 = string2;
            string2 = string3.substring(string3.indexOf(sprrsq.cfr_renamed_9(";x")) + 2);
        }
        if (string2.lastIndexOf(58) != -1) {
            String string4 = string2;
            string2 = string4.substring(0, string4.lastIndexOf(58));
        }
        String string5 = string2;
        string2 = string5.substring(string5.indexOf(58) + 1);
        if ((string2 = string2.substring(string2.indexOf(64) + 1)).indexOf(47) != -1) {
            String string6 = string2;
            string2 = string6.substring(0, string6.indexOf(47));
        }
        return string2;
    }

    private /* synthetic */ void cfr_renamed_2259(Set arg0, byte[] arg1) throws sprzrb {
        if (arg0.isEmpty()) {
            return;
        }
        for (byte[] byArray : arg0) {
            if (!this.cfr_renamed_2249(arg1, byArray)) continue;
            throw new sprzrb(sprhcb.cfr_renamed_9("\u001eCwz$31a8~wr932k4\u007f\"w2ww`\"q#a2vy"));
        }
    }

    private /* synthetic */ int cfr_renamed_2228(Collection arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = 0;
        for (Object e : arg0) {
            if (e instanceof byte[]) {
                n += sprzra.cfr_renamed_95((byte[])e);
                continue;
            }
            n += e.hashCode();
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_2241(Set arg0, sprbne arg1) throws sprzrb {
        if (arg0.isEmpty()) {
            return;
        }
        for (sprbne sprbne2 : arg0) {
            if (!sprkmb.cfr_renamed_2235(arg1, sprbne2)) continue;
            throw new sprzrb(sprrsq.cfr_renamed_9("G\"v=q4`wp>g#}9s\"}$|2pwz6y24>gwr%{:46zwq/w;a3q34$a5`%q2"));
        }
    }

    private /* synthetic */ byte[] cfr_renamed_2260(byte[] arg0, byte[] arg1) {
        int n = arg0.length;
        byte[] byArray = new byte[n * 2];
        System.arraycopy(arg0, 0, byArray, 0, n);
        int n2 = n;
        System.arraycopy(arg1, 0, byArray, n2, n2);
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_2261(Set arg0, String arg1) throws sprzrb {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2226(arg1, string) && !arg1.equalsIgnoreCase(string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprzrb(sprhcb.cfr_renamed_9("W\u0019@wz$39|#31a8~wrwc2a:z#g2ww`\"q#a2vy"));
    }

    public void cfr_renamed_344(sprbne arg0) throws sprzrb {
        sprkmb sprkmb2 = this;
        sprkmb2.cfr_renamed_2262(sprkmb2.cfr_renamed_4, arg0);
    }

    private /* synthetic */ void cfr_renamed_2263(Set arg0, byte[] arg1) throws sprzrb {
        if (arg0 == null) {
            return;
        }
        for (byte[] byArray : arg0) {
            if (!this.cfr_renamed_2249(arg1, byArray)) continue;
            return;
        }
        if (arg1.length == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprzrb(sprrsq.cfr_renamed_9("\u001eDw}$49{#41f8ywuwd2f:}#`2pwg\"v#f2qy"));
    }

    private /* synthetic */ Set cfr_renamed_2264(Set arg0, sprbne arg1) {
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet<sprbne> hashSet = new HashSet<sprbne>();
        for (sprbne sprbne2 : arg0) {
            if (sprkmb.cfr_renamed_2235(arg1, sprbne2)) {
                hashSet.add(sprbne2);
                continue;
            }
            HashSet<sprbne> hashSet2 = hashSet;
            if (sprkmb.cfr_renamed_2235(sprbne2, arg1)) {
                hashSet2.add(arg1);
                continue;
            }
            hashSet2.add(sprbne2);
            hashSet.add(arg1);
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2257(Set arg0, String arg1) throws sprzrb {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2265(arg1, string)) continue;
            throw new sprzrb(sprhcb.cfr_renamed_9("V:r>\u007fwr3w%v$`wz$31a8~wr932k4\u007f\"w2ww`\"q#a2vy"));
        }
    }

    private /* synthetic */ Set cfr_renamed_2230(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_2242(((sprbfe)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                String string2 = (String)iterator3.next();
                iterator2 = iterator3;
                this.cfr_renamed_2243(string, string2, hashSet);
            }
        }
        return hashSet;
    }

    private /* synthetic */ boolean cfr_renamed_2265(String arg0, String arg1) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(64) + 1);
        return arg1.indexOf(64) != -1 ? arg0.equalsIgnoreCase(arg1) : (arg1.charAt(0) != '.' ? string2.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string2, arg1));
    }

    public String toString() {
        String string = "";
        string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("'q%y>`#q3.]")).toString();
        if (this.cfr_renamed_4 != null) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("W\u0019)]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_4.toString()).append("\n").toString();
        }
        if (this.cfr_renamed_91 != null) {
            string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("\u0013Z\u0004.]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_91.toString()).append("\n").toString();
        }
        if (this.cfr_renamed_3 != null) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("\u0012~6z;)]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_3.toString()).append("\n").toString();
        }
        if (this.cfr_renamed_0 != null) {
            string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("\u0002F\u001e.]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_0.toString()).append("\n").toString();
        }
        if (this.cfr_renamed_152 != null) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("Z\u0007)]")).toString();
            sprkmb sprkmb2 = this;
            string = new StringBuilder().insert(0, string).append(sprkmb2.cfr_renamed_2266(sprkmb2.cfr_renamed_152)).append("\n").toString();
        }
        string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("q/w;a3q3.]")).toString();
        if (!this.cfr_renamed_1.isEmpty()) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("W\u0019)]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_1.toString()).append("\n").toString();
        }
        if (!this.cfr_renamed_2.isEmpty()) {
            string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("\u0013Z\u0004.]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_2.toString()).append("\n").toString();
        }
        if (!this.cfr_renamed_119.isEmpty()) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("\u0012~6z;)]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_119.toString()).append("\n").toString();
        }
        if (!this.cfr_renamed_112.isEmpty()) {
            string = new StringBuilder().insert(0, string).append(sprrsq.cfr_renamed_9("\u0002F\u001e.]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_112.toString()).append("\n").toString();
        }
        if (!this.cfr_renamed_86.isEmpty()) {
            string = new StringBuilder().insert(0, string).append(sprhcb.cfr_renamed_9("Z\u0007)]")).toString();
            sprkmb sprkmb3 = this;
            string = new StringBuilder().insert(0, string).append(sprkmb3.cfr_renamed_2266(sprkmb3.cfr_renamed_86)).append("\n").toString();
        }
        return string;
    }

    private /* synthetic */ Set cfr_renamed_2237(byte[] arg0, byte[] arg1) {
        if (arg0.length != arg1.length) {
            return Collections.EMPTY_SET;
        }
        sprkmb sprkmb2 = this;
        byte[][] byArray = sprkmb2.cfr_renamed_2224(arg0, arg1);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        byte[] byArray4 = byArray[2];
        byte[] byArray5 = byArray[3];
        byte[][] byArray6 = sprkmb2.cfr_renamed_2246(byArray2, byArray3, byArray4, byArray5);
        byte[] byArray7 = sprkmb.cfr_renamed_2250(byArray6[1], byArray6[3]);
        if (sprkmb.cfr_renamed_2254(sprkmb.cfr_renamed_2227(byArray6[0], byArray6[2]), byArray7) == 1) {
            return Collections.EMPTY_SET;
        }
        byte[] byArray8 = sprkmb.cfr_renamed_2267(byArray6[0], byArray6[2]);
        byte[] byArray9 = sprkmb.cfr_renamed_2267(byArray3, byArray5);
        return Collections.singleton(this.cfr_renamed_2260(byArray8, byArray9));
    }

    private /* synthetic */ void cfr_renamed_2262(Set arg0, sprbne arg1) throws sprzrb {
        if (arg0 == null) {
            return;
        }
        if (arg0.isEmpty() && arg1.cfr_renamed_84() == 0) {
            return;
        }
        for (sprbne sprbne2 : arg0) {
            if (!sprkmb.cfr_renamed_2235(arg1, sprbne2)) continue;
            return;
        }
        throw new sprzrb(sprrsq.cfr_renamed_9("G\"v=q4`wp>g#}9s\"}$|2pwz6y24>gwz8`wr%{:464'q%y>`#q34$a5`%q2"));
    }

    public Set cfr_renamed_2268(Set arg0, String arg1) {
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : arg0) {
            if (this.cfr_renamed_2226(string, arg1)) {
                hashSet.add(arg1);
                continue;
            }
            HashSet<String> hashSet2 = hashSet;
            if (this.cfr_renamed_2226(arg1, string)) {
                hashSet2.add(string);
                continue;
            }
            hashSet2.add(string);
            hashSet.add(arg1);
        }
        return hashSet;
    }

    private /* synthetic */ boolean cfr_renamed_2269(Collection arg0, Collection arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.size() != arg1.size()) {
            return false;
        }
        for (Object e : arg0) {
            boolean bl;
            block5: {
                Iterator iterator = arg1.iterator();
                boolean bl2 = false;
                while (iterator.hasNext()) {
                    Object e2 = iterator.next();
                    if (!this.cfr_renamed_2253(e, e2)) continue;
                    bl = bl2 = true;
                    break block5;
                }
                bl = bl2;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    private /* synthetic */ Set cfr_renamed_2233(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_2242(((sprbfe)iterator.next()).cfr_renamed_2229());
            if (arg0 == null) {
                if (string == null) continue;
                hashSet.add(string);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                String string2 = (String)iterator3.next();
                iterator2 = iterator3;
                this.cfr_renamed_2225(string2, string, hashSet);
            }
        }
        return hashSet;
    }

    private /* synthetic */ void cfr_renamed_2270(Set arg0, String arg1) throws sprzrb {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2265(arg1, string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprzrb(sprhcb.cfr_renamed_9("@\"q=v4gwv:r>\u007fwr3w%v$`wz$39|#31a8~wrwc2a:z#g2ww`\"q#a2vy"));
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprkmb)) {
            return false;
        }
        sprkmb sprkmb2 = (sprkmb)arg0;
        sprkmb sprkmb3 = this;
        if (sprkmb3.cfr_renamed_2269(sprkmb2.cfr_renamed_1, sprkmb3.cfr_renamed_1)) {
            sprkmb sprkmb4 = this;
            if (sprkmb4.cfr_renamed_2269(sprkmb2.cfr_renamed_2, sprkmb4.cfr_renamed_2)) {
                sprkmb sprkmb5 = this;
                if (sprkmb5.cfr_renamed_2269(sprkmb2.cfr_renamed_119, sprkmb5.cfr_renamed_119)) {
                    sprkmb sprkmb6 = this;
                    if (sprkmb6.cfr_renamed_2269(sprkmb2.cfr_renamed_86, sprkmb6.cfr_renamed_86)) {
                        sprkmb sprkmb7 = this;
                        if (sprkmb7.cfr_renamed_2269(sprkmb2.cfr_renamed_112, sprkmb7.cfr_renamed_112)) {
                            sprkmb sprkmb8 = this;
                            if (sprkmb8.cfr_renamed_2269(sprkmb2.cfr_renamed_4, sprkmb8.cfr_renamed_4)) {
                                sprkmb sprkmb9 = this;
                                if (sprkmb9.cfr_renamed_2269(sprkmb2.cfr_renamed_91, sprkmb9.cfr_renamed_91)) {
                                    sprkmb sprkmb10 = this;
                                    if (sprkmb10.cfr_renamed_2269(sprkmb2.cfr_renamed_3, sprkmb10.cfr_renamed_3)) {
                                        sprkmb sprkmb11 = this;
                                        if (sprkmb11.cfr_renamed_2269(sprkmb2.cfr_renamed_152, sprkmb11.cfr_renamed_152)) {
                                            sprkmb sprkmb12 = this;
                                            if (sprkmb12.cfr_renamed_2269(sprkmb2.cfr_renamed_0, sprkmb12.cfr_renamed_0)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2271(Set arg0, String arg1) throws sprzrb {
        if (arg0 == null) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2244(arg1, string)) continue;
            return;
        }
        if (arg1.length() == 0 && arg0.size() == 0) {
            return;
        }
        throw new sprzrb(sprrsq.cfr_renamed_9("A\u0005]w}$49{#41f8ywuwd2f:}#`2pwg\"v#f2qy"));
    }

    private /* synthetic */ void cfr_renamed_2256(String arg0, String arg1, Set arg2) {
        if (arg0.indexOf(64) != -1) {
            String string = arg0;
            String string2 = string.substring(string.indexOf(64) + 1);
            if (arg1.indexOf(64) != -1) {
                if (arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg0);
                    return;
                }
                arg2.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                Set set = arg2;
                if (this.cfr_renamed_2226(string2, arg1)) {
                    set.add(arg1);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (string2.equalsIgnoreCase(arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg0.startsWith(".")) {
            if (arg1.indexOf(64) != -1) {
                String string = arg1.substring(arg0.indexOf(64) + 1);
                Set set = arg2;
                if (this.cfr_renamed_2226(string, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            if (arg1.startsWith(".")) {
                if (this.cfr_renamed_2226(arg0, arg1) || arg0.equalsIgnoreCase(arg1)) {
                    arg2.add(arg1);
                    return;
                }
                Set set = arg2;
                if (this.cfr_renamed_2226(arg1, arg0)) {
                    set.add(arg0);
                    return;
                }
                set.add(arg0);
                arg2.add(arg1);
                return;
            }
            Set set = arg2;
            if (this.cfr_renamed_2226(arg1, arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.indexOf(64) != -1) {
            String string = arg1.substring(arg0.indexOf(64) + 1);
            Set set = arg2;
            if (string.equalsIgnoreCase(arg0)) {
                set.add(arg0);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        if (arg1.startsWith(".")) {
            Set set = arg2;
            if (this.cfr_renamed_2226(arg0, arg1)) {
                set.add(arg1);
                return;
            }
            set.add(arg0);
            arg2.add(arg1);
            return;
        }
        Set set = arg2;
        if (arg0.equalsIgnoreCase(arg1)) {
            set.add(arg0);
            return;
        }
        set.add(arg0);
        arg2.add(arg1);
    }

    public void cfr_renamed_351(sprbfe arg0) {
        sprmee sprmee2 = arg0.cfr_renamed_2229();
        switch (sprmee2.cfr_renamed_312()) {
            case 1: {
                while (false) {
                }
                sprkmb sprkmb2 = this;
                this.cfr_renamed_119 = sprkmb2.cfr_renamed_2239(this.cfr_renamed_119, sprkmb2.cfr_renamed_2242(sprmee2));
                return;
            }
            case 2: {
                sprkmb sprkmb3 = this;
                this.cfr_renamed_2 = sprkmb3.cfr_renamed_2268(this.cfr_renamed_2, sprkmb3.cfr_renamed_2242(sprmee2));
                return;
            }
            case 4: {
                sprkmb sprkmb4 = this;
                sprkmb4.cfr_renamed_1 = sprkmb4.cfr_renamed_2264(sprkmb4.cfr_renamed_1, (sprbne)sprmee2.cfr_renamed_313().cfr_renamed_119());
                return;
            }
            case 6: {
                sprkmb sprkmb5 = this;
                this.cfr_renamed_112 = sprkmb5.cfr_renamed_2255(this.cfr_renamed_112, sprkmb5.cfr_renamed_2242(sprmee2));
                return;
            }
            case 7: {
                sprkmb sprkmb6 = this;
                sprkmb6.cfr_renamed_86 = sprkmb6.cfr_renamed_2252(sprkmb6.cfr_renamed_86, sprxue.cfr_renamed_23(sprmee2.cfr_renamed_313()).cfr_renamed_186());
            }
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_2267(byte[] arg0, byte[] arg1) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n] | arg1[n3]);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ String cfr_renamed_2266(Set arg0) {
        Iterator iterator;
        String string = "";
        string = new StringBuilder().insert(0, string).append("[").toString();
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_2236((byte[])iterator.next())).append(",").toString();
            iterator2 = iterator;
        }
        if (string.length() > 1) {
            String string2 = string;
            string = string2.substring(0, string2.length() - 1);
        }
        string = new StringBuilder().insert(0, string).append("]").toString();
        return string;
    }

    public void cfr_renamed_346(sprmee arg0) throws sprzrb {
        switch (arg0.cfr_renamed_312()) {
            case 1: {
                sprkmb sprkmb2 = this;
                while (false) {
                }
                sprkmb2.cfr_renamed_2270(sprkmb2.cfr_renamed_3, this.cfr_renamed_2242(arg0));
                return;
            }
            case 2: {
                sprkmb sprkmb3 = this;
                sprkmb3.cfr_renamed_2261(sprkmb3.cfr_renamed_91, sprcae.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 4: {
                this.cfr_renamed_344(sprbne.cfr_renamed_23(arg0.cfr_renamed_313().cfr_renamed_119()));
                return;
            }
            case 6: {
                sprkmb sprkmb4 = this;
                sprkmb4.cfr_renamed_2271(sprkmb4.cfr_renamed_0, sprcae.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314());
                return;
            }
            case 7: {
                byte[] byArray = sprxue.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186();
                sprkmb sprkmb5 = this;
                sprkmb5.cfr_renamed_2263(sprkmb5.cfr_renamed_152, byArray);
            }
        }
    }

    private /* synthetic */ void cfr_renamed_2258(Set arg0, String arg1) throws sprzrb {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2244(arg1, string)) continue;
            throw new sprzrb(sprhcb.cfr_renamed_9("F\u0005Zwz$31a8~wr932k4\u007f\"w2ww`\"q#a2vy"));
        }
    }
}

