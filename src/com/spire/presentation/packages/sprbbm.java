/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgim;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlcm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrwja;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprsjfa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxd;
import com.spire.presentation.packages.sprxjm;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sprbbm
implements sprxd {
    private Set cfr_renamed_102;
    private Set cfr_renamed_93;
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

    private /* synthetic */ boolean cfr_renamed_2265(String arg0, String arg1) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(64) + 1);
        if (arg1.indexOf(64) != -1) {
            if (arg0.equalsIgnoreCase(arg1)) {
                return true;
            }
            if (string2.equalsIgnoreCase(arg1.substring(1))) {
                return true;
            }
        } else if (arg1.charAt(0) != '.' ? string2.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string2, arg1)) {
            return true;
        }
        return false;
    }

    private /* synthetic */ Set cfr_renamed_7355(Set arg0, sprgim arg1) {
        HashSet<sprgim> hashSet;
        HashSet<sprgim> hashSet2 = hashSet = arg0 != null ? new HashSet<sprgim>(arg0) : new HashSet();
        hashSet2.add(arg1);
        return hashSet2;
    }

    private /* synthetic */ Set cfr_renamed_2234(Set arg0, Set arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            byte[] byArray = sproug.cfr_renamed_23(((sprsem)iterator.next()).cfr_renamed_2229().cfr_renamed_313()).cfr_renamed_186();
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

    private /* synthetic */ String cfr_renamed_7344(sprigm arg0) {
        return sprupm.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_314();
    }

    private /* synthetic */ void cfr_renamed_11139(sprgim arg0, sprgim arg1, Set arg2) {
        if (arg0.equals(arg1)) {
            arg2.add(arg0);
        }
    }

    private /* synthetic */ int cfr_renamed_2228(Collection arg0) {
        if (arg0 == null) {
            return 0;
        }
        int n = 0;
        for (Object e : arg0) {
            if (e instanceof byte[]) {
                n += sproze.cfr_renamed_95((byte[])e);
                continue;
            }
            n += e.hashCode();
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_7352(Set arg0, sprszm arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        if (arg0.isEmpty() && arg1.cfr_renamed_84() == 0) {
            return;
        }
        for (sprszm sprszm2 : arg0) {
            if (!sprbbm.cfr_renamed_7345(arg1, sprszm2)) continue;
            return;
        }
        throw new sprlcm(sprsjfa.cfr_renamed_9("\u001f1..)'8d(-?0%*+1%7$!(d\"%!!l-?d\"+8d*6#)l%l4)6!-80) l79&86)!"));
    }

    private /* synthetic */ boolean cfr_renamed_2253(Object arg0, Object arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0 instanceof byte[] && arg1 instanceof byte[]) {
            return sproze.cfr_renamed_92((byte[])arg0, (byte[])arg1);
        }
        return arg0.equals(arg1);
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

    private /* synthetic */ void cfr_renamed_7342(Set arg0, sprgim arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            sprgim sprgim2 = sprgim.cfr_renamed_23(iterator.next());
            if (!this.cfr_renamed_7343(arg1, sprgim2)) continue;
            throw new sprlcm(sprrwja.cfr_renamed_9("$i\u0003x\u0019S\np\u000e=\u0002nK{\u0019r\u0006=\nsKx\u0013~\u0007h\u000fx\u000f=\u0018h\ti\u0019x\u000e3"));
        }
    }

    public sprbbm() {
        sprbbm sprbbm2 = this;
        this.cfr_renamed_3 = new HashSet();
        sprbbm2.cfr_renamed_2 = new HashSet();
        this.cfr_renamed_152 = new HashSet();
        this.cfr_renamed_4 = new HashSet();
        this.cfr_renamed_102 = new HashSet();
        this.cfr_renamed_91 = new HashSet();
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

    private /* synthetic */ void cfr_renamed_2263(Set arg0, byte[] arg1) throws sprlcm {
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
        throw new sprlcm(sprsjfa.cfr_renamed_9("\r\u001cd%7l*#0l\">+!d-d<!>)%08!(d?1.0>!)j"));
    }

    private static /* synthetic */ String cfr_renamed_2245(String arg0) {
        String string = arg0;
        String string2 = string.substring(string.indexOf(58) + 1);
        if (string2.indexOf(sprrwja.cfr_renamed_9("D2")) != -1) {
            String string3 = string2;
            string2 = string3.substring(string3.indexOf(sprsjfa.cfr_renamed_9("ck")) + 2);
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

    private /* synthetic */ void cfr_renamed_2257(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2265(arg1, string)) continue;
            throw new sprlcm(sprrwja.cfr_renamed_9(".p\nt\u0007=\ny\u000fo\u000en\u0018=\u0002nK{\u0019r\u0006=\nsKx\u0013~\u0007h\u000fx\u000f=\u0018h\ti\u0019x\u000e3"));
        }
    }

    private /* synthetic */ Set cfr_renamed_7354(Set arg0, Set arg1) {
        HashSet<sprgim> hashSet = new HashSet<sprgim>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            sprgim sprgim2 = sprgim.cfr_renamed_23(((sprsem)iterator.next()).cfr_renamed_2229().cfr_renamed_313());
            if (arg0 == null) {
                if (sprgim2 == null) continue;
                hashSet.add(sprgim2);
                continue;
            }
            Iterator iterator2 = arg0.iterator();
            while (iterator2.hasNext()) {
                Iterator iterator3;
                Iterator iterator4 = iterator3;
                iterator2 = iterator4;
                sprgim sprgim3 = sprgim.cfr_renamed_23(iterator4.next());
                this.cfr_renamed_11139(sprgim2, sprgim3, hashSet);
            }
        }
        return hashSet;
    }

    @Override
    public void cfr_renamed_5068(sprigm arg0) throws sprlcm {
        switch (arg0.cfr_renamed_312()) {
            case 0: {
                sprbbm sprbbm2 = this;
                while (false) {
                }
                sprbbm2.cfr_renamed_7349(sprbbm2.cfr_renamed_112, sprgim.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprbbm sprbbm3 = this;
                sprbbm3.cfr_renamed_2270(sprbbm3.cfr_renamed_119, this.cfr_renamed_7344(arg0));
                return;
            }
            case 2: {
                sprbbm sprbbm4 = this;
                sprbbm4.cfr_renamed_2261(sprbbm4.cfr_renamed_0, this.cfr_renamed_7344(arg0));
                return;
            }
            case 4: {
                this.cfr_renamed_7266(sprnbm.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 6: {
                sprbbm sprbbm5 = this;
                sprbbm5.cfr_renamed_2271(sprbbm5.cfr_renamed_93, this.cfr_renamed_7344(arg0));
                return;
            }
            case 7: {
                sprbbm sprbbm6 = this;
                sprbbm6.cfr_renamed_2263(sprbbm6.cfr_renamed_86, sproug.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186());
                return;
            }
        }
    }

    private static /* synthetic */ int cfr_renamed_2254(byte[] arg0, byte[] arg1) {
        if (sproze.cfr_renamed_92(arg0, arg1)) {
            return 0;
        }
        if (sproze.cfr_renamed_92(sprbbm.cfr_renamed_2227(arg0, arg1), arg0)) {
            return 1;
        }
        return -1;
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

    private /* synthetic */ Set cfr_renamed_2230(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
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

    @Override
    public void cfr_renamed_5070(sprsem[] arg0) {
        int n;
        HashMap hashMap = new HashMap();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprsem object = arg0[n];
            Integer n3 = spruaf.cfr_renamed_279(object.cfr_renamed_2229().cfr_renamed_312());
            if (hashMap.get(n3) == null) {
                hashMap.put(n3, new HashSet());
            }
            ((Set)hashMap.get(n3)).add(object);
            n2 = ++n;
        }
        block9: for (Map.Entry entry : hashMap.entrySet()) {
            int n4 = (Integer)entry.getKey();
            switch (n4) {
                case 0: {
                    sprbbm sprbbm2 = this;
                    while (false) {
                    }
                    sprbbm2.cfr_renamed_112 = sprbbm2.cfr_renamed_7354(sprbbm2.cfr_renamed_112, (Set)entry.getValue());
                    continue block9;
                }
                case 1: {
                    sprbbm sprbbm3 = this;
                    sprbbm3.cfr_renamed_119 = sprbbm3.cfr_renamed_2230(sprbbm3.cfr_renamed_119, (Set)entry.getValue());
                    continue block9;
                }
                case 2: {
                    sprbbm sprbbm4 = this;
                    sprbbm4.cfr_renamed_0 = sprbbm4.cfr_renamed_2231(sprbbm4.cfr_renamed_0, (Set)entry.getValue());
                    continue block9;
                }
                case 4: {
                    sprbbm sprbbm5 = this;
                    sprbbm5.cfr_renamed_1 = sprbbm5.cfr_renamed_2232(sprbbm5.cfr_renamed_1, (Set)entry.getValue());
                    continue block9;
                }
                case 6: {
                    sprbbm sprbbm6 = this;
                    sprbbm6.cfr_renamed_93 = sprbbm6.cfr_renamed_2233(sprbbm6.cfr_renamed_93, (Set)entry.getValue());
                    continue block9;
                }
                case 7: {
                    sprbbm sprbbm7 = this;
                    sprbbm7.cfr_renamed_86 = sprbbm7.cfr_renamed_2234(sprbbm7.cfr_renamed_86, (Set)entry.getValue());
                    continue block9;
                }
            }
            throw new IllegalStateException(new StringBuilder().insert(0, sprsjfa.cfr_renamed_9("\u0011\"/\"+;*l0-#l!\"'#1\"0)6) vd")).append(n4).toString());
        }
    }

    private /* synthetic */ String cfr_renamed_2266(Set arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = arg0.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.cfr_renamed_2236((byte[])iterator.next()));
            iterator2 = iterator;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }

    private /* synthetic */ void cfr_renamed_7349(Set arg0, sprgim arg1) throws sprlcm {
        if (arg0 == null) {
            return;
        }
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            sprgim sprgim2 = sprgim.cfr_renamed_23(iterator.next());
            if (!this.cfr_renamed_7343(arg1, sprgim2)) continue;
            return;
        }
        throw new sprlcm(sprrwja.cfr_renamed_9("8h\tw\u000e~\u001f=$i\u0003x\u0019S\np\u000e=\u0002nKs\u0004iK{\u0019r\u0006=\n=\u001bx\u0019p\u0002i\u001fx\u000f=\u0018h\ti\u0019x\u000e3"));
    }

    private /* synthetic */ Set cfr_renamed_2251(byte[] arg0, byte[] arg1) {
        HashSet<byte[]> hashSet = new HashSet<byte[]>();
        if (sproze.cfr_renamed_92(arg0, arg1)) {
            HashSet<byte[]> hashSet2 = hashSet;
            hashSet2.add(arg0);
            return hashSet2;
        }
        HashSet<byte[]> hashSet3 = hashSet;
        hashSet3.add(arg0);
        hashSet.add(arg1);
        return hashSet3;
    }

    @Override
    public void cfr_renamed_5069(sprigm arg0) throws sprlcm {
        switch (arg0.cfr_renamed_312()) {
            case 0: {
                sprbbm sprbbm2 = this;
                while (false) {
                }
                sprbbm2.cfr_renamed_7342(sprbbm2.cfr_renamed_91, sprgim.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprbbm sprbbm3 = this;
                sprbbm3.cfr_renamed_2257(sprbbm3.cfr_renamed_152, this.cfr_renamed_7344(arg0));
                return;
            }
            case 2: {
                sprbbm sprbbm4 = this;
                sprbbm4.cfr_renamed_2247(sprbbm4.cfr_renamed_2, this.cfr_renamed_7344(arg0));
                return;
            }
            case 4: {
                this.cfr_renamed_7265(sprnbm.cfr_renamed_23(arg0.cfr_renamed_313()));
                return;
            }
            case 6: {
                sprbbm sprbbm5 = this;
                sprbbm5.cfr_renamed_2258(sprbbm5.cfr_renamed_4, this.cfr_renamed_7344(arg0));
                return;
            }
            case 7: {
                sprbbm sprbbm6 = this;
                sprbbm6.cfr_renamed_2259(sprbbm6.cfr_renamed_102, sproug.cfr_renamed_23(arg0.cfr_renamed_313()).cfr_renamed_186());
                return;
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

    private /* synthetic */ Set cfr_renamed_2237(byte[] arg0, byte[] arg1) {
        if (arg0.length != arg1.length) {
            return Collections.EMPTY_SET;
        }
        sprbbm sprbbm2 = this;
        byte[][] byArray = sprbbm2.cfr_renamed_2224(arg0, arg1);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        byte[] byArray4 = byArray[2];
        byte[] byArray5 = byArray[3];
        byte[][] byArray6 = sprbbm2.cfr_renamed_2246(byArray2, byArray3, byArray4, byArray5);
        byte[] byArray7 = sprbbm.cfr_renamed_2250(byArray6[1], byArray6[3]);
        if (sprbbm.cfr_renamed_2254(sprbbm.cfr_renamed_2227(byArray6[0], byArray6[2]), byArray7) == 1) {
            return Collections.EMPTY_SET;
        }
        byte[] byArray8 = sprbbm.cfr_renamed_2267(byArray6[0], byArray6[2]);
        byte[] byArray9 = sprbbm.cfr_renamed_2267(byArray3, byArray5);
        return Collections.singleton(this.cfr_renamed_2260(byArray8, byArray9));
    }

    public void cfr_renamed_7266(sprnbm arg0) throws sprlcm {
        sprbbm sprbbm2 = this;
        sprbbm2.cfr_renamed_7352(sprbbm2.cfr_renamed_1, sprszm.cfr_renamed_23(arg0.cfr_renamed_119()));
    }

    private /* synthetic */ Set cfr_renamed_2232(Set arg0, Set arg1) {
        HashSet<sprszm> hashSet = new HashSet<sprszm>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(((sprsem)iterator.next()).cfr_renamed_2229().cfr_renamed_313().cfr_renamed_119());
            if (arg0 == null) {
                if (sprszm2 == null) continue;
                hashSet.add(sprszm2);
                continue;
            }
            for (sprszm sprszm3 : arg0) {
                if (sprbbm.cfr_renamed_7345(sprszm2, sprszm3)) {
                    hashSet.add(sprszm2);
                    continue;
                }
                if (!sprbbm.cfr_renamed_7345(sprszm3, sprszm2)) continue;
                hashSet.add(sprszm3);
            }
        }
        return hashSet;
    }

    @Override
    public void cfr_renamed_5071(sprsem arg0) {
        sprigm sprigm2 = arg0.cfr_renamed_2229();
        switch (sprigm2.cfr_renamed_312()) {
            case 0: {
                sprbbm sprbbm2 = this;
                while (false) {
                }
                sprbbm2.cfr_renamed_91 = sprbbm2.cfr_renamed_7355(sprbbm2.cfr_renamed_91, sprgim.cfr_renamed_23(sprigm2.cfr_renamed_313()));
                return;
            }
            case 1: {
                sprbbm sprbbm3 = this;
                this.cfr_renamed_152 = sprbbm3.cfr_renamed_2239(this.cfr_renamed_152, sprbbm3.cfr_renamed_7344(sprigm2));
                return;
            }
            case 2: {
                sprbbm sprbbm4 = this;
                this.cfr_renamed_2 = sprbbm4.cfr_renamed_2268(this.cfr_renamed_2, sprbbm4.cfr_renamed_7344(sprigm2));
                return;
            }
            case 4: {
                sprbbm sprbbm5 = this;
                sprbbm5.cfr_renamed_3 = sprbbm5.cfr_renamed_7353(sprbbm5.cfr_renamed_3, (sprszm)sprigm2.cfr_renamed_313().cfr_renamed_119());
                return;
            }
            case 6: {
                sprbbm sprbbm6 = this;
                this.cfr_renamed_4 = sprbbm6.cfr_renamed_2255(this.cfr_renamed_4, sprbbm6.cfr_renamed_7344(sprigm2));
                return;
            }
            case 7: {
                sprbbm sprbbm7 = this;
                sprbbm7.cfr_renamed_102 = sprbbm7.cfr_renamed_2252(sprbbm7.cfr_renamed_102, sproug.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186());
                return;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprsjfa.cfr_renamed_9("\u0011\"/\"+;*l0-#l!\"'#1\"0)6) vd")).append(sprigm2.cfr_renamed_312()).toString());
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
        return sproze.cfr_renamed_92(byArray2, byArray3);
    }

    private /* synthetic */ boolean cfr_renamed_2226(String arg0, String arg1) {
        int n;
        String string = arg1;
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        String[] stringArray = sprkoe.cfr_renamed_434(string, '.');
        String[] stringArray2 = sprkoe.cfr_renamed_434(arg0, '.');
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

    private /* synthetic */ void cfr_renamed_2270(Set arg0, String arg1) throws sprlcm {
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
        throw new sprlcm(sprrwja.cfr_renamed_9("8h\tw\u000e~\u001f=\u000ep\nt\u0007=\ny\u000fo\u000en\u0018=\u0002nKs\u0004iK{\u0019r\u0006=\n=\u001bx\u0019p\u0002i\u001fx\u000f=\u0018h\ti\u0019x\u000e3"));
    }

    private /* synthetic */ boolean cfr_renamed_7343(sprgim arg0, sprgim arg1) {
        return arg1.equals(arg0);
    }

    public void cfr_renamed_7265(sprnbm arg0) throws sprlcm {
        sprbbm sprbbm2 = this;
        sprbbm2.cfr_renamed_7351(sprbbm2.cfr_renamed_3, sprszm.cfr_renamed_23(arg0));
    }

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

    private /* synthetic */ boolean cfr_renamed_2244(String arg0, String arg1) {
        String string = sprbbm.cfr_renamed_2245(arg0);
        return !arg1.startsWith(".") ? string.equalsIgnoreCase(arg1) : this.cfr_renamed_2226(string, arg1);
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

    private /* synthetic */ void cfr_renamed_2271(Set arg0, String arg1) throws sprlcm {
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
        throw new sprlcm(sprsjfa.cfr_renamed_9("\u0019\u0016\u0005d%7l*#0l\">+!d-d<!>)%08!(d?1.0>!)j"));
    }

    private /* synthetic */ String cfr_renamed_2236(byte[] arg0) {
        int n;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = n2 = 0;
        while (n3 < arg0.length / 2) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(".");
            }
            byte by = arg0[n2];
            stringBuilder.append(Integer.toString(by & 0xFF));
            n3 = ++n2;
        }
        stringBuilder.append("/");
        n2 = 1;
        int n4 = n = arg0.length / 2;
        while (n4 < arg0.length) {
            StringBuilder stringBuilder2;
            if (n2 != 0) {
                n2 = 0;
                stringBuilder2 = stringBuilder;
            } else {
                StringBuilder stringBuilder3 = stringBuilder;
                stringBuilder2 = stringBuilder3;
                stringBuilder3.append(".");
            }
            byte by = arg0[n];
            stringBuilder2.append(Integer.toString(by & 0xFF));
            n4 = ++n;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_7347(Set arg0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = arg0.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                StringBuilder stringBuilder2 = stringBuilder;
                stringBuilder2.append("]");
                return stringBuilder2.toString();
            }
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            sprgim sprgim2 = sprgim.cfr_renamed_23(iterator.next());
            stringBuilder.append(sprgim2.cfr_renamed_7350().cfr_renamed_19());
            stringBuilder.append(":");
            try {
                stringBuilder.append(sprfqe.cfr_renamed_503(sprgim2.cfr_renamed_97().cfr_renamed_119().cfr_renamed_91()));
            }
            catch (IOException iOException) {
                stringBuilder.append(iOException.toString());
                continue;
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_7351(Set arg0, sprszm arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (sprszm sprszm2 : arg0) {
            if (!sprbbm.cfr_renamed_7345(arg1, sprszm2)) continue;
            throw new sprlcm(sprrwja.cfr_renamed_9("8h\tw\u000e~\u001f=\u000ft\u0018i\u0002s\fh\u0002n\u0003x\u000f=\u0005|\u0006xKt\u0018=\ro\u0004pK|\u0005=\u000ee\bq\u001ey\u000eyKn\u001e\u007f\u001fo\u000ex"));
        }
    }

    private /* synthetic */ Set cfr_renamed_2233(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
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

    private static /* synthetic */ boolean cfr_renamed_7345(sprszm arg0, sprszm arg1) {
        sprszm sprszm2;
        sprxjm sprxjm2;
        int n;
        int n2;
        block10: {
            if (arg1.cfr_renamed_84() < 1) {
                return false;
            }
            if (arg1.cfr_renamed_84() > arg0.cfr_renamed_84()) {
                return false;
            }
            n2 = 0;
            sprxjm sprxjm3 = sprxjm.cfr_renamed_23(arg1.cfr_renamed_85(0));
            int n3 = n = 0;
            while (n3 < arg0.cfr_renamed_84()) {
                n2 = n;
                sprxjm2 = sprxjm.cfr_renamed_23(arg0.cfr_renamed_85(n));
                if (sprtdm.cfr_renamed_7348(sprxjm3, sprxjm2)) {
                    sprszm2 = arg1;
                    break block10;
                }
                n3 = ++n;
            }
            sprszm2 = arg1;
        }
        if (sprszm2.cfr_renamed_84() > arg0.cfr_renamed_84() - n2) {
            return false;
        }
        int n4 = n = 0;
        while (n4 < arg1.cfr_renamed_84()) {
            sprxjm2 = sprxjm.cfr_renamed_23(arg1.cfr_renamed_85(n));
            sprxjm sprxjm4 = sprxjm.cfr_renamed_23(arg0.cfr_renamed_85(n2 + n));
            if (sprxjm2.cfr_renamed_84() == sprxjm4.cfr_renamed_84()) {
                if (!sprxjm2.cfr_renamed_4541().cfr_renamed_324().cfr_renamed_5078(sprxjm4.cfr_renamed_4541().cfr_renamed_324())) {
                    return false;
                }
                if (sprxjm2.cfr_renamed_84() == 1 && sprxjm2.cfr_renamed_4541().cfr_renamed_324().cfr_renamed_5078(sprkdm.cfr_renamed_102) ? !sprxjm4.cfr_renamed_4541().cfr_renamed_97().toString().startsWith(sprxjm2.cfr_renamed_4541().cfr_renamed_97().toString()) : !sprtdm.cfr_renamed_7348(sprxjm2, sprxjm4)) {
                    return false;
                }
            } else {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    public int hashCode() {
        sprbbm sprbbm2 = this;
        sprbbm sprbbm3 = this;
        sprbbm sprbbm4 = this;
        sprbbm sprbbm5 = this;
        sprbbm sprbbm6 = this;
        sprbbm sprbbm7 = this;
        sprbbm sprbbm8 = this;
        sprbbm sprbbm9 = this;
        sprbbm sprbbm10 = this;
        sprbbm sprbbm11 = this;
        sprbbm sprbbm12 = this;
        sprbbm sprbbm13 = this;
        return sprbbm2.cfr_renamed_2228(sprbbm2.cfr_renamed_3) + sprbbm3.cfr_renamed_2228(sprbbm3.cfr_renamed_2) + sprbbm4.cfr_renamed_2228(sprbbm4.cfr_renamed_152) + sprbbm5.cfr_renamed_2228(sprbbm5.cfr_renamed_102) + sprbbm6.cfr_renamed_2228(sprbbm6.cfr_renamed_4) + sprbbm7.cfr_renamed_2228(sprbbm7.cfr_renamed_91) + sprbbm8.cfr_renamed_2228(sprbbm8.cfr_renamed_1) + sprbbm9.cfr_renamed_2228(sprbbm9.cfr_renamed_0) + sprbbm10.cfr_renamed_2228(sprbbm10.cfr_renamed_119) + sprbbm11.cfr_renamed_2228(sprbbm11.cfr_renamed_86) + sprbbm12.cfr_renamed_2228(sprbbm12.cfr_renamed_93) + sprbbm13.cfr_renamed_2228(sprbbm13.cfr_renamed_112);
    }

    private /* synthetic */ Set cfr_renamed_2268(Set arg0, String arg1) {
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

    private /* synthetic */ void cfr_renamed_2247(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2226(arg1, string) && !arg1.equalsIgnoreCase(string)) continue;
            throw new sprlcm(sprsjfa.cfr_renamed_9("\b\n\u001fd%7l\">+!d-*l!4' 1(!(d?1.0>!)j"));
        }
    }

    private /* synthetic */ Set cfr_renamed_7353(Set arg0, sprszm arg1) {
        if (arg0.isEmpty()) {
            if (arg1 == null) {
                return arg0;
            }
            Set set = arg0;
            set.add(arg1);
            return set;
        }
        HashSet<sprszm> hashSet = new HashSet<sprszm>();
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(iterator.next());
            if (sprbbm.cfr_renamed_7345(arg1, sprszm2)) {
                hashSet.add(sprszm2);
                continue;
            }
            HashSet<sprszm> hashSet2 = hashSet;
            if (sprbbm.cfr_renamed_7345(sprszm2, arg1)) {
                hashSet2.add(arg1);
                continue;
            }
            hashSet2.add(sprszm2);
            hashSet.add(arg1);
        }
        return hashSet;
    }

    private /* synthetic */ Set cfr_renamed_2231(Set arg0, Set arg1) {
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            String string = this.cfr_renamed_7344(((sprsem)iterator.next()).cfr_renamed_2229());
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

    private /* synthetic */ void cfr_renamed_2261(Set arg0, String arg1) throws sprlcm {
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
        throw new sprlcm(sprrwja.cfr_renamed_9("/S8=\u0002nKs\u0004iK{\u0019r\u0006=\n=\u001bx\u0019p\u0002i\u001fx\u000f=\u0018h\ti\u0019x\u000e3"));
    }

    @Override
    public void cfr_renamed_7264(sprsem arg0) {
        sprsem[] sprsemArray = new sprsem[1];
        sprsemArray[0] = arg0;
        this.cfr_renamed_5070(sprsemArray);
    }

    private final /* synthetic */ void cfr_renamed_7346(StringBuilder arg0, String arg1) {
        arg0.append(arg1).append(sprkoe.cfr_renamed_5114());
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprbbm)) {
            return false;
        }
        sprbbm sprbbm2 = (sprbbm)arg0;
        sprbbm sprbbm3 = this;
        if (sprbbm3.cfr_renamed_2269(sprbbm2.cfr_renamed_3, sprbbm3.cfr_renamed_3)) {
            sprbbm sprbbm4 = this;
            if (sprbbm4.cfr_renamed_2269(sprbbm2.cfr_renamed_2, sprbbm4.cfr_renamed_2)) {
                sprbbm sprbbm5 = this;
                if (sprbbm5.cfr_renamed_2269(sprbbm2.cfr_renamed_152, sprbbm5.cfr_renamed_152)) {
                    sprbbm sprbbm6 = this;
                    if (sprbbm6.cfr_renamed_2269(sprbbm2.cfr_renamed_102, sprbbm6.cfr_renamed_102)) {
                        sprbbm sprbbm7 = this;
                        if (sprbbm7.cfr_renamed_2269(sprbbm2.cfr_renamed_4, sprbbm7.cfr_renamed_4)) {
                            sprbbm sprbbm8 = this;
                            if (sprbbm8.cfr_renamed_2269(sprbbm2.cfr_renamed_91, sprbbm8.cfr_renamed_91)) {
                                sprbbm sprbbm9 = this;
                                if (sprbbm9.cfr_renamed_2269(sprbbm2.cfr_renamed_1, sprbbm9.cfr_renamed_1)) {
                                    sprbbm sprbbm10 = this;
                                    if (sprbbm10.cfr_renamed_2269(sprbbm2.cfr_renamed_0, sprbbm10.cfr_renamed_0)) {
                                        sprbbm sprbbm11 = this;
                                        if (sprbbm11.cfr_renamed_2269(sprbbm2.cfr_renamed_119, sprbbm11.cfr_renamed_119)) {
                                            sprbbm sprbbm12 = this;
                                            if (sprbbm12.cfr_renamed_2269(sprbbm2.cfr_renamed_86, sprbbm12.cfr_renamed_86)) {
                                                sprbbm sprbbm13 = this;
                                                if (sprbbm13.cfr_renamed_2269(sprbbm2.cfr_renamed_93, sprbbm13.cfr_renamed_93)) {
                                                    sprbbm sprbbm14 = this;
                                                    if (sprbbm14.cfr_renamed_2269(sprbbm2.cfr_renamed_112, sprbbm14.cfr_renamed_112)) {
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
            }
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2259(Set arg0, byte[] arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (byte[] byArray : arg0) {
            if (!this.cfr_renamed_2249(arg1, byArray)) continue;
            throw new sprlcm(sprsjfa.cfr_renamed_9("\r\u001cd%7l\">+!d-*l!4' 1(!(d?1.0>!)j"));
        }
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_2238(int arg0) {
        switch (arg0) {
            case 0: {
                this.cfr_renamed_112 = new HashSet();
                return;
            }
            case 1: {
                this.cfr_renamed_119 = new HashSet();
                return;
            }
            case 2: {
                this.cfr_renamed_0 = new HashSet();
                return;
            }
            case 4: {
                this.cfr_renamed_1 = new HashSet();
                return;
            }
            case 6: {
                this.cfr_renamed_93 = new HashSet();
                return;
            }
            case 7: {
                this.cfr_renamed_86 = new HashSet();
                return;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprrwja.cfr_renamed_9("H\u0005v\u0005r\u001csKi\nzKx\u0005~\u0004h\u0005i\u000eo\u000eyQ=")).append(arg0).toString());
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

    private /* synthetic */ void cfr_renamed_2258(Set arg0, String arg1) throws sprlcm {
        if (arg0.isEmpty()) {
            return;
        }
        for (String string : arg0) {
            if (!this.cfr_renamed_2244(arg1, string)) continue;
            throw new sprlcm(sprsjfa.cfr_renamed_9("\u0019\u0016\u0005d%7l\">+!d-*l!4' 1(!(d?1.0>!)j"));
        }
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

    private /* synthetic */ byte[] cfr_renamed_2260(byte[] arg0, byte[] arg1) {
        int n = arg0.length;
        byte[] byArray = new byte[n * 2];
        System.arraycopy(arg0, 0, byArray, 0, n);
        int n2 = n;
        System.arraycopy(arg1, 0, byArray, n2, n2);
        return byArray;
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        sprbbm sprbbm2 = this;
        sprbbm2.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9("\u001bx\u0019p\u0002i\u001fx\u000f'"));
        if (sprbbm2.cfr_renamed_1 != null) {
            sprbbm sprbbm3 = this;
            sprbbm3.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\u0000\u0002~"));
            sprbbm3.cfr_renamed_7346(stringBuilder, sprbbm3.cfr_renamed_1.toString());
        }
        if (this.cfr_renamed_0 != null) {
            sprbbm sprbbm4 = this;
            sprbbm4.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9("/S8'"));
            sprbbm4.cfr_renamed_7346(stringBuilder, sprbbm4.cfr_renamed_0.toString());
        }
        if (this.cfr_renamed_119 != null) {
            sprbbm sprbbm5 = this;
            sprbbm5.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\t)-- ~"));
            sprbbm5.cfr_renamed_7346(stringBuilder, sprbbm5.cfr_renamed_119.toString());
        }
        if (this.cfr_renamed_93 != null) {
            sprbbm sprbbm6 = this;
            sprbbm6.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9(">O\"'"));
            sprbbm6.cfr_renamed_7346(stringBuilder, sprbbm6.cfr_renamed_93.toString());
        }
        if (this.cfr_renamed_86 != null) {
            sprbbm sprbbm7 = this;
            sprbbm7.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\r\u001c~"));
            sprbbm7.cfr_renamed_7346(stringBuilder, sprbbm7.cfr_renamed_2266(this.cfr_renamed_86));
        }
        if (this.cfr_renamed_112 != null) {
            sprbbm sprbbm8 = this;
            sprbbm8.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9("$i\u0003x\u0019S\np\u000e'"));
            sprbbm8.cfr_renamed_7346(stringBuilder, sprbbm8.cfr_renamed_7347(this.cfr_renamed_112));
        }
        sprbbm sprbbm9 = this;
        sprbbm9.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("!4' 1(!(~"));
        if (!sprbbm9.cfr_renamed_3.isEmpty()) {
            sprbbm sprbbm10 = this;
            sprbbm10.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9("Y%'"));
            sprbbm10.cfr_renamed_7346(stringBuilder, sprbbm10.cfr_renamed_3.toString());
        }
        if (!this.cfr_renamed_2.isEmpty()) {
            sprbbm sprbbm11 = this;
            sprbbm11.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\b\n\u001f~"));
            sprbbm11.cfr_renamed_7346(stringBuilder, sprbbm11.cfr_renamed_2.toString());
        }
        if (!this.cfr_renamed_152.isEmpty()) {
            sprbbm sprbbm12 = this;
            sprbbm12.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9(".p\nt\u0007'"));
            sprbbm12.cfr_renamed_7346(stringBuilder, sprbbm12.cfr_renamed_152.toString());
        }
        if (!this.cfr_renamed_4.isEmpty()) {
            sprbbm sprbbm13 = this;
            sprbbm13.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\u0019\u0016\u0005~"));
            sprbbm13.cfr_renamed_7346(stringBuilder, sprbbm13.cfr_renamed_4.toString());
        }
        if (!this.cfr_renamed_102.isEmpty()) {
            sprbbm sprbbm14 = this;
            sprbbm14.cfr_renamed_7346(stringBuilder, sprrwja.cfr_renamed_9("T;'"));
            sprbbm14.cfr_renamed_7346(stringBuilder, sprbbm14.cfr_renamed_2266(this.cfr_renamed_102));
        }
        if (!this.cfr_renamed_91.isEmpty()) {
            sprbbm sprbbm15 = this;
            sprbbm15.cfr_renamed_7346(stringBuilder, sprsjfa.cfr_renamed_9("\u00030$!>\n-))~"));
            sprbbm15.cfr_renamed_7346(stringBuilder, sprbbm15.cfr_renamed_7347(this.cfr_renamed_91));
        }
        return stringBuilder.toString();
    }
}

